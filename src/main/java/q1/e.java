package q1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f25779c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25781b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f25782a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f25783b = 0;

        a() {
        }

        public e a() {
            return new e(this.f25782a, this.f25783b);
        }

        public a b(long j8) {
            this.f25782a = j8;
            return this;
        }

        public a c(long j8) {
            this.f25783b = j8;
            return this;
        }
    }

    e(long j8, long j9) {
        this.f25780a = j8;
        this.f25781b = j9;
    }

    public static a c() {
        return new a();
    }

    @l4.d(tag = 1)
    public long a() {
        return this.f25780a;
    }

    @l4.d(tag = 2)
    public long b() {
        return this.f25781b;
    }
}
