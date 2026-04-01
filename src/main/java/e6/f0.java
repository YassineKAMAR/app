package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Comparable<f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21419b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f21420a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private /* synthetic */ f0(short s8) {
        this.f21420a = s8;
    }

    public static final /* synthetic */ f0 a(short s8) {
        return new f0(s8);
    }

    public static short c(short s8) {
        return s8;
    }

    public static boolean d(short s8, Object obj) {
        return (obj instanceof f0) && s8 == ((f0) obj).h();
    }

    public static int e(short s8) {
        return s8;
    }

    public static String g(short s8) {
        return String.valueOf(s8 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(f0 f0Var) {
        return kotlin.jvm.internal.q.g(h() & 65535, f0Var.h() & 65535);
    }

    public boolean equals(Object obj) {
        return d(this.f21420a, obj);
    }

    public final /* synthetic */ short h() {
        return this.f21420a;
    }

    public int hashCode() {
        return e(this.f21420a);
    }

    public String toString() {
        return g(this.f21420a);
    }
}
