package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Long f5811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f5812j = new Object();

    public bj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", ceVar, i8, 44);
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (f5811i == null) {
            synchronized (f5812j) {
                if (f5811i == null) {
                    f5811i = (Long) this.f5297f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f5296e) {
            this.f5296e.p0(f5811i.longValue());
        }
    }
}
