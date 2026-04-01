package h2;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1.q f22178a;

    public e4(z1.q qVar) {
        this.f22178a = qVar;
    }

    @Override // h2.f2
    public final boolean n() {
        return this.f22178a == null;
    }

    @Override // h2.f2
    public final void p4(y4 y4Var) {
        z1.q qVar = this.f22178a;
        if (qVar != null) {
            qVar.a(z1.i.d(y4Var.f22379b, y4Var.f22380c, y4Var.f22381d));
        }
    }
}
