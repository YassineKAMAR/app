package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gi4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8358b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ji4 f8360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yh4 f8361e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg4 f8357a = sg4.f14656c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fi4 f8359c = fi4.f7770a;

    @Deprecated
    public gi4() {
    }

    @Deprecated
    public final gi4 c(sg4 sg4Var) {
        this.f8357a = sg4Var;
        return this;
    }

    public final gi4 d(nn1[] nn1VarArr) {
        this.f8360d = new ji4(nn1VarArr);
        return this;
    }

    public final xi4 e() {
        uu1.f(!this.f8358b);
        this.f8358b = true;
        if (this.f8360d == null) {
            this.f8360d = new ji4(new nn1[0]);
        }
        vi4 vi4Var = null;
        if (this.f8361e == null) {
            this.f8361e = new yh4(null);
        }
        return new xi4(this, vi4Var);
    }
}
