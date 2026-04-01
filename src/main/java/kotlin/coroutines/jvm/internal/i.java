package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f24287a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f24288b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f24289c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f24290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f24291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f24292c;

        public a(Method method, Method method2, Method method3) {
            this.f24290a = method;
            this.f24291b = method2;
            this.f24292c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f24289c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f24288b;
            f24289c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        q.f(continuation, "continuation");
        a aVarA = f24289c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f24288b) {
            return null;
        }
        Method method = aVarA.f24290a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f24291b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f24292c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
