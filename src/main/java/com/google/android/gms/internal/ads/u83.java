package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class u83 extends x83 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ v83 f15564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u83(v83 v83Var, z83 z83Var, CharSequence charSequence) {
        super(z83Var, charSequence);
        this.f15564g = v83Var;
    }

    @Override // com.google.android.gms.internal.ads.x83
    public final int c(int i8) {
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.x83
    public final int d(int i8) {
        int i9 = i8 + 4000;
        if (i9 < this.f17125c.length()) {
            return i9;
        }
        return -1;
    }
}
