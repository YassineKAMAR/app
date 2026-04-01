package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ie implements fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f18811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f18812d;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18809a = w6VarE.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f18810b = w6VarE.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f18811c = w6VarE.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f18812d = w6VarE.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean k() {
        return f18810b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean l() {
        return f18811c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.fe
    public final boolean p() {
        return f18812d.e().booleanValue();
    }
}
