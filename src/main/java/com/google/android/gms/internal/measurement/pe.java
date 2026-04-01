package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class pe implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Long> f19053c;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19051a = w6VarE.d("measurement.gbraid_campaign.gbraid.client.dev", false);
        f19052b = w6VarE.d("measurement.gbraid_campaign.gbraid.service", false);
        f19053c = w6VarE.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean k() {
        return f19051a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean l() {
        return f19052b.e().booleanValue();
    }
}
