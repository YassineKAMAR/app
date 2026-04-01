package y6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p1 extends w implements t0, f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f27518d;

    @Override // y6.t0
    public void a() {
        t().m0(this);
    }

    @Override // y6.f1
    public boolean c() {
        return true;
    }

    @Override // y6.f1
    public v1 e() {
        return null;
    }

    public final q1 t() {
        q1 q1Var = this.f27518d;
        if (q1Var != null) {
            return q1Var;
        }
        kotlin.jvm.internal.q.t("job");
        return null;
    }

    @Override // d7.s
    public String toString() {
        return i0.a(this) + '@' + i0.b(this) + "[job@" + i0.b(t()) + ']';
    }

    public final void u(q1 q1Var) {
        this.f27518d = q1Var;
    }
}
