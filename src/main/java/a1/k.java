package a1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f1.p;
import f1.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public class k implements y0.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f5e = x0.j.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0.i f8c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f9d;

    public k(Context context, y0.i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new j(context));
    }

    public k(Context context, y0.i iVar, JobScheduler jobScheduler, j jVar) {
        this.f6a = context;
        this.f8c = iVar;
        this.f7b = jobScheduler;
        this.f9d = jVar;
    }

    public static void b(Context context) {
        List<JobInfo> listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, it.next().getId());
        }
    }

    private static void d(JobScheduler jobScheduler, int i8) {
        try {
            jobScheduler.cancel(i8);
        } catch (Throwable th) {
            x0.j.c().b(f5e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i8)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            x0.j.c().b(f5e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, y0.i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List<String> listA = iVar.o().y().a();
        boolean z7 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator<String> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                x0.j.c().a(f5e, "Reconciling jobs", new Throwable[0]);
                z7 = true;
                break;
            }
        }
        if (z7) {
            WorkDatabase workDatabaseO = iVar.o();
            workDatabaseO.c();
            try {
                q qVarB = workDatabaseO.B();
                Iterator<String> it2 = listA.iterator();
                while (it2.hasNext()) {
                    qVarB.b(it2.next(), -1L);
                }
                workDatabaseO.r();
            } finally {
                workDatabaseO.g();
            }
        }
        return z7;
    }

    @Override // y0.e
    public boolean a() {
        return true;
    }

    @Override // y0.e
    public void c(p... pVarArr) {
        List<Integer> listF;
        WorkDatabase workDatabaseO = this.f8c.o();
        g1.d dVar = new g1.d(workDatabaseO);
        for (p pVar : pVarArr) {
            workDatabaseO.c();
            try {
                p pVarM = workDatabaseO.B().m(pVar.f21651a);
                if (pVarM == null) {
                    x0.j.c().h(f5e, "Skipping scheduling " + pVar.f21651a + " because it's no longer in the DB", new Throwable[0]);
                } else if (pVarM.f21652b != s.ENQUEUED) {
                    x0.j.c().h(f5e, "Skipping scheduling " + pVar.f21651a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    f1.g gVarC = workDatabaseO.y().c(pVar.f21651a);
                    int iD = gVarC != null ? gVarC.f21629b : dVar.d(this.f8c.i().i(), this.f8c.i().g());
                    if (gVarC == null) {
                        this.f8c.o().y().b(new f1.g(pVar.f21651a, iD));
                    }
                    j(pVar, iD);
                    if (Build.VERSION.SDK_INT == 23 && (listF = f(this.f6a, this.f7b, pVar.f21651a)) != null) {
                        int iIndexOf = listF.indexOf(Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        j(pVar, !listF.isEmpty() ? listF.get(0).intValue() : dVar.d(this.f8c.i().i(), this.f8c.i().g()));
                    }
                }
                workDatabaseO.r();
                workDatabaseO.g();
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    @Override // y0.e
    public void e(String str) {
        List<Integer> listF = f(this.f6a, this.f7b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            d(this.f7b, it.next().intValue());
        }
        this.f8c.o().y().d(str);
    }

    public void j(p pVar, int i8) {
        JobInfo jobInfoA = this.f9d.a(pVar, i8);
        x0.j jVarC = x0.j.c();
        String str = f5e;
        jVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f21651a, Integer.valueOf(i8)), new Throwable[0]);
        try {
            if (this.f7b.schedule(jobInfoA) == 0) {
                x0.j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f21651a), new Throwable[0]);
                if (pVar.f21667q && pVar.f21668r == x0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f21667q = false;
                    x0.j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f21651a), new Throwable[0]);
                    j(pVar, i8);
                }
            }
        } catch (IllegalStateException e8) {
            List<JobInfo> listG = g(this.f6a, this.f7b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f8c.o().B().f().size()), Integer.valueOf(this.f8c.i().h()));
            x0.j.c().b(f5e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e8);
        } catch (Throwable th) {
            x0.j.c().b(f5e, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
