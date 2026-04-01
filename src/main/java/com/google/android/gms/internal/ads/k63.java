package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class k63 extends x63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r63 f9958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l63 f9959b;

    k63(l63 l63Var, r63 r63Var) {
        this.f9959b = l63Var;
        this.f9958a = r63Var;
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final void c4(Bundle bundle) {
        int i8 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        p63 p63VarC = q63.c();
        p63VarC.b(i8);
        if (string != null) {
            p63VarC.a(string);
        }
        this.f9958a.a(p63VarC.c());
        if (i8 == 8157) {
            this.f9959b.c();
        }
    }
}
