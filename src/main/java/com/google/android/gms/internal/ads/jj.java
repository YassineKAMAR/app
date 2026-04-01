package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ai f9647i;

    public jj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, ai aiVar) {
        super(iiVar, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", ceVar, i8, 94);
        this.f9647i = aiVar;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        int iIntValue = ((Integer) this.f5297f.invoke(null, this.f9647i.a())).intValue();
        synchronized (this.f5296e) {
            this.f5296e.Z(qe.a(iIntValue));
        }
    }
}
