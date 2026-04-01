package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t92 extends a70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y60 f15013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jh0 f15014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f15015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f15016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15017f;

    public t92(String str, y60 y60Var, jh0 jh0Var, long j8) {
        JSONObject jSONObject = new JSONObject();
        this.f15015d = jSONObject;
        this.f15017f = false;
        this.f15014c = jh0Var;
        this.f15012a = str;
        this.f15013b = y60Var;
        this.f15016e = j8;
        try {
            jSONObject.put("adapter_version", y60Var.n().toString());
            jSONObject.put("sdk_version", y60Var.q().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void O5(String str, jh0 jh0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) h2.y.c().b(ns.f12234y1)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            jh0Var.d(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void P5(String str, int i8) {
        if (this.f15017f) {
            return;
        }
        try {
            this.f15015d.put("signal_error", str);
            if (((Boolean) h2.y.c().b(ns.f12242z1)).booleanValue()) {
                this.f15015d.put("latency", g2.t.b().b() - this.f15016e);
            }
            if (((Boolean) h2.y.c().b(ns.f12234y1)).booleanValue()) {
                this.f15015d.put("signal_error_code", i8);
            }
        } catch (JSONException unused) {
        }
        this.f15014c.d(this.f15015d);
        this.f15017f = true;
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final synchronized void O(String str) {
        P5(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final synchronized void Z1(h2.z2 z2Var) {
        P5(z2Var.f22384b, 2);
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final synchronized void b(String str) {
        if (this.f15017f) {
            return;
        }
        if (str == null) {
            O("Adapter returned null signals");
            return;
        }
        try {
            this.f15015d.put("signals", str);
            if (((Boolean) h2.y.c().b(ns.f12242z1)).booleanValue()) {
                this.f15015d.put("latency", g2.t.b().b() - this.f15016e);
            }
            if (((Boolean) h2.y.c().b(ns.f12234y1)).booleanValue()) {
                this.f15015d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f15014c.d(this.f15015d);
        this.f15017f = true;
    }

    public final synchronized void l() {
        P5("Signal collection timeout.", 3);
    }

    public final synchronized void p() {
        if (this.f15017f) {
            return;
        }
        try {
            if (((Boolean) h2.y.c().b(ns.f12234y1)).booleanValue()) {
                this.f15015d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f15014c.d(this.f15015d);
        this.f15017f = true;
    }
}
