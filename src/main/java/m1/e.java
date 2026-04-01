package m1;

import m1.k;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f24512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m1.a f24513b;

    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f24514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m1.a f24515b;

        b() {
        }

        @Override // m1.k.a
        public k a() {
            return new e(this.f24514a, this.f24515b);
        }

        @Override // m1.k.a
        public k.a b(m1.a aVar) {
            this.f24515b = aVar;
            return this;
        }

        @Override // m1.k.a
        public k.a c(k.b bVar) {
            this.f24514a = bVar;
            return this;
        }
    }

    private e(k.b bVar, m1.a aVar) {
        this.f24512a = bVar;
        this.f24513b = aVar;
    }

    @Override // m1.k
    public m1.a b() {
        return this.f24513b;
    }

    @Override // m1.k
    public k.b c() {
        return this.f24512a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f24512a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            m1.a aVar = this.f24513b;
            m1.a aVarB = kVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f24512a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        m1.a aVar = this.f24513b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f24512a + ", androidClientInfo=" + this.f24513b + "}";
    }
}
