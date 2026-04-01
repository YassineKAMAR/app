package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f19489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f19490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f19491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c4 f19492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f19493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f19494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f19495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f19496h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    static {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.d4.<clinit>():void");
    }

    private d4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i8 = z.f19745a;
        try {
            Class cls2 = f19490b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j8) {
        return f19492d.g(obj, j8);
    }

    static boolean C() {
        return f19494f;
    }

    static boolean D() {
        return f19493e;
    }

    private static int E(Class cls) {
        if (f19494f) {
            return f19492d.f19479a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f19494f) {
            return f19492d.f19479a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i8 = z.f19745a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j8, byte b8) {
        c4 c4Var = f19492d;
        long j9 = (-4) & j8;
        int i8 = c4Var.f19479a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        c4Var.f19479a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j8, byte b8) {
        c4 c4Var = f19492d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        c4Var.f19479a.putInt(obj, j9, ((255 & b8) << i8) | (c4Var.f19479a.getInt(obj, j9) & (~(255 << i8))));
    }

    static double f(Object obj, long j8) {
        return f19492d.a(obj, j8);
    }

    static float g(Object obj, long j8) {
        return f19492d.b(obj, j8);
    }

    static int h(Object obj, long j8) {
        return f19492d.f19479a.getInt(obj, j8);
    }

    static long i(Object obj, long j8) {
        return f19492d.f19479a.getLong(obj, j8);
    }

    static Object j(Class cls) {
        try {
            return f19489a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object k(Object obj, long j8) {
        return f19492d.f19479a.getObject(obj, j8);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new z3());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(d4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j8, boolean z7) {
        f19492d.c(obj, j8, z7);
    }

    static void s(byte[] bArr, long j8, byte b8) {
        f19492d.d(bArr, f19495g + j8, b8);
    }

    static void t(Object obj, long j8, double d8) {
        f19492d.e(obj, j8, d8);
    }

    static void u(Object obj, long j8, float f8) {
        f19492d.f(obj, j8, f8);
    }

    static void v(Object obj, long j8, int i8) {
        f19492d.f19479a.putInt(obj, j8, i8);
    }

    static void w(Object obj, long j8, long j9) {
        f19492d.f19479a.putLong(obj, j8, j9);
    }

    static void x(Object obj, long j8, Object obj2) {
        f19492d.f19479a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        return ((byte) ((f19492d.f19479a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        return ((byte) ((f19492d.f19479a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }
}
