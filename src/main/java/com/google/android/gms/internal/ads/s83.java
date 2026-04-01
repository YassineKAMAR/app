package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class s83 extends x83 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ t83 f14567g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s83(t83 t83Var, z83 z83Var, CharSequence charSequence) {
        super(z83Var, charSequence);
        this.f14567g = t83Var;
    }

    @Override // com.google.android.gms.internal.ads.x83
    final int c(int i8) {
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.x83
    final int d(int i8) {
        CharSequence charSequence = this.f17125c;
        int length = charSequence.length();
        l83.b(i8, length, "index");
        while (i8 < length) {
            t83 t83Var = this.f14567g;
            if (t83Var.f15009a.b(charSequence.charAt(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
