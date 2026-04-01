package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class nm3 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ut3 f11918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f11919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11921h;

    public nm3() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.f11921h;
        if (i10 == 0) {
            return -1;
        }
        int iMin = Math.min(i9, i10);
        byte[] bArr2 = this.f11919f;
        int i11 = nz2.f12300a;
        System.arraycopy(bArr2, this.f11920g, bArr, i8, iMin);
        this.f11920g += iMin;
        this.f11921h -= iMin;
        F(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws yh0, qp3 {
        d(ut3Var);
        this.f11918e = ut3Var;
        Uri uriNormalizeScheme = ut3Var.f15867a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        uu1.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i8 = nz2.f12300a;
        String[] strArrSplit = schemeSpecificPart.split(com.amazon.a.a.o.b.f.f3942a, -1);
        if (strArrSplit.length != 2) {
            throw yh0.b("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f11919f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e8) {
                throw yh0.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e8);
            }
        } else {
            this.f11919f = URLDecoder.decode(str, x73.f17096a.name()).getBytes(x73.f17098c);
        }
        long j8 = ut3Var.f15872f;
        int length = this.f11919f.length;
        if (j8 > length) {
            this.f11919f = null;
            throw new qp3(2008);
        }
        int i9 = (int) j8;
        this.f11920g = i9;
        int i10 = length - i9;
        this.f11921h = i10;
        long j9 = ut3Var.f15873g;
        if (j9 != -1) {
            this.f11921h = (int) Math.min(i10, j9);
        }
        e(ut3Var);
        long j10 = ut3Var.f15873g;
        return j10 != -1 ? j10 : this.f11921h;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        ut3 ut3Var = this.f11918e;
        if (ut3Var != null) {
            return ut3Var.f15867a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        if (this.f11919f != null) {
            this.f11919f = null;
            c();
        }
        this.f11918e = null;
    }
}
