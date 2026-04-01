package c4;

/* JADX INFO: loaded from: classes.dex */
final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3438c;

    a(long j8, long j9, long j10) {
        this.f3436a = j8;
        this.f3437b = j9;
        this.f3438c = j10;
    }

    @Override // c4.m
    public long b() {
        return this.f3437b;
    }

    @Override // c4.m
    public long c() {
        return this.f3436a;
    }

    @Override // c4.m
    public long d() {
        return this.f3438c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3436a == mVar.c() && this.f3437b == mVar.b() && this.f3438c == mVar.d();
    }

    public int hashCode() {
        long j8 = this.f3436a;
        long j9 = this.f3437b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f3438c;
        return ((int) ((j10 >>> 32) ^ j10)) ^ i8;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f3436a + ", elapsedRealtime=" + this.f3437b + ", uptimeMillis=" + this.f3438c + "}";
    }
}
