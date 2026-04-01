package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class pd implements md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Long> f19050d;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19047a = w6VarE.d("measurement.client.consent_state_v1", true);
        f19048b = w6VarE.d("measurement.client.3p_consent_state_v1", true);
        f19049c = w6VarE.d("measurement.service.consent_state_v1_W36", true);
        f19050d = w6VarE.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.md
    public final long j() {
        return f19050d.e().longValue();
    }
}
