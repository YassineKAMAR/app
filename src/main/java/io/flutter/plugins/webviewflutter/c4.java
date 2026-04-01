package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.s6;

/* JADX INFO: loaded from: classes.dex */
public class c4 implements n.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f23411a;

    public c4(b4 b4Var) {
        this.f23411a = b4Var;
    }

    @Override // io.flutter.plugins.webviewflutter.n.r
    public void a(Long l8) {
        Object objI = this.f23411a.i(l8.longValue());
        if (objI instanceof s6.a) {
            ((s6.a) objI).destroy();
        }
        this.f23411a.m(l8.longValue());
    }
}
