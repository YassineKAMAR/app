package g2;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ch;
import com.google.android.gms.internal.ads.e43;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.fh;
import com.google.android.gms.internal.ads.g23;
import com.google.android.gms.internal.ads.j33;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.zg;
import h2.v;
import h2.y;
import j2.k2;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable, ch {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f21955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f21958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g23 f21959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f21960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f21961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private wg0 f21962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wg0 f21963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21964m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21966o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f21952a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f21953b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f21954c = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final CountDownLatch f21965n = new CountDownLatch(1);

    public i(Context context, wg0 wg0Var) {
        this.f21960i = context;
        this.f21961j = context;
        this.f21962k = wg0Var;
        this.f21963l = wg0Var;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f21958g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) y.c().b(ns.f12078g2)).booleanValue();
        this.f21964m = zBooleanValue;
        this.f21959h = g23.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f21956e = ((Boolean) y.c().b(ns.f12042c2)).booleanValue();
        this.f21957f = ((Boolean) y.c().b(ns.f12087h2)).booleanValue();
        if (((Boolean) y.c().b(ns.f12069f2)).booleanValue()) {
            this.f21966o = 2;
        } else {
            this.f21966o = 1;
        }
        if (!((Boolean) y.c().b(ns.f12106j3)).booleanValue()) {
            this.f21955d = k();
        }
        if (!((Boolean) y.c().b(ns.f12043c3)).booleanValue()) {
            v.b();
            if (!jg0.y()) {
                run();
                return;
            }
        }
        eh0.f7322a.execute(this);
    }

    private final ch n() {
        return (ch) (m() == 2 ? this.f21954c : this.f21953b).get();
    }

    private final void o() {
        List list = this.f21952a;
        ch chVarN = n();
        if (list.isEmpty() || chVarN == null) {
            return;
        }
        for (Object[] objArr : this.f21952a) {
            int length = objArr.length;
            if (length == 1) {
                chVarN.f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                chVarN.d(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f21952a.clear();
    }

    private final void p(boolean z7) {
        this.f21953b.set(fh.y(this.f21962k.f16723a, q(this.f21960i), z7, this.f21966o));
    }

    private static final Context q(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void a(View view) {
        ch chVarN = n();
        if (chVarN != null) {
            chVarN.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(StackTraceElement[] stackTraceElementArr) {
        ch chVarN;
        if (!l() || (chVarN = n()) == null) {
            return;
        }
        chVarN.b(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String c(Context context) {
        ch chVarN;
        if (!l() || (chVarN = n()) == null) {
            return "";
        }
        o();
        return chVarN.c(q(context));
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void d(int i8, int i9, int i10) {
        ch chVarN = n();
        if (chVarN == null) {
            this.f21952a.add(new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)});
        } else {
            o();
            chVarN.d(i8, i9, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String e(Context context, String str, View view, Activity activity) {
        if (!l()) {
            return "";
        }
        ch chVarN = n();
        if (((Boolean) y.c().b(ns.P9)).booleanValue()) {
            t.r();
            k2.i(view, 4, null);
        }
        if (chVarN == null) {
            return "";
        }
        o();
        return chVarN.e(q(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void f(MotionEvent motionEvent) {
        ch chVarN = n();
        if (chVarN == null) {
            this.f21952a.add(new Object[]{motionEvent});
        } else {
            o();
            chVarN.f(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String g(Context context, View view, Activity activity) {
        if (!((Boolean) y.c().b(ns.O9)).booleanValue()) {
            ch chVarN = n();
            if (((Boolean) y.c().b(ns.P9)).booleanValue()) {
                t.r();
                k2.i(view, 2, null);
            }
            return chVarN != null ? chVarN.g(context, view, activity) : "";
        }
        if (!l()) {
            return "";
        }
        ch chVarN2 = n();
        if (((Boolean) y.c().b(ns.P9)).booleanValue()) {
            t.r();
            k2.i(view, 2, null);
        }
        return chVarN2 != null ? chVarN2.g(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String h(Context context, String str, View view) {
        return e(context, str, view, null);
    }

    final /* synthetic */ void j(boolean z7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zg.i(this.f21963l.f16723a, q(this.f21961j), z7, this.f21964m).p();
        } catch (NullPointerException e8) {
            this.f21959h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e8);
        }
    }

    protected final boolean k() {
        Context context = this.f21960i;
        h hVar = new h(this);
        g23 g23Var = this.f21959h;
        return new e43(this.f21960i, j33.b(context, g23Var), hVar, ((Boolean) y.c().b(ns.f12051d2)).booleanValue()).d(1);
    }

    public final boolean l() {
        try {
            this.f21965n.await();
            return true;
        } catch (InterruptedException e8) {
            qg0.h("Interrupted during GADSignals creation.", e8);
            return false;
        }
    }

    protected final int m() {
        if (!this.f21956e || this.f21955d) {
            return this.f21966o;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) y.c().b(ns.f12106j3)).booleanValue()) {
                this.f21955d = k();
            }
            boolean z7 = this.f21962k.f16726d;
            final boolean z8 = false;
            if (!((Boolean) y.c().b(ns.V0)).booleanValue() && z7) {
                z8 = true;
            }
            if (m() == 1) {
                p(z8);
                if (this.f21966o == 2) {
                    this.f21958g.execute(new Runnable() { // from class: g2.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21949a.j(z8);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zg zgVarI = zg.i(this.f21962k.f16723a, q(this.f21960i), z8, this.f21964m);
                    this.f21954c.set(zgVarI);
                    if (this.f21957f && !zgVarI.r()) {
                        this.f21966o = 1;
                        p(z8);
                    }
                } catch (NullPointerException e8) {
                    this.f21966o = 1;
                    p(z8);
                    this.f21959h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e8);
                }
            }
        } finally {
            this.f21965n.countDown();
            this.f21960i = null;
            this.f21962k = null;
        }
    }
}
