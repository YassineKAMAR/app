package a7;

import e6.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final <E> d<E> a(int i8, a aVar, p6.l<? super E, i0> lVar) {
        d<E> bVar;
        if (i8 != -2) {
            if (i8 == -1) {
                if (aVar == a.SUSPEND) {
                    return new l(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i8 != 0) {
                return i8 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i8, lVar) : new l(i8, aVar, lVar) : new b(Integer.MAX_VALUE, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b<>(0, lVar) : new l<>(1, aVar, lVar);
        } else {
            bVar = aVar == a.SUSPEND ? new b<>(d.f283a.a(), lVar) : new l<>(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i8, a aVar, p6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        return a(i8, aVar, lVar);
    }
}
