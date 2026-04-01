package m3;

/* JADX INFO: loaded from: classes.dex */
final class q implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f24793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f24794b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f24796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o2 f24797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o2 f24798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o2 f24799g;

    /* synthetic */ q(k kVar, n0 n0Var, p pVar) {
        this.f24793a = kVar;
        o2 o2VarA = k2.a(new u0(kVar.f24747c));
        this.f24795c = o2VarA;
        l2 l2VarA = m2.a(n0Var);
        this.f24796d = l2VarA;
        j2 j2Var = new j2();
        this.f24797e = j2Var;
        z0 z0Var = new z0(kVar.f24747c, o2VarA, v.f24832a, x.f24846a, kVar.f24754j, kVar.f24755k, j2Var, kVar.f24748d);
        this.f24798f = z0Var;
        s0 s0Var = new s0(o2VarA, v.f24832a, z0Var);
        this.f24799g = s0Var;
        j2.a(j2Var, k2.a(new h0(kVar.f24747c, kVar.f24749e, o2VarA, kVar.f24748d, l2VarA, s0Var)));
    }

    @Override // m3.a0
    public final g0 j() {
        return (g0) this.f24797e.k();
    }
}
