package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Comparable<a0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21403b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21404a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private /* synthetic */ a0(int i8) {
        this.f21404a = i8;
    }

    public static final /* synthetic */ a0 a(int i8) {
        return new a0(i8);
    }

    public static int c(int i8) {
        return i8;
    }

    public static boolean d(int i8, Object obj) {
        return (obj instanceof a0) && i8 == ((a0) obj).h();
    }

    public static int e(int i8) {
        return i8;
    }

    public static String g(int i8) {
        return String.valueOf(((long) i8) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a0 a0Var) {
        return k0.a(h(), a0Var.h());
    }

    public boolean equals(Object obj) {
        return d(this.f21404a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f21404a;
    }

    public int hashCode() {
        return e(this.f21404a);
    }

    public String toString() {
        return g(this.f21404a);
    }
}
