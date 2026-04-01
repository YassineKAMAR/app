package d7;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f21041a;

    static {
        Object objB;
        try {
            s.a aVar = e6.s.f21442b;
            objB = e6.s.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            s.a aVar2 = e6.s.f21442b;
            objB = e6.s.b(e6.t.a(th));
        }
        f21041a = e6.s.h(objB);
    }

    public static final boolean a() {
        return f21041a;
    }
}
