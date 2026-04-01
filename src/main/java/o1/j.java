package o1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p1.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f25273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<x1.a> f25274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<x1.a> f25275c;

    public j(d6.a<Context> aVar, d6.a<x1.a> aVar2, d6.a<x1.a> aVar3) {
        this.f25273a = aVar;
        this.f25274b = aVar2;
        this.f25275c = aVar3;
    }

    public static j a(d6.a<Context> aVar, d6.a<x1.a> aVar2, d6.a<x1.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, x1.a aVar, x1.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f25273a.get(), this.f25274b.get(), this.f25275c.get());
    }
}
