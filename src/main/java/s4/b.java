package s4;

import s4.f;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f26207c;

    /* JADX INFO: renamed from: s4.b$b, reason: collision with other inner class name */
    static final class C0168b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f26209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f26210c;

        C0168b() {
        }

        @Override // s4.f.a
        public f a() {
            String str = "";
            if (this.f26209b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f26208a, this.f26209b.longValue(), this.f26210c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s4.f.a
        public f.a b(f.b bVar) {
            this.f26210c = bVar;
            return this;
        }

        @Override // s4.f.a
        public f.a c(String str) {
            this.f26208a = str;
            return this;
        }

        @Override // s4.f.a
        public f.a d(long j8) {
            this.f26209b = Long.valueOf(j8);
            return this;
        }
    }

    private b(String str, long j8, f.b bVar) {
        this.f26205a = str;
        this.f26206b = j8;
        this.f26207c = bVar;
    }

    @Override // s4.f
    public f.b b() {
        return this.f26207c;
    }

    @Override // s4.f
    public String c() {
        return this.f26205a;
    }

    @Override // s4.f
    public long d() {
        return this.f26206b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f26205a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f26206b == fVar.d()) {
                f.b bVar = this.f26207c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26205a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j8 = this.f26206b;
        int i8 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        f.b bVar = this.f26207c;
        return i8 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f26205a + ", tokenExpirationTimestamp=" + this.f26206b + ", responseCode=" + this.f26207c + "}";
    }
}
