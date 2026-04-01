package x0;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f27167i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f27174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f27175h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f27176a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27177b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        k f27178c = k.NOT_REQUIRED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f27179d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f27180e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f27181f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f27182g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f27183h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f27178c = kVar;
            return this;
        }
    }

    public b() {
        this.f27168a = k.NOT_REQUIRED;
        this.f27173f = -1L;
        this.f27174g = -1L;
        this.f27175h = new c();
    }

    b(a aVar) {
        this.f27168a = k.NOT_REQUIRED;
        this.f27173f = -1L;
        this.f27174g = -1L;
        this.f27175h = new c();
        this.f27169b = aVar.f27176a;
        int i8 = Build.VERSION.SDK_INT;
        this.f27170c = i8 >= 23 && aVar.f27177b;
        this.f27168a = aVar.f27178c;
        this.f27171d = aVar.f27179d;
        this.f27172e = aVar.f27180e;
        if (i8 >= 24) {
            this.f27175h = aVar.f27183h;
            this.f27173f = aVar.f27181f;
            this.f27174g = aVar.f27182g;
        }
    }

    public b(b bVar) {
        this.f27168a = k.NOT_REQUIRED;
        this.f27173f = -1L;
        this.f27174g = -1L;
        this.f27175h = new c();
        this.f27169b = bVar.f27169b;
        this.f27170c = bVar.f27170c;
        this.f27168a = bVar.f27168a;
        this.f27171d = bVar.f27171d;
        this.f27172e = bVar.f27172e;
        this.f27175h = bVar.f27175h;
    }

    public c a() {
        return this.f27175h;
    }

    public k b() {
        return this.f27168a;
    }

    public long c() {
        return this.f27173f;
    }

    public long d() {
        return this.f27174g;
    }

    public boolean e() {
        return this.f27175h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27169b == bVar.f27169b && this.f27170c == bVar.f27170c && this.f27171d == bVar.f27171d && this.f27172e == bVar.f27172e && this.f27173f == bVar.f27173f && this.f27174g == bVar.f27174g && this.f27168a == bVar.f27168a) {
            return this.f27175h.equals(bVar.f27175h);
        }
        return false;
    }

    public boolean f() {
        return this.f27171d;
    }

    public boolean g() {
        return this.f27169b;
    }

    public boolean h() {
        return this.f27170c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f27168a.hashCode() * 31) + (this.f27169b ? 1 : 0)) * 31) + (this.f27170c ? 1 : 0)) * 31) + (this.f27171d ? 1 : 0)) * 31) + (this.f27172e ? 1 : 0)) * 31;
        long j8 = this.f27173f;
        int i8 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f27174g;
        return ((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f27175h.hashCode();
    }

    public boolean i() {
        return this.f27172e;
    }

    public void j(c cVar) {
        this.f27175h = cVar;
    }

    public void k(k kVar) {
        this.f27168a = kVar;
    }

    public void l(boolean z7) {
        this.f27171d = z7;
    }

    public void m(boolean z7) {
        this.f27169b = z7;
    }

    public void n(boolean z7) {
        this.f27170c = z7;
    }

    public void o(boolean z7) {
        this.f27172e = z7;
    }

    public void p(long j8) {
        this.f27173f = j8;
    }

    public void q(long j8) {
        this.f27174g = j8;
    }
}
