package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class vd implements sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f19275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<Boolean> f19276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o6<Boolean> f19277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o6<Long> f19278g;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19272a = w6VarE.d("measurement.dma_consent.client", false);
        f19273b = w6VarE.d("measurement.dma_consent.client_bow_check", false);
        f19274c = w6VarE.d("measurement.dma_consent.service", false);
        f19275d = w6VarE.d("measurement.dma_consent.service_gcs_v2", false);
        f19276e = w6VarE.d("measurement.dma_consent.service_npa_remote_default", false);
        f19277f = w6VarE.d("measurement.dma_consent.service_split_batch_on_consent", false);
        f19278g = w6VarE.b("measurement.id.dma_consent.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean k() {
        return f19272a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean l() {
        return f19273b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean m() {
        return f19275d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean n() {
        return f19276e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean p() {
        return f19274c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.sd
    public final boolean q() {
        return f19277f.e().booleanValue();
    }
}
