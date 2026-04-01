package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nq4 f12616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wq4 f12617b;

    public td4 a() {
        throw null;
    }

    public void b() {
        this.f12616a = null;
        this.f12617b = null;
    }

    public void c(zb4 zb4Var) {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public abstract pq4 e(ud4[] ud4VarArr, to4 to4Var, tm4 tm4Var, s11 s11Var);

    public abstract void f(Object obj);

    protected final wq4 g() {
        wq4 wq4Var = this.f12617b;
        uu1.b(wq4Var);
        return wq4Var;
    }

    public final void h(nq4 nq4Var, wq4 wq4Var) {
        this.f12616a = nq4Var;
        this.f12617b = wq4Var;
    }

    protected final void i() {
        nq4 nq4Var = this.f12616a;
        if (nq4Var != null) {
            nq4Var.t();
        }
    }
}
