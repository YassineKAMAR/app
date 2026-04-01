package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f18608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Long> f18609d;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18606a = w6VarE.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f18607b = w6VarE.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f18608c = w6VarE.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f18609d = w6VarE.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.cf
    public final boolean j() {
        return f18608c.e().booleanValue();
    }
}
