package w0;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends v0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebResourceError f27046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f27047b;

    public a0(WebResourceError webResourceError) {
        this.f27046a = webResourceError;
    }

    public a0(InvocationHandler invocationHandler) {
        this.f27047b = (WebResourceErrorBoundaryInterface) r7.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f27047b == null) {
            this.f27047b = (WebResourceErrorBoundaryInterface) r7.a.a(WebResourceErrorBoundaryInterface.class, c0.c().e(this.f27046a));
        }
        return this.f27047b;
    }

    private WebResourceError d() {
        if (this.f27046a == null) {
            this.f27046a = c0.c().d(Proxy.getInvocationHandler(this.f27047b));
        }
        return this.f27046a;
    }

    @Override // v0.e
    public CharSequence a() {
        a.b bVar = b0.f27071v;
        if (bVar.c()) {
            return g.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw b0.a();
    }

    @Override // v0.e
    public int b() {
        a.b bVar = b0.f27072w;
        if (bVar.c()) {
            return g.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw b0.a();
    }
}
