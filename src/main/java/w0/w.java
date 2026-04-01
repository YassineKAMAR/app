package w0;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f27082a = new String[0];

    @Override // w0.d0
    public String[] a() {
        return f27082a;
    }

    @Override // w0.d0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
