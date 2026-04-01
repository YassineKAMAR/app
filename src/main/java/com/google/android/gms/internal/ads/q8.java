package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class q8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f13327e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13331d = new byte[128];

    public q8(int i8) {
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f13328a) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.f13331d;
            int length = bArr2.length;
            int i11 = this.f13329b + i10;
            if (length < i11) {
                this.f13331d = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.f13331d, this.f13329b, i10);
            this.f13329b += i10;
        }
    }

    public final void b() {
        this.f13328a = false;
        this.f13329b = 0;
        this.f13330c = 0;
    }

    public final boolean c(int i8, int i9) {
        if (this.f13328a) {
            int i10 = this.f13329b - i9;
            this.f13329b = i10;
            if (this.f13330c != 0 || i8 != 181) {
                this.f13328a = false;
                return true;
            }
            this.f13330c = i10;
        } else if (i8 == 179) {
            this.f13328a = true;
        }
        a(f13327e, 0, 3);
        return false;
    }
}
