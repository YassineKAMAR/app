package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f11324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f11325j = new Object();

    public mj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", ceVar, i8, 1);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        this.f5296e.v("E");
        if (f11324i == null) {
            synchronized (f11325j) {
                if (f11324i == null) {
                    f11324i = (String) this.f5297f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f5296e) {
            this.f5296e.v(f11324i);
        }
    }
}
