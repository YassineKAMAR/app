package t1;

import java.util.concurrent.Executor;
import u1.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p1.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Executor> f26476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<o1.e> f26477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<x> f26478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<v1.d> f26479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.a<w1.b> f26480e;

    public d(d6.a<Executor> aVar, d6.a<o1.e> aVar2, d6.a<x> aVar3, d6.a<v1.d> aVar4, d6.a<w1.b> aVar5) {
        this.f26476a = aVar;
        this.f26477b = aVar2;
        this.f26478c = aVar3;
        this.f26479d = aVar4;
        this.f26480e = aVar5;
    }

    public static d a(d6.a<Executor> aVar, d6.a<o1.e> aVar2, d6.a<x> aVar3, d6.a<v1.d> aVar4, d6.a<w1.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, o1.e eVar, x xVar, v1.d dVar, w1.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f26476a.get(), this.f26477b.get(), this.f26478c.get(), this.f26479d.get(), this.f26480e.get());
    }
}
