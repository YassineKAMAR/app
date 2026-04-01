package m1;

import m1.o;

/* JADX INFO: loaded from: classes.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f24545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f24546b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f24547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f24548b;

        b() {
        }

        @Override // m1.o.a
        public o a() {
            return new i(this.f24547a, this.f24548b);
        }

        @Override // m1.o.a
        public o.a b(o.b bVar) {
            this.f24548b = bVar;
            return this;
        }

        @Override // m1.o.a
        public o.a c(o.c cVar) {
            this.f24547a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f24545a = cVar;
        this.f24546b = bVar;
    }

    @Override // m1.o
    public o.b b() {
        return this.f24546b;
    }

    @Override // m1.o
    public o.c c() {
        return this.f24545a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f24545a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f24546b;
            o.b bVarB = oVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f24545a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f24546b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f24545a + ", mobileSubtype=" + this.f24546b + "}";
    }
}
