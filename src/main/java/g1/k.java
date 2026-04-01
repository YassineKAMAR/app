package g1;

import androidx.work.impl.WorkDatabase;
import f1.q;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21896d = x0.j.f("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0.i f21897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21899c;

    public k(y0.i iVar, String str, boolean z7) {
        this.f21897a = iVar;
        this.f21898b = str;
        this.f21899c = z7;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseO = this.f21897a.o();
        y0.d dVarM = this.f21897a.m();
        q qVarB = workDatabaseO.B();
        workDatabaseO.c();
        try {
            boolean zH = dVarM.h(this.f21898b);
            if (this.f21899c) {
                zO = this.f21897a.m().n(this.f21898b);
            } else {
                if (!zH && qVarB.l(this.f21898b) == s.RUNNING) {
                    qVarB.k(s.ENQUEUED, this.f21898b);
                }
                zO = this.f21897a.m().o(this.f21898b);
            }
            x0.j.c().a(f21896d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f21898b, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }
}
