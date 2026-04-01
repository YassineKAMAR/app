package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce1 f9996a;

    public k92(ce1 ce1Var) {
        this.f9996a = ce1Var;
    }

    public final /* bridge */ /* synthetic */ Object a(ks2 ks2Var, wr2 wr2Var, View view, f92 f92Var) {
        h92 h92Var = new h92(this, new ke1() { // from class: com.google.android.gms.internal.ads.g92
            @Override // com.google.android.gms.internal.ads.ke1
            public final void a(boolean z7, Context context, t41 t41Var) {
            }
        });
        bd1 bd1VarC = this.f9996a.c(new d01(ks2Var, wr2Var, null), h92Var);
        f92Var.b(new i92(this, bd1VarC));
        return bd1VarC.i();
    }
}
