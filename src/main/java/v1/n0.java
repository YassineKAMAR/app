package v1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements p1.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<x1.a> f26809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<x1.a> f26810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<e> f26811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<t0> f26812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.a<String> f26813e;

    public n0(d6.a<x1.a> aVar, d6.a<x1.a> aVar2, d6.a<e> aVar3, d6.a<t0> aVar4, d6.a<String> aVar5) {
        this.f26809a = aVar;
        this.f26810b = aVar2;
        this.f26811c = aVar3;
        this.f26812d = aVar4;
        this.f26813e = aVar5;
    }

    public static n0 a(d6.a<x1.a> aVar, d6.a<x1.a> aVar2, d6.a<e> aVar3, d6.a<t0> aVar4, d6.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(x1.a aVar, x1.a aVar2, Object obj, Object obj2, d6.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f26809a.get(), this.f26810b.get(), this.f26811c.get(), this.f26812d.get(), this.f26813e);
    }
}
