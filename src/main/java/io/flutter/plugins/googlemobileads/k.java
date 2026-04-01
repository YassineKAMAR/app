package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class k extends e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f23213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a2.c f23214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f23215f;

    private static final class a extends a2.d implements a2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<k> f23216a;

        a(k kVar) {
            this.f23216a = new WeakReference<>(kVar);
        }

        @Override // z1.e
        public void b(z1.n nVar) {
            if (this.f23216a.get() != null) {
                this.f23216a.get().g(nVar);
            }
        }

        @Override // z1.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(a2.c cVar) {
            if (this.f23216a.get() != null) {
                this.f23216a.get().h(cVar);
            }
        }

        @Override // a2.e
        public void w(String str, String str2) {
            if (this.f23216a.get() != null) {
                this.f23216a.get().i(str, str2);
            }
        }
    }

    public k(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, h hVar) {
        super(i8);
        this.f23211b = aVar;
        this.f23212c = str;
        this.f23213d = iVar;
        this.f23215f = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f23214e = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z7) {
        a2.c cVar = this.f23214e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.d(z7);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f23214e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.f23211b.f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f23214e.c(new s(this.f23211b, this.f23147a));
            this.f23214e.f(this.f23211b.f());
        }
    }

    void f() {
        h hVar = this.f23215f;
        String str = this.f23212c;
        hVar.b(str, this.f23213d.k(str), new a(this));
    }

    void g(z1.n nVar) {
        this.f23211b.k(this.f23147a, new e.c(nVar));
    }

    void h(a2.c cVar) {
        this.f23214e = cVar;
        cVar.h(new a(this));
        cVar.e(new a0(this.f23211b, this));
        this.f23211b.m(this.f23147a, cVar.a());
    }

    void i(String str, String str2) {
        this.f23211b.q(this.f23147a, str, str2);
    }
}
