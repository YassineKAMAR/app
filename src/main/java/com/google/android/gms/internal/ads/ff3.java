package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ff3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f7741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7744d = 0;

    public ff3(byte[] bArr, int i8, int i9) {
        this.f7741a = bArr;
        this.f7743c = i8;
        this.f7742b = i9;
        h();
    }

    private final int g() {
        int i8 = 0;
        while (!f()) {
            i8++;
        }
        return ((1 << i8) - 1) + (i8 > 0 ? a(i8) : 0);
    }

    private final void h() {
        int i8;
        int i9 = this.f7743c;
        boolean z7 = true;
        if (i9 < 0 || (i9 >= (i8 = this.f7742b) && (i9 != i8 || this.f7744d != 0))) {
            z7 = false;
        }
        uu1.f(z7);
    }

    private final boolean i(int i8) {
        if (i8 < 2 || i8 >= this.f7742b) {
            return false;
        }
        byte[] bArr = this.f7741a;
        return bArr[i8] == 3 && bArr[i8 + (-2)] == 0 && bArr[i8 + (-1)] == 0;
    }

    public final int a(int i8) {
        int i9;
        this.f7744d += i8;
        int i10 = 0;
        while (true) {
            i9 = this.f7744d;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.f7744d = i11;
            byte[] bArr = this.f7741a;
            int i12 = this.f7743c;
            i10 |= (bArr[i12] & 255) << i11;
            if (true != i(i12 + 1)) {
                i = 1;
            }
            this.f7743c = i12 + i;
        }
        byte[] bArr2 = this.f7741a;
        int i13 = this.f7743c;
        int i14 = i10 | ((bArr2[i13] & 255) >> (8 - i9));
        int i15 = 32 - i8;
        if (i9 == 8) {
            this.f7744d = 0;
            this.f7743c = i13 + (true != i(i13 + 1) ? 1 : 2);
        }
        int i16 = ((-1) >>> i15) & i14;
        h();
        return i16;
    }

    public final int b() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public final int c() {
        return g();
    }

    public final void d() {
        int i8 = this.f7744d + 1;
        this.f7744d = i8;
        if (i8 == 8) {
            this.f7744d = 0;
            int i9 = this.f7743c;
            this.f7743c = i9 + (true == i(i9 + 1) ? 2 : 1);
        }
        h();
    }

    public final void e(int i8) {
        int i9 = this.f7743c;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        this.f7743c = i11;
        int i12 = this.f7744d + (i8 - (i10 * 8));
        this.f7744d = i12;
        if (i12 > 7) {
            this.f7743c = i11 + 1;
            this.f7744d = i12 - 8;
        }
        while (true) {
            i9++;
            if (i9 > this.f7743c) {
                h();
                return;
            } else if (i(i9)) {
                this.f7743c++;
                i9 += 2;
            }
        }
    }

    public final boolean f() {
        int i8 = this.f7741a[this.f7743c] & (128 >> this.f7744d);
        d();
        return i8 != 0;
    }
}
