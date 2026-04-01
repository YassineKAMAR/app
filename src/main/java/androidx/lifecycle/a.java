package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static a f2641c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, C0032a> f2642a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2643b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    @Deprecated
    static class C0032a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<d.a, List<b>> f2644a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, d.a> f2645b;

        C0032a(Map<b, d.a> map) {
            this.f2645b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> arrayList = this.f2644a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2644a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, i iVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, aVar, obj);
                }
            }
        }

        void a(i iVar, d.a aVar, Object obj) {
            b(this.f2644a.get(aVar), iVar, aVar, obj);
            b(this.f2644a.get(d.a.ON_ANY), iVar, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f2647b;

        b(int i8, Method method) {
            this.f2646a = i8;
            this.f2647b = method;
            method.setAccessible(true);
        }

        void a(i iVar, d.a aVar, Object obj) {
            try {
                int i8 = this.f2646a;
                if (i8 == 0) {
                    this.f2647b.invoke(obj, new Object[0]);
                } else if (i8 == 1) {
                    this.f2647b.invoke(obj, iVar);
                } else {
                    if (i8 != 2) {
                        return;
                    }
                    this.f2647b.invoke(obj, iVar, aVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to call observer method", e9.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2646a == bVar.f2646a && this.f2647b.getName().equals(bVar.f2647b.getName());
        }

        public int hashCode() {
            return (this.f2646a * 31) + this.f2647b.getName().hashCode();
        }
    }

    a() {
    }

    private C0032a a(Class<?> cls, Method[] methodArr) {
        int i8;
        C0032a c0032aC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0032aC = c(superclass)) != null) {
            map.putAll(c0032aC.f2645b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : c(cls2).f2645b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else {
                    if (!i.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i8 = 1;
                }
                d.a aVarValue = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!d.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i8, method), aVarValue, cls);
                z7 = true;
            }
        }
        C0032a c0032a = new C0032a(map);
        this.f2642a.put(cls, c0032a);
        this.f2643b.put(cls, Boolean.valueOf(z7));
        return c0032a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class<?> cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2647b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    C0032a c(Class<?> cls) {
        C0032a c0032a = this.f2642a.get(cls);
        return c0032a != null ? c0032a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f2643b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2643b.put(cls, Boolean.FALSE);
        return false;
    }
}
