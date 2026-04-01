package y6;

/* JADX INFO: loaded from: classes2.dex */
public class m1 extends q1 implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27513c;

    public m1(j1 j1Var) {
        super(true);
        U(j1Var);
        this.f27513c = y0();
    }

    private final boolean y0() {
        q1 q1VarT;
        p pVarL = L();
        q qVar = pVarL instanceof q ? (q) pVarL : null;
        if (qVar != null && (q1VarT = qVar.t()) != null) {
            while (!q1VarT.H()) {
                p pVarL2 = q1VarT.L();
                q qVar2 = pVarL2 instanceof q ? (q) pVarL2 : null;
                if (qVar2 == null || (q1VarT = qVar2.t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // y6.q1
    public boolean H() {
        return this.f27513c;
    }

    @Override // y6.q1
    public boolean I() {
        return true;
    }
}
