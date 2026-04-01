package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.ae;
import com.google.android.gms.measurement.internal.y6;
import d2.a;

/* JADX INFO: loaded from: classes.dex */
final class y4 extends u6 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Pair<String, Long> f20696z = new Pair<>("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f20697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c5 f20698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d5 f20699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d5 f20700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e5 f20701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f20702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f20704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d5 f20705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b5 f20706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e5 f20707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a5 f20708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b5 f20709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d5 f20710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d5 f20711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b5 f20713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b5 f20714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d5 f20715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e5 f20716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e5 f20717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d5 f20718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a5 f20719y;

    y4(w5 w5Var) {
        super(w5Var);
        this.f20705k = new d5(this, "session_timeout", 1800000L);
        this.f20706l = new b5(this, "start_new_session", true);
        this.f20710p = new d5(this, "last_pause_time", 0L);
        this.f20711q = new d5(this, "session_id", 0L);
        this.f20707m = new e5(this, "non_personalized_ads", null);
        this.f20708n = new a5(this, "last_received_uri_timestamps_by_source", null);
        this.f20709o = new b5(this, "allow_remote_dynamite", false);
        this.f20699e = new d5(this, "first_open_time", 0L);
        this.f20700f = new d5(this, "app_install_time", 0L);
        this.f20701g = new e5(this, "app_instance_id", null);
        this.f20713s = new b5(this, "app_backgrounded", false);
        this.f20714t = new b5(this, "deep_link_retrieval_complete", false);
        this.f20715u = new d5(this, "deep_link_retrieval_attempts", 0L);
        this.f20716v = new e5(this, "firebase_feature_rollouts", null);
        this.f20717w = new e5(this, "deferred_attribution_cache", null);
        this.f20718x = new d5(this, "deferred_attribution_cache_timestamp", 0L);
        this.f20719y = new a5(this, "default_event_parameters", null);
    }

    final boolean A(y6 y6Var) {
        i();
        int iB = y6Var.b();
        if (!x(iB)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putString("consent_settings", y6Var.v());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        return true;
    }

    final boolean B() {
        SharedPreferences sharedPreferences = this.f20697c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void C(Boolean bool) {
        i();
        SharedPreferences.Editor editorEdit = F().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void D(String str) {
        i();
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void E(boolean z7) {
        i();
        t().K().b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z7);
        editorEdit.apply();
    }

    protected final SharedPreferences F() {
        i();
        l();
        a3.o.j(this.f20697c);
        return this.f20697c;
    }

    final void G(String str) {
        i();
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    final SparseArray<Long> H() {
        Bundle bundleA = this.f20708n.a();
        if (bundleA == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            t().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i8 = 0; i8 < intArray.length; i8++) {
            sparseArray.put(intArray[i8], Long.valueOf(longArray[i8]));
        }
        return sparseArray;
    }

    final v I() {
        i();
        return v.c(F().getString("dma_consent_settings", null));
    }

    final y6 J() {
        i();
        return y6.f(F().getString("consent_settings", "G1"), F().getInt("consent_source", 100));
    }

    final Boolean K() {
        i();
        if (F().contains("use_service")) {
            return Boolean.valueOf(F().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean L() {
        i();
        if (F().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean M() {
        i();
        if (F().contains("measurement_enabled")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String N() {
        i();
        String string = F().getString("previous_os_version", null);
        b().l();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = F().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final String O() {
        i();
        return F().getString("admob_app_id", null);
    }

    final String P() {
        i();
        return F().getString("gmp_app_id", null);
    }

    final void Q() {
        i();
        Boolean boolM = M();
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolM != null) {
            v(boolM);
        }
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean q() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final void r() {
        SharedPreferences sharedPreferences = j().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f20697c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f20712r = z7;
        if (!z7) {
            SharedPreferences.Editor editorEdit = this.f20697c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f20698d = new c5(this, "health_monitor", Math.max(0L, e0.f19931e.a(null).longValue()));
    }

    final Pair<String, Boolean> s(String str) {
        i();
        if (ae.a() && a().q(e0.R0) && !J().l(y6.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long jB = k().b();
        if (this.f20702h != null && jB < this.f20704j) {
            return new Pair<>(this.f20702h, Boolean.valueOf(this.f20703i));
        }
        this.f20704j = jB + a().C(str);
        d2.a.d(true);
        try {
            a.C0100a c0100aA = d2.a.a(j());
            this.f20702h = "";
            String strA = c0100aA.a();
            if (strA != null) {
                this.f20702h = strA;
            }
            this.f20703i = c0100aA.b();
        } catch (Exception e8) {
            t().F().b("Unable to get advertising id", e8);
            this.f20702h = "";
        }
        d2.a.d(false);
        return new Pair<>(this.f20702h, Boolean.valueOf(this.f20703i));
    }

    final void v(Boolean bool) {
        i();
        SharedPreferences.Editor editorEdit = F().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void w(boolean z7) {
        i();
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putBoolean("use_service", z7);
        editorEdit.apply();
    }

    final boolean x(int i8) {
        return y6.k(i8, F().getInt("consent_source", 100));
    }

    final boolean y(long j8) {
        return j8 - this.f20705k.a() > this.f20710p.a();
    }

    final boolean z(v vVar) {
        i();
        if (!y6.k(vVar.a(), I().a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putString("dma_consent_settings", vVar.i());
        editorEdit.apply();
        return true;
    }
}
