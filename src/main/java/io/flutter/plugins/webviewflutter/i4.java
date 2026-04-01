package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugins.webviewflutter.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f23463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.u f23465c;

    public i4(s5.c cVar, b4 b4Var) {
        this.f23463a = cVar;
        this.f23464b = b4Var;
        this.f23465c = new n.u(cVar);
    }

    public void a(PermissionRequest permissionRequest, String[] strArr, n.u.a<Void> aVar) {
        if (this.f23464b.f(permissionRequest)) {
            return;
        }
        this.f23465c.b(Long.valueOf(this.f23464b.c(permissionRequest)), Arrays.asList(strArr), aVar);
    }
}
