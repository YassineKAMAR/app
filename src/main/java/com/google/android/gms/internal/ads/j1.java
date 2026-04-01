package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f9436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f9437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f9438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9439d;

    public j1(long[] jArr, long[] jArr2, long j8) {
        int length = jArr.length;
        int length2 = jArr2.length;
        uu1.d(length == length2);
        boolean z7 = length2 > 0;
        this.f9439d = z7;
        if (!z7 || jArr2[0] <= 0) {
            this.f9436a = jArr;
            this.f9437b = jArr2;
        } else {
            int i8 = length2 + 1;
            long[] jArr3 = new long[i8];
            this.f9436a = jArr3;
            long[] jArr4 = new long[i8];
            this.f9437b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f9438c = j8;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f9438c;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return this.f9439d;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        if (!this.f9439d) {
            r1 r1Var = r1.f13855c;
            return new o1(r1Var, r1Var);
        }
        int iO = nz2.o(this.f9437b, j8, true, true);
        r1 r1Var2 = new r1(this.f9437b[iO], this.f9436a[iO]);
        if (r1Var2.f13856a != j8) {
            long[] jArr = this.f9437b;
            if (iO != jArr.length - 1) {
                int i8 = iO + 1;
                return new o1(r1Var2, new r1(jArr[i8], this.f9436a[i8]));
            }
        }
        return new o1(r1Var2, r1Var2);
    }
}
