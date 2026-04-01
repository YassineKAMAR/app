package androidx.work.impl.background.systemalarm;

import android.content.Context;
import f1.p;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class f implements y0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3173b = j.f("SystemAlarmScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3174a;

    public f(Context context) {
        this.f3174a = context.getApplicationContext();
    }

    private void b(p pVar) {
        j.c().a(f3173b, String.format("Scheduling work with workSpecId %s", pVar.f21651a), new Throwable[0]);
        this.f3174a.startService(b.f(this.f3174a, pVar.f21651a));
    }

    @Override // y0.e
    public boolean a() {
        return true;
    }

    @Override // y0.e
    public void c(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // y0.e
    public void e(String str) {
        this.f3174a.startService(b.g(this.f3174a, str));
    }
}
