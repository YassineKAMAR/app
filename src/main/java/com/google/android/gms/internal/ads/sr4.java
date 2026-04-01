package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class sr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Constructor f14806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f14807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f14808c;

    public static f3 a(float f8) {
        try {
            if (f14806a == null || f14807b == null || f14808c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f14806a = cls.getConstructor(new Class[0]);
                f14807b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f14808c = cls.getMethod("build", new Class[0]);
            }
            Object objNewInstance = f14806a.newInstance(new Object[0]);
            f14807b.invoke(objNewInstance, Float.valueOf(f8));
            Object objInvoke = f14808c.invoke(objNewInstance, new Object[0]);
            objInvoke.getClass();
            return (f3) objInvoke;
        } catch (Exception e8) {
            throw new IllegalStateException(e8);
        }
    }
}
