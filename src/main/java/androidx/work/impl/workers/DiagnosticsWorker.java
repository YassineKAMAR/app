package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import f1.g;
import f1.h;
import f1.k;
import f1.p;
import f1.q;
import f1.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x0.j;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f3252g = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f21651a, pVar.f21653c, num, pVar.f21652b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            Integer numValueOf = null;
            g gVarC = hVar.c(pVar.f21651a);
            if (gVarC != null) {
                numValueOf = Integer.valueOf(gVarC.f21629b);
            }
            sb.append(a(pVar, TextUtils.join(f.f3942a, kVar.b(pVar.f21651a)), numValueOf, TextUtils.join(f.f3942a, tVar.a(pVar.f21651a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase workDatabaseO = i.k(getApplicationContext()).o();
        q qVarB = workDatabaseO.B();
        k kVarZ = workDatabaseO.z();
        t tVarC = workDatabaseO.C();
        h hVarY = workDatabaseO.y();
        List<p> listD = qVarB.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> listH = qVarB.h();
        List<p> listT = qVarB.t(RCHTTPStatusCodes.SUCCESS);
        if (listD != null && !listD.isEmpty()) {
            j jVarC = j.c();
            String str = f3252g;
            jVarC.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, c(kVarZ, tVarC, hVarY, listD), new Throwable[0]);
        }
        if (listH != null && !listH.isEmpty()) {
            j jVarC2 = j.c();
            String str2 = f3252g;
            jVarC2.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, c(kVarZ, tVarC, hVarY, listH), new Throwable[0]);
        }
        if (listT != null && !listT.isEmpty()) {
            j jVarC3 = j.c();
            String str3 = f3252g;
            jVarC3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, c(kVarZ, tVarC, hVarY, listT), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
