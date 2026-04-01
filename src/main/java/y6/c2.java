package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f27483c = new c2();

    private c2() {
    }

    @Override // y6.b0
    public void e0(h6.g gVar, Runnable runnable) {
        g2 g2Var = (g2) gVar.a(g2.f27496c);
        if (g2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        g2Var.f27497b = true;
    }

    @Override // y6.b0
    public boolean f0(h6.g gVar) {
        return false;
    }

    @Override // y6.b0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
