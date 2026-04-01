package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class s7 extends y7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19154g;

    s7(byte[] bArr, int i8, int i9) {
        super(bArr);
        o7.i(i8, i8 + i9, bArr.length);
        this.f19153f = i8;
        this.f19154g = i9;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    protected final int E() {
        return this.f19153f;
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.o7
    public final byte a(int i8) {
        int iY = y();
        if (((iY - (i8 + 1)) | i8) >= 0) {
            return this.f19401e[this.f19153f + i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + iY);
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.o7
    final byte x(int i8) {
        return this.f19401e[this.f19153f + i8];
    }

    @Override // com.google.android.gms.internal.measurement.y7, com.google.android.gms.internal.measurement.o7
    public final int y() {
        return this.f19154g;
    }
}
