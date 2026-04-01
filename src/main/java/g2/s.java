package g2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a90;
import com.google.android.gms.internal.ads.d90;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.wt;
import h2.a1;
import h2.c0;
import h2.c5;
import h2.e1;
import h2.f0;
import h2.f2;
import h2.h1;
import h2.i0;
import h2.k4;
import h2.m2;
import h2.p2;
import h2.r0;
import h2.r4;
import h2.t2;
import h2.v;
import h2.w0;
import h2.w4;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wg0 f21986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w4 f21987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Future f21988c = eh0.f7322a.Z(new o(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f21989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f21990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebView f21991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f0 f21992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private gh f21993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AsyncTask f21994i;

    public s(Context context, w4 w4Var, String str, wg0 wg0Var) {
        this.f21989d = context;
        this.f21986a = wg0Var;
        this.f21987b = w4Var;
        this.f21991f = new WebView(context);
        this.f21990e = new r(context, str);
        O5(0);
        this.f21991f.setVerticalScrollBarEnabled(false);
        this.f21991f.getSettings().setJavaScriptEnabled(true);
        this.f21991f.setWebViewClient(new m(this));
        this.f21991f.setOnTouchListener(new n(this));
    }

    static /* bridge */ /* synthetic */ String U5(s sVar, String str) {
        if (sVar.f21993h == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = sVar.f21993h.a(uriA, sVar.f21989d, null, null);
        } catch (hh e8) {
            qg0.h("Unable to process ad data", e8);
        }
        return uriA.toString();
    }

    static /* bridge */ /* synthetic */ void X5(s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f21989d.startActivity(intent);
    }

    @Override // h2.s0
    public final String B() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // h2.s0
    public final String C() {
        return null;
    }

    @Override // h2.s0
    public final void D() {
        a3.o.e("destroy must be called on the main UI thread.");
        this.f21994i.cancel(true);
        this.f21988c.cancel(true);
        this.f21991f.destroy();
        this.f21991f = null;
    }

    @Override // h2.s0
    public final boolean E0() {
        return false;
    }

    @Override // h2.s0
    public final String G() {
        return null;
    }

    @Override // h2.s0
    public final void H5(boolean z7) {
    }

    @Override // h2.s0
    public final void I2(a1 a1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void I4(boolean z7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void K5(d90 d90Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void O1(vb0 vb0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void O3(t2 t2Var) {
        throw new IllegalStateException("Unused method");
    }

    final void O5(int i8) {
        if (this.f21991f == null) {
            return;
        }
        this.f21991f.setLayoutParams(new ViewGroup.LayoutParams(-1, i8));
    }

    @Override // h2.s0
    public final void P1(k4 k4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void R() {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void R0(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void S1(f0 f0Var) {
        this.f21992g = f0Var;
    }

    @Override // h2.s0
    public final void S3(a90 a90Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void T3(r4 r4Var, i0 i0Var) {
    }

    @Override // h2.s0
    public final void W() {
        a3.o.e("pause must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final void W1(e1 e1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void a5(w4 w4Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    final int c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            v.b();
            return jg0.B(this.f21989d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // h2.s0
    public final void c5(c5 c5Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void d1(w0 w0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void f0() {
        a3.o.e("resume must be called on the main UI thread.");
    }

    @Override // h2.s0
    public final void g4(c0 c0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void h2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void l0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final void m4(f2 f2Var) {
    }

    @Override // h2.s0
    public final Bundle p() {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final boolean p5() {
        return false;
    }

    @Override // h2.s0
    public final w4 q() {
        return this.f21987b;
    }

    @Override // h2.s0
    public final f0 r() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // h2.s0
    public final void r4(h1 h1Var) {
    }

    @Override // h2.s0
    public final m2 s() {
        return null;
    }

    @Override // h2.s0
    public final void s4(g3.a aVar) {
    }

    @Override // h2.s0
    public final a1 t() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // h2.s0
    public final void t2(nt ntVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // h2.s0
    public final p2 u() {
        return null;
    }

    @Override // h2.s0
    public final g3.a v() {
        a3.o.e("getAdFrame must be called on the main UI thread.");
        return g3.b.k3(this.f21991f);
    }

    @Override // h2.s0
    public final boolean v2(r4 r4Var) {
        a3.o.k(this.f21991f, "This Search Ad has already been torn down");
        this.f21990e.f(r4Var, this.f21986a);
        this.f21994i = new q(this, null).execute(new Void[0]);
        return true;
    }

    final String y() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) wt.f16944d.e());
        builder.appendQueryParameter("query", this.f21990e.d());
        builder.appendQueryParameter("pubId", this.f21990e.c());
        builder.appendQueryParameter("mappver", this.f21990e.a());
        Map mapE = this.f21990e.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        gh ghVar = this.f21993h;
        if (ghVar != null) {
            try {
                uriBuild = ghVar.b(uriBuild, this.f21989d);
            } catch (hh e8) {
                qg0.h("Unable to process ad data", e8);
            }
        }
        return z() + "#" + uriBuild.getEncodedQuery();
    }

    final String z() {
        String strB = this.f21990e.b();
        if (true == TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((String) wt.f16944d.e());
    }
}
