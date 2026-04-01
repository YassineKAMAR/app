package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v84 implements w84 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f16066c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w84 f16067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f16068b = f16066c;

    private v84(w84 w84Var) {
        this.f16067a = w84Var;
    }

    public static w84 a(w84 w84Var) {
        return ((w84Var instanceof v84) || (w84Var instanceof i84)) ? w84Var : new v84(w84Var);
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final Object k() {
        Object obj = this.f16068b;
        if (obj != f16066c) {
            return obj;
        }
        w84 w84Var = this.f16067a;
        if (w84Var == null) {
            return this.f16068b;
        }
        Object objK = w84Var.k();
        this.f16068b = objK;
        this.f16067a = null;
        return objK;
    }
}
