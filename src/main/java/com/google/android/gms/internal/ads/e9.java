package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f7196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7197e;

    public e9(int i8, int i9) {
        this.f7193a = i8;
        byte[] bArr = new byte[131];
        this.f7196d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f7194b) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f7196d;
            int length = bArr2.length;
            int i11 = this.f7197e + i10;
            if (length < i11) {
                this.f7196d = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f7196d, this.f7197e, i10);
            this.f7197e += i10;
        }
    }

    public final void b() {
        this.f7194b = false;
        this.f7195c = false;
    }

    public final void c(int i8) {
        uu1.f(!this.f7194b);
        boolean z7 = i8 == this.f7193a;
        this.f7194b = z7;
        if (z7) {
            this.f7197e = 3;
            this.f7195c = false;
        }
    }

    public final boolean d(int i8) {
        if (!this.f7194b) {
            return false;
        }
        this.f7197e -= i8;
        this.f7194b = false;
        this.f7195c = true;
        return true;
    }

    public final boolean e() {
        return this.f7195c;
    }
}
