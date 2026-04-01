package p2;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.ey2;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.jq1;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.qy2;
import com.google.android.gms.internal.ads.vf3;
import com.google.android.gms.internal.ads.zp1;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import j2.k2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x3.d f25566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jf0 f25567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ cf0 f25568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ey2 f25569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f25570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f25571f;

    p0(c cVar, x3.d dVar, jf0 jf0Var, cf0 cf0Var, ey2 ey2Var, long j8) {
        this.f25571f = cVar;
        this.f25566a = dVar;
        this.f25567b = jf0Var;
        this.f25568c = cf0Var;
        this.f25569d = ey2Var;
        this.f25570e = j8;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        long jA = g2.t.b().a() - this.f25570e;
        String message = th.getMessage();
        g2.t.q().u(th, "SignalGeneratorImpl.generateSignals");
        c cVar = this.f25571f;
        y.c(cVar.f25500m, cVar.f25492e, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(jA)));
        qy2 qy2VarV6 = c.v6(this.f25566a, this.f25567b);
        if (((Boolean) bu.f6043e.e()).booleanValue() && qy2VarV6 != null) {
            ey2 ey2Var = this.f25569d;
            ey2Var.E0(th);
            ey2Var.C0(false);
            qy2VarV6.a(ey2Var);
            qy2VarV6.g();
        }
        try {
            this.f25568c.c("Internal error. " + message);
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ey2 ey2Var;
        o oVar = (o) obj;
        qy2 qy2VarV6 = c.v6(this.f25566a, this.f25567b);
        if (((Boolean) h2.y.c().b(ns.z7)).booleanValue()) {
            long jA = g2.t.b().a() - this.f25570e;
            try {
                try {
                    if (oVar == null) {
                        this.f25568c.B1(null, null, null);
                        c cVar = this.f25571f;
                        y.c(cVar.f25500m, cVar.f25492e, "sgs", new Pair("rid", "-1"));
                        this.f25569d.C0(true);
                        if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(oVar.f25562b);
                            String strOptString = jSONObject.optString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, "");
                            if (TextUtils.isEmpty(strOptString)) {
                                qg0.g("The request ID is empty in request JSON.");
                                this.f25568c.c("Internal error: request ID is empty in request JSON.");
                                c cVar2 = this.f25571f;
                                y.c(cVar2.f25500m, cVar2.f25492e, "sgf", new Pair("sgf_reason", "rid_missing"));
                                ey2 ey2Var2 = this.f25569d;
                                ey2Var2.e("Request ID empty");
                                ey2Var2.C0(false);
                                if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                                    return;
                                }
                            } else {
                                c cVar3 = this.f25571f;
                                c.V5(cVar3, strOptString, oVar.f25562b, cVar3.f25492e);
                                Bundle bundle = oVar.f25563c;
                                c cVar4 = this.f25571f;
                                if (cVar4.f25505r && bundle != null && bundle.getInt(cVar4.f25507t, -1) == -1) {
                                    c cVar5 = this.f25571f;
                                    bundle.putInt(cVar5.f25507t, cVar5.f25508u.get());
                                }
                                c cVar6 = this.f25571f;
                                if (cVar6.f25504q && bundle != null && TextUtils.isEmpty(bundle.getString(cVar6.f25506s))) {
                                    if (TextUtils.isEmpty(this.f25571f.f25510w)) {
                                        c cVar7 = this.f25571f;
                                        k2 k2VarR = g2.t.r();
                                        c cVar8 = this.f25571f;
                                        cVar7.f25510w = k2VarR.D(cVar8.f25489b, cVar8.f25509v.f16723a);
                                    }
                                    c cVar9 = this.f25571f;
                                    bundle.putString(cVar9.f25506s, cVar9.f25510w);
                                }
                                this.f25568c.B1(oVar.f25561a, oVar.f25562b, bundle);
                                c cVar10 = this.f25571f;
                                jq1 jq1Var = cVar10.f25500m;
                                zp1 zp1Var = cVar10.f25492e;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(jA));
                                String str = "na";
                                if (((Boolean) h2.y.c().b(ns.m9)).booleanValue()) {
                                    try {
                                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e8) {
                                        qg0.e("Error retrieving JSONObject from the requestJson, ", e8);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str);
                                y.c(jq1Var, zp1Var, "sgs", pairArr);
                                this.f25569d.C0(true);
                                if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e9) {
                            qg0.g("Failed to create JSON object from the request string.");
                            this.f25568c.c("Internal error for request JSON: " + e9.toString());
                            c cVar11 = this.f25571f;
                            y.c(cVar11.f25500m, cVar11.f25492e, "sgf", new Pair("sgf_reason", "request_invalid"));
                            ey2 ey2Var3 = this.f25569d;
                            ey2Var3.E0(e9);
                            ey2Var3.C0(false);
                            g2.t.q().u(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e10) {
                    ey2 ey2Var4 = this.f25569d;
                    ey2Var4.E0(e10);
                    ey2Var4.C0(false);
                    qg0.e("", e10);
                    g2.t.q().u(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                        return;
                    }
                }
                ey2Var = this.f25569d;
            } catch (Throwable th) {
                if (((Boolean) bu.f6043e.e()).booleanValue() && qy2VarV6 != null) {
                    qy2VarV6.a(this.f25569d);
                    qy2VarV6.g();
                }
                throw th;
            }
        } else {
            try {
                this.f25568c.c("QueryInfo generation has been disabled.");
            } catch (RemoteException e11) {
                qg0.d("QueryInfo generation has been disabled.".concat(e11.toString()));
            }
            if (!((Boolean) bu.f6043e.e()).booleanValue() || qy2VarV6 == null) {
                return;
            }
            ey2Var = this.f25569d;
            ey2Var.e("QueryInfo generation has been disabled.");
            ey2Var.C0(false);
        }
        qy2VarV6.a(ey2Var);
        qy2VarV6.g();
    }
}
