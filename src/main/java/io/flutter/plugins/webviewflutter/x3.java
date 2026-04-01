package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugins.webviewflutter.n;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class x3 implements n.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23641b;

    public x3(s5.c cVar, b4 b4Var) {
        this.f23640a = cVar;
        this.f23641b = b4Var;
    }

    private GeolocationPermissions.Callback b(Long l8) {
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) this.f23641b.i(l8.longValue());
        Objects.requireNonNull(callback);
        return callback;
    }

    @Override // io.flutter.plugins.webviewflutter.n.m
    public void a(Long l8, String str, Boolean bool, Boolean bool2) {
        b(l8).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
