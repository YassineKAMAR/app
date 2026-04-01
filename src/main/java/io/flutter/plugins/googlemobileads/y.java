package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class y implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<w> f23363a;

    y(w wVar) {
        this.f23363a = new WeakReference<>(wVar);
    }

    @Override // com.google.android.gms.ads.nativead.a.c
    public void a(com.google.android.gms.ads.nativead.a aVar) {
        if (this.f23363a.get() != null) {
            this.f23363a.get().e(aVar);
        }
    }
}
