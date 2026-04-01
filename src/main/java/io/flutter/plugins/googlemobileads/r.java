package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class r extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final WeakReference<g> f23330c;

    r(int i8, a aVar, g gVar) {
        super(i8, aVar);
        this.f23330c = new WeakReference<>(gVar);
    }

    @Override // z1.d
    public void l() {
        if (this.f23330c.get() != null) {
            this.f23330c.get().a();
        }
    }
}
