package u1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p1.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Executor> f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<v1.d> f26705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<x> f26706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<w1.b> f26707d;

    public w(d6.a<Executor> aVar, d6.a<v1.d> aVar2, d6.a<x> aVar3, d6.a<w1.b> aVar4) {
        this.f26704a = aVar;
        this.f26705b = aVar2;
        this.f26706c = aVar3;
        this.f26707d = aVar4;
    }

    public static w a(d6.a<Executor> aVar, d6.a<v1.d> aVar2, d6.a<x> aVar3, d6.a<w1.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, v1.d dVar, x xVar, w1.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f26704a.get(), this.f26705b.get(), this.f26706c.get(), this.f26707d.get());
    }
}
