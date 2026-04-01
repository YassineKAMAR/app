package g1;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;
import x0.m;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21880c = x0.j.f("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0.g f21881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0.c f21882b = new y0.c();

    public b(y0.g gVar) {
        this.f21881a = gVar;
    }

    private static boolean b(y0.g gVar) {
        boolean zC = c(gVar.g(), gVar.f(), (String[]) y0.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db A[LOOP:5: B:126:0x01d5->B:128:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e A[PHI: r1 r9 r12 r13 r14
  0x014e: PHI (r1v1 java.lang.String[]) = (r1v0 java.lang.String[]), (r1v0 java.lang.String[]), (r1v4 java.lang.String[]) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v7 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v4 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v5 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v5 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(y0.i r19, java.util.List<? extends x0.u> r20, java.lang.String[] r21, java.lang.String r22, x0.d r23) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.c(y0.i, java.util.List, java.lang.String[], java.lang.String, x0.d):boolean");
    }

    private static boolean e(y0.g gVar) {
        List<y0.g> listE = gVar.e();
        boolean z7 = false;
        if (listE != null) {
            boolean zE = false;
            for (y0.g gVar2 : listE) {
                if (gVar2.j()) {
                    x0.j.c().h(f21880c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    zE |= e(gVar2);
                }
            }
            z7 = zE;
        }
        return b(gVar) | z7;
    }

    private static void g(f1.p pVar) {
        x0.b bVar = pVar.f21660j;
        String str = pVar.f21653c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f21655e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f21653c = ConstraintTrackingWorker.class.getName();
            pVar.f21655e = aVar.a();
        }
    }

    private static boolean h(y0.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<y0.e> it = iVar.n().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase workDatabaseO = this.f21881a.g().o();
        workDatabaseO.c();
        try {
            boolean zE = e(this.f21881a);
            workDatabaseO.r();
            return zE;
        } finally {
            workDatabaseO.g();
        }
    }

    public x0.m d() {
        return this.f21882b;
    }

    public void f() {
        y0.i iVarG = this.f21881a.g();
        y0.f.b(iVarG.i(), iVarG.o(), iVarG.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f21881a.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f21881a));
            }
            if (a()) {
                e.a(this.f21881a.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f21882b.a(x0.m.f27206a);
        } catch (Throwable th) {
            this.f21882b.a(new m.b.a(th));
        }
    }
}
