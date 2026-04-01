package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s13 implements r03 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s13 f14462i = new s13();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Handler f14463j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f14464k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f14465l = new n13();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f14466m = new o13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14468b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f14474h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14467a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14469c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f14470d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k13 f14472f = new k13();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t03 f14471e = new t03();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l13 f14473g = new l13(new v13());

    s13() {
    }

    public static s13 d() {
        return f14462i;
    }

    static /* bridge */ /* synthetic */ void g(s13 s13Var) {
        s13Var.f14468b = 0;
        s13Var.f14470d.clear();
        s13Var.f14469c = false;
        for (uz2 uz2Var : i03.a().b()) {
        }
        s13Var.f14474h = System.nanoTime();
        s13Var.f14472f.i();
        long jNanoTime = System.nanoTime();
        s03 s03VarA = s13Var.f14471e.a();
        if (s13Var.f14472f.e().size() > 0) {
            for (String str : s13Var.f14472f.e()) {
                JSONObject jSONObjectA = s03VarA.a(null);
                View viewA = s13Var.f14472f.a(str);
                s03 s03VarB = s13Var.f14471e.b();
                String strC = s13Var.f14472f.c(str);
                if (strC != null) {
                    JSONObject jSONObjectA2 = s03VarB.a(viewA);
                    c13.b(jSONObjectA2, str);
                    try {
                        jSONObjectA2.put("notVisibleReason", strC);
                    } catch (JSONException e8) {
                        d13.a("Error with setting not visible reason", e8);
                    }
                    c13.c(jSONObjectA, jSONObjectA2);
                }
                c13.f(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                s13Var.f14473g.c(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (s13Var.f14472f.f().size() > 0) {
            JSONObject jSONObjectA3 = s03VarA.a(null);
            s13Var.k(null, s03VarA, jSONObjectA3, 1, false);
            c13.f(jSONObjectA3);
            s13Var.f14473g.d(jSONObjectA3, s13Var.f14472f.f(), jNanoTime);
        } else {
            s13Var.f14473g.b();
        }
        s13Var.f14472f.g();
        long jNanoTime2 = System.nanoTime() - s13Var.f14474h;
        if (s13Var.f14467a.size() > 0) {
            for (r13 r13Var : s13Var.f14467a) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                r13Var.k();
                if (r13Var instanceof q13) {
                    ((q13) r13Var).j();
                }
            }
        }
    }

    private final void k(View view, s03 s03Var, JSONObject jSONObject, int i8, boolean z7) {
        s03Var.b(view, jSONObject, this, i8 == 1, z7);
    }

    private static final void l() {
        Handler handler = f14464k;
        if (handler != null) {
            handler.removeCallbacks(f14466m);
            f14464k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.r03
    public final void a(View view, s03 s03Var, JSONObject jSONObject, boolean z7) {
        int iK;
        boolean z8;
        if (i13.b(view) != null || (iK = this.f14472f.k(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = s03Var.a(view);
        c13.c(jSONObject, jSONObjectA);
        String strD = this.f14472f.d(view);
        if (strD != null) {
            c13.b(jSONObjectA, strD);
            try {
                jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f14472f.j(view)));
            } catch (JSONException e8) {
                d13.a("Error with setting has window focus", e8);
            }
            this.f14472f.h();
        } else {
            j13 j13VarB = this.f14472f.b(view);
            if (j13VarB != null) {
                l03 l03VarA = j13VarB.a();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = j13VarB.b();
                int size = arrayListB.size();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put((String) arrayListB.get(i8));
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", l03VarA.d());
                    jSONObjectA.put("friendlyObstructionPurpose", l03VarA.a());
                    jSONObjectA.put("friendlyObstructionReason", l03VarA.c());
                } catch (JSONException e9) {
                    d13.a("Error with setting friendly obstruction", e9);
                }
                z8 = true;
            } else {
                z8 = false;
            }
            k(view, s03Var, jSONObjectA, iK, z7 || z8);
        }
        this.f14468b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f14464k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f14464k = handler;
            handler.post(f14465l);
            f14464k.postDelayed(f14466m, 200L);
        }
    }

    public final void j() {
        l();
        this.f14467a.clear();
        f14463j.post(new m13(this));
    }
}
