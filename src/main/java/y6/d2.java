package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class d2<T> extends d7.d0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<e6.r<h6.g, Object>> f27485e;
    private volatile boolean threadLocalIsSet;

    public final boolean C0() {
        boolean z7 = this.threadLocalIsSet && this.f27485e.get() == null;
        this.f27485e.remove();
        return !z7;
    }

    public final void D0(h6.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f27485e.set(e6.x.a(gVar, obj));
    }

    @Override // d7.d0, y6.a
    protected void y0(Object obj) {
        if (this.threadLocalIsSet) {
            e6.r<h6.g, Object> rVar = this.f27485e.get();
            if (rVar != null) {
                d7.l0.a(rVar.a(), rVar.b());
            }
            this.f27485e.remove();
        }
        Object objA = y.a(obj, this.f21013d);
        h6.d<T> dVar = this.f21013d;
        h6.g context = dVar.getContext();
        Object objC = d7.l0.c(context, null);
        d2<?> d2VarF = objC != d7.l0.f21034a ? a0.f(dVar, context, objC) : null;
        try {
            this.f21013d.resumeWith(objA);
            e6.i0 i0Var = e6.i0.f21430a;
        } finally {
            if (d2VarF == null || d2VarF.C0()) {
                d7.l0.a(context, objC);
            }
        }
    }
}
