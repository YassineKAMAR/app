package o7;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o7.v;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v.a<Map<String, Integer>> f25309a = new v.a<>();

    /* synthetic */ class a extends kotlin.jvm.internal.o implements p6.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, c0.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Map<String, Integer> invoke() {
            return c0.a((k7.f) this.receiver);
        }
    }

    public static final Map<String, Integer> a(k7.f fVar) {
        String[] strArrNames;
        kotlin.jvm.internal.q.f(fVar, "<this>");
        int iF = fVar.f();
        Map<String, Integer> mapA = null;
        for (int i8 = 0; i8 < iF; i8++) {
            List<Annotation> listH = fVar.h(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof n7.q) {
                    arrayList.add(obj);
                }
            }
            n7.q qVar = (n7.q) f6.w.O(arrayList);
            if (qVar != null && (strArrNames = qVar.names()) != null) {
                for (String str : strArrNames) {
                    if (mapA == null) {
                        mapA = u.a(fVar.f());
                    }
                    kotlin.jvm.internal.q.c(mapA);
                    b(mapA, fVar, str, i8);
                }
            }
        }
        return mapA == null ? f6.k0.e() : mapA;
    }

    private static final void b(Map<String, Integer> map, k7.f fVar, String str, int i8) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new a0("The suggested name '" + str + "' for property " + fVar.g(i8) + " is already one of the names for property " + fVar.g(((Number) f6.k0.f(map, str)).intValue()) + " in " + fVar);
    }

    public static final v.a<Map<String, Integer>> c() {
        return f25309a;
    }

    public static final int d(k7.f fVar, n7.a json, String name) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(name, "name");
        int iD = fVar.d(name);
        if (iD != -3 || !json.e().j()) {
            return iD;
        }
        Integer num = (Integer) ((Map) n7.x.a(json).b(fVar, f25309a, new a(fVar))).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int e(k7.f fVar, n7.a json, String name, String suffix) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(name, "name");
        kotlin.jvm.internal.q.f(suffix, "suffix");
        int iD = d(fVar, json, name);
        if (iD != -3) {
            return iD;
        }
        throw new i7.i(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int f(k7.f fVar, n7.a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return e(fVar, aVar, str, str2);
    }
}
