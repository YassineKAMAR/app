package i2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.b63;
import com.google.android.gms.internal.ads.c63;
import com.google.android.gms.internal.ads.d63;
import com.google.android.gms.internal.ads.e63;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.n73;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o63;
import com.google.android.gms.internal.ads.q63;
import com.google.android.gms.internal.ads.r63;
import com.google.android.gms.internal.ads.s63;
import com.google.android.gms.internal.ads.t63;
import j2.v1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r63 f22491f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fm0 f22488c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22490e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22486a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d63 f22489d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22487b = null;

    private final t63 l() {
        s63 s63VarC = t63.c();
        if (!((Boolean) h2.y.c().b(ns.va)).booleanValue() || TextUtils.isEmpty(this.f22487b)) {
            String str = this.f22486a;
            if (str != null) {
                s63VarC.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            s63VarC.a(this.f22487b);
        }
        return s63VarC.c();
    }

    private final void m() {
        if (this.f22491f == null) {
            this.f22491f = new b0(this);
        }
    }

    public final synchronized void a(fm0 fm0Var, Context context) {
        this.f22488c = fm0Var;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        e("on_play_store_bind", map);
    }

    public final void b() {
        d63 d63Var;
        if (!this.f22490e || (d63Var = this.f22489d) == null) {
            v1.k("LastMileDelivery not connected");
        } else {
            d63Var.c(l(), this.f22491f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        d63 d63Var;
        if (!this.f22490e || (d63Var = this.f22489d) == null) {
            v1.k("LastMileDelivery not connected");
            return;
        }
        b63 b63VarC = c63.c();
        if (!((Boolean) h2.y.c().b(ns.va)).booleanValue() || TextUtils.isEmpty(this.f22487b)) {
            String str = this.f22486a;
            if (str != null) {
                b63VarC.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            b63VarC.a(this.f22487b);
        }
        d63Var.d(b63VarC.c(), this.f22491f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        eh0.f7326e.execute(new Runnable() { // from class: i2.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22482a.h(str, map);
            }
        });
    }

    final void f(String str, String str2) {
        v1.k(str);
        if (this.f22488c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    public final void g() {
        d63 d63Var;
        if (!this.f22490e || (d63Var = this.f22489d) == null) {
            v1.k("LastMileDelivery not connected");
        } else {
            d63Var.a(l(), this.f22491f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        fm0 fm0Var = this.f22488c;
        if (fm0Var != null) {
            fm0Var.U(str, map);
        }
    }

    final void i(q63 q63Var) {
        if (!TextUtils.isEmpty(q63Var.b())) {
            if (!((Boolean) h2.y.c().b(ns.va)).booleanValue()) {
                this.f22486a = q63Var.b();
            }
        }
        switch (q63Var.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.f22486a = null;
                this.f22487b = null;
                this.f22490e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(q63Var.a()));
                e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void j(fm0 fm0Var, o63 o63Var) {
        if (fm0Var == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f22488c = fm0Var;
        if (!this.f22490e && !k(fm0Var.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) h2.y.c().b(ns.va)).booleanValue()) {
            this.f22487b = o63Var.g();
        }
        m();
        d63 d63Var = this.f22489d;
        if (d63Var != null) {
            d63Var.b(o63Var, this.f22491f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!n73.a(context)) {
            return false;
        }
        try {
            this.f22489d = e63.a(context);
        } catch (NullPointerException e8) {
            v1.k("Error connecting LMD Overlay service");
            g2.t.q().u(e8, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f22489d == null) {
            this.f22490e = false;
            return false;
        }
        m();
        this.f22490e = true;
        return true;
    }
}
