package k7;

import kotlin.jvm.internal.q;
import m7.a2;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final u6.c<?> a(f fVar) {
        q.f(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f24246b;
        }
        if (fVar instanceof a2) {
            return a(((a2) fVar).k());
        }
        return null;
    }

    public static final f b(p7.c cVar, f descriptor) {
        i7.b bVarC;
        q.f(cVar, "<this>");
        q.f(descriptor, "descriptor");
        u6.c<?> cVarA = a(descriptor);
        if (cVarA == null || (bVarC = p7.c.c(cVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }

    public static final f c(f fVar, u6.c<?> context) {
        q.f(fVar, "<this>");
        q.f(context, "context");
        return new c(fVar, context);
    }
}
