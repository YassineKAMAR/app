package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17542d;

    public y1(byte[] bArr) {
        this.f17539a = bArr;
        this.f17540b = bArr.length;
    }

    public final int a() {
        return (this.f17541c * 8) + this.f17542d;
    }

    public final int b(int i8) {
        int i9 = this.f17541c;
        int i10 = 8 - this.f17542d;
        int i11 = i9 + 1;
        byte[] bArr = this.f17539a;
        int iMin = Math.min(i8, i10);
        int i12 = ((bArr[i9] & 255) >> this.f17542d) & (255 >> (8 - iMin));
        while (iMin < i8) {
            i12 |= (this.f17539a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i8));
        c(i8);
        return i13;
    }

    public final void c(int i8) {
        int i9;
        int i10 = i8 / 8;
        int i11 = this.f17541c + i10;
        this.f17541c = i11;
        int i12 = this.f17542d + (i8 - (i10 * 8));
        this.f17542d = i12;
        if (i12 > 7) {
            i11++;
            this.f17541c = i11;
            i12 -= 8;
            this.f17542d = i12;
        }
        boolean z7 = false;
        if (i11 >= 0 && (i11 < (i9 = this.f17540b) || (i11 == i9 && i12 == 0))) {
            z7 = true;
        }
        uu1.f(z7);
    }

    public final boolean d() {
        int i8 = (this.f17539a[this.f17541c] & 255) >> this.f17542d;
        c(1);
        return 1 == (i8 & 1);
    }
}
