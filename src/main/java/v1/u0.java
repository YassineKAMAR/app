package v1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements p1.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f26836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a<String> f26837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d6.a<Integer> f26838c;

    public u0(d6.a<Context> aVar, d6.a<String> aVar2, d6.a<Integer> aVar3) {
        this.f26836a = aVar;
        this.f26837b = aVar2;
        this.f26838c = aVar3;
    }

    public static u0 a(d6.a<Context> aVar, d6.a<String> aVar2, d6.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i8) {
        return new t0(context, str, i8);
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f26836a.get(), this.f26837b.get(), this.f26838c.get().intValue());
    }
}
