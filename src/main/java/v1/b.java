package v1;

/* JADX INFO: loaded from: classes.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1.o f26776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n1.i f26777c;

    b(long j8, n1.o oVar, n1.i iVar) {
        this.f26775a = j8;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f26776b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f26777c = iVar;
    }

    @Override // v1.k
    public n1.i b() {
        return this.f26777c;
    }

    @Override // v1.k
    public long c() {
        return this.f26775a;
    }

    @Override // v1.k
    public n1.o d() {
        return this.f26776b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f26775a == kVar.c() && this.f26776b.equals(kVar.d()) && this.f26777c.equals(kVar.b());
    }

    public int hashCode() {
        long j8 = this.f26775a;
        return this.f26777c.hashCode() ^ ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f26776b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f26775a + ", transportContext=" + this.f26776b + ", event=" + this.f26777c + "}";
    }
}
