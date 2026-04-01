package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class d0 extends e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f23138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f23140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f23141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f23142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    r2.c f23143g;

    private static final class a extends r2.d implements r2.a, z1.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<d0> f23144a;

        a(d0 d0Var) {
            this.f23144a = new WeakReference<>(d0Var);
        }

        @Override // z1.r
        public void a(r2.b bVar) {
            if (this.f23144a.get() != null) {
                this.f23144a.get().j(bVar);
            }
        }

        @Override // z1.e
        public void b(z1.n nVar) {
            if (this.f23144a.get() != null) {
                this.f23144a.get().g(nVar);
            }
        }

        @Override // z1.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(r2.c cVar) {
            if (this.f23144a.get() != null) {
                this.f23144a.get().h(cVar);
            }
        }

        @Override // r2.a
        public void h() {
            if (this.f23144a.get() != null) {
                this.f23144a.get().i();
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Integer f23145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f23146b;

        b(Integer num, String str) {
            this.f23145a = num;
            this.f23146b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f23145a.equals(bVar.f23145a)) {
                return this.f23146b.equals(bVar.f23146b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f23145a.hashCode() * 31) + this.f23146b.hashCode();
        }
    }

    public d0(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, h hVar) {
        super(i8);
        this.f23138b = aVar;
        this.f23139c = str;
        this.f23142f = iVar;
        this.f23141e = null;
        this.f23140d = hVar;
    }

    public d0(int i8, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, h hVar) {
        super(i8);
        this.f23138b = aVar;
        this.f23139c = str;
        this.f23141e = lVar;
        this.f23142f = null;
        this.f23140d = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f23143g = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z7) {
        r2.c cVar = this.f23143g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.e(z7);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f23143g == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else {
            if (this.f23138b.f() == null) {
                Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
                return;
            }
            this.f23143g.d(new s(this.f23138b, this.f23147a));
            this.f23143g.f(new a(this));
            this.f23143g.i(this.f23138b.f(), new a(this));
        }
    }

    void f() {
        a aVar = new a(this);
        l lVar = this.f23141e;
        if (lVar != null) {
            h hVar = this.f23140d;
            String str = this.f23139c;
            hVar.i(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f23142f;
        if (iVar == null) {
            Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
            return;
        }
        h hVar2 = this.f23140d;
        String str2 = this.f23139c;
        hVar2.d(str2, iVar.k(str2), aVar);
    }

    void g(z1.n nVar) {
        this.f23138b.k(this.f23147a, new e.c(nVar));
    }

    void h(r2.c cVar) {
        this.f23143g = cVar;
        cVar.g(new a0(this.f23138b, this));
        this.f23138b.m(this.f23147a, cVar.a());
    }

    void i() {
        this.f23138b.n(this.f23147a);
    }

    void j(r2.b bVar) {
        this.f23138b.u(this.f23147a, new b(Integer.valueOf(bVar.a()), bVar.getType()));
    }

    public void k(f0 f0Var) {
        r2.c cVar = this.f23143g;
        if (cVar != null) {
            cVar.h(f0Var.a());
        } else {
            Log.e("FlutterRewardedAd", "RewardedAd is null in setServerSideVerificationOptions");
        }
    }
}
