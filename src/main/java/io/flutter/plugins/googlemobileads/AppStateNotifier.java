package io.flutter.plugins.googlemobileads;

import androidx.lifecycle.d;
import s5.d;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
final class AppStateNotifier implements androidx.lifecycle.g, k.c, d.InterfaceC0172d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.k f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s5.d f23117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d.b f23118c;

    AppStateNotifier(s5.c cVar) {
        s5.k kVar = new s5.k(cVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.f23116a = kVar;
        kVar.e(this);
        s5.d dVar = new s5.d(cVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.f23117b = dVar;
        dVar.d(this);
    }

    @Override // androidx.lifecycle.g
    public void a(androidx.lifecycle.i iVar, d.a aVar) {
        d.b bVar;
        String str;
        if (aVar == d.a.ON_START && (bVar = this.f23118c) != null) {
            str = "foreground";
        } else if (aVar != d.a.ON_STOP || (bVar = this.f23118c) == null) {
            return;
        } else {
            str = "background";
        }
        bVar.a(str);
    }

    @Override // s5.d.InterfaceC0172d
    public void b(Object obj) {
        this.f23118c = null;
    }

    @Override // s5.d.InterfaceC0172d
    public void c(Object obj, d.b bVar) {
        this.f23118c = bVar;
    }

    void d() {
        androidx.lifecycle.t.n().a().a(this);
    }

    void e() {
        androidx.lifecycle.t.n().a().c(this);
    }

    @Override // s5.k.c
    public void onMethodCall(s5.j jVar, k.d dVar) {
        String str = jVar.f26252a;
        str.hashCode();
        if (str.equals("stop")) {
            e();
        } else if (str.equals("start")) {
            d();
        } else {
            dVar.c();
        }
    }
}
