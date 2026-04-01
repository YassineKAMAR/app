package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Comparable<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21456b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f21457a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private /* synthetic */ y(byte b8) {
        this.f21457a = b8;
    }

    public static final /* synthetic */ y a(byte b8) {
        return new y(b8);
    }

    public static byte c(byte b8) {
        return b8;
    }

    public static boolean d(byte b8, Object obj) {
        return (obj instanceof y) && b8 == ((y) obj).h();
    }

    public static int e(byte b8) {
        return b8;
    }

    public static String g(byte b8) {
        return String.valueOf(b8 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(y yVar) {
        return kotlin.jvm.internal.q.g(h() & 255, yVar.h() & 255);
    }

    public boolean equals(Object obj) {
        return d(this.f21457a, obj);
    }

    public final /* synthetic */ byte h() {
        return this.f21457a;
    }

    public int hashCode() {
        return e(this.f21457a);
    }

    public String toString() {
        return g(this.f21457a);
    }
}
