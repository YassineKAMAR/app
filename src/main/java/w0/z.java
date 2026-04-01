package w0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class z extends v0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebMessagePort f27088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebMessagePortBoundaryInterface f27089b;

    public z(WebMessagePort webMessagePort) {
        this.f27088a = webMessagePort;
    }

    public static WebMessagePort[] b(v0.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        int length = dVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i8 = 0; i8 < length; i8++) {
            webMessagePortArr[i8] = dVarArr[i8].a();
        }
        return webMessagePortArr;
    }

    public static v0.c c(WebMessage webMessage) {
        return g.d(webMessage);
    }

    private WebMessagePort d() {
        if (this.f27088a == null) {
            this.f27088a = c0.c().c(Proxy.getInvocationHandler(this.f27089b));
        }
        return this.f27088a;
    }

    public static v0.d[] e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        v0.d[] dVarArr = new v0.d[webMessagePortArr.length];
        for (int i8 = 0; i8 < webMessagePortArr.length; i8++) {
            dVarArr[i8] = new z(webMessagePortArr[i8]);
        }
        return dVarArr;
    }

    @Override // v0.d
    public WebMessagePort a() {
        return d();
    }
}
