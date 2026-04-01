package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class u extends e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f23336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k2.a f23337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f23338f;

    private static final class a extends k2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<u> f23339a;

        a(u uVar) {
            this.f23339a = new WeakReference<>(uVar);
        }

        @Override // z1.e
        public void b(z1.n nVar) {
            if (this.f23339a.get() != null) {
                this.f23339a.get().g(nVar);
            }
        }

        @Override // z1.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(k2.a aVar) {
            if (this.f23339a.get() != null) {
                this.f23339a.get().h(aVar);
            }
        }
    }

    public u(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, h hVar) {
        super(i8);
        this.f23334b = aVar;
        this.f23335c = str;
        this.f23336d = lVar;
        this.f23338f = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f23337e = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z7) {
        k2.a aVar = this.f23337e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.d(z7);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f23337e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.f23334b.f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f23337e.c(new s(this.f23334b, this.f23147a));
            this.f23337e.f(this.f23334b.f());
        }
    }

    void f() {
        String str;
        l lVar;
        if (this.f23334b == null || (str = this.f23335c) == null || (lVar = this.f23336d) == null) {
            return;
        }
        this.f23338f.g(str, lVar.b(str), new a(this));
    }

    void g(z1.n nVar) {
        this.f23334b.k(this.f23147a, new e.c(nVar));
    }

    void h(k2.a aVar) {
        this.f23337e = aVar;
        aVar.e(new a0(this.f23334b, this));
        this.f23334b.m(this.f23147a, aVar.a());
    }
}
