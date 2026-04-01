package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Comparable<c0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21409b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21410a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private /* synthetic */ c0(long j8) {
        this.f21410a = j8;
    }

    public static final /* synthetic */ c0 a(long j8) {
        return new c0(j8);
    }

    public static long c(long j8) {
        return j8;
    }

    public static boolean d(long j8, Object obj) {
        return (obj instanceof c0) && j8 == ((c0) obj).h();
    }

    public static int e(long j8) {
        return androidx.privacysandbox.ads.adservices.topics.d.a(j8);
    }

    public static String g(long j8) {
        return k0.c(j8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c0 c0Var) {
        return k0.b(h(), c0Var.h());
    }

    public boolean equals(Object obj) {
        return d(this.f21410a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f21410a;
    }

    public int hashCode() {
        return e(this.f21410a);
    }

    public String toString() {
        return g(this.f21410a);
    }
}
