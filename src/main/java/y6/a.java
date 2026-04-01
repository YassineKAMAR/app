package y6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> extends q1 implements h6.d<T>, e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h6.g f27470c;

    public a(h6.g gVar, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            U((j1) gVar.a(j1.V));
        }
        this.f27470c = gVar.X(this);
    }

    protected void A0(T t7) {
    }

    public final <R> void B0(g0 g0Var, R r8, p6.p<? super R, ? super h6.d<? super T>, ? extends Object> pVar) {
        g0Var.c(pVar, r8, this);
    }

    @Override // y6.q1
    public final void T(Throwable th) {
        d0.a(this.f27470c, th);
    }

    @Override // y6.q1, y6.j1
    public boolean c() {
        return super.c();
    }

    @Override // y6.e0
    public h6.g d() {
        return this.f27470c;
    }

    @Override // y6.q1
    public String d0() {
        String strB = a0.b(this.f27470c);
        if (strB == null) {
            return super.d0();
        }
        return '\"' + strB + "\":" + super.d0();
    }

    @Override // h6.d
    public final h6.g getContext() {
        return this.f27470c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.q1
    protected final void i0(Object obj) {
        if (!(obj instanceof u)) {
            A0(obj);
        } else {
            u uVar = (u) obj;
            z0(uVar.f27552a, uVar.a());
        }
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        Object objB0 = b0(y.d(obj, null, 1, null));
        if (objB0 == r1.f27534b) {
            return;
        }
        y0(objB0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y6.q1
    public String s() {
        return i0.a(this) + " was cancelled";
    }

    protected void y0(Object obj) {
        l(obj);
    }

    protected void z0(Throwable th, boolean z7) {
    }
}
