package t6;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26528e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f26529f = new f(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final f a() {
            return f.f26529f;
        }
    }

    public f(int i8, int i9) {
        super(i8, i9, 1);
    }

    @Override // t6.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (a() != fVar.a() || e() != fVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // t6.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + e();
    }

    @Override // t6.d
    public boolean isEmpty() {
        return a() > e();
    }

    public boolean p(int i8) {
        return a() <= i8 && i8 <= e();
    }

    @Override // t6.d
    public String toString() {
        return a() + ".." + e();
    }

    public Integer u() {
        return Integer.valueOf(e());
    }

    public Integer v() {
        return Integer.valueOf(a());
    }
}
