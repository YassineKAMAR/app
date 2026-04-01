package kotlin.jvm.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f24326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u6.c[] f24327b;

    static {
        a0 a0Var = null;
        try {
            a0Var = (a0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a0Var == null) {
            a0Var = new a0();
        }
        f24326a = a0Var;
        f24327b = new u6.c[0];
    }

    public static u6.f a(n nVar) {
        return f24326a.a(nVar);
    }

    public static u6.c b(Class cls) {
        return f24326a.b(cls);
    }

    public static u6.e c(Class cls) {
        return f24326a.c(cls, "");
    }

    public static u6.g d(u uVar) {
        return f24326a.d(uVar);
    }

    public static String e(m mVar) {
        return f24326a.e(mVar);
    }

    public static String f(r rVar) {
        return f24326a.f(rVar);
    }

    public static u6.i g(Class cls) {
        return f24326a.g(b(cls), Collections.emptyList(), false);
    }
}
