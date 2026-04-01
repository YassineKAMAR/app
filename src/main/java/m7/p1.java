package m7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k7.f[] f24980a = new k7.f[0];

    public static final Set<String> a(k7.f fVar) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int iF = fVar.f();
        for (int i8 = 0; i8 < iF; i8++) {
            hashSet.add(fVar.g(i8));
        }
        return hashSet;
    }

    public static final k7.f[] b(List<? extends k7.f> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new k7.f[0]);
            kotlin.jvm.internal.q.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            k7.f[] fVarArr = (k7.f[]) array;
            if (fVarArr != null) {
                return fVarArr;
            }
        }
        return f24980a;
    }

    public static final u6.c<Object> c(u6.i iVar) {
        kotlin.jvm.internal.q.f(iVar, "<this>");
        u6.d dVarD = iVar.d();
        if (dVarD instanceof u6.c) {
            return (u6.c) dVarD;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + dVarD).toString());
    }

    public static final Void d(u6.c<?> cVar) {
        kotlin.jvm.internal.q.f(cVar, "<this>");
        throw new i7.i("Serializer for class '" + cVar.b() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
