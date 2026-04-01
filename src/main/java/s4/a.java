package s4;

import s4.d;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f26198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f26199e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f26203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f26204e;

        b() {
        }

        @Override // s4.d.a
        public d a() {
            return new a(this.f26200a, this.f26201b, this.f26202c, this.f26203d, this.f26204e);
        }

        @Override // s4.d.a
        public d.a b(f fVar) {
            this.f26203d = fVar;
            return this;
        }

        @Override // s4.d.a
        public d.a c(String str) {
            this.f26201b = str;
            return this;
        }

        @Override // s4.d.a
        public d.a d(String str) {
            this.f26202c = str;
            return this;
        }

        @Override // s4.d.a
        public d.a e(d.b bVar) {
            this.f26204e = bVar;
            return this;
        }

        @Override // s4.d.a
        public d.a f(String str) {
            this.f26200a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f26195a = str;
        this.f26196b = str2;
        this.f26197c = str3;
        this.f26198d = fVar;
        this.f26199e = bVar;
    }

    @Override // s4.d
    public f b() {
        return this.f26198d;
    }

    @Override // s4.d
    public String c() {
        return this.f26196b;
    }

    @Override // s4.d
    public String d() {
        return this.f26197c;
    }

    @Override // s4.d
    public d.b e() {
        return this.f26199e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f26195a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f26196b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f26197c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f26198d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f26199e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.d
    public String f() {
        return this.f26195a;
    }

    public int hashCode() {
        String str = this.f26195a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f26196b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26197c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f26198d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f26199e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f26195a + ", fid=" + this.f26196b + ", refreshToken=" + this.f26197c + ", authToken=" + this.f26198d + ", responseCode=" + this.f26199e + "}";
    }
}
