package io.flutter.plugins.googlemobileads;

import android.util.Log;
import b2.a;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class p extends e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f23319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f23320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b2.a f23321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f23322h;

    private static final class a extends a.AbstractC0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<p> f23323a;

        a(p pVar) {
            this.f23323a = new WeakReference<>(pVar);
        }

        @Override // z1.e
        public void b(z1.n nVar) {
            if (this.f23323a.get() != null) {
                this.f23323a.get().j(nVar);
            }
        }

        @Override // z1.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(b2.a aVar) {
            if (this.f23323a.get() != null) {
                this.f23323a.get().k(aVar);
            }
        }
    }

    p(int i8, int i9, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, i iVar, h hVar) {
        super(i8);
        b6.c.b((lVar == null && iVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.f23316b = aVar;
        this.f23318d = i9;
        this.f23317c = str;
        this.f23319e = lVar;
        this.f23320f = iVar;
        this.f23322h = hVar;
    }

    private int h() {
        int i8 = this.f23318d;
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2 || i8 == 3) {
            return 2;
        }
        Log.e("FlutterAppOpenAd", "Passed unknown app open orientation: " + this.f23318d);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(z1.n nVar) {
        this.f23316b.k(this.f23147a, new e.c(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(b2.a aVar) {
        this.f23321g = aVar;
        aVar.f(new a0(this.f23316b, this));
        this.f23316b.m(this.f23147a, aVar.a());
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f23321g = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    void d(boolean z7) {
        b2.a aVar = this.f23321g;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.e(z7);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    void e() {
        if (this.f23321g == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.f23316b.f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f23321g.d(new s(this.f23316b, this.f23147a));
            this.f23321g.g(this.f23316b.f());
        }
    }

    void i() {
        l lVar = this.f23319e;
        if (lVar != null) {
            h hVar = this.f23322h;
            String str = this.f23317c;
            hVar.f(str, lVar.b(str), h(), new a(this));
        } else {
            i iVar = this.f23320f;
            if (iVar != null) {
                h hVar2 = this.f23322h;
                String str2 = this.f23317c;
                hVar2.a(str2, iVar.k(str2), h(), new a(this));
            }
        }
    }
}
