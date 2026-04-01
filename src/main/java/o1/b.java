package o1;

import o1.g;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f25259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25260b;

    b(g.a aVar, long j8) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f25259a = aVar;
        this.f25260b = j8;
    }

    @Override // o1.g
    public long b() {
        return this.f25260b;
    }

    @Override // o1.g
    public g.a c() {
        return this.f25259a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f25259a.equals(gVar.c()) && this.f25260b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f25259a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f25260b;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f25259a + ", nextRequestWaitMillis=" + this.f25260b + "}";
    }
}
