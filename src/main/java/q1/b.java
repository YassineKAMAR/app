package q1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f25757b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f25758a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f25759a = null;

        a() {
        }

        public b a() {
            return new b(this.f25759a);
        }

        public a b(e eVar) {
            this.f25759a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f25758a = eVar;
    }

    public static a b() {
        return new a();
    }

    @l4.d(tag = 1)
    public e a() {
        return this.f25758a;
    }
}
