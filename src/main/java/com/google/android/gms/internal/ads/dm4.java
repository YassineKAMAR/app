package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dm4 implements no4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final no4[] f6815a;

    public dm4(no4[] no4VarArr) {
        this.f6815a = no4VarArr;
    }

    @Override // com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
        for (no4 no4Var : this.f6815a) {
            no4Var.a(j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        boolean zC;
        boolean z7 = false;
        do {
            long jL = l();
            long j8 = Long.MIN_VALUE;
            if (jL == Long.MIN_VALUE) {
                break;
            }
            no4[] no4VarArr = this.f6815a;
            int length = no4VarArr.length;
            int i8 = 0;
            zC = false;
            while (i8 < length) {
                no4 no4Var = no4VarArr[i8];
                long jL2 = no4Var.l();
                boolean z8 = jL2 != j8 && jL2 <= sc4Var.f14605a;
                if (jL2 == jL || z8) {
                    zC |= no4Var.c(sc4Var);
                }
                i8++;
                j8 = Long.MIN_VALUE;
            }
            z7 |= zC;
        } while (zC);
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.no4
    public final long k() {
        long jMin = Long.MAX_VALUE;
        for (no4 no4Var : this.f6815a) {
            long jK = no4Var.k();
            if (jK != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jK);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.no4
    public final long l() {
        long jMin = Long.MAX_VALUE;
        for (no4 no4Var : this.f6815a) {
            long jL = no4Var.l();
            if (jL != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jL);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.no4
    public final boolean y() {
        for (no4 no4Var : this.f6815a) {
            if (no4Var.y()) {
                return true;
            }
        }
        return false;
    }
}
