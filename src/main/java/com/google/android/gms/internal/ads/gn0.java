package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes.dex */
public final class gn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hn0 f8414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fn0 f8415b;

    public gn0(hn0 hn0Var, fn0 fn0Var) {
        this.f8415b = fn0Var;
        this.f8414a = hn0Var;
    }

    final /* synthetic */ void a(String str) {
        Uri uri = Uri.parse(str);
        mm0 mm0VarA0 = ((ym0) this.f8415b.f7821a).A0();
        if (mm0VarA0 == null) {
            qg0.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            mm0VarA0.j0(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.on0] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r02 = this.f8414a;
            gh ghVarQ = r02.Q();
            if (ghVarQ == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                ch chVarC = ghVarQ.c();
                if (r02.getContext() != null) {
                    hn0 hn0Var = this.f8414a;
                    return chVarC.e(hn0Var.getContext(), str, (View) hn0Var, hn0Var.r());
                }
                str2 = "Context is null, ignoring.";
            }
        }
        j2.v1.k(str2);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.hn0, com.google.android.gms.internal.ads.on0] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r02 = this.f8414a;
        gh ghVarQ = r02.Q();
        if (ghVarQ == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            ch chVarC = ghVarQ.c();
            if (r02.getContext() != null) {
                hn0 hn0Var = this.f8414a;
                return chVarC.g(hn0Var.getContext(), (View) hn0Var, hn0Var.r());
            }
            str = "Context is null, ignoring.";
        }
        j2.v1.k(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            qg0.g("URL is empty, ignoring message");
        } else {
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dn0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6822a.a(str);
                }
            });
        }
    }
}
