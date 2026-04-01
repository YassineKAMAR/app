package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class lc {
    lc() {
    }

    abstract int a(int i8, byte[] bArr, int i9, int i10);

    abstract int b(CharSequence charSequence, byte[] bArr, int i8, int i9);

    abstract String c(byte[] bArr, int i8, int i9);

    final boolean d(byte[] bArr, int i8, int i9) {
        return a(0, bArr, i8, i9) == 0;
    }
}
