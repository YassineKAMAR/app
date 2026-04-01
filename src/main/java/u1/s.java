package u1;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p1.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f26689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<o1.e> f26690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<v1.d> f26691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<x> f26692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.a<Executor> f26693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d6.a<w1.b> f26694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d6.a<x1.a> f26695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d6.a<x1.a> f26696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d6.a<v1.c> f26697i;

    public s(d6.a<Context> aVar, d6.a<o1.e> aVar2, d6.a<v1.d> aVar3, d6.a<x> aVar4, d6.a<Executor> aVar5, d6.a<w1.b> aVar6, d6.a<x1.a> aVar7, d6.a<x1.a> aVar8, d6.a<v1.c> aVar9) {
        this.f26689a = aVar;
        this.f26690b = aVar2;
        this.f26691c = aVar3;
        this.f26692d = aVar4;
        this.f26693e = aVar5;
        this.f26694f = aVar6;
        this.f26695g = aVar7;
        this.f26696h = aVar8;
        this.f26697i = aVar9;
    }

    public static s a(d6.a<Context> aVar, d6.a<o1.e> aVar2, d6.a<v1.d> aVar3, d6.a<x> aVar4, d6.a<Executor> aVar5, d6.a<w1.b> aVar6, d6.a<x1.a> aVar7, d6.a<x1.a> aVar8, d6.a<v1.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, o1.e eVar, v1.d dVar, x xVar, Executor executor, w1.b bVar, x1.a aVar, x1.a aVar2, v1.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f26689a.get(), this.f26690b.get(), this.f26691c.get(), this.f26692d.get(), this.f26693e.get(), this.f26694f.get(), this.f26695g.get(), this.f26696h.get(), this.f26697i.get());
    }
}
