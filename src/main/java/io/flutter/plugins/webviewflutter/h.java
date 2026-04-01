package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.h;
import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class h implements n.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f23447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f23448c;

    public static class a {
        public b a(g gVar) {
            return new b(gVar);
        }
    }

    public static class b implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f23449a;

        public b(g gVar) {
            this.f23449a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(Void r02) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
            this.f23449a.f(this, str, str2, str3, str4, j8, new n.f.a() { // from class: io.flutter.plugins.webviewflutter.i
                @Override // io.flutter.plugins.webviewflutter.n.f.a
                public final void a(Object obj) {
                    h.b.b((Void) obj);
                }
            });
        }
    }

    public h(b4 b4Var, a aVar, g gVar) {
        this.f23446a = b4Var;
        this.f23447b = aVar;
        this.f23448c = gVar;
    }

    @Override // io.flutter.plugins.webviewflutter.n.g
    public void a(Long l8) {
        this.f23446a.b(this.f23447b.a(this.f23448c), l8.longValue());
    }
}
