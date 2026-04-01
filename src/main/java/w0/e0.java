package w0;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f27079a;

    public e0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f27079a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // w0.d0
    public String[] a() {
        return this.f27079a.getSupportedFeatures();
    }

    @Override // w0.d0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) r7.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f27079a.getWebkitToCompatConverter());
    }
}
