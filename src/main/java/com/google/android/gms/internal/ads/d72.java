package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class d72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v62 f6602a;

    d72() {
    }

    private d72(v62 v62Var) {
        this.f6602a = v62Var;
    }

    public static d72 b(v62 v62Var) {
        return new d72(v62Var);
    }

    public final v62 a(e3.e eVar, w62 w62Var, c32 c32Var, jz2 jz2Var) {
        v62 v62Var = this.f6602a;
        return v62Var != null ? v62Var : new v62(eVar, w62Var, c32Var, jz2Var);
    }
}
