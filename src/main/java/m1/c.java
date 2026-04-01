package m1;

import m1.a;

/* JADX INFO: loaded from: classes.dex */
final class c extends m1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f24495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f24497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f24498l;

    static final class b extends a.AbstractC0147a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f24499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f24500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f24501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f24504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f24505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f24506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f24507i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f24508j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f24509k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f24510l;

        b() {
        }

        @Override // m1.a.AbstractC0147a
        public m1.a a() {
            return new c(this.f24499a, this.f24500b, this.f24501c, this.f24502d, this.f24503e, this.f24504f, this.f24505g, this.f24506h, this.f24507i, this.f24508j, this.f24509k, this.f24510l);
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a b(String str) {
            this.f24510l = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a c(String str) {
            this.f24508j = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a d(String str) {
            this.f24502d = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a e(String str) {
            this.f24506h = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a f(String str) {
            this.f24501c = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a g(String str) {
            this.f24507i = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a h(String str) {
            this.f24505g = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a i(String str) {
            this.f24509k = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a j(String str) {
            this.f24500b = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a k(String str) {
            this.f24504f = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a l(String str) {
            this.f24503e = str;
            return this;
        }

        @Override // m1.a.AbstractC0147a
        public a.AbstractC0147a m(Integer num) {
            this.f24499a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f24487a = num;
        this.f24488b = str;
        this.f24489c = str2;
        this.f24490d = str3;
        this.f24491e = str4;
        this.f24492f = str5;
        this.f24493g = str6;
        this.f24494h = str7;
        this.f24495i = str8;
        this.f24496j = str9;
        this.f24497k = str10;
        this.f24498l = str11;
    }

    @Override // m1.a
    public String b() {
        return this.f24498l;
    }

    @Override // m1.a
    public String c() {
        return this.f24496j;
    }

    @Override // m1.a
    public String d() {
        return this.f24490d;
    }

    @Override // m1.a
    public String e() {
        return this.f24494h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1.a)) {
            return false;
        }
        m1.a aVar = (m1.a) obj;
        Integer num = this.f24487a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f24488b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f24489c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f24490d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f24491e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f24492f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f24493g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f24494h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f24495i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f24496j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f24497k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f24498l;
                                                    String strB = aVar.b();
                                                    if (str11 == null) {
                                                        if (strB == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(strB)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m1.a
    public String f() {
        return this.f24489c;
    }

    @Override // m1.a
    public String g() {
        return this.f24495i;
    }

    @Override // m1.a
    public String h() {
        return this.f24493g;
    }

    public int hashCode() {
        Integer num = this.f24487a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f24488b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f24489c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24490d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f24491e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f24492f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f24493g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f24494h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f24495i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f24496j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f24497k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f24498l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // m1.a
    public String i() {
        return this.f24497k;
    }

    @Override // m1.a
    public String j() {
        return this.f24488b;
    }

    @Override // m1.a
    public String k() {
        return this.f24492f;
    }

    @Override // m1.a
    public String l() {
        return this.f24491e;
    }

    @Override // m1.a
    public Integer m() {
        return this.f24487a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f24487a + ", model=" + this.f24488b + ", hardware=" + this.f24489c + ", device=" + this.f24490d + ", product=" + this.f24491e + ", osBuild=" + this.f24492f + ", manufacturer=" + this.f24493g + ", fingerprint=" + this.f24494h + ", locale=" + this.f24495i + ", country=" + this.f24496j + ", mccMnc=" + this.f24497k + ", applicationBuild=" + this.f24498l + "}";
    }
}
