package m3;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f24806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24807c;

    public r0(t0 t0Var, Handler handler, y0 y0Var) {
        super(t0Var);
        this.f24807c = false;
        this.f24805a = handler;
        this.f24806b = y0Var;
    }

    static /* bridge */ /* synthetic */ boolean e(r0 r0Var, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.f24805a.post(new Runnable() { // from class: m3.o0
            @Override // java.lang.Runnable
            public final void run() {
                q1.a(this.f24783a, str3);
            }
        });
    }
}
