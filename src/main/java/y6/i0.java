package y6;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(h6.d<?> dVar) {
        Object objB;
        if (dVar instanceof d7.j) {
            return dVar.toString();
        }
        try {
            s.a aVar = e6.s.f21442b;
            objB = e6.s.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            s.a aVar2 = e6.s.f21442b;
            objB = e6.s.b(e6.t.a(th));
        }
        if (e6.s.e(objB) != null) {
            objB = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objB;
    }
}
