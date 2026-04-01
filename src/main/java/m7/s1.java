package m7;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {
    public static final int a(k7.f fVar, k7.f[] typeParams) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        kotlin.jvm.internal.q.f(typeParams, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<k7.f> iterableA = k7.h.a(fVar);
        Iterator<k7.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i8 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i9 = i8 * 31;
            String strA = it.next().a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i8 = i9 + iHashCode3;
        }
        Iterator<k7.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i10 = iHashCode2 * 31;
            k7.j jVarE = it2.next().e();
            iHashCode2 = i10 + (jVarE != null ? jVarE.hashCode() : 0);
        }
        return (((iHashCode * 31) + i8) * 31) + iHashCode2;
    }
}
