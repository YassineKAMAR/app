package q1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f25784c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25786b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f25787a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f25788b = 0;

        a() {
        }

        public f a() {
            return new f(this.f25787a, this.f25788b);
        }

        public a b(long j8) {
            this.f25788b = j8;
            return this;
        }

        public a c(long j8) {
            this.f25787a = j8;
            return this;
        }
    }

    f(long j8, long j9) {
        this.f25785a = j8;
        this.f25786b = j9;
    }

    public static a c() {
        return new a();
    }

    @l4.d(tag = 2)
    public long a() {
        return this.f25786b;
    }

    @l4.d(tag = 1)
    public long b() {
        return this.f25785a;
    }
}
