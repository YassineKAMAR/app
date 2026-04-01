package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vj extends ak {
    public vj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", ceVar, i8, 48);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        this.f5296e.b0(3);
        boolean zBooleanValue = ((Boolean) this.f5297f.invoke(null, this.f5293b.b())).booleanValue();
        synchronized (this.f5296e) {
            if (zBooleanValue) {
                this.f5296e.b0(2);
            } else {
                this.f5296e.b0(1);
            }
        }
    }
}
