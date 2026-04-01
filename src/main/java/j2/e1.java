package j2;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23955b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23956c = new Object();

    public e1(long j8) {
        this.f23954a = j8;
    }

    public final void a(long j8) {
        synchronized (this.f23956c) {
            this.f23954a = j8;
        }
    }

    public final boolean b() {
        synchronized (this.f23956c) {
            long jB = g2.t.b().b();
            if (this.f23955b + this.f23954a > jB) {
                return false;
            }
            this.f23955b = jB;
            return true;
        }
    }
}
