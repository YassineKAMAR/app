package t1;

import android.content.Context;
import u1.x;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p1.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f26482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<v1.d> f26483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<u1.f> f26484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a<x1.a> f26485d;

    public i(d6.a<Context> aVar, d6.a<v1.d> aVar2, d6.a<u1.f> aVar3, d6.a<x1.a> aVar4) {
        this.f26482a = aVar;
        this.f26483b = aVar2;
        this.f26484c = aVar3;
        this.f26485d = aVar4;
    }

    public static i a(d6.a<Context> aVar, d6.a<v1.d> aVar2, d6.a<u1.f> aVar3, d6.a<x1.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, v1.d dVar, u1.f fVar, x1.a aVar) {
        return (x) p1.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f26482a.get(), this.f26483b.get(), this.f26484c.get(), this.f26485d.get());
    }
}
