package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class sw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f14845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x3.d f14847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f14848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x3.d f14849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ tw2 f14850f;

    private sw2(tw2 tw2Var, Object obj, String str, x3.d dVar, List list, x3.d dVar2) {
        this.f14850f = tw2Var;
        this.f14845a = obj;
        this.f14846b = str;
        this.f14847c = dVar;
        this.f14848d = list;
        this.f14849e = dVar2;
    }

    public final fw2 a() {
        Object obj = this.f14845a;
        String strF = this.f14846b;
        if (strF == null) {
            strF = this.f14850f.f(obj);
        }
        final fw2 fw2Var = new fw2(obj, strF, this.f14849e);
        this.f14850f.f15358c.W(fw2Var);
        x3.d dVar = this.f14847c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.pw2
            @Override // java.lang.Runnable
            public final void run() {
                this.f13170a.f14850f.f15358c.J(fw2Var);
            }
        };
        lg3 lg3Var = eh0.f7327f;
        dVar.c(runnable, lg3Var);
        zf3.r(fw2Var, new qw2(this, fw2Var), lg3Var);
        return fw2Var;
    }

    public final sw2 b(Object obj) {
        return this.f14850f.b(obj, a());
    }

    public final sw2 c(Class cls, gf3 gf3Var) {
        return new sw2(this.f14850f, this.f14845a, this.f14846b, this.f14847c, this.f14848d, zf3.f(this.f14849e, cls, gf3Var, this.f14850f.f15356a));
    }

    public final sw2 d(final x3.d dVar) {
        return g(new gf3() { // from class: com.google.android.gms.internal.ads.ow2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return dVar;
            }
        }, eh0.f7327f);
    }

    public final sw2 e(final dw2 dw2Var) {
        return f(new gf3() { // from class: com.google.android.gms.internal.ads.nw2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(dw2Var.a(obj));
            }
        });
    }

    public final sw2 f(gf3 gf3Var) {
        return g(gf3Var, this.f14850f.f15356a);
    }

    public final sw2 g(gf3 gf3Var, Executor executor) {
        return new sw2(this.f14850f, this.f14845a, this.f14846b, this.f14847c, this.f14848d, zf3.n(this.f14849e, gf3Var, executor));
    }

    public final sw2 h(String str) {
        return new sw2(this.f14850f, this.f14845a, str, this.f14847c, this.f14848d, this.f14849e);
    }

    public final sw2 i(long j8, TimeUnit timeUnit) {
        return new sw2(this.f14850f, this.f14845a, this.f14846b, this.f14847c, this.f14848d, zf3.o(this.f14849e, j8, timeUnit, this.f14850f.f15357b));
    }
}
