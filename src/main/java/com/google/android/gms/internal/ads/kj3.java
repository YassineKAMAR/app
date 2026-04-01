package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class kj3 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f10119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f10120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10123i;

    public kj3(byte[] bArr) {
        super(false);
        uu1.d(bArr.length > 0);
        this.f10119e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f10122h;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(i9, i10);
        System.arraycopy(this.f10119e, this.f10121g, bArr, i8, iMin);
        this.f10121g += iMin;
        this.f10122h -= iMin;
        F(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws qp3 {
        this.f10120f = ut3Var.f15867a;
        d(ut3Var);
        long j8 = ut3Var.f15872f;
        int length = this.f10119e.length;
        if (j8 > length) {
            throw new qp3(2008);
        }
        int i8 = (int) j8;
        this.f10121g = i8;
        int i9 = length - i8;
        this.f10122h = i9;
        long j9 = ut3Var.f15873g;
        if (j9 != -1) {
            this.f10122h = (int) Math.min(i9, j9);
        }
        this.f10123i = true;
        e(ut3Var);
        long j10 = ut3Var.f15873g;
        return j10 != -1 ? j10 : this.f10122h;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f10120f;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        if (this.f10123i) {
            this.f10123i = false;
            c();
        }
        this.f10120f = null;
    }
}
