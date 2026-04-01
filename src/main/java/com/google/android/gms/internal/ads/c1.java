package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1 f6098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final td0 f6099l;

    private c1(int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, b1 b1Var, td0 td0Var) {
        this.f6088a = i8;
        this.f6089b = i9;
        this.f6090c = i10;
        this.f6091d = i11;
        this.f6092e = i12;
        this.f6093f = i(i12);
        this.f6094g = i13;
        this.f6095h = i14;
        this.f6096i = h(i14);
        this.f6097j = j8;
        this.f6098k = b1Var;
        this.f6099l = td0Var;
    }

    public c1(byte[] bArr, int i8) {
        cp2 cp2Var = new cp2(bArr, bArr.length);
        cp2Var.j(i8 * 8);
        this.f6088a = cp2Var.d(16);
        this.f6089b = cp2Var.d(16);
        this.f6090c = cp2Var.d(24);
        this.f6091d = cp2Var.d(24);
        int iD = cp2Var.d(20);
        this.f6092e = iD;
        this.f6093f = i(iD);
        this.f6094g = cp2Var.d(3) + 1;
        int iD2 = cp2Var.d(5) + 1;
        this.f6095h = iD2;
        this.f6096i = h(iD2);
        int iD3 = cp2Var.d(4);
        int iD4 = cp2Var.d(32);
        int i9 = nz2.f12300a;
        this.f6097j = ((((long) iD3) & 4294967295L) << 32) | (((long) iD4) & 4294967295L);
        this.f6098k = null;
        this.f6099l = null;
    }

    private static int h(int i8) {
        if (i8 == 8) {
            return 1;
        }
        if (i8 == 12) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 != 20) {
            return i8 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i8) {
        switch (i8) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j8 = this.f6097j;
        if (j8 == 0) {
            return -9223372036854775807L;
        }
        return (j8 * 1000000) / ((long) this.f6092e);
    }

    public final long b(long j8) {
        return Math.max(0L, Math.min((j8 * ((long) this.f6092e)) / 1000000, this.f6097j - 1));
    }

    public final nb c(byte[] bArr, td0 td0Var) {
        bArr[4] = -128;
        td0 td0VarD = d(td0Var);
        l9 l9Var = new l9();
        l9Var.u("audio/flac");
        int i8 = this.f6091d;
        if (i8 <= 0) {
            i8 = -1;
        }
        l9Var.n(i8);
        l9Var.k0(this.f6094g);
        l9Var.v(this.f6092e);
        l9Var.k(Collections.singletonList(bArr));
        l9Var.o(td0VarD);
        return l9Var.D();
    }

    public final td0 d(td0 td0Var) {
        td0 td0Var2 = this.f6099l;
        return td0Var2 == null ? td0Var : td0Var2.e(td0Var);
    }

    public final c1 e(List list) {
        return new c1(this.f6088a, this.f6089b, this.f6090c, this.f6091d, this.f6092e, this.f6094g, this.f6095h, this.f6097j, this.f6098k, d(new td0(list)));
    }

    public final c1 f(b1 b1Var) {
        return new c1(this.f6088a, this.f6089b, this.f6090c, this.f6091d, this.f6092e, this.f6094g, this.f6095h, this.f6097j, b1Var, this.f6099l);
    }

    public final c1 g(List list) {
        return new c1(this.f6088a, this.f6089b, this.f6090c, this.f6091d, this.f6092e, this.f6094g, this.f6095h, this.f6097j, this.f6098k, d(c2.b(list)));
    }
}
