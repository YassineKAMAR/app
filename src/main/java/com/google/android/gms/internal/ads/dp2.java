package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class dp2 implements z73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hp2 f6851a;

    dp2(hp2 hp2Var) {
        this.f6851a = hp2Var;
    }

    @Override // com.google.android.gms.internal.ads.z73
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        qg0.e("", (kw1) obj);
        j2.v1.k("Failed to get a cache key, reverting to legacy flow.");
        hp2 hp2Var = this.f6851a;
        hp2Var.f8878d = new gp2(null, hp2Var.e(), null);
        return this.f6851a.f8878d;
    }
}
