package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;

/* JADX INFO: loaded from: classes.dex */
public class g4 extends n.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23443b;

    public g4(s5.c cVar, b4 b4Var) {
        super(cVar);
        this.f23443b = b4Var;
    }

    private long e(f4 f4Var) {
        Long lH = this.f23443b.h(f4Var);
        if (lH != null) {
            return lH.longValue();
        }
        throw new IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    public void f(f4 f4Var, String str, n.s.a<Void> aVar) {
        super.d(Long.valueOf(e(f4Var)), str, aVar);
    }
}
