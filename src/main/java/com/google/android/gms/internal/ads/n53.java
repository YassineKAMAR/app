package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n53 {
    public static x3.d a(s3.h hVar) {
        final l53 l53Var = new l53(hVar);
        hVar.b(rg3.b(), new s3.d() { // from class: com.google.android.gms.internal.ads.k53
            @Override // s3.d
            public final void a(s3.h hVar2) {
                l53 l53Var2 = l53Var;
                if (hVar2.k()) {
                    l53Var2.cancel(false);
                    return;
                }
                if (hVar2.m()) {
                    l53Var2.f(hVar2.j());
                    return;
                }
                Exception excI = hVar2.i();
                if (excI == null) {
                    throw new IllegalStateException();
                }
                l53Var2.g(excI);
            }
        });
        return l53Var;
    }
}
