package j2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.au;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.tl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23912b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x3.d f23914d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SharedPreferences f23916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f23917g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f23920j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23911a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f23913c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private tl f23915e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23918h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23921k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f23922l = "-1";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f23923m = "-1";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f23924n = "-1";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23925o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private rf0 f23926p = new rf0("", 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f23927q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f23928r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23929s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23930t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Set f23931u = Collections.emptySet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f23932v = new JSONObject();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23933w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23934x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f23935y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f23936z = "";
    private boolean A = false;
    private String B = "";
    private int C = -1;
    private int D = -1;
    private long E = 0;

    private final void R() {
        x3.d dVar = this.f23914d;
        if (dVar == null || dVar.isDone()) {
            return;
        }
        try {
            this.f23914d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            qg0.h("Interrupted while waiting for preferences loaded.", e8);
        } catch (CancellationException e9) {
            e = e9;
            qg0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            qg0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            qg0.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void S() {
        eh0.f7322a.execute(new Runnable() { // from class: j2.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f24075a.q();
            }
        });
    }

    @Override // j2.x1
    public final void A(String str) {
        R();
        synchronized (this.f23911a) {
            if (str.equals(this.f23919i)) {
                return;
            }
            this.f23919i = str;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void B(boolean z7) {
        R();
        synchronized (this.f23911a) {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) h2.y.c().b(ns.E9)).longValue();
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z7);
                this.f23917g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void C() {
        R();
        synchronized (this.f23911a) {
            this.f23932v = new JSONObject();
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void D(long j8) {
        R();
        synchronized (this.f23911a) {
            if (this.f23927q == j8) {
                return;
            }
            this.f23927q = j8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void E(String str) {
        R();
        synchronized (this.f23911a) {
            long jA = g2.t.b().a();
            if (str != null && !str.equals(this.f23926p.c())) {
                this.f23926p = new rf0(str, jA);
                SharedPreferences.Editor editor = this.f23917g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f23917g.putLong("app_settings_last_update_ms", jA);
                    this.f23917g.apply();
                }
                S();
                Iterator it = this.f23913c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.f23926p.g(jA);
        }
    }

    @Override // j2.x1
    public final void F(final Context context) {
        synchronized (this.f23911a) {
            if (this.f23916f != null) {
                return;
            }
            final String str = "admob";
            this.f23914d = eh0.f7322a.d(new Runnable(context, str) { // from class: j2.z1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Context f24088b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f24089c = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f24087a.Q(this.f24088b, this.f24089c);
                }
            });
            this.f23912b = true;
        }
    }

    @Override // j2.x1
    public final boolean F0() {
        boolean z7;
        if (!((Boolean) h2.y.c().b(ns.f12193t0)).booleanValue()) {
            return false;
        }
        R();
        synchronized (this.f23911a) {
            z7 = this.f23921k;
        }
        return z7;
    }

    @Override // j2.x1
    public final void G(String str) {
        R();
        synchronized (this.f23911a) {
            if (str.equals(this.f23920j)) {
                return;
            }
            this.f23920j = str;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final boolean H() {
        boolean z7;
        R();
        synchronized (this.f23911a) {
            z7 = this.f23933w;
        }
        return z7;
    }

    @Override // j2.x1
    public final boolean I() {
        boolean z7;
        R();
        synchronized (this.f23911a) {
            z7 = this.f23934x;
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // j2.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.R()
            java.lang.Object r0 = r5.f23911a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L6c
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 2
            goto L3b
        L3a:
            r1 = -1
        L3b:
            if (r1 == 0) goto L49
            if (r1 == r4) goto L46
            if (r1 == r3) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L43:
            r5.f23924n = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L46:
            r5.f23923m = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L49:
            r5.f23922l = r7     // Catch: java.lang.Throwable -> L6c
        L4b:
            android.content.SharedPreferences$Editor r1 = r5.f23917g     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L67
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L5d
            android.content.SharedPreferences$Editor r7 = r5.f23917g     // Catch: java.lang.Throwable -> L6c
            r7.remove(r6)     // Catch: java.lang.Throwable -> L6c
            goto L62
        L5d:
            android.content.SharedPreferences$Editor r1 = r5.f23917g     // Catch: java.lang.Throwable -> L6c
            r1.putString(r6, r7)     // Catch: java.lang.Throwable -> L6c
        L62:
            android.content.SharedPreferences$Editor r6 = r5.f23917g     // Catch: java.lang.Throwable -> L6c
            r6.apply()     // Catch: java.lang.Throwable -> L6c
        L67:
            r5.S()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a2.J(java.lang.String, java.lang.String):void");
    }

    @Override // j2.x1
    public final void K(long j8) {
        R();
        synchronized (this.f23911a) {
            if (this.f23928r == j8) {
                return;
            }
            this.f23928r = j8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void L(long j8) {
        R();
        synchronized (this.f23911a) {
            if (this.E == j8) {
                return;
            }
            this.E = j8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void M(boolean z7) {
        R();
        synchronized (this.f23911a) {
            if (this.f23933w == z7) {
                return;
            }
            this.f23933w = z7;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z7);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void N(String str) {
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue()) {
            R();
            synchronized (this.f23911a) {
                if (this.f23936z.equals(str)) {
                    return;
                }
                this.f23936z = str;
                SharedPreferences.Editor editor = this.f23917g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f23917g.apply();
                }
                S();
            }
        }
    }

    @Override // j2.x1
    public final void O(String str, String str2, boolean z7) {
        R();
        synchronized (this.f23911a) {
            JSONArray jSONArrayOptJSONArray = this.f23932v.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i8 = 0;
            while (true) {
                if (i8 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (z7 && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i8;
                    } else {
                        i8++;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z7);
                jSONObject.put("timestamp_ms", g2.t.b().a());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.f23932v.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e8) {
                qg0.h("Could not update native advanced settings", e8);
            }
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f23932v.toString());
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final boolean P() {
        boolean z7;
        R();
        synchronized (this.f23911a) {
            z7 = this.A;
        }
        return z7;
    }

    final /* synthetic */ void Q(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f23911a) {
            this.f23916f = sharedPreferences;
            this.f23917g = editorEdit;
            if (e3.m.g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f23918h = this.f23916f.getBoolean("use_https", this.f23918h);
            this.f23933w = this.f23916f.getBoolean("content_url_opted_out", this.f23933w);
            this.f23919i = this.f23916f.getString("content_url_hashes", this.f23919i);
            this.f23921k = this.f23916f.getBoolean("gad_idless", this.f23921k);
            this.f23934x = this.f23916f.getBoolean("content_vertical_opted_out", this.f23934x);
            this.f23920j = this.f23916f.getString("content_vertical_hashes", this.f23920j);
            this.f23930t = this.f23916f.getInt("version_code", this.f23930t);
            this.f23926p = new rf0(this.f23916f.getString("app_settings_json", this.f23926p.c()), this.f23916f.getLong("app_settings_last_update_ms", this.f23926p.a()));
            this.f23927q = this.f23916f.getLong("app_last_background_time_ms", this.f23927q);
            this.f23929s = this.f23916f.getInt("request_in_session_count", this.f23929s);
            this.f23928r = this.f23916f.getLong("first_ad_req_time_ms", this.f23928r);
            this.f23931u = this.f23916f.getStringSet("never_pool_slots", this.f23931u);
            this.f23935y = this.f23916f.getString("display_cutout", this.f23935y);
            this.C = this.f23916f.getInt("app_measurement_npa", this.C);
            this.D = this.f23916f.getInt("sd_app_measure_npa", this.D);
            this.E = this.f23916f.getLong("sd_app_measure_npa_ts", this.E);
            this.f23936z = this.f23916f.getString("inspector_info", this.f23936z);
            this.A = this.f23916f.getBoolean("linked_device", this.A);
            this.B = this.f23916f.getString("linked_ad_unit", this.B);
            this.f23922l = this.f23916f.getString("IABTCF_gdprApplies", this.f23922l);
            this.f23924n = this.f23916f.getString("IABTCF_PurposeConsents", this.f23924n);
            this.f23923m = this.f23916f.getString("IABTCF_TCString", this.f23923m);
            this.f23925o = this.f23916f.getInt("gad_has_consent_for_cookies", this.f23925o);
            try {
                this.f23932v = new JSONObject(this.f23916f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e8) {
                qg0.h("Could not convert native advanced settings to json object", e8);
            }
            S();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // j2.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Z(java.lang.String r6) {
        /*
            r5 = this;
            r5.R()
            java.lang.Object r0 = r5.f23911a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L50
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 2
            goto L3b
        L3a:
            r6 = -1
        L3b:
            if (r6 == 0) goto L4c
            if (r6 == r4) goto L48
            if (r6 == r3) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r6 = 0
            return r6
        L44:
            java.lang.String r6 = r5.f23924n     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L48:
            java.lang.String r6 = r5.f23923m     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L4c:
            java.lang.String r6 = r5.f23922l     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L50:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a2.Z(java.lang.String):java.lang.String");
    }

    @Override // j2.x1
    public final void a(String str) {
        if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
            R();
            synchronized (this.f23911a) {
                if (this.B.equals(str)) {
                    return;
                }
                this.B = str;
                SharedPreferences.Editor editor = this.f23917g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f23917g.apply();
                }
                S();
            }
        }
    }

    @Override // j2.x1
    public final void b(int i8) {
        R();
        synchronized (this.f23911a) {
            this.f23925o = i8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                if (i8 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i8);
                }
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final boolean c() {
        R();
        synchronized (this.f23911a) {
            SharedPreferences sharedPreferences = this.f23916f;
            boolean z7 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.f23916f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f23921k) {
                z7 = true;
            }
            return z7;
        }
    }

    @Override // j2.x1
    public final void d(Runnable runnable) {
        this.f23913c.add(runnable);
    }

    @Override // j2.x1
    public final void e(int i8) {
        R();
        synchronized (this.f23911a) {
            if (this.f23929s == i8) {
                return;
            }
            this.f23929s = i8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void f(boolean z7) {
        if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
            R();
            synchronized (this.f23911a) {
                if (this.A == z7) {
                    return;
                }
                this.A = z7;
                SharedPreferences.Editor editor = this.f23917g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z7);
                    this.f23917g.apply();
                }
                S();
            }
        }
    }

    @Override // j2.x1
    public final void g(int i8) {
        R();
        synchronized (this.f23911a) {
            if (this.f23930t == i8) {
                return;
            }
            this.f23930t = i8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putInt("version_code", i8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void h(boolean z7) {
        R();
        synchronized (this.f23911a) {
            if (this.f23934x == z7) {
                return;
            }
            this.f23934x = z7;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z7);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final void i(int i8) {
        R();
        synchronized (this.f23911a) {
            if (this.D == i8) {
                return;
            }
            this.D = i8;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i8);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final int j() {
        int i8;
        R();
        synchronized (this.f23911a) {
            i8 = this.f23930t;
        }
        return i8;
    }

    @Override // j2.x1
    public final int k() {
        int i8;
        R();
        synchronized (this.f23911a) {
            i8 = this.f23925o;
        }
        return i8;
    }

    @Override // j2.x1
    public final int l() {
        int i8;
        R();
        synchronized (this.f23911a) {
            i8 = this.f23929s;
        }
        return i8;
    }

    @Override // j2.x1
    public final long m() {
        long j8;
        R();
        synchronized (this.f23911a) {
            j8 = this.f23928r;
        }
        return j8;
    }

    @Override // j2.x1
    public final long n() {
        long j8;
        R();
        synchronized (this.f23911a) {
            j8 = this.E;
        }
        return j8;
    }

    @Override // j2.x1
    public final rf0 o() {
        rf0 rf0Var;
        R();
        synchronized (this.f23911a) {
            if (((Boolean) h2.y.c().b(ns.Ia)).booleanValue() && this.f23926p.j()) {
                Iterator it = this.f23913c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            rf0Var = this.f23926p;
        }
        return rf0Var;
    }

    @Override // j2.x1
    public final long p() {
        long j8;
        R();
        synchronized (this.f23911a) {
            j8 = this.f23927q;
        }
        return j8;
    }

    @Override // j2.x1
    public final tl q() {
        if (!this.f23912b) {
            return null;
        }
        if ((H() && I()) || !((Boolean) au.f5489b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f23911a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f23915e == null) {
                this.f23915e = new tl();
            }
            this.f23915e.e();
            qg0.f("start fetching content...");
            return this.f23915e;
        }
    }

    @Override // j2.x1
    public final rf0 r() {
        rf0 rf0Var;
        synchronized (this.f23911a) {
            rf0Var = this.f23926p;
        }
        return rf0Var;
    }

    @Override // j2.x1
    public final String s() {
        String str;
        R();
        synchronized (this.f23911a) {
            str = this.f23920j;
        }
        return str;
    }

    @Override // j2.x1
    public final String t() {
        String str;
        R();
        synchronized (this.f23911a) {
            str = this.f23919i;
        }
        return str;
    }

    @Override // j2.x1
    public final String u() {
        String str;
        R();
        synchronized (this.f23911a) {
            str = this.B;
        }
        return str;
    }

    @Override // j2.x1
    public final void v(boolean z7) {
        R();
        synchronized (this.f23911a) {
            if (z7 == this.f23921k) {
                return;
            }
            this.f23921k = z7;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z7);
                this.f23917g.apply();
            }
            S();
        }
    }

    @Override // j2.x1
    public final String w() {
        String str;
        R();
        synchronized (this.f23911a) {
            str = this.f23936z;
        }
        return str;
    }

    @Override // j2.x1
    public final String x() {
        String str;
        R();
        synchronized (this.f23911a) {
            str = this.f23935y;
        }
        return str;
    }

    @Override // j2.x1
    public final JSONObject y() {
        JSONObject jSONObject;
        R();
        synchronized (this.f23911a) {
            jSONObject = this.f23932v;
        }
        return jSONObject;
    }

    @Override // j2.x1
    public final void z(String str) {
        R();
        synchronized (this.f23911a) {
            if (TextUtils.equals(this.f23935y, str)) {
                return;
            }
            this.f23935y = str;
            SharedPreferences.Editor editor = this.f23917g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f23917g.apply();
            }
            S();
        }
    }
}
