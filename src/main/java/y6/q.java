package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends l1 implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f27519e;

    public q(r rVar) {
        this.f27519e = rVar;
    }

    @Override // y6.p
    public boolean d(Throwable th) {
        return t().u(th);
    }

    @Override // y6.p
    public j1 getParent() {
        return t();
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ e6.i0 invoke(Throwable th) {
        s(th);
        return e6.i0.f21430a;
    }

    @Override // y6.w
    public void s(Throwable th) {
        this.f27519e.R(t());
    }
}
