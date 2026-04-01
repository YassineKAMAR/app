package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class em0 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f7426a;

    public em0(fm0 fm0Var) {
        this.f7426a = fm0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof fm0)) {
            return webView.getContext();
        }
        fm0 fm0Var = (fm0) webView;
        Activity activityR = fm0Var.r();
        return activityR != null ? activityR : fm0Var.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z7) {
        fm0 fm0Var;
        AlertDialog alertDialogCreate;
        g2.b bVarP;
        try {
            fm0Var = this.f7426a;
        } catch (WindowManager.BadTokenException e8) {
            qg0.h("Fail to display Dialog.", e8);
        }
        if (fm0Var != null && fm0Var.H() != null && this.f7426a.H().p() != null && (bVarP = this.f7426a.H().p()) != null && !bVarP.c()) {
            bVarP.b("window." + str + "('" + str3 + "')");
            return false;
        }
        g2.t.r();
        AlertDialog.Builder builderJ = j2.k2.j(context);
        builderJ.setTitle(str2);
        if (z7) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            alertDialogCreate = builderJ.setView(linearLayout).setPositiveButton(R.string.ok, new bm0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new am0(jsPromptResult)).setOnCancelListener(new zl0(jsPromptResult)).create();
        } else {
            alertDialogCreate = builderJ.setMessage(str3).setPositiveButton(R.string.ok, new yl0(jsResult)).setNegativeButton(R.string.cancel, new xl0(jsResult)).setOnCancelListener(new wl0(jsResult)).create();
        }
        alertDialogCreate.show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof fm0) {
            i2.s sVarL = ((fm0) webView).L();
            if (sVarL != null) {
                sVarL.k();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        qg0.g(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i8 = cm0.f6396a[consoleMessage.messageLevel().ordinal()];
        if (i8 == 1) {
            qg0.d(str);
        } else if (i8 == 2) {
            qg0.g(str);
        } else if (i8 == 3 || i8 == 4 || i8 != 5) {
            qg0.f(str);
        } else {
            qg0.b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f7426a.h0() != null) {
            webView2.setWebViewClient(this.f7426a.h0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j8);
            return;
        }
        if (j8 == 0) {
            if (j9 > j11 || j9 > 1048576) {
                j9 = 0;
            }
        } else if (j9 == 0) {
            j9 = Math.min(j8 + Math.min(131072L, j11), 1048576L);
        } else {
            if (j9 <= Math.min(1048576 - j8, j11)) {
                j8 += j9;
            }
            j9 = j8;
        }
        quotaUpdater.updateQuota(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.internal.ads.fm0 r0 = r3.f7426a
            g2.t.r()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = j2.k2.a0(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.internal.ads.fm0 r0 = r3.f7426a
            g2.t.r()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = j2.k2.a0(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.em0.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        i2.s sVarL = this.f7426a.L();
        if (sVarL == null) {
            qg0.g("Could not get ad overlay when hiding custom view.");
        } else {
            sVarL.q();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i8, WebChromeClient.CustomViewCallback customViewCallback) {
        i2.s sVarL = this.f7426a.L();
        if (sVarL == null) {
            qg0.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            sVarL.R5(view, customViewCallback);
            sVarL.P5(i8);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
