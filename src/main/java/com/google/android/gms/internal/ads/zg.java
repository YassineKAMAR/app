package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class zg implements ch {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static zg f18200r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x33 f18202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e43 f18203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g43 f18204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ci f18205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g23 f18206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f18207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d43 f18208h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final si f18210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ji f18211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ai f18212l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f18215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f18216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f18217q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile long f18213m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f18214n = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CountDownLatch f18209i = new CountDownLatch(1);

    zg(Context context, g23 g23Var, x33 x33Var, e43 e43Var, g43 g43Var, ci ciVar, Executor executor, b23 b23Var, int i8, si siVar, ji jiVar, ai aiVar) {
        this.f18216p = false;
        this.f18201a = context;
        this.f18206f = g23Var;
        this.f18202b = x33Var;
        this.f18203c = e43Var;
        this.f18204d = g43Var;
        this.f18205e = ciVar;
        this.f18207g = executor;
        this.f18217q = i8;
        this.f18210j = siVar;
        this.f18211k = jiVar;
        this.f18212l = aiVar;
        this.f18216p = false;
        this.f18208h = new xg(this, b23Var);
    }

    public static synchronized zg i(String str, Context context, boolean z7, boolean z8) {
        return j(str, context, Executors.newCachedThreadPool(), z7, z8);
    }

    @Deprecated
    public static synchronized zg j(String str, Context context, Executor executor, boolean z7, boolean z8) {
        if (f18200r == null) {
            h23 h23VarA = i23.a();
            h23VarA.a(str);
            h23VarA.c(z7);
            i23 i23VarD = h23VarA.d();
            g23 g23VarA = g23.a(context, executor, z8);
            kh khVarC = ((Boolean) h2.y.c().b(ns.f12070f3)).booleanValue() ? kh.c(context) : null;
            si siVarD = ((Boolean) h2.y.c().b(ns.f12079g3)).booleanValue() ? si.d(context, executor) : null;
            ji jiVar = ((Boolean) h2.y.c().b(ns.f12203u2)).booleanValue() ? new ji() : null;
            ai aiVar = ((Boolean) h2.y.c().b(ns.f12219w2)).booleanValue() ? new ai() : null;
            a33 a33VarE = a33.e(context, executor, g23VarA, i23VarD);
            bi biVar = new bi(context);
            ci ciVar = new ci(i23VarD, a33VarE, new pi(context, biVar), biVar, khVarC, siVarD, jiVar, aiVar);
            int iB = j33.b(context, g23VarA);
            b23 b23Var = new b23();
            zg zgVar = new zg(context, g23VarA, new x33(context, iB), new e43(context, iB, new wg(g23VarA), ((Boolean) h2.y.c().b(ns.f12051d2)).booleanValue()), new g43(context, ciVar, g23VarA, b23Var), ciVar, executor, b23Var, iB, siVarD, jiVar, aiVar);
            f18200r = zgVar;
            zgVar.o();
            f18200r.p();
        }
        return f18200r;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[Catch: all -> 0x0115, m14 -> 0x0117, TryCatch #2 {m14 -> 0x0117, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00d6, B:41:0x00e0, B:43:0x00e6, B:45:0x00ee, B:46:0x00f0, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:47:0x00fa, B:48:0x0103, B:49:0x010c), top: B:58:0x0021, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void n(com.google.android.gms.internal.ads.zg r12) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zg.n(com.google.android.gms.internal.ads.zg):void");
    }

    private final void s() {
        si siVar = this.f18210j;
        if (siVar != null) {
            siVar.h();
        }
    }

    private final w33 t(int i8) {
        if (j33.a(this.f18217q)) {
            return ((Boolean) h2.y.c().b(ns.f12033b2)).booleanValue() ? this.f18203c.c(1) : this.f18202b.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void a(View view) {
        this.f18205e.a(view);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(StackTraceElement[] stackTraceElementArr) {
        ai aiVar = this.f18212l;
        if (aiVar != null) {
            aiVar.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String c(Context context) {
        s();
        if (((Boolean) h2.y.c().b(ns.f12203u2)).booleanValue()) {
            this.f18211k.j();
        }
        p();
        j23 j23VarA = this.f18204d.a();
        if (j23VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = j23VarA.a(context, null);
        this.f18206f.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void d(int i8, int i9, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String e(Context context, String str, View view, Activity activity) {
        s();
        if (((Boolean) h2.y.c().b(ns.f12203u2)).booleanValue()) {
            this.f18211k.i();
        }
        p();
        j23 j23VarA = this.f18204d.a();
        if (j23VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = j23VarA.c(context, null, str, view, activity);
        this.f18206f.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void f(MotionEvent motionEvent) {
        j23 j23VarA = this.f18204d.a();
        if (j23VarA != null) {
            try {
                j23VarA.b(null, motionEvent);
            } catch (f43 e8) {
                this.f18206f.c(e8.a(), -1L, e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String g(Context context, View view, Activity activity) {
        s();
        if (((Boolean) h2.y.c().b(ns.f12203u2)).booleanValue()) {
            this.f18211k.k(context, view);
        }
        p();
        j23 j23VarA = this.f18204d.a();
        if (j23VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = j23VarA.d(context, null, view, activity);
        this.f18206f.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final String h(Context context, String str, View view) {
        return e(context, str, view, null);
    }

    final synchronized void o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        w33 w33VarT = t(1);
        if (w33VarT == null) {
            this.f18206f.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f18204d.c(w33VarT)) {
            this.f18216p = true;
            this.f18209i.countDown();
        }
    }

    public final void p() {
        if (this.f18215o) {
            return;
        }
        synchronized (this.f18214n) {
            if (!this.f18215o) {
                if ((System.currentTimeMillis() / 1000) - this.f18213m < 3600) {
                    return;
                }
                w33 w33VarB = this.f18204d.b();
                if ((w33VarB == null || w33VarB.d(3600L)) && j33.a(this.f18217q)) {
                    this.f18207g.execute(new yg(this));
                }
            }
        }
    }

    public final synchronized boolean r() {
        return this.f18216p;
    }
}
