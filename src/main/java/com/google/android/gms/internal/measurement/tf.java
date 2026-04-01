package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class tf implements qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Boolean> f19232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<Boolean> f19233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o6<Boolean> f19234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o6<Boolean> f19235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o6<Boolean> f19236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o6<Boolean> f19237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final o6<Boolean> f19238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final o6<Boolean> f19239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final o6<Boolean> f19240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final o6<Boolean> f19241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final o6<Boolean> f19242n;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19229a = w6VarE.d("measurement.redaction.app_instance_id", true);
        f19230b = w6VarE.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        f19231c = w6VarE.d("measurement.redaction.config_redacted_fields", true);
        f19232d = w6VarE.d("measurement.redaction.device_info", true);
        f19233e = w6VarE.d("measurement.redaction.e_tag", true);
        f19234f = w6VarE.d("measurement.redaction.enhanced_uid", true);
        f19235g = w6VarE.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f19236h = w6VarE.d("measurement.redaction.google_signals", true);
        f19237i = w6VarE.d("measurement.redaction.no_aiid_in_config_request", true);
        f19238j = w6VarE.d("measurement.redaction.retain_major_os_version", true);
        f19239k = w6VarE.d("measurement.redaction.scion_payload_generator", true);
        f19240l = w6VarE.d("measurement.redaction.upload_redacted_fields", true);
        f19241m = w6VarE.d("measurement.redaction.upload_subdomain_override", true);
        f19242n = w6VarE.d("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final boolean j() {
        return f19238j.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final boolean k() {
        return f19239k.e().booleanValue();
    }
}
