package y0;

import a1.k;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import f1.p;
import f1.q;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27359a = x0.j.f("Schedulers");

    static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            k kVar = new k(context, iVar);
            g1.e.a(context, SystemJobService.class, true);
            x0.j.c().a(f27359a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return kVar;
        }
        e eVarC = c(context);
        if (eVarC != null) {
            return eVarC;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        g1.e.a(context, SystemAlarmService.class, true);
        x0.j.c().a(f27359a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q qVarB = workDatabase.B();
        workDatabase.c();
        try {
            List<p> listE = qVarB.e(aVar.h());
            List<p> listT = qVarB.t(RCHTTPStatusCodes.SUCCESS);
            if (listE != null && listE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<p> it = listE.iterator();
                while (it.hasNext()) {
                    qVarB.b(it.next().f21651a, jCurrentTimeMillis);
                }
            }
            workDatabase.r();
            if (listE != null && listE.size() > 0) {
                p[] pVarArr = (p[]) listE.toArray(new p[listE.size()]);
                for (e eVar : list) {
                    if (eVar.a()) {
                        eVar.c(pVarArr);
                    }
                }
            }
            if (listT == null || listT.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) listT.toArray(new p[listT.size()]);
            for (e eVar2 : list) {
                if (!eVar2.a()) {
                    eVar2.c(pVarArr2);
                }
            }
        } finally {
            workDatabase.g();
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            x0.j.c().a(f27359a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            x0.j.c().a(f27359a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
