package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class id0 implements nd0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List f9141m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9142n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h54 f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f9144b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f9147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f9148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kd0 f9149g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final jd0 f9154l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9145c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9146d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9150h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashSet f9151i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9152j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9153k = false;

    public id0(Context context, wg0 wg0Var, kd0 kd0Var, String str, jd0 jd0Var) {
        a3.o.k(kd0Var, "SafeBrowsing config is not present.");
        this.f9147e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9144b = new LinkedHashMap();
        this.f9154l = jd0Var;
        this.f9149g = kd0Var;
        Iterator it = kd0Var.f10031e.iterator();
        while (it.hasNext()) {
            this.f9151i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f9151i.remove("cookie".toLowerCase(Locale.ENGLISH));
        h54 h54VarM = c74.M();
        h54VarM.H(9);
        h54VarM.D(str);
        h54VarM.B(str);
        i54 i54VarM = j54.M();
        String str2 = this.f9149g.f10027a;
        if (str2 != null) {
            i54VarM.u(str2);
        }
        h54VarM.A((j54) i54VarM.q());
        w64 w64VarM = x64.M();
        w64VarM.w(f3.e.a(this.f9147e).g());
        String str3 = wg0Var.f16723a;
        if (str3 != null) {
            w64VarM.u(str3);
        }
        long jA = x2.f.f().a(this.f9147e);
        if (jA > 0) {
            w64VarM.v(jA);
        }
        h54VarM.z((x64) w64VarM.q());
        this.f9143a = h54VarM;
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final void a(String str, Map map, int i8) {
        synchronized (this.f9150h) {
            if (i8 == 3) {
                this.f9153k = true;
            }
            if (this.f9144b.containsKey(str)) {
                if (i8 == 3) {
                    ((u64) this.f9144b.get(str)).y(4);
                }
                return;
            }
            u64 u64VarN = v64.N();
            int iA = t64.a(i8);
            if (iA != 0) {
                u64VarN.y(iA);
            }
            u64VarN.v(this.f9144b.size());
            u64VarN.x(str);
            u54 u54VarM = x54.M();
            if (!this.f9151i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f9151i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        s54 s54VarM = t54.M();
                        s54VarM.u(rz3.M(str2));
                        s54VarM.v(rz3.M(str3));
                        u54VarM.u((t54) s54VarM.q());
                    }
                }
            }
            u64VarN.w((x54) u54VarM.q());
            this.f9144b.put(str, u64VarN);
        }
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final void b(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f9149g.f10029c && !this.f9152j) {
            g2.t.r();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e8) {
                        e = e8;
                        qg0.e("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e9) {
                    e = e9;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            qg0.g("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e10) {
                        qg0.e("Fail to capture the webview", e10);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                md0.a("Failed to capture the webview bitmap.");
                return;
            }
            this.f9152j = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.ed0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7266a.e(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                eh0.f7322a.execute(runnable);
            }
        }
    }

    final /* synthetic */ x3.d c(Map map) {
        u64 u64Var;
        x3.d dVarM;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f9150h) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.f9150h) {
                                u64Var = (u64) this.f9144b.get(str);
                            }
                            if (u64Var == null) {
                                md0.a("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i8 = 0; i8 < length; i8++) {
                                    u64Var.u(jSONArrayOptJSONArray.getJSONObject(i8).getString("threat_type"));
                                }
                                this.f9148f = (length > 0) | this.f9148f;
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                if (((Boolean) ru.f14341b.e()).booleanValue()) {
                    qg0.c("Failed to get SafeBrowsing metadata", e8);
                }
                return zf3.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f9148f) {
            synchronized (this.f9150h) {
                this.f9143a.H(10);
            }
        }
        boolean z7 = this.f9148f;
        if (!(z7 && this.f9149g.f10033g) && (!(this.f9153k && this.f9149g.f10032f) && (z7 || !this.f9149g.f10030d))) {
            return zf3.h(null);
        }
        synchronized (this.f9150h) {
            Iterator it = this.f9144b.values().iterator();
            while (it.hasNext()) {
                this.f9143a.w((v64) ((u64) it.next()).q());
            }
            this.f9143a.u(this.f9145c);
            this.f9143a.v(this.f9146d);
            if (md0.b()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.f9143a.F() + "\n  clickUrl: " + this.f9143a.E() + "\n  resources: \n");
                for (v64 v64Var : this.f9143a.G()) {
                    sb.append("    [");
                    sb.append(v64Var.M());
                    sb.append("] ");
                    sb.append(v64Var.P());
                }
                md0.a(sb.toString());
            }
            x3.d dVarB = new j2.s0(this.f9147e).b(1, this.f9149g.f10028b, null, ((c74) this.f9143a.q()).g());
            if (md0.b()) {
                dVarB.c(new Runnable() { // from class: com.google.android.gms.internal.ads.fd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        md0.a("Pinged SB successfully.");
                    }
                }, eh0.f7322a);
            }
            dVarM = zf3.m(dVarB, new z73() { // from class: com.google.android.gms.internal.ads.gd0
                @Override // com.google.android.gms.internal.ads.z73
                public final Object apply(Object obj) {
                    int i9 = id0.f9142n;
                    return null;
                }
            }, eh0.f7327f);
        }
        return dVarM;
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final void d0(String str) {
        synchronized (this.f9150h) {
            if (str == null) {
                this.f9143a.x();
            } else {
                this.f9143a.y(str);
            }
        }
    }

    final /* synthetic */ void e(Bitmap bitmap) {
        oz3 oz3VarJ = rz3.J();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, oz3VarJ);
        synchronized (this.f9150h) {
            h54 h54Var = this.f9143a;
            n64 n64VarM = p64.M();
            n64VarM.u(oz3VarJ.c());
            n64VarM.v("image/png");
            n64VarM.w(2);
            h54Var.C((p64) n64VarM.q());
        }
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final kd0 j() {
        return this.f9149g;
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final void m() {
        synchronized (this.f9150h) {
            this.f9144b.keySet();
            x3.d dVarH = zf3.h(Collections.emptyMap());
            gf3 gf3Var = new gf3() { // from class: com.google.android.gms.internal.ads.dd0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f6687a.c((Map) obj);
                }
            };
            lg3 lg3Var = eh0.f7327f;
            x3.d dVarN = zf3.n(dVarH, gf3Var, lg3Var);
            x3.d dVarO = zf3.o(dVarN, 10L, TimeUnit.SECONDS, eh0.f7325d);
            zf3.r(dVarN, new hd0(this, dVarO), lg3Var);
            f9141m.add(dVarO);
        }
    }

    @Override // com.google.android.gms.internal.ads.nd0
    public final boolean r() {
        return e3.m.d() && this.f9149g.f10029c && !this.f9152j;
    }
}
