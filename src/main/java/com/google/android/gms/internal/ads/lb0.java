package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 extends nb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10569b;

    public lb0(String str, int i8) {
        this.f10568a = str;
        this.f10569b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof lb0)) {
            lb0 lb0Var = (lb0) obj;
            if (a3.n.a(this.f10568a, lb0Var.f10568a)) {
                if (a3.n.a(Integer.valueOf(this.f10569b), Integer.valueOf(lb0Var.f10569b))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final int k() {
        return this.f10569b;
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final String l() {
        return this.f10568a;
    }
}
