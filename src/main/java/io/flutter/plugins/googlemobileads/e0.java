package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class e0 extends e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f23171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f23172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f23173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    s2.a f23174g;

    private static final class a extends s2.b implements r2.a, z1.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<e0> f23175a;

        a(e0 e0Var) {
            this.f23175a = new WeakReference<>(e0Var);
        }

        @Override // z1.r
        public void a(r2.b bVar) {
            if (this.f23175a.get() != null) {
                this.f23175a.get().j(bVar);
            }
        }

        @Override // z1.e
        public void b(z1.n nVar) {
            if (this.f23175a.get() != null) {
                this.f23175a.get().g(nVar);
            }
        }

        @Override // z1.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(s2.a aVar) {
            if (this.f23175a.get() != null) {
                this.f23175a.get().h(aVar);
            }
        }

        @Override // r2.a
        public void h() {
            if (this.f23175a.get() != null) {
                this.f23175a.get().i();
            }
        }
    }

    public e0(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, h hVar) {
        super(i8);
        this.f23169b = aVar;
        this.f23170c = str;
        this.f23173f = iVar;
        this.f23172e = null;
        this.f23171d = hVar;
    }

    public e0(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, h hVar) {
        super(i8);
        this.f23169b = aVar;
        this.f23170c = str;
        this.f23172e = lVar;
        this.f23173f = null;
        this.f23171d = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f23174g = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z7) {
        s2.a aVar = this.f23174g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.e(z7);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f23174g == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            if (this.f23169b.f() == null) {
                Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
                return;
            }
            this.f23174g.d(new s(this.f23169b, this.f23147a));
            this.f23174g.f(new a(this));
            this.f23174g.i(this.f23169b.f(), new a(this));
        }
    }

    void f() {
        a aVar = new a(this);
        l lVar = this.f23172e;
        if (lVar != null) {
            h hVar = this.f23171d;
            String str = this.f23170c;
            hVar.j(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f23173f;
        if (iVar == null) {
            Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
            return;
        }
        h hVar2 = this.f23171d;
        String str2 = this.f23170c;
        hVar2.e(str2, iVar.k(str2), aVar);
    }

    void g(z1.n nVar) {
        this.f23169b.k(this.f23147a, new e.c(nVar));
    }

    void h(s2.a aVar) {
        this.f23174g = aVar;
        aVar.g(new a0(this.f23169b, this));
        this.f23169b.m(this.f23147a, aVar.a());
    }

    void i() {
        this.f23169b.n(this.f23147a);
    }

    void j(r2.b bVar) {
        this.f23169b.u(this.f23147a, new d0.b(Integer.valueOf(bVar.a()), bVar.getType()));
    }

    public void k(f0 f0Var) {
        s2.a aVar = this.f23174g;
        if (aVar != null) {
            aVar.h(f0Var.a());
        } else {
            Log.e("FlutterRIAd", "RewardedInterstitialAd is null in setServerSideVerificationOptions");
        }
    }
}
