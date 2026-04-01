package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class e93 implements c93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c93 f7199c = new c93() { // from class: com.google.android.gms.internal.ads.d93
        @Override // com.google.android.gms.internal.ads.c93
        public final Object j() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile c93 f7200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f7201b;

    e93(c93 c93Var) {
        this.f7200a = c93Var;
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final Object j() {
        c93 c93Var = this.f7200a;
        c93 c93Var2 = f7199c;
        if (c93Var != c93Var2) {
            synchronized (this) {
                if (this.f7200a != c93Var2) {
                    Object objJ = this.f7200a.j();
                    this.f7201b = objJ;
                    this.f7200a = c93Var2;
                    return objJ;
                }
            }
        }
        return this.f7201b;
    }

    public final String toString() {
        Object obj = this.f7200a;
        if (obj == f7199c) {
            obj = "<supplier that returned " + String.valueOf(this.f7201b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
