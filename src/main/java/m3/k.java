package m3;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class k extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f24746b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o2 f24747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f24748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o2 f24749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o2 f24750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o2 f24751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o2 f24752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o2 f24753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o2 f24754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o2 f24755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o2 f24756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o2 f24757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o2 f24758n;

    /* synthetic */ k(Application application, j jVar) {
        l2 l2VarA = m2.a(application);
        this.f24747c = l2VarA;
        o2 o2VarA = k2.a(new u(l2VarA));
        this.f24748d = o2VarA;
        o2 o2VarA2 = k2.a(g.f24674a);
        this.f24749e = o2VarA2;
        i iVar = new i(this);
        this.f24750f = iVar;
        o2 o2VarA3 = k2.a(new m0(iVar, x.f24846a));
        this.f24751g = o2VarA3;
        b0 b0Var = new b0(l2VarA);
        this.f24752h = b0Var;
        a3 a3Var = new a3(l2VarA, b0Var, o2VarA);
        this.f24753i = a3Var;
        o2 o2VarA4 = k2.a(new s2(x.f24846a));
        this.f24754j = o2VarA4;
        s sVar = new s(l2VarA, o2VarA, x.f24846a);
        this.f24755k = sVar;
        e eVar = new e(o2VarA4, sVar, o2VarA);
        this.f24756l = eVar;
        i3 i3Var = new i3(l2VarA, o2VarA2, v.f24832a, x.f24846a, o2VarA, o2VarA3, a3Var, eVar, o2VarA4);
        this.f24757m = i3Var;
        this.f24758n = k2.a(new v2(o2VarA, i3Var, o2VarA3));
    }

    @Override // m3.v0
    public final u2 b() {
        return (u2) this.f24758n.k();
    }

    @Override // m3.v0
    public final l0 c() {
        return (l0) this.f24751g.k();
    }
}
