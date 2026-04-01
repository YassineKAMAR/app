package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f18705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f18706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<Boolean> f18707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o6<Long> f18708f;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18703a = w6VarE.d("measurement.client.sessions.background_sessions_enabled", true);
        f18704b = w6VarE.d("measurement.client.sessions.enable_fix_background_engagement", false);
        f18705c = w6VarE.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f18706d = w6VarE.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f18707e = w6VarE.d("measurement.client.sessions.session_id_enabled", true);
        f18708f = w6VarE.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.cg
    public final boolean j() {
        return f18704b.e().booleanValue();
    }
}
