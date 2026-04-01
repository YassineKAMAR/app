package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class h84 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w84 f8682a;

    public static void a(w84 w84Var, w84 w84Var2) {
        h84 h84Var = (h84) w84Var;
        if (h84Var.f8682a != null) {
            throw new IllegalStateException();
        }
        h84Var.f8682a = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final Object k() {
        w84 w84Var = this.f8682a;
        if (w84Var != null) {
            return w84Var.k();
        }
        throw new IllegalStateException();
    }
}
