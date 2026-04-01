package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class kd implements ld {
    private static final o6<String> A;
    private static final o6<String> B;
    private static final o6<String> C;
    private static final o6<String> D;
    private static final o6<Long> E;
    private static final o6<Long> F;
    private static final o6<Long> G;
    private static final o6<Long> H;
    private static final o6<Long> I;
    private static final o6<Long> J;
    private static final o6<Long> K;
    private static final o6<Long> L;
    private static final o6<Long> M;
    private static final o6<Long> N;
    private static final o6<Long> O;
    private static final o6<Long> P;
    private static final o6<Long> Q;
    private static final o6<Long> R;
    private static final o6<Long> S;
    private static final o6<Long> T;
    private static final o6<Long> U;
    private static final o6<String> V;
    private static final o6<Long> W;
    private static final o6<String> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Long> f18881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Long> f18882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Long> f18883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Long> f18884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<String> f18885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o6<String> f18886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o6<String> f18887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o6<Long> f18888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o6<String> f18889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final o6<Long> f18890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final o6<Long> f18891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final o6<Long> f18892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final o6<Long> f18893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final o6<Long> f18894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final o6<Long> f18895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final o6<Long> f18896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final o6<Long> f18897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final o6<Long> f18898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o6<Long> f18899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final o6<String> f18900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final o6<Long> f18901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o6<Long> f18902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final o6<Long> f18903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final o6<Long> f18904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final o6<String> f18905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final o6<Long> f18906z;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18881a = w6VarE.b("measurement.ad_id_cache_time", 10000L);
        f18882b = w6VarE.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f18883c = w6VarE.b("measurement.max_bundles_per_iteration", 100L);
        f18884d = w6VarE.b("measurement.config.cache_time", 86400000L);
        f18885e = w6VarE.c("measurement.log_tag", "FA");
        f18886f = w6VarE.c("measurement.config.url_authority", "app-measurement.com");
        f18887g = w6VarE.c("measurement.config.url_scheme", "https");
        f18888h = w6VarE.b("measurement.upload.debug_upload_interval", 1000L);
        f18889i = w6VarE.c("measurement.rb.attribution.event_params", "value|currency");
        f18890j = w6VarE.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        f18891k = w6VarE.b("measurement.upload.max_event_parameter_value_length", 100L);
        f18892l = w6VarE.b("measurement.store.max_stored_events_per_app", 100000L);
        f18893m = w6VarE.b("measurement.experiment.max_ids", 50L);
        f18894n = w6VarE.b("measurement.audience.filter_result_max_count", 200L);
        f18895o = w6VarE.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f18896p = w6VarE.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f18897q = w6VarE.b("measurement.alarm_manager.minimum_interval", 60000L);
        f18898r = w6VarE.b("measurement.upload.minimum_delay", 500L);
        f18899s = w6VarE.b("measurement.monitoring.sample_period_millis", 86400000L);
        f18900t = w6VarE.c("measurement.rb.attribution.app_allowlist", "");
        f18901u = w6VarE.b("measurement.upload.realtime_upload_interval", 10000L);
        f18902v = w6VarE.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f18903w = w6VarE.b("measurement.config.cache_time.service", 3600000L);
        f18904x = w6VarE.b("measurement.service_client.idle_disconnect_millis", 5000L);
        f18905y = w6VarE.c("measurement.log_tag.service", "FA-SVC");
        f18906z = w6VarE.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        A = w6VarE.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = w6VarE.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = w6VarE.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = w6VarE.c("measurement.rb.attribution.uri_scheme", "https");
        E = w6VarE.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        F = w6VarE.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        G = w6VarE.b("measurement.upload.backoff_period", 43200000L);
        H = w6VarE.b("measurement.upload.initial_upload_delay_time", 15000L);
        I = w6VarE.b("measurement.upload.interval", 3600000L);
        J = w6VarE.b("measurement.upload.max_bundle_size", 65536L);
        K = w6VarE.b("measurement.upload.max_bundles", 100L);
        L = w6VarE.b("measurement.upload.max_conversions_per_day", 500L);
        M = w6VarE.b("measurement.upload.max_error_events_per_day", 1000L);
        N = w6VarE.b("measurement.upload.max_events_per_bundle", 1000L);
        O = w6VarE.b("measurement.upload.max_events_per_day", 100000L);
        P = w6VarE.b("measurement.upload.max_public_events_per_day", 50000L);
        Q = w6VarE.b("measurement.upload.max_queue_time", 2419200000L);
        R = w6VarE.b("measurement.upload.max_realtime_events_per_day", 10L);
        S = w6VarE.b("measurement.upload.max_batch_size", 65536L);
        T = w6VarE.b("measurement.upload.retry_count", 6L);
        U = w6VarE.b("measurement.upload.retry_time", 1800000L);
        V = w6VarE.c("measurement.upload.url", "https://app-measurement.com/a");
        W = w6VarE.b("measurement.upload.window_interval", 3600000L);
        X = w6VarE.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long A() {
        return G.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long B() {
        return f18904x.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long C() {
        return f18906z.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long D() {
        return I.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long E() {
        return F.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long F() {
        return Q.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long G() {
        return E.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String H() {
        return f18886f.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String I() {
        return V.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long J() {
        return H.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long K() {
        return J.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String L() {
        return f18887g.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long M() {
        return O.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String N() {
        return C.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long O() {
        return T.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long P() {
        return W.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String Q() {
        return D.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long W() {
        return K.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String a() {
        return f18889i.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String b() {
        return A.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String c() {
        return X.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long d() {
        return M.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long e() {
        return R.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long f() {
        return N.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String g() {
        return B.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long h() {
        return S.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final String i() {
        return f18900t.e();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long j() {
        return f18881a.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long k() {
        return f18882b.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long l() {
        return f18883c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long m() {
        return f18888h.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long m0() {
        return P.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long n() {
        return f18890j.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long o() {
        return f18892l.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long p() {
        return f18884d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long q() {
        return f18891k.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long q0() {
        return U.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long r() {
        return f18893m.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long r0() {
        return L.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long s() {
        return f18895o.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long t() {
        return f18894n.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long u() {
        return f18896p.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long v() {
        return f18898r.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long w() {
        return f18899s.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long x() {
        return f18897q.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long y() {
        return f18901u.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final long z() {
        return f18902v.e().longValue();
    }
}
