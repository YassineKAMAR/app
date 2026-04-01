package z1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27645c;

    private i(int i8, String str, long j8) {
        this.f27643a = i8;
        this.f27644b = str;
        this.f27645c = j8;
    }

    public static i d(int i8, String str, long j8) {
        return new i(i8, str, j8);
    }

    public String a() {
        return this.f27644b;
    }

    public int b() {
        return this.f27643a;
    }

    public long c() {
        return this.f27645c;
    }
}
