package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f12905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f12906j;

    public pj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, Context context) {
        super(iiVar, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", ceVar, i8, 31);
        this.f12905i = null;
        this.f12906j = context;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        this.f5296e.Q(-1L);
        this.f5296e.M(-1L);
        Context contextB = this.f12906j;
        if (contextB == null) {
            contextB = this.f5293b.b();
        }
        if (this.f12905i == null) {
            this.f12905i = (List) this.f5297f.invoke(null, contextB);
        }
        List list = this.f12905i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f5296e) {
            this.f5296e.Q(((Long) this.f12905i.get(0)).longValue());
            this.f5296e.M(((Long) this.f12905i.get(1)).longValue());
        }
    }
}
