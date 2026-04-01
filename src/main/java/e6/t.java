package e6;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.q.f(exception, "exception");
        return new s.b(exception);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof s.b) {
            throw ((s.b) obj).f21444a;
        }
    }
}
