package h2;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1.e f22237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22238b;

    public n4(z1.e eVar, Object obj) {
        this.f22237a = eVar;
        this.f22238b = obj;
    }

    @Override // h2.i0
    public final void l() {
        Object obj;
        z1.e eVar = this.f22237a;
        if (eVar == null || (obj = this.f22238b) == null) {
            return;
        }
        eVar.c(obj);
    }

    @Override // h2.i0
    public final void z0(z2 z2Var) {
        z1.e eVar = this.f22237a;
        if (eVar != null) {
            eVar.b(z2Var.i());
        }
    }
}
