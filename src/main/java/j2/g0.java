package j2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23969e;

    public g0(String str, double d8, double d9, double d10, int i8) {
        this.f23965a = str;
        this.f23967c = d8;
        this.f23966b = d9;
        this.f23968d = d10;
        this.f23969e = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return a3.n.a(this.f23965a, g0Var.f23965a) && this.f23966b == g0Var.f23966b && this.f23967c == g0Var.f23967c && this.f23969e == g0Var.f23969e && Double.compare(this.f23968d, g0Var.f23968d) == 0;
    }

    public final int hashCode() {
        return a3.n.b(this.f23965a, Double.valueOf(this.f23966b), Double.valueOf(this.f23967c), Double.valueOf(this.f23968d), Integer.valueOf(this.f23969e));
    }

    public final String toString() {
        return a3.n.c(this).a("name", this.f23965a).a("minBound", Double.valueOf(this.f23967c)).a("maxBound", Double.valueOf(this.f23966b)).a("percent", Double.valueOf(this.f23968d)).a("count", Integer.valueOf(this.f23969e)).toString();
    }
}
