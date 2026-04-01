package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kl f15139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f15143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f15144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f15145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f15146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f15147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f15148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f15149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f15150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f15151p;

    public tl() {
        kl klVar = new kl();
        this.f15136a = false;
        this.f15137b = false;
        this.f15139d = klVar;
        this.f15138c = new Object();
        this.f15141f = ((Long) au.f5491d.e()).intValue();
        this.f15142g = ((Long) au.f5488a.e()).intValue();
        this.f15143h = ((Long) au.f5492e.e()).intValue();
        this.f15144i = ((Long) au.f5490c.e()).intValue();
        this.f15145j = ((Integer) h2.y.c().b(ns.S)).intValue();
        this.f15146k = ((Integer) h2.y.c().b(ns.T)).intValue();
        this.f15147l = ((Integer) h2.y.c().b(ns.U)).intValue();
        this.f15140e = ((Long) au.f5493f.e()).intValue();
        this.f15148m = (String) h2.y.c().b(ns.W);
        this.f15149n = ((Boolean) h2.y.c().b(ns.X)).booleanValue();
        this.f15150o = ((Boolean) h2.y.c().b(ns.Y)).booleanValue();
        this.f15151p = ((Boolean) h2.y.c().b(ns.Z)).booleanValue();
        setName("ContentFetchTask");
    }

    public final jl a() {
        return this.f15139d.a(this.f15151p);
    }

    final sl b(View view, jl jlVar) {
        if (view == null) {
            return new sl(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new sl(this, 0, 0);
            }
            jlVar.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new sl(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof fm0)) {
            WebView webView = (WebView) view;
            if (!e3.m.d()) {
                return new sl(this, 0, 0);
            }
            jlVar.h();
            webView.post(new rl(this, jlVar, webView, globalVisibleRect));
            return new sl(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new sl(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            sl slVarB = b(viewGroup.getChildAt(i10), jlVar);
            i8 += slVarB.f14756a;
            i9 += slVarB.f14757b;
        }
        return new sl(this, i8, i9);
    }

    final void c(View view) {
        try {
            jl jlVar = new jl(this.f15141f, this.f15142g, this.f15143h, this.f15144i, this.f15145j, this.f15146k, this.f15147l, this.f15150o);
            Context contextB = g2.t.d().b();
            if (contextB != null && !TextUtils.isEmpty(this.f15148m)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) h2.y.c().b(ns.V), "id", contextB.getPackageName()));
                if (str != null && str.equals(this.f15148m)) {
                    return;
                }
            }
            sl slVarB = b(view, jlVar);
            jlVar.m();
            if (slVarB.f14756a == 0 && slVarB.f14757b == 0) {
                return;
            }
            int i8 = slVarB.f14757b;
            if (i8 != 0) {
                if (i8 == 0) {
                }
                this.f15139d.b(jlVar);
            } else if (jlVar.c() == 0) {
                return;
            }
            if (this.f15139d.d(jlVar)) {
                return;
            }
            this.f15139d.b(jlVar);
        } catch (Exception e8) {
            qg0.e("Exception in fetchContentOnUIThread", e8);
            g2.t.q().u(e8, "ContentFetchTask.fetchContent");
        }
    }

    final void d(jl jlVar, WebView webView, String str, boolean z7) {
        jlVar.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.f15149n || TextUtils.isEmpty(webView.getTitle())) {
                    jlVar.l(strOptString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    jlVar.l(webView.getTitle() + "\n" + strOptString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (jlVar.o()) {
                this.f15139d.c(jlVar);
            }
        } catch (JSONException unused) {
            qg0.b("Json string may be malformed.");
        } catch (Throwable th) {
            qg0.c("Failed to get webview content.", th);
            g2.t.q().u(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.f15138c) {
            if (this.f15136a) {
                qg0.b("Content hash thread already started, quitting...");
            } else {
                this.f15136a = true;
                start();
            }
        }
    }

    public final void f() {
        synchronized (this.f15138c) {
            this.f15137b = true;
            qg0.b("ContentFetchThread: paused, pause = true");
        }
    }

    public final void g() {
        synchronized (this.f15138c) {
            this.f15137b = false;
            this.f15138c.notifyAll();
            qg0.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.f15137b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = g2.t.d().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.google.android.gms.internal.ads.qg0.b("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        g2.t.q().u(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.qg0.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        com.google.android.gms.internal.ads.qg0.e("Error in ContentFetchTask", r0);
        g2.t.q().u(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        com.google.android.gms.internal.ads.qg0.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00da->B:71:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tl.run():void");
    }
}
