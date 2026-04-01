package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class aj extends ak {
    public aj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", ceVar, i8, 5);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        this.f5296e.n0(-1L);
        this.f5296e.m0(-1L);
        int[] iArr = (int[]) this.f5297f.invoke(null, this.f5293b.b());
        synchronized (this.f5296e) {
            this.f5296e.n0(iArr[0]);
            this.f5296e.m0(iArr[1]);
            int i8 = iArr[2];
            if (i8 != Integer.MIN_VALUE) {
                this.f5296e.l0(i8);
            }
        }
    }
}
