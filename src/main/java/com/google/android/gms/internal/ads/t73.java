package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class t73 extends s73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f14991a;

    t73(char c8) {
        this.f14991a = c8;
    }

    @Override // com.google.android.gms.internal.ads.w73
    public final boolean b(char c8) {
        return c8 == this.f14991a;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i8 = this.f14991a;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(i8 & 15);
            i8 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
