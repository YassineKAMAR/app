package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ag implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f18576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f18577d;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18574a = w6VarE.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        f18575b = w6VarE.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f18576c = w6VarE.d("measurement.session_stitching_token_enabled", false);
        f18577d = w6VarE.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final boolean k() {
        return f18574a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final boolean l() {
        return f18575b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.bg
    public final boolean p() {
        return f18576c.e().booleanValue();
    }
}
