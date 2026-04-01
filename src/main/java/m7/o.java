package m7;

import e6.s;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f24973a;

    static {
        Object objB;
        try {
            s.a aVar = e6.s.f21442b;
            objB = e6.s.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            s.a aVar2 = e6.s.f21442b;
            objB = e6.s.b(e6.t.a(th));
        }
        if (e6.s.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = e6.s.b(objB);
        Boolean bool = Boolean.FALSE;
        if (e6.s.g(objB2)) {
            objB2 = bool;
        }
        f24973a = ((Boolean) objB2).booleanValue();
    }

    public static final <T> c2<T> a(p6.l<? super u6.c<?>, ? extends i7.b<T>> factory) {
        kotlin.jvm.internal.q.f(factory, "factory");
        return f24973a ? new s(factory) : new w(factory);
    }

    public static final <T> n1<T> b(p6.p<? super u6.c<Object>, ? super List<? extends u6.i>, ? extends i7.b<T>> factory) {
        kotlin.jvm.internal.q.f(factory, "factory");
        return f24973a ? new t(factory) : new x(factory);
    }
}
