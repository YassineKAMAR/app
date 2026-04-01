package y6;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final <T> Object a(Object obj, h6.d<? super T> dVar) {
        if (obj instanceof u) {
            s.a aVar = e6.s.f21442b;
            obj = e6.t.a(((u) obj).f27552a);
        }
        return e6.s.b(obj);
    }

    public static final <T> Object b(Object obj, p6.l<? super Throwable, e6.i0> lVar) {
        Throwable thE = e6.s.e(obj);
        return thE == null ? lVar != null ? new v(obj, lVar) : obj : new u(thE, false, 2, null);
    }

    public static final <T> Object c(Object obj, j<?> jVar) {
        Throwable thE = e6.s.e(obj);
        return thE == null ? obj : new u(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, p6.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
