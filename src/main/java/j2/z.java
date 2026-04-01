package j2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.et1;
import com.google.android.gms.internal.ads.ft1;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24076a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24077b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24078c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24079d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24080e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f24081f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ft1 f24082g;

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String o(Context context, String str, String str2) {
        String strValueOf;
        String str3;
        HashMap map = new HashMap();
        map.put("User-Agent", g2.t.r().D(context, str2));
        x3.d dVarB = new s0(context).b(0, str, map, null);
        try {
            return (String) dVarB.get(((Integer) h2.y.c().b(ns.E4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            strValueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            qg0.e(str3.concat(strValueOf), e);
            dVarB.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            e = e9;
            strValueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            qg0.e(str3.concat(strValueOf), e);
            dVarB.cancel(true);
            return null;
        } catch (Exception e10) {
            qg0.e("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.f24076a
            monitor-enter(r0)
            java.lang.String r1 = r4.f24077b     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            g2.t.r()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            r3 = 1
            byte[] r1 = e3.k.d(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            goto L30
        L29:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.internal.ads.qg0.b(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = ""
        L30:
            r4.f24077b = r2     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            g2.t.r()     // Catch: java.lang.Throwable -> L7b
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r4.f24077b = r1     // Catch: java.lang.Throwable -> L7b
            g2.t.r()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.f24077b     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.write(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.close()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            goto L64
        L5e:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.internal.ads.qg0.e(r1, r5)     // Catch: java.lang.Throwable -> L7b
        L64:
            java.lang.String r5 = r4.f24077b     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.z.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final ft1 a() {
        return this.f24082g;
    }

    public final String b() {
        String str;
        synchronized (this.f24076a) {
            str = this.f24078c;
        }
        return str;
    }

    public final void c(Context context) {
        ft1 ft1Var;
        if (!((Boolean) h2.y.c().b(ns.U8)).booleanValue() || (ft1Var = this.f24082g) == null) {
            return;
        }
        ft1Var.h(new w(this, context), et1.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        g2.t.r();
        k2.t(context, p(context, (String) h2.y.c().b(ns.A4), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = p(context, (String) h2.y.c().b(ns.D4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        g2.t.r();
        k2.k(context, str, builderBuildUpon.build().toString());
    }

    public final void f(boolean z7) {
        synchronized (this.f24076a) {
            this.f24080e = z7;
            if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
                g2.t.q().h().f(z7);
                ft1 ft1Var = this.f24082g;
                if (ft1Var != null) {
                    ft1Var.k(z7);
                }
            }
        }
    }

    public final void g(ft1 ft1Var) {
        this.f24082g = ft1Var;
    }

    public final void h(boolean z7) {
        synchronized (this.f24076a) {
            this.f24079d = z7;
        }
    }

    protected final void i(Context context, String str, boolean z7, boolean z8) {
        if (context instanceof Activity) {
            k2.f23991k.post(new y(this, context, str, z7, z8));
        } else {
            qg0.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) h2.y.c().b(ns.C4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            qg0.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strO.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
                x1 x1VarH = g2.t.q().h();
                if (true != zEquals) {
                    str = "";
                }
                x1VarH.a(str);
            }
            return zEquals;
        } catch (JSONException e8) {
            qg0.h("Fail to get debug mode response json.", e8);
            return false;
        }
    }

    final boolean k(Context context, String str, String str2) {
        String strO = o(context, p(context, (String) h2.y.c().b(ns.B4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            qg0.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strO.trim());
            String strOptString = jSONObject.optString("gct");
            this.f24081f = jSONObject.optString("status");
            if (((Boolean) h2.y.c().b(ns.U8)).booleanValue()) {
                boolean z7 = "0".equals(this.f24081f) || "2".equals(this.f24081f);
                f(z7);
                x1 x1VarH = g2.t.q().h();
                if (!z7) {
                    str = "";
                }
                x1VarH.a(str);
            }
            synchronized (this.f24076a) {
                this.f24078c = strOptString;
            }
            return true;
        } catch (JSONException e8) {
            qg0.h("Fail to get in app preview response json.", e8);
            return false;
        }
    }

    public final boolean l() {
        boolean z7;
        synchronized (this.f24076a) {
            z7 = this.f24080e;
        }
        return z7;
    }

    public final boolean m() {
        boolean z7;
        synchronized (this.f24076a) {
            z7 = this.f24079d;
        }
        return z7;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        qg0.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
