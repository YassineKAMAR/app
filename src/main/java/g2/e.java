package g2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.dy2;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.ey2;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.gf3;
import com.google.android.gms.internal.ads.hh0;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.ty2;
import com.google.android.gms.internal.ads.v30;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.y30;
import com.google.android.gms.internal.ads.zf3;
import h2.y;
import j2.v1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21948b = 0;

    public final void a(Context context, wg0 wg0Var, String str, Runnable runnable, ty2 ty2Var) {
        b(context, wg0Var, true, null, str, null, runnable, ty2Var);
    }

    final void b(Context context, wg0 wg0Var, boolean z7, rf0 rf0Var, String str, String str2, Runnable runnable, final ty2 ty2Var) {
        PackageInfo packageInfoF;
        if (t.b().b() - this.f21948b < 5000) {
            qg0.g("Not retrying to fetch app settings");
            return;
        }
        this.f21948b = t.b().b();
        if (rf0Var != null && !TextUtils.isEmpty(rf0Var.c())) {
            if (t.b().a() - rf0Var.a() <= ((Long) y.c().b(ns.U3)).longValue() && rf0Var.i()) {
                return;
            }
        }
        if (context == null) {
            qg0.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            qg0.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f21947a = applicationContext;
        final ey2 ey2VarA = dy2.a(context, 4);
        ey2VarA.o();
        c40 c40VarA = t.h().a(this.f21947a, wg0Var, ty2Var);
        v30 v30Var = y30.f17575b;
        r30 r30VarA = c40VarA.a("google.afma.config.fetchAppSettings", v30Var, v30Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z7);
            jSONObject.put("pn", context.getPackageName());
            fs fsVar = ns.f12021a;
            jSONObject.put("experiment_ids", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, y.a().a()));
            jSONObject.put("js", wg0Var.f16723a);
            try {
                ApplicationInfo applicationInfo = this.f21947a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = f3.e.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                v1.k("Error fetching PackageInfo.");
            }
            x3.d dVarB = r30VarA.b(jSONObject);
            gf3 gf3Var = new gf3() { // from class: g2.d
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) throws JSONException {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        t.q().h().E(jSONObject2.getString("appSettingsJson"));
                    }
                    ey2 ey2Var = ey2VarA;
                    ty2 ty2Var2 = ty2Var;
                    ey2Var.C0(zOptBoolean);
                    ty2Var2.b(ey2Var.u());
                    return zf3.h(null);
                }
            };
            lg3 lg3Var = eh0.f7327f;
            x3.d dVarN = zf3.n(dVarB, gf3Var, lg3Var);
            if (runnable != null) {
                dVarB.c(runnable, lg3Var);
            }
            hh0.a(dVarN, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e8) {
            qg0.e("Error requesting application settings", e8);
            ey2VarA.E0(e8);
            ey2VarA.C0(false);
            ty2Var.b(ey2VarA.u());
        }
    }

    public final void c(Context context, wg0 wg0Var, String str, rf0 rf0Var, ty2 ty2Var) {
        b(context, wg0Var, false, rf0Var, rf0Var != null ? rf0Var.b() : null, str, null, ty2Var);
    }
}
