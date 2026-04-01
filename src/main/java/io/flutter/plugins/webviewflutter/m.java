package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class m extends io.flutter.plugin.platform.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f23489b;

    class a implements io.flutter.plugin.platform.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f23490a;

        a(Object obj) {
            this.f23490a = obj;
        }

        @Override // io.flutter.plugin.platform.k
        public void a() {
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void b(View view) {
            io.flutter.plugin.platform.j.a(this, view);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void c() {
            io.flutter.plugin.platform.j.c(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void d() {
            io.flutter.plugin.platform.j.d(this);
        }

        @Override // io.flutter.plugin.platform.k
        public /* synthetic */ void e() {
            io.flutter.plugin.platform.j.b(this);
        }

        @Override // io.flutter.plugin.platform.k
        public View getView() {
            return (View) this.f23490a;
        }
    }

    m(b4 b4Var) {
        super(s5.s.f26264a);
        this.f23489b = b4Var;
    }

    @Override // io.flutter.plugin.platform.l
    public io.flutter.plugin.platform.k a(Context context, int i8, Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object objI = this.f23489b.i(r3.intValue());
        if (objI instanceof io.flutter.plugin.platform.k) {
            return (io.flutter.plugin.platform.k) objI;
        }
        if (objI instanceof View) {
            return new a(objI);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objI);
    }
}
