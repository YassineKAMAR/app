package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21424e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f21425f = j.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21429d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public i(int i8, int i9, int i10) {
        this.f21426a = i8;
        this.f21427b = i9;
        this.f21428c = i10;
        this.f21429d = c(i8, i9, i10);
    }

    private final int c(int i8, int i9, int i10) {
        boolean z7 = false;
        if (new t6.f(0, 255).p(i8) && new t6.f(0, 255).p(i9) && new t6.f(0, 255).p(i10)) {
            z7 = true;
        }
        if (z7) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i other) {
        kotlin.jvm.internal.q.f(other, "other");
        return this.f21429d - other.f21429d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f21429d == iVar.f21429d;
    }

    public int hashCode() {
        return this.f21429d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21426a);
        sb.append('.');
        sb.append(this.f21427b);
        sb.append('.');
        sb.append(this.f21428c);
        return sb.toString();
    }
}
