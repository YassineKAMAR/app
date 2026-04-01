package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class g extends n.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23438b;

    public g(s5.c cVar, b4 b4Var) {
        super(cVar);
        this.f23438b = b4Var;
    }

    private long e(DownloadListener downloadListener) {
        Long lH = this.f23438b.h(downloadListener);
        if (lH != null) {
            return lH.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public void f(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j8, n.f.a<Void> aVar) {
        d(Long.valueOf(e(downloadListener)), str, str2, str3, str4, Long.valueOf(j8), aVar);
    }
}
