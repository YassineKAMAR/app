package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import g1.l;
import g1.p;
import java.util.Collections;
import java.util.List;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class d implements b1.c, y0.b, p.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f3147j = j.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f3151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b1.d f3152e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PowerManager.WakeLock f3155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3156i = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3154g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f3153f = new Object();

    d(Context context, int i8, String str, e eVar) {
        this.f3148a = context;
        this.f3149b = i8;
        this.f3151d = eVar;
        this.f3150c = str;
        this.f3152e = new b1.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f3153f) {
            this.f3152e.e();
            this.f3151d.h().c(this.f3150c);
            PowerManager.WakeLock wakeLock = this.f3155h;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().a(f3147j, String.format("Releasing wakelock %s for WorkSpec %s", this.f3155h, this.f3150c), new Throwable[0]);
                this.f3155h.release();
            }
        }
    }

    private void g() {
        synchronized (this.f3153f) {
            if (this.f3154g < 2) {
                this.f3154g = 2;
                j jVarC = j.c();
                String str = f3147j;
                jVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f3150c), new Throwable[0]);
                Intent intentG = b.g(this.f3148a, this.f3150c);
                e eVar = this.f3151d;
                eVar.k(new e.b(eVar, intentG, this.f3149b));
                if (this.f3151d.e().g(this.f3150c)) {
                    j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f3150c), new Throwable[0]);
                    Intent intentF = b.f(this.f3148a, this.f3150c);
                    e eVar2 = this.f3151d;
                    eVar2.k(new e.b(eVar2, intentF, this.f3149b));
                } else {
                    j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f3150c), new Throwable[0]);
                }
            } else {
                j.c().a(f3147j, String.format("Already stopped work for %s", this.f3150c), new Throwable[0]);
            }
        }
    }

    @Override // g1.p.b
    public void a(String str) {
        j.c().a(f3147j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // b1.c
    public void b(List<String> list) {
        g();
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        j.c().a(f3147j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z7)), new Throwable[0]);
        c();
        if (z7) {
            Intent intentF = b.f(this.f3148a, this.f3150c);
            e eVar = this.f3151d;
            eVar.k(new e.b(eVar, intentF, this.f3149b));
        }
        if (this.f3156i) {
            Intent intentA = b.a(this.f3148a);
            e eVar2 = this.f3151d;
            eVar2.k(new e.b(eVar2, intentA, this.f3149b));
        }
    }

    void e() {
        this.f3155h = l.b(this.f3148a, String.format("%s (%s)", this.f3150c, Integer.valueOf(this.f3149b)));
        j jVarC = j.c();
        String str = f3147j;
        jVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f3155h, this.f3150c), new Throwable[0]);
        this.f3155h.acquire();
        f1.p pVarM = this.f3151d.g().o().B().m(this.f3150c);
        if (pVarM == null) {
            g();
            return;
        }
        boolean zB = pVarM.b();
        this.f3156i = zB;
        if (zB) {
            this.f3152e.d(Collections.singletonList(pVarM));
        } else {
            j.c().a(str, String.format("No constraints for %s", this.f3150c), new Throwable[0]);
            f(Collections.singletonList(this.f3150c));
        }
    }

    @Override // b1.c
    public void f(List<String> list) {
        if (list.contains(this.f3150c)) {
            synchronized (this.f3153f) {
                if (this.f3154g == 0) {
                    this.f3154g = 1;
                    j.c().a(f3147j, String.format("onAllConstraintsMet for %s", this.f3150c), new Throwable[0]);
                    if (this.f3151d.e().j(this.f3150c)) {
                        this.f3151d.h().b(this.f3150c, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    j.c().a(f3147j, String.format("Already started work for %s", this.f3150c), new Throwable[0]);
                }
            }
        }
    }
}
