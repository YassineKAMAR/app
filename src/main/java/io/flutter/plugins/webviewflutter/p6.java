package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import io.flutter.plugins.webviewflutter.b4;
import io.flutter.plugins.webviewflutter.b6;
import io.flutter.plugins.webviewflutter.g5;
import io.flutter.plugins.webviewflutter.h;
import io.flutter.plugins.webviewflutter.h4;
import io.flutter.plugins.webviewflutter.h5;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.n;
import io.flutter.plugins.webviewflutter.s6;
import io.flutter.plugins.webviewflutter.u4;
import l5.a;

/* JADX INFO: loaded from: classes.dex */
public class p6 implements l5.a, m5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b4 f23567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.b f23568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s6 f23569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h4 f23570d;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(s5.c cVar, long j8) {
        new n.q(cVar).b(Long.valueOf(j8), new n.q.a() { // from class: io.flutter.plugins.webviewflutter.o6
            @Override // io.flutter.plugins.webviewflutter.n.q.a
            public final void a(Object obj) {
                p6.e((Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f23567a.e();
    }

    private void h(final s5.c cVar, io.flutter.plugin.platform.m mVar, Context context, k kVar) {
        this.f23567a = b4.g(new b4.a() { // from class: io.flutter.plugins.webviewflutter.m6
            @Override // io.flutter.plugins.webviewflutter.b4.a
            public final void a(long j8) {
                p6.f(cVar, j8);
            }
        });
        m0.c(cVar, new n.p() { // from class: io.flutter.plugins.webviewflutter.n6
            @Override // io.flutter.plugins.webviewflutter.n.p
            public final void clear() {
                this.f23558a.g();
            }
        });
        mVar.a("plugins.flutter.io/webview", new m(this.f23567a));
        this.f23569c = new s6(this.f23567a, cVar, new s6.b(), context);
        this.f23570d = new h4(this.f23567a, new h4.a(), new g4(cVar, this.f23567a), new Handler(context.getMainLooper()));
        p0.c(cVar, new c4(this.f23567a));
        v3.B(cVar, this.f23569c);
        s0.c(cVar, this.f23570d);
        t2.d(cVar, new b6(this.f23567a, new b6.b(), new s5(cVar, this.f23567a)));
        p1.h(cVar, new u4(this.f23567a, new u4.b(), new s4(cVar, this.f23567a)));
        y.c(cVar, new h(this.f23567a, new h.a(), new g(cVar, this.f23567a)));
        f2.q(cVar, new g5(this.f23567a, new g5.a()));
        c0.d(cVar, new l(kVar));
        s.f(cVar, new c(cVar, this.f23567a));
        i2.d(cVar, new h5(this.f23567a, new h5.a()));
        w0.d(cVar, new j4(cVar, this.f23567a));
        f0.c(cVar, new x3(cVar, this.f23567a));
        v.c(cVar, new e(cVar, this.f23567a));
        k0.e(cVar, new z3(cVar, this.f23567a));
    }

    private void i(Context context) {
        this.f23569c.A(context);
        this.f23570d.b(new Handler(context.getMainLooper()));
    }

    public b4 d() {
        return this.f23567a;
    }

    @Override // m5.a
    public void onAttachedToActivity(m5.c cVar) {
        i(cVar.g());
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f23568b = bVar;
        h(bVar.b(), bVar.e(), bVar.a(), new k.a(bVar.a().getAssets(), bVar.c()));
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
        i(this.f23568b.a());
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
        i(this.f23568b.a());
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        b4 b4Var = this.f23567a;
        if (b4Var != null) {
            b4Var.n();
            this.f23567a = null;
        }
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c cVar) {
        i(cVar.g());
    }
}
