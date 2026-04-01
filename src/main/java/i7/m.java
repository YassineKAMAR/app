package i7;

import e6.r;
import e6.s;
import e6.w;
import f6.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import m7.l0;
import m7.n0;
import m7.o1;
import m7.p1;
import m7.w0;
import m7.y0;
import m7.y1;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class m {
    private static final b<? extends Object> a(u6.c<Object> cVar, List<? extends u6.i> list, List<? extends b<Object>> list2) {
        if (q.b(cVar, z.b(Collection.class)) ? true : q.b(cVar, z.b(List.class)) ? true : q.b(cVar, z.b(List.class)) ? true : q.b(cVar, z.b(ArrayList.class))) {
            return new m7.f(list2.get(0));
        }
        if (q.b(cVar, z.b(HashSet.class))) {
            return new n0(list2.get(0));
        }
        if (q.b(cVar, z.b(Set.class)) ? true : q.b(cVar, z.b(Set.class)) ? true : q.b(cVar, z.b(LinkedHashSet.class))) {
            return new y0(list2.get(0));
        }
        if (q.b(cVar, z.b(HashMap.class))) {
            return new l0(list2.get(0), list2.get(1));
        }
        if (q.b(cVar, z.b(Map.class)) ? true : q.b(cVar, z.b(Map.class)) ? true : q.b(cVar, z.b(LinkedHashMap.class))) {
            return new w0(list2.get(0), list2.get(1));
        }
        if (q.b(cVar, z.b(Map.Entry.class))) {
            return j7.a.j(list2.get(0), list2.get(1));
        }
        if (q.b(cVar, z.b(r.class))) {
            return j7.a.l(list2.get(0), list2.get(1));
        }
        if (q.b(cVar, z.b(w.class))) {
            return j7.a.n(list2.get(0), list2.get(1), list2.get(2));
        }
        if (!o1.l(cVar)) {
            return null;
        }
        u6.d dVarD = list.get(0).d();
        q.d(dVarD, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return j7.a.a((u6.c) dVarD, list2.get(0));
    }

    private static final b<? extends Object> b(u6.c<Object> cVar, List<? extends b<Object>> list) {
        Object[] array = list.toArray(new b[0]);
        q.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        b[] bVarArr = (b[]) array;
        return o1.d(cVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    private static final <T> b<T> c(b<T> bVar, boolean z7) {
        if (z7) {
            return j7.a.s(bVar);
        }
        q.d(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b<? extends Object> d(u6.c<Object> cVar, List<? extends u6.i> types, List<? extends b<Object>> serializers) {
        q.f(cVar, "<this>");
        q.f(types, "types");
        q.f(serializers, "serializers");
        b<? extends Object> bVarA = a(cVar, types, serializers);
        return bVarA == null ? b(cVar, serializers) : bVarA;
    }

    public static final b<Object> e(p7.c cVar, u6.i type) {
        q.f(cVar, "<this>");
        q.f(type, "type");
        b<Object> bVarF = f(cVar, type, true);
        if (bVarF != null) {
            return bVarF;
        }
        o1.m(p1.c(type));
        throw new e6.h();
    }

    private static final b<Object> f(p7.c cVar, u6.i iVar, boolean z7) {
        b<Object> bVarA;
        b<? extends Object> bVarB;
        u6.c<Object> cVarC = p1.c(iVar);
        boolean zA = iVar.a();
        List<u6.j> listC = iVar.c();
        ArrayList arrayList = new ArrayList(p.m(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            u6.i iVarA = ((u6.j) it.next()).a();
            if (iVarA == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + iVar).toString());
            }
            arrayList.add(iVarA);
        }
        if (arrayList.isEmpty()) {
            bVarA = k.a(cVarC, zA);
        } else {
            Object objB = k.b(cVarC, arrayList, zA);
            if (z7) {
                if (s.g(objB)) {
                    objB = null;
                }
            } else if (s.e(objB) != null) {
                return null;
            }
            bVarA = (b) objB;
        }
        if (bVarA != null) {
            return bVarA;
        }
        if (arrayList.isEmpty()) {
            bVarB = p7.c.c(cVar, cVarC, null, 2, null);
        } else {
            List<b<Object>> listE = l.e(cVar, arrayList, z7);
            if (listE == null) {
                return null;
            }
            b<? extends Object> bVarA2 = l.a(cVarC, arrayList, listE);
            bVarB = bVarA2 == null ? cVar.b(cVarC, listE) : bVarA2;
        }
        if (bVarB != null) {
            return c(bVarB, zA);
        }
        return null;
    }

    public static final b<Object> g(p7.c cVar, u6.i type) {
        q.f(cVar, "<this>");
        q.f(type, "type");
        return f(cVar, type, false);
    }

    public static final <T> b<T> h(u6.c<T> cVar) {
        q.f(cVar, "<this>");
        b<T> bVarB = o1.b(cVar);
        return bVarB == null ? y1.b(cVar) : bVarB;
    }

    public static final List<b<Object>> i(p7.c cVar, List<? extends u6.i> typeArguments, boolean z7) {
        ArrayList arrayList;
        q.f(cVar, "<this>");
        q.f(typeArguments, "typeArguments");
        if (z7) {
            arrayList = new ArrayList(p.m(typeArguments, 10));
            Iterator<T> it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(l.b(cVar, (u6.i) it.next()));
            }
        } else {
            arrayList = new ArrayList(p.m(typeArguments, 10));
            Iterator<T> it2 = typeArguments.iterator();
            while (it2.hasNext()) {
                b<Object> bVarC = l.c(cVar, (u6.i) it2.next());
                if (bVarC == null) {
                    return null;
                }
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }
}
