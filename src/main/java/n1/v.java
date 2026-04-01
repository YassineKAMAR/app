package n1;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p1.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<x1.a> f25132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<x1.a> f25133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<t1.e> f25134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<u1.r> f25135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.a<u1.v> f25136e;

    public v(d6.a<x1.a> aVar, d6.a<x1.a> aVar2, d6.a<t1.e> aVar3, d6.a<u1.r> aVar4, d6.a<u1.v> aVar5) {
        this.f25132a = aVar;
        this.f25133b = aVar2;
        this.f25134c = aVar3;
        this.f25135d = aVar4;
        this.f25136e = aVar5;
    }

    public static v a(d6.a<x1.a> aVar, d6.a<x1.a> aVar2, d6.a<t1.e> aVar3, d6.a<u1.r> aVar4, d6.a<u1.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(x1.a aVar, x1.a aVar2, t1.e eVar, u1.r rVar, u1.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f25132a.get(), this.f25133b.get(), this.f25134c.get(), this.f25135d.get(), this.f25136e.get());
    }
}
