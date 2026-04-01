package v1;

import v1.e;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26769f;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f26770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f26771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f26772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f26773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f26774e;

        b() {
        }

        @Override // v1.e.a
        e a() {
            String str = "";
            if (this.f26770a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f26771b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f26772c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f26773d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f26774e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f26770a.longValue(), this.f26771b.intValue(), this.f26772c.intValue(), this.f26773d.longValue(), this.f26774e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v1.e.a
        e.a b(int i8) {
            this.f26772c = Integer.valueOf(i8);
            return this;
        }

        @Override // v1.e.a
        e.a c(long j8) {
            this.f26773d = Long.valueOf(j8);
            return this;
        }

        @Override // v1.e.a
        e.a d(int i8) {
            this.f26771b = Integer.valueOf(i8);
            return this;
        }

        @Override // v1.e.a
        e.a e(int i8) {
            this.f26774e = Integer.valueOf(i8);
            return this;
        }

        @Override // v1.e.a
        e.a f(long j8) {
            this.f26770a = Long.valueOf(j8);
            return this;
        }
    }

    private a(long j8, int i8, int i9, long j9, int i10) {
        this.f26765b = j8;
        this.f26766c = i8;
        this.f26767d = i9;
        this.f26768e = j9;
        this.f26769f = i10;
    }

    @Override // v1.e
    int b() {
        return this.f26767d;
    }

    @Override // v1.e
    long c() {
        return this.f26768e;
    }

    @Override // v1.e
    int d() {
        return this.f26766c;
    }

    @Override // v1.e
    int e() {
        return this.f26769f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26765b == eVar.f() && this.f26766c == eVar.d() && this.f26767d == eVar.b() && this.f26768e == eVar.c() && this.f26769f == eVar.e();
    }

    @Override // v1.e
    long f() {
        return this.f26765b;
    }

    public int hashCode() {
        long j8 = this.f26765b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f26766c) * 1000003) ^ this.f26767d) * 1000003;
        long j9 = this.f26768e;
        return this.f26769f ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f26765b + ", loadBatchSize=" + this.f26766c + ", criticalSectionEnterTimeoutMs=" + this.f26767d + ", eventCleanUpAge=" + this.f26768e + ", maxBlobByteSizePerRow=" + this.f26769f + "}";
    }
}
