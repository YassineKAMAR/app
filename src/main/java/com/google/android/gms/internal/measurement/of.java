package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class of implements pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f19021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<Boolean> f19022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o6<Long> f19023f;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19018a = w6VarE.d("measurement.rb.attribution.client2", false);
        f19019b = w6VarE.d("measurement.rb.attribution.followup1.service", false);
        f19020c = w6VarE.d("measurement.rb.attribution.service", false);
        f19021d = w6VarE.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f19022e = w6VarE.d("measurement.rb.attribution.uuid_generation", true);
        f19023f = w6VarE.b("measurement.id.rb.attribution.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean k() {
        return f19018a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean l() {
        return f19019b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean m() {
        return f19021d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean n() {
        return f19022e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.pf
    public final boolean p() {
        return f19020c.e().booleanValue();
    }
}
