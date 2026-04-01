package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x0.j;
import y0.b;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3175c = j.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f3176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, JobParameters> f3177b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        JobParameters jobParametersRemove;
        j.c().a(f3175c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f3177b) {
            jobParametersRemove = this.f3177b.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z7);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i iVarK = i.k(getApplicationContext());
            this.f3176a = iVarK;
            iVarK.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.c().h(f3175c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f3176a;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f3176a == null) {
            j.c().a(f3175c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            j.c().b(f3175c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f3177b) {
            if (this.f3177b.containsKey(strA)) {
                j.c().a(f3175c, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                return false;
            }
            j.c().a(f3175c, String.format("onStartJob for %s", strA), new Throwable[0]);
            this.f3177b.put(strA, jobParameters);
            WorkerParameters.a aVar = null;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f3076b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f3075a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i8 >= 28) {
                    aVar.f3077c = jobParameters.getNetwork();
                }
            }
            this.f3176a.v(strA, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f3176a == null) {
            j.c().a(f3175c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            j.c().b(f3175c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f3175c, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f3177b) {
            this.f3177b.remove(strA);
        }
        this.f3176a.x(strA);
        return !this.f3176a.m().f(strA);
    }
}
