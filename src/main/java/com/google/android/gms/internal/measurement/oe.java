package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class oe implements le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19017c;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19015a = w6VarE.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        f19016b = w6VarE.d("measurement.client.sessions.check_on_startup", true);
        f19017c = w6VarE.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.le
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.le
    public final boolean k() {
        return f19015a.e().booleanValue();
    }
}
