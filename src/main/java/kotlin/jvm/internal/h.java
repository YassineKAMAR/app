package kotlin.jvm.internal;

import f6.j0;
import f6.k0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements u6.c<Object>, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24309b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends e6.g<?>>, Integer> f24310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f24311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f24312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f24313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f24314g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f24315a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            q.f(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    Method enclosingMethod = jClass.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        q.e(name, "name");
                        String strK0 = w6.w.k0(name, enclosingMethod.getName() + '$', null, 2, null);
                        if (strK0 != null) {
                            return strK0;
                        }
                    }
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    q.e(name, "name");
                    if (enclosingConstructor == null) {
                        return w6.w.j0(name, '$', null, 2, null);
                    }
                    return w6.w.k0(name, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!jClass.isArray()) {
                    String str3 = (String) h.f24314g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) h.f24314g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i8 = 0;
        List listG = f6.o.g(p6.a.class, p6.l.class, p6.p.class, p6.q.class, p6.r.class, p6.s.class, p6.t.class, p6.u.class, p6.v.class, p6.w.class, p6.b.class, p6.c.class, p6.d.class, p6.e.class, p6.f.class, p6.g.class, p6.h.class, p6.i.class, p6.j.class, p6.k.class, p6.m.class, p6.n.class, p6.o.class);
        ArrayList arrayList = new ArrayList(f6.p.m(listG, 10));
        for (Object obj : listG) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                f6.o.l();
            }
            arrayList.add(e6.x.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        f24310c = k0.n(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f24311d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f24312e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        q.e(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            q.e(kotlinName, "kotlinName");
            sb.append(w6.w.m0(kotlinName, '.', null, 2, null));
            sb.append("CompanionObject");
            e6.r rVarA = e6.x.a(sb.toString(), kotlinName + ".Companion");
            map3.put(rVarA.c(), rVarA.d());
        }
        for (Map.Entry<Class<? extends e6.g<?>>, Integer> entry : f24310c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f24313f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), w6.w.m0((String) entry2.getValue(), '.', null, 2, null));
        }
        f24314g = linkedHashMap;
    }

    public h(Class<?> jClass) {
        q.f(jClass, "jClass");
        this.f24315a = jClass;
    }

    @Override // u6.c
    public String b() {
        return f24309b.a(e());
    }

    @Override // kotlin.jvm.internal.g
    public Class<?> e() {
        return this.f24315a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && q.b(o6.a.b(this), o6.a.b((u6.c) obj));
    }

    public int hashCode() {
        return o6.a.b(this).hashCode();
    }

    public String toString() {
        return e().toString() + " (Kotlin reflection is not available)";
    }
}
