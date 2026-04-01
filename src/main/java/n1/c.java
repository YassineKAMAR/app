package n1;

import n1.n;

/* JADX INFO: loaded from: classes.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f25083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1.c<?> f25085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l1.e<?, byte[]> f25086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l1.b f25087e;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f25088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l1.c<?> f25090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l1.e<?, byte[]> f25091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private l1.b f25092e;

        b() {
        }

        @Override // n1.n.a
        public n a() {
            String str = "";
            if (this.f25088a == null) {
                str = " transportContext";
            }
            if (this.f25089b == null) {
                str = str + " transportName";
            }
            if (this.f25090c == null) {
                str = str + " event";
            }
            if (this.f25091d == null) {
                str = str + " transformer";
            }
            if (this.f25092e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f25088a, this.f25089b, this.f25090c, this.f25091d, this.f25092e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n1.n.a
        n.a b(l1.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f25092e = bVar;
            return this;
        }

        @Override // n1.n.a
        n.a c(l1.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f25090c = cVar;
            return this;
        }

        @Override // n1.n.a
        n.a d(l1.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f25091d = eVar;
            return this;
        }

        @Override // n1.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f25088a = oVar;
            return this;
        }

        @Override // n1.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f25089b = str;
            return this;
        }
    }

    private c(o oVar, String str, l1.c<?> cVar, l1.e<?, byte[]> eVar, l1.b bVar) {
        this.f25083a = oVar;
        this.f25084b = str;
        this.f25085c = cVar;
        this.f25086d = eVar;
        this.f25087e = bVar;
    }

    @Override // n1.n
    public l1.b b() {
        return this.f25087e;
    }

    @Override // n1.n
    l1.c<?> c() {
        return this.f25085c;
    }

    @Override // n1.n
    l1.e<?, byte[]> e() {
        return this.f25086d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f25083a.equals(nVar.f()) && this.f25084b.equals(nVar.g()) && this.f25085c.equals(nVar.c()) && this.f25086d.equals(nVar.e()) && this.f25087e.equals(nVar.b());
    }

    @Override // n1.n
    public o f() {
        return this.f25083a;
    }

    @Override // n1.n
    public String g() {
        return this.f25084b;
    }

    public int hashCode() {
        return ((((((((this.f25083a.hashCode() ^ 1000003) * 1000003) ^ this.f25084b.hashCode()) * 1000003) ^ this.f25085c.hashCode()) * 1000003) ^ this.f25086d.hashCode()) * 1000003) ^ this.f25087e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f25083a + ", transportName=" + this.f25084b + ", event=" + this.f25085c + ", transformer=" + this.f25086d + ", encoding=" + this.f25087e + "}";
    }
}
