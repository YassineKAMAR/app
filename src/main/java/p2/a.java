package p2;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.jq1;
import com.google.android.gms.internal.ads.jz2;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f25476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gh f25477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jq1 f25479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f25480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lg3 f25481g = eh0.f7326e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jz2 f25482h;

    a(WebView webView, gh ghVar, jq1 jq1Var, jz2 jz2Var) {
        this.f25476b = webView;
        Context context = webView.getContext();
        this.f25475a = context;
        this.f25477c = ghVar;
        this.f25479e = jq1Var;
        ns.a(context);
        this.f25478d = ((Integer) h2.y.c().b(ns.i9)).intValue();
        this.f25480f = ((Boolean) h2.y.c().b(ns.j9)).booleanValue();
        this.f25482h = jz2Var;
    }

    final /* synthetic */ void b(Bundle bundle, q2.b bVar) {
        CookieManager cookieManagerB = g2.t.s().b(this.f25475a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerB != null ? cookieManagerB.acceptThirdPartyCookies(this.f25476b) : false);
        Context context = this.f25475a;
        z1.b bVar2 = z1.b.BANNER;
        g.a aVar = new g.a();
        aVar.b(AdMobAdapter.class, bundle);
        q2.a.a(context, bVar2, aVar.c(), bVar);
    }

    final /* synthetic */ void c(String str) {
        Uri uriA = Uri.parse(str);
        try {
            uriA = this.f25477c.a(uriA, this.f25475a, this.f25476b, null);
        } catch (hh e8) {
            qg0.c("Failed to append the click signal to URL: ", e8);
            g2.t.q().u(e8, "TaggingLibraryJsInterface.recordClick");
        }
        this.f25482h.c(uriA.toString(), null);
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jA = g2.t.b().a();
            String strH = this.f25477c.c().h(this.f25475a, str, this.f25476b);
            if (this.f25480f) {
                y.c(this.f25479e, null, "csg", new Pair("clat", String.valueOf(g2.t.b().a() - jA)));
            }
            return strH;
        } catch (RuntimeException e8) {
            qg0.e("Exception getting click signals. ", e8);
            g2.t.q().u(e8, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i8) {
        if (i8 <= 0) {
            qg0.d("Invalid timeout for getting click signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) eh0.f7322a.Z(new Callable() { // from class: p2.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f25577a.getClickSignals(str);
                }
            }).get(Math.min(i8, this.f25478d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            qg0.e("Exception getting click signals with timeout. ", e8);
            g2.t.q().u(e8, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        g2.t.r();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final t tVar = new t(this, string);
        if (((Boolean) h2.y.c().b(ns.l9)).booleanValue()) {
            this.f25481g.execute(new Runnable() { // from class: p2.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25582a.b(bundle, tVar);
                }
            });
        } else {
            Context context = this.f25475a;
            z1.b bVar = z1.b.BANNER;
            g.a aVar = new g.a();
            aVar.b(AdMobAdapter.class, bundle);
            q2.a.a(context, bVar, aVar.c(), tVar);
        }
        return string;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jA = g2.t.b().a();
            String strG = this.f25477c.c().g(this.f25475a, this.f25476b, null);
            if (this.f25480f) {
                y.c(this.f25479e, null, "vsg", new Pair("vlat", String.valueOf(g2.t.b().a() - jA)));
            }
            return strG;
        } catch (RuntimeException e8) {
            qg0.e("Exception getting view signals. ", e8);
            g2.t.q().u(e8, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i8) {
        if (i8 <= 0) {
            qg0.d("Invalid timeout for getting view signals. Timeout=" + i8);
            return "";
        }
        try {
            return (String) eh0.f7322a.Z(new Callable() { // from class: p2.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f25565a.getViewSignals();
                }
            }).get(Math.min(i8, this.f25478d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            qg0.e("Exception getting view signals with timeout. ", e8);
            g2.t.q().u(e8, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) h2.y.c().b(ns.n9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        eh0.f7322a.execute(new Runnable() { // from class: p2.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f25572a.c(str);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i8;
        int i9;
        int i10;
        float f8;
        int i11;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i8 = jSONObject.getInt("x");
            i9 = jSONObject.getInt("y");
            i10 = jSONObject.getInt("duration_ms");
            f8 = (float) jSONObject.getDouble("force");
            i11 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e8) {
            e = e8;
        }
        try {
            this.f25477c.d(MotionEvent.obtain(0L, i10, i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? -1 : 3 : 2 : 1 : 0, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e9) {
            e = e9;
            qg0.e("Failed to parse the touch string. ", e);
            g2.t.q().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e10) {
            e = e10;
            qg0.e("Failed to parse the touch string. ", e);
            g2.t.q().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
