package m7;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 {
    private static final Object a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> i7.b<T> b(u6.c<T> cVar) {
        kotlin.jvm.internal.q.f(cVar, "<this>");
        return d(cVar, new i7.b[0]);
    }

    public static final <T> i7.b<T> c(Class<T> cls, i7.b<Object>... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Field field;
        i7.b<T> bVarG;
        kotlin.jvm.internal.q.f(cls, "<this>");
        kotlin.jvm.internal.q.f(args, "args");
        if (cls.isEnum() && j(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (bVarG = g(cls)) != null) {
            return bVarG;
        }
        i7.b<T> bVarH = h(cls, (i7.b[]) Arrays.copyOf(args, args.length));
        if (bVarH != null) {
            return bVarH;
        }
        i7.b<T> bVarF = f(cls);
        if (bVarF != null) {
            return bVarF;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.q.e(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i8 = 0;
            Class<?> cls2 = null;
            boolean z7 = false;
            while (true) {
                if (i8 >= length) {
                    if (!z7) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i8];
                    if (kotlin.jvm.internal.q.b(cls3.getSimpleName(), "$serializer")) {
                        if (z7) {
                            break;
                        }
                        z7 = true;
                        cls2 = cls3;
                    }
                    i8++;
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
        } catch (NoSuchFieldException unused) {
        }
        i7.b<T> bVar = obj instanceof i7.b ? (i7.b) obj : null;
        if (bVar != null) {
            return bVar;
        }
        if (k(cls)) {
            return new i7.e(o6.a.c(cls));
        }
        return null;
    }

    public static final <T> i7.b<T> d(u6.c<T> cVar, i7.b<Object>... args) {
        kotlin.jvm.internal.q.f(cVar, "<this>");
        kotlin.jvm.internal.q.f(args, "args");
        return c(o6.a.a(cVar), (i7.b[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> i7.b<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.q.e(canonicalName, "canonicalName");
        kotlin.jvm.internal.q.d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new e0(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> i7.b<T> f(java.lang.Class<T> r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "declaredFields"
            kotlin.jvm.internal.q.e(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r3
            r4 = 0
            r5 = 0
        Lf:
            r7 = 1
            if (r4 >= r1) goto L41
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.q.b(r9, r10)
            if (r9 == 0) goto L36
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.q.b(r9, r11)
            if (r9 == 0) goto L36
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L36
            r9 = 1
            goto L37
        L36:
            r9 = 0
        L37:
            if (r9 == 0) goto L3e
            if (r5 == 0) goto L3c
            goto L43
        L3c:
            r6 = r8
            r5 = 1
        L3e:
            int r4 = r4 + 1
            goto Lf
        L41:
            if (r5 != 0) goto L44
        L43:
            r6 = r3
        L44:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L49
            return r3
        L49:
            java.lang.Object r0 = r6.get(r3)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "methods"
            kotlin.jvm.internal.q.e(r11, r1)
            int r1 = r11.length
            r6 = r3
            r4 = 0
            r5 = 0
        L5a:
            if (r4 >= r1) goto L94
            r8 = r11[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = kotlin.jvm.internal.q.b(r9, r10)
            if (r9 == 0) goto L89
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            kotlin.jvm.internal.q.e(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L78
            r9 = 1
            goto L79
        L78:
            r9 = 0
        L79:
            if (r9 == 0) goto L89
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<i7.b> r10 = i7.b.class
            boolean r9 = kotlin.jvm.internal.q.b(r9, r10)
            if (r9 == 0) goto L89
            r9 = 1
            goto L8a
        L89:
            r9 = 0
        L8a:
            if (r9 == 0) goto L91
            if (r5 == 0) goto L8f
            goto L96
        L8f:
            r6 = r8
            r5 = 1
        L91:
            int r4 = r4 + 1
            goto L5a
        L94:
            if (r5 != 0) goto L97
        L96:
            r6 = r3
        L97:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L9c
            return r3
        L9c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof i7.b
            if (r0 == 0) goto La9
            r3 = r11
            i7.b r3 = (i7.b) r3
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.o1.f(java.lang.Class):i7.b");
    }

    private static final <T> i7.b<T> g(Class<T> cls) {
        i7.h hVar = (i7.h) cls.getAnnotation(i7.h.class);
        if (hVar == null || kotlin.jvm.internal.q.b(kotlin.jvm.internal.z.b(hVar.with()), kotlin.jvm.internal.z.b(i7.e.class))) {
            return new i7.e(o6.a.c(cls));
        }
        return null;
    }

    private static final <T> i7.b<T> h(Class<?> cls, i7.b<Object>... bVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Object objA = a(cls);
        if (objA == null) {
            return null;
        }
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i8 = 0; i8 < length; i8++) {
                    clsArr2[i8] = i7.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = objA.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(objA, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof i7.b) {
                return (i7.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                throw e8;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e8.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(Object obj, u6.c<?> kclass) {
        kotlin.jvm.internal.q.f(obj, "<this>");
        kotlin.jvm.internal.q.f(kclass, "kclass");
        return o6.a.b(kclass).isInstance(obj);
    }

    private static final <T> boolean j(Class<T> cls) {
        return cls.getAnnotation(i7.h.class) == null && cls.getAnnotation(i7.d.class) == null;
    }

    private static final <T> boolean k(Class<T> cls) {
        if (cls.getAnnotation(i7.d.class) != null) {
            return true;
        }
        i7.h hVar = (i7.h) cls.getAnnotation(i7.h.class);
        return hVar != null && kotlin.jvm.internal.q.b(kotlin.jvm.internal.z.b(hVar.with()), kotlin.jvm.internal.z.b(i7.e.class));
    }

    public static final boolean l(u6.c<Object> rootClass) {
        kotlin.jvm.internal.q.f(rootClass, "rootClass");
        return o6.a.a(rootClass).isArray();
    }

    public static final Void m(u6.c<?> cVar) {
        kotlin.jvm.internal.q.f(cVar, "<this>");
        p1.d(cVar);
        throw new e6.h();
    }

    public static final <T, E extends T> E[] n(ArrayList<E> arrayList, u6.c<T> eClass) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        kotlin.jvm.internal.q.f(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) o6.a.a(eClass), arrayList.size());
        kotlin.jvm.internal.q.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.q.e(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}
