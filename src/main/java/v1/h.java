package v1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p1.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6.a<Context> f26786a;

    public h(d6.a<Context> aVar) {
        this.f26786a = aVar;
    }

    public static h a(d6.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) p1.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f26786a.get());
    }
}
