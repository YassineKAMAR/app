package o1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p1.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f25281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<i> f25282b;

    public l(d6.a<Context> aVar, d6.a<i> aVar2) {
        this.f25281a = aVar;
        this.f25282b = aVar2;
    }

    public static l a(d6.a<Context> aVar, d6.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f25281a.get(), this.f25282b.get());
    }
}
