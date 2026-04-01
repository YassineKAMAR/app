package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class fl0 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final po3 f7797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final po3 f7799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f7801e;

    fl0(po3 po3Var, int i8, po3 po3Var2) {
        this.f7797a = po3Var;
        this.f7798b = i8;
        this.f7799c = po3Var2;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        int i10;
        long j8 = this.f7800d;
        long j9 = this.f7798b;
        if (j8 < j9) {
            int iH = this.f7797a.H(bArr, i8, (int) Math.min(i9, j9 - j8));
            long j10 = this.f7800d + ((long) iH);
            this.f7800d = j10;
            i10 = iH;
            j8 = j10;
        } else {
            i10 = 0;
        }
        if (j8 < this.f7798b) {
            return i10;
        }
        int iH2 = this.f7799c.H(bArr, i8 + i10, i9 - i10);
        int i11 = i10 + iH2;
        this.f7800d += (long) iH2;
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) {
        ut3 ut3Var2;
        this.f7801e = ut3Var.f15867a;
        long j8 = this.f7798b;
        long j9 = ut3Var.f15872f;
        ut3 ut3Var3 = null;
        if (j9 >= j8) {
            ut3Var2 = null;
        } else {
            long j10 = ut3Var.f15873g;
            long jMin = j8 - j9;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            ut3Var2 = new ut3(ut3Var.f15867a, null, j9, j9, jMin, null, 0);
        }
        long j11 = ut3Var.f15873g;
        if (j11 == -1 || ut3Var.f15872f + j11 > this.f7798b) {
            long jMax = Math.max(this.f7798b, ut3Var.f15872f);
            long j12 = ut3Var.f15873g;
            ut3Var3 = new ut3(ut3Var.f15867a, null, jMax, jMax, j12 != -1 ? Math.min(j12, (ut3Var.f15872f + j12) - this.f7798b) : -1L, null, 0);
        }
        long jB = ut3Var2 != null ? this.f7797a.b(ut3Var2) : 0L;
        long jB2 = ut3Var3 != null ? this.f7799c.b(ut3Var3) : 0L;
        this.f7800d = ut3Var.f15872f;
        if (jB == -1 || jB2 == -1) {
            return -1L;
        }
        return jB + jB2;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f7801e;
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        return mb3.d();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f7797a.p();
        this.f7799c.p();
    }
}
