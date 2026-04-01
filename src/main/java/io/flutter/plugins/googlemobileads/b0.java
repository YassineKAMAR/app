package io.flutter.plugins.googlemobileads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class b0 implements io.flutter.plugin.platform.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f23131a;

    b0(View view) {
        this.f23131a = view;
    }

    @Override // io.flutter.plugin.platform.k
    public void a() {
        this.f23131a = null;
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
        return this.f23131a;
    }
}
