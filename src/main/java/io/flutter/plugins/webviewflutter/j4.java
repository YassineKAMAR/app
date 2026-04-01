package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugins.webviewflutter.n;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j4 implements n.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23472b;

    public j4(s5.c cVar, b4 b4Var) {
        this.f23471a = cVar;
        this.f23472b = b4Var;
    }

    private PermissionRequest c(Long l8) {
        PermissionRequest permissionRequest = (PermissionRequest) this.f23472b.i(l8.longValue());
        Objects.requireNonNull(permissionRequest);
        return permissionRequest;
    }

    @Override // io.flutter.plugins.webviewflutter.n.v
    public void a(Long l8, List<String> list) {
        c(l8).grant((String[]) list.toArray(new String[0]));
    }

    @Override // io.flutter.plugins.webviewflutter.n.v
    public void b(Long l8) {
        c(l8).deny();
    }
}
