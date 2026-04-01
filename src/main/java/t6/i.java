package t6;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26538e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f26539f = new i(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public i(long j8, long j9) {
        super(j8, j9, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (a() != iVar.a() || e() != iVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (a() ^ (a() >>> 32))) + (e() ^ (e() >>> 32)));
    }

    public boolean i(long j8) {
        return a() <= j8 && j8 <= e();
    }

    public boolean isEmpty() {
        return a() > e();
    }

    public String toString() {
        return a() + ".." + e();
    }
}
