package com.amazon.a.b;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.amazon.a.a.n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f4013a = new com.amazon.a.a.o.c("DRMSuccessTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4014b = "com.amazon.drm.AmazonLicenseVerificationCallback";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4015c = "onDRMSuccess";

    private static Method a(Class<?> cls, String str) {
        com.amazon.a.a.o.a.a.a((Object) cls, "Class<?> target");
        com.amazon.a.a.o.a.a.a((Object) str, "String methodName");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f4013a.a("No exception thrown, but method '" + str + "' was not found, this should not happen. ");
                }
                return null;
            }
            declaredMethod.setAccessible(true);
            if (!com.amazon.a.a.o.d.c(declaredMethod)) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f4013a.a("Callback " + str + " isn't static, ignoring...");
                }
                return null;
            }
            if (!com.amazon.a.a.o.d.b(declaredMethod)) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f4013a.a("Callback " + str + " returns a value, ignoring...");
                }
                return null;
            }
            if (!com.amazon.a.a.o.d.a(declaredMethod)) {
                return declaredMethod;
            }
            if (com.amazon.a.a.o.c.f3947a) {
                f4013a.a("Callback " + str + " takes parameters, ignoring...");
            }
            return null;
        } catch (NoSuchMethodException unused) {
            if (com.amazon.a.a.o.c.f3947a) {
                f4013a.a("Did not find method " + str);
            }
            return null;
        }
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        Method methodA;
        Class<?> clsA = com.amazon.a.a.o.d.a(f4014b);
        if (clsA == null || (methodA = a(clsA, f4015c)) == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f4013a.a("Invoking callback: " + methodA.getName());
        }
        try {
            methodA.invoke(null, new Object[0]);
            if (com.amazon.a.a.o.c.f3947a) {
                f4013a.a("Callback invoked.");
            }
        } catch (Exception unused) {
        }
    }
}
