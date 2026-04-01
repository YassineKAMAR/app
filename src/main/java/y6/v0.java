package y6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f6.e<p0<?>> f27558e;

    private final long i0(boolean z7) {
        return z7 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void m0(v0 v0Var, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        v0Var.l0(z7);
    }

    public final void h0(boolean z7) {
        long jI0 = this.f27556c - i0(z7);
        this.f27556c = jI0;
        if (jI0 <= 0 && this.f27557d) {
            shutdown();
        }
    }

    public final void j0(p0<?> p0Var) {
        f6.e<p0<?>> eVar = this.f27558e;
        if (eVar == null) {
            eVar = new f6.e<>();
            this.f27558e = eVar;
        }
        eVar.addLast(p0Var);
    }

    protected long k0() {
        f6.e<p0<?>> eVar = this.f27558e;
        return (eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void l0(boolean z7) {
        this.f27556c += i0(z7);
        if (z7) {
            return;
        }
        this.f27557d = true;
    }

    public final boolean n0() {
        return this.f27556c >= i0(true);
    }

    public final boolean o0() {
        f6.e<p0<?>> eVar = this.f27558e;
        if (eVar != null) {
            return eVar.isEmpty();
        }
        return true;
    }

    public final boolean p0() {
        p0<?> p0VarX;
        f6.e<p0<?>> eVar = this.f27558e;
        if (eVar == null || (p0VarX = eVar.x()) == null) {
            return false;
        }
        p0VarX.run();
        return true;
    }

    public void shutdown() {
    }
}
