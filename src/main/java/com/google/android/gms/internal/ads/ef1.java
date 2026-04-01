package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ef1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f7298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f7299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f7300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f7301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f7302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f7303f;

    public ef1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6) {
        this.f7298a = w84Var;
        this.f7299b = w84Var2;
        this.f7300c = w84Var3;
        this.f7301d = w84Var4;
        this.f7302e = w84Var5;
        this.f7303f = w84Var6;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        bo0 bo0Var = (bo0) this.f7298a.k();
        n31 n31VarA = ((y31) this.f7299b).a();
        ea1 ea1VarA = ((xa1) this.f7300c).a();
        te1 te1VarA = ((ve1) this.f7301d).a();
        z61 z61VarK = ((ix0) this.f7302e).k();
        v62 v62Var = (v62) this.f7303f.k();
        gy0 gy0VarJ = bo0Var.j();
        gy0VarJ.k(n31VarA.j());
        gy0VarJ.h(ea1VarA);
        gy0VarJ.c(te1VarA);
        gy0VarJ.i(new c92(null));
        gy0VarJ.e(new fz0(z61VarK, null));
        gy0VarJ.b(new gx0(null));
        if (((Boolean) h2.y.c().b(ns.f12187s3)).booleanValue()) {
            gy0VarJ.p(d72.b(v62Var));
        }
        rz0 rz0VarC = gy0VarJ.o().c();
        r84.b(rz0VarC);
        return rz0VarC;
    }
}
