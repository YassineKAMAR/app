package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Long f8762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f8763j = new Object();

    public hj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", ceVar, i8, 22);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (f8762i == null) {
            synchronized (f8763j) {
                if (f8762i == null) {
                    f8762i = (Long) this.f5297f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f5296e) {
            this.f5296e.z0(f8762i.longValue());
        }
    }
}
