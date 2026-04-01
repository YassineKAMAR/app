package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
final class y2 extends d3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f17556e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17559d;

    public y2(w1 w1Var) {
        super(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean a(dq2 dq2Var) throws c3 {
        nb nbVarD;
        if (this.f17557b) {
            dq2Var.h(1);
        } else {
            int iU = dq2Var.u();
            int i8 = iU >> 4;
            this.f17559d = i8;
            if (i8 == 2) {
                int i9 = f17556e[(iU >> 2) & 3];
                l9 l9Var = new l9();
                l9Var.u("audio/mpeg");
                l9Var.k0(1);
                l9Var.v(i9);
                nbVarD = l9Var.D();
            } else if (i8 == 7 || i8 == 8) {
                l9 l9Var2 = new l9();
                l9Var2.u(i8 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                l9Var2.k0(1);
                l9Var2.v(8000);
                nbVarD = l9Var2.D();
            } else {
                if (i8 != 10) {
                    throw new c3("Audio format not supported: " + i8);
                }
                this.f17557b = true;
            }
            this.f6549a.e(nbVarD);
            this.f17558c = true;
            this.f17557b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean b(dq2 dq2Var, long j8) {
        if (this.f17559d == 2) {
            int iJ = dq2Var.j();
            this.f6549a.d(dq2Var, iJ);
            this.f6549a.a(j8, 1, iJ, 0, null);
            return true;
        }
        int iU = dq2Var.u();
        if (iU != 0 || this.f17558c) {
            if (this.f17559d == 10 && iU != 1) {
                return false;
            }
            int iJ2 = dq2Var.j();
            this.f6549a.d(dq2Var, iJ2);
            this.f6549a.a(j8, 1, iJ2, 0, null);
            return true;
        }
        int iJ3 = dq2Var.j();
        byte[] bArr = new byte[iJ3];
        dq2Var.c(bArr, 0, iJ3);
        l lVarA = m.a(bArr);
        l9 l9Var = new l9();
        l9Var.u("audio/mp4a-latm");
        l9Var.l0(lVarA.f10398c);
        l9Var.k0(lVarA.f10397b);
        l9Var.v(lVarA.f10396a);
        l9Var.k(Collections.singletonList(bArr));
        this.f6549a.e(l9Var.D());
        this.f17558c = true;
        return false;
    }
}
