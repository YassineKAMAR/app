package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j extends n.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23466b;

    public j(s5.c cVar, b4 b4Var) {
        super(cVar);
        this.f23466b = b4Var;
    }

    private static n.h f(int i8) {
        if (i8 == 0) {
            return n.h.OPEN;
        }
        if (i8 == 1) {
            return n.h.OPEN_MULTIPLE;
        }
        if (i8 == 3) {
            return n.h.SAVE;
        }
        throw new IllegalArgumentException(String.format("Unsupported FileChooserMode: %d", Integer.valueOf(i8)));
    }

    public void e(WebChromeClient.FileChooserParams fileChooserParams, n.i.a<Void> aVar) {
        if (this.f23466b.f(fileChooserParams)) {
            return;
        }
        b(Long.valueOf(this.f23466b.c(fileChooserParams)), Boolean.valueOf(fileChooserParams.isCaptureEnabled()), Arrays.asList(fileChooserParams.getAcceptTypes()), f(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), aVar);
    }
}
