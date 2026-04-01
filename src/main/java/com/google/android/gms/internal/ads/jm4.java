package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class jm4 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final po3 f9719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final im4 f9721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f9722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9723e;

    public jm4(po3 po3Var, int i8, im4 im4Var) {
        uu1.d(i8 > 0);
        this.f9719a = po3Var;
        this.f9720b = i8;
        this.f9721c = im4Var;
        this.f9722d = new byte[1];
        this.f9723e = i8;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        int i10 = this.f9723e;
        if (i10 == 0) {
            int i11 = 0;
            if (this.f9719a.H(this.f9722d, 0, 1) != -1) {
                int i12 = (this.f9722d[0] & 255) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    while (i13 > 0) {
                        int iH = this.f9719a.H(bArr2, i11, i13);
                        if (iH != -1) {
                            i11 += iH;
                            i13 -= iH;
                        }
                    }
                    while (i12 > 0) {
                        int i14 = i12 - 1;
                        if (bArr2[i14] != 0) {
                            break;
                        }
                        i12 = i14;
                    }
                    if (i12 > 0) {
                        this.f9721c.a(new dq2(bArr2, i12));
                    }
                }
                i10 = this.f9720b;
                this.f9723e = i10;
            }
            return -1;
        }
        int iH2 = this.f9719a.H(bArr, i8, Math.min(i10, i9));
        if (iH2 != -1) {
            this.f9723e -= iH2;
        }
        return iH2;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
        g94Var.getClass();
        this.f9719a.a(g94Var);
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f9719a.l();
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        return this.f9719a.m();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        throw new UnsupportedOperationException();
    }
}
