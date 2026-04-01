package d7;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f21020a = new a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f21021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21022c;

    static {
        Object objB;
        Object objB2;
        try {
            s.a aVar = e6.s.f21442b;
            objB = e6.s.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            s.a aVar2 = e6.s.f21442b;
            objB = e6.s.b(e6.t.a(th));
        }
        if (e6.s.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f21021b = (String) objB;
        try {
            objB2 = e6.s.b(g0.class.getCanonicalName());
        } catch (Throwable th2) {
            s.a aVar3 = e6.s.f21442b;
            objB2 = e6.s.b(e6.t.a(th2));
        }
        if (e6.s.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f21022c = (String) objB2;
    }

    public static final <E extends Throwable> E a(E e8) {
        return e8;
    }
}
