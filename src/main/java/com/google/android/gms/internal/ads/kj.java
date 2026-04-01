package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kh f10105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f10106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f10107k;

    public kj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, kh khVar, long j8, long j9) {
        super(iiVar, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", ceVar, i8, 11);
        this.f10105i = khVar;
        this.f10106j = j8;
        this.f10107k = j9;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        kh khVar = this.f10105i;
        if (khVar != null) {
            ih ihVar = new ih((String) this.f5297f.invoke(null, khVar.b(), Long.valueOf(this.f10106j), Long.valueOf(this.f10107k)));
            synchronized (this.f5296e) {
                this.f5296e.A0(ihVar.f9188b.longValue());
                if (ihVar.f9189c.longValue() >= 0) {
                    this.f5296e.K(ihVar.f9189c.longValue());
                }
                if (ihVar.f9190d.longValue() >= 0) {
                    this.f5296e.g0(ihVar.f9190d.longValue());
                }
            }
        }
    }
}
