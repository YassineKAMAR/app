package m1;

/* JADX INFO: loaded from: classes.dex */
final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24544a;

    h(long j8) {
        this.f24544a = j8;
    }

    @Override // m1.n
    public long c() {
        return this.f24544a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f24544a == ((n) obj).c();
    }

    public int hashCode() {
        long j8 = this.f24544a;
        return 1000003 ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f24544a + "}";
    }
}
