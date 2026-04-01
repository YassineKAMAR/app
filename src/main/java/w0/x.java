package w0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
public class x extends v0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f27083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f27084b;

    public x(SafeBrowsingResponse safeBrowsingResponse) {
        this.f27083a = safeBrowsingResponse;
    }

    public x(InvocationHandler invocationHandler) {
        this.f27084b = (SafeBrowsingResponseBoundaryInterface) r7.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f27084b == null) {
            this.f27084b = (SafeBrowsingResponseBoundaryInterface) r7.a.a(SafeBrowsingResponseBoundaryInterface.class, c0.c().b(this.f27083a));
        }
        return this.f27084b;
    }

    private SafeBrowsingResponse c() {
        if (this.f27083a == null) {
            this.f27083a = c0.c().a(Proxy.getInvocationHandler(this.f27084b));
        }
        return this.f27083a;
    }

    @Override // v0.a
    public void a(boolean z7) {
        a.f fVar = b0.f27075z;
        if (fVar.c()) {
            q.e(c(), z7);
        } else {
            if (!fVar.d()) {
                throw b0.a();
            }
            b().showInterstitial(z7);
        }
    }
}
