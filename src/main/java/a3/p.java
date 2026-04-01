package a3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p f151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f152c = new q(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f153a;

    private p() {
    }

    public static synchronized p b() {
        if (f151b == null) {
            f151b = new p();
        }
        return f151b;
    }

    public q a() {
        return this.f153a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f153a = f152c;
            return;
        }
        q qVar2 = this.f153a;
        if (qVar2 == null || qVar2.u() < qVar.u()) {
            this.f153a = qVar;
        }
    }
}
