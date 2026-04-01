package f4;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0<?> f21768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21770c;

    private r(e0<?> e0Var, int i8, int i9) {
        this.f21768a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.f21769b = i8;
        this.f21770c = i9;
    }

    private r(Class<?> cls, int i8, int i9) {
        this((e0<?>) e0.b(cls), i8, i9);
    }

    private static String a(int i8) {
        if (i8 == 0) {
            return "direct";
        }
        if (i8 == 1) {
            return "provider";
        }
        if (i8 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i8);
    }

    public static r g(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r h(e0<?> e0Var) {
        return new r(e0Var, 1, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public e0<?> b() {
        return this.f21768a;
    }

    public boolean c() {
        return this.f21770c == 2;
    }

    public boolean d() {
        return this.f21770c == 0;
    }

    public boolean e() {
        return this.f21769b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f21768a.equals(rVar.f21768a) && this.f21769b == rVar.f21769b && this.f21770c == rVar.f21770c;
    }

    public boolean f() {
        return this.f21769b == 2;
    }

    public int hashCode() {
        return ((((this.f21768a.hashCode() ^ 1000003) * 1000003) ^ this.f21769b) * 1000003) ^ this.f21770c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f21768a);
        sb.append(", type=");
        int i8 = this.f21769b;
        sb.append(i8 == 1 ? "required" : i8 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f21770c));
        sb.append("}");
        return sb.toString();
    }
}
