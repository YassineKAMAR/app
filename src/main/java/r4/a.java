package r4;

import r4.c;
import r4.d;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f25884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f25888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25889h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f25891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f25893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f25894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f25895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f25896g;

        b() {
        }

        private b(d dVar) {
            this.f25890a = dVar.d();
            this.f25891b = dVar.g();
            this.f25892c = dVar.b();
            this.f25893d = dVar.f();
            this.f25894e = Long.valueOf(dVar.c());
            this.f25895f = Long.valueOf(dVar.h());
            this.f25896g = dVar.e();
        }

        @Override // r4.d.a
        public d a() {
            String str = "";
            if (this.f25891b == null) {
                str = " registrationStatus";
            }
            if (this.f25894e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f25895f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f25890a, this.f25891b, this.f25892c, this.f25893d, this.f25894e.longValue(), this.f25895f.longValue(), this.f25896g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r4.d.a
        public d.a b(String str) {
            this.f25892c = str;
            return this;
        }

        @Override // r4.d.a
        public d.a c(long j8) {
            this.f25894e = Long.valueOf(j8);
            return this;
        }

        @Override // r4.d.a
        public d.a d(String str) {
            this.f25890a = str;
            return this;
        }

        @Override // r4.d.a
        public d.a e(String str) {
            this.f25896g = str;
            return this;
        }

        @Override // r4.d.a
        public d.a f(String str) {
            this.f25893d = str;
            return this;
        }

        @Override // r4.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f25891b = aVar;
            return this;
        }

        @Override // r4.d.a
        public d.a h(long j8) {
            this.f25895f = Long.valueOf(j8);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f25883b = str;
        this.f25884c = aVar;
        this.f25885d = str2;
        this.f25886e = str3;
        this.f25887f = j8;
        this.f25888g = j9;
        this.f25889h = str4;
    }

    @Override // r4.d
    public String b() {
        return this.f25885d;
    }

    @Override // r4.d
    public long c() {
        return this.f25887f;
    }

    @Override // r4.d
    public String d() {
        return this.f25883b;
    }

    @Override // r4.d
    public String e() {
        return this.f25889h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f25883b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f25884c.equals(dVar.g()) && ((str = this.f25885d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f25886e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f25887f == dVar.c() && this.f25888g == dVar.h()) {
                String str4 = this.f25889h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // r4.d
    public String f() {
        return this.f25886e;
    }

    @Override // r4.d
    public c.a g() {
        return this.f25884c;
    }

    @Override // r4.d
    public long h() {
        return this.f25888g;
    }

    public int hashCode() {
        String str = this.f25883b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f25884c.hashCode()) * 1000003;
        String str2 = this.f25885d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f25886e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j8 = this.f25887f;
        int i8 = (iHashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f25888g;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f25889h;
        return i9 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // r4.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f25883b + ", registrationStatus=" + this.f25884c + ", authToken=" + this.f25885d + ", refreshToken=" + this.f25886e + ", expiresInSecs=" + this.f25887f + ", tokenCreationEpochInSecs=" + this.f25888g + ", fisError=" + this.f25889h + "}";
    }
}
