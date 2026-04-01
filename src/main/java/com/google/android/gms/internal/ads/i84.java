package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i84 implements w84, c84 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9097c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w84 f9098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f9099b = f9097c;

    private i84(w84 w84Var) {
        this.f9098a = w84Var;
    }

    public static c84 a(w84 w84Var) {
        if (w84Var instanceof c84) {
            return (c84) w84Var;
        }
        w84Var.getClass();
        return new i84(w84Var);
    }

    public static w84 b(w84 w84Var) {
        return w84Var instanceof i84 ? w84Var : new i84(w84Var);
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final Object k() {
        Object objK = this.f9099b;
        Object obj = f9097c;
        if (objK == obj) {
            synchronized (this) {
                objK = this.f9099b;
                if (objK == obj) {
                    objK = this.f9098a.k();
                    Object obj2 = this.f9099b;
                    if (obj2 != obj && obj2 != objK) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objK + ". This is likely due to a circular dependency.");
                    }
                    this.f9099b = objK;
                    this.f9098a = null;
                }
            }
        }
        return objK;
    }
}
