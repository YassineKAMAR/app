package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2671a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Integer> f2672b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends c>>> f2673c = new HashMap();

    private m() {
    }

    private final c a(Constructor<? extends c> constructor, Object obj) {
        try {
            c cVarNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.q.e(cVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return cVarNewInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final Constructor<? extends c> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            kotlin.jvm.internal.q.e(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.q.e(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.q.e(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.q.e(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (!(fullPackage.length() == 0)) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.q.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static final String c(String className) {
        kotlin.jvm.internal.q.f(className, "className");
        return w6.v.s(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f2672b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && h.class.isAssignableFrom(cls);
    }

    public static final g f(Object object) {
        kotlin.jvm.internal.q.f(object, "object");
        boolean z7 = object instanceof g;
        boolean z8 = object instanceof DefaultLifecycleObserver;
        if (z7 && z8) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (g) object);
        }
        if (z8) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z7) {
            return (g) object;
        }
        Class<?> cls = object.getClass();
        m mVar = f2671a;
        if (mVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends c>> list = f2673c.get(cls);
        kotlin.jvm.internal.q.c(list);
        List<Constructor<? extends c>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(mVar.a(list2.get(0), object));
        }
        int size = list2.size();
        c[] cVarArr = new c[size];
        for (int i8 = 0; i8 < size; i8++) {
            cVarArr[i8] = f2671a.a(list2.get(i8), object);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends c> constructorB = b(cls);
        if (constructorB != null) {
            f2673c.put(cls, f6.n.b(constructorB));
            return 2;
        }
        if (a.f2641c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            kotlin.jvm.internal.q.e(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends c>> list = f2673c.get(superclass);
            kotlin.jvm.internal.q.c(list);
            arrayList = new ArrayList(list);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.q.e(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.q.e(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends c>> list2 = f2673c.get(intrface);
                kotlin.jvm.internal.q.c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f2673c.put(cls, arrayList);
        return 2;
    }
}
