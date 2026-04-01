package o7;

import k7.j;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    public static final k7.f a(k7.f fVar, p7.c module) {
        k7.f fVarA;
        kotlin.jvm.internal.q.f(fVar, "<this>");
        kotlin.jvm.internal.q.f(module, "module");
        if (!kotlin.jvm.internal.q.b(fVar.e(), j.a.f24280a)) {
            return fVar.isInline() ? a(fVar.i(0), module) : fVar;
        }
        k7.f fVarB = k7.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final y0 b(n7.a aVar, k7.f desc) {
        kotlin.jvm.internal.q.f(aVar, "<this>");
        kotlin.jvm.internal.q.f(desc, "desc");
        k7.j jVarE = desc.e();
        if (jVarE instanceof k7.d) {
            return y0.POLY_OBJ;
        }
        if (!kotlin.jvm.internal.q.b(jVarE, k.b.f24283a)) {
            if (!kotlin.jvm.internal.q.b(jVarE, k.c.f24284a)) {
                return y0.OBJ;
            }
            k7.f fVarA = a(desc.i(0), aVar.a());
            k7.j jVarE2 = fVarA.e();
            if ((jVarE2 instanceof k7.e) || kotlin.jvm.internal.q.b(jVarE2, j.b.f24281a)) {
                return y0.MAP;
            }
            if (!aVar.e().b()) {
                throw b0.d(fVarA);
            }
        }
        return y0.LIST;
    }
}
