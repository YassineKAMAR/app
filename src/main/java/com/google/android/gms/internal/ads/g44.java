package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class g44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f8205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f8206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f8207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f44 f8208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f8209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f8210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f8211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f8212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f8213i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    static {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g44.<clinit>():void");
    }

    private g44() {
    }

    static void A(Object obj, long j8, float f8) {
        f8208d.h(obj, j8, f8);
    }

    static void B(Object obj, long j8, int i8) {
        f8208d.f7625a.putInt(obj, j8, i8);
    }

    static void C(Object obj, long j8, long j9) {
        f8208d.f7625a.putLong(obj, j8, j9);
    }

    static void D(Object obj, long j8, Object obj2) {
        f8208d.f7625a.putObject(obj, j8, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j8) {
        return ((byte) ((f8208d.f7625a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j8) {
        return ((byte) ((f8208d.f7625a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean G(Class cls) {
        int i8 = cz3.f6517a;
        try {
            Class cls2 = f8206b;
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

    static boolean H(Object obj, long j8) {
        return f8208d.i(obj, j8);
    }

    static boolean a() {
        return f8210f;
    }

    static boolean b() {
        return f8209e;
    }

    private static int c(Class cls) {
        if (f8210f) {
            return f8208d.f7625a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f8210f) {
            return f8208d.f7625a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i8 = cz3.f6517a;
        Field fieldF = f(Buffer.class, "effectiveDirectAddress");
        if (fieldF != null) {
            return fieldF;
        }
        Field fieldF2 = f(Buffer.class, "address");
        if (fieldF2 == null || fieldF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldF2;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j8, byte b8) {
        f44 f44Var = f8208d;
        long j9 = (-4) & j8;
        int i8 = f44Var.f7625a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        f44Var.f7625a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j8, byte b8) {
        f44 f44Var = f8208d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        f44Var.f7625a.putInt(obj, j9, ((255 & b8) << i8) | (f44Var.f7625a.getInt(obj, j9) & (~(255 << i8))));
    }

    static byte i(long j8) {
        return f8208d.a(j8);
    }

    static double j(Object obj, long j8) {
        return f8208d.b(obj, j8);
    }

    static float k(Object obj, long j8) {
        return f8208d.c(obj, j8);
    }

    static int l(Object obj, long j8) {
        return f8208d.f7625a.getInt(obj, j8);
    }

    static long m(ByteBuffer byteBuffer) {
        f44 f44Var = f8208d;
        return f44Var.f7625a.getLong(byteBuffer, f8212h);
    }

    static long n(Object obj, long j8) {
        return f8208d.f7625a.getLong(obj, j8);
    }

    static Object o(Class cls) {
        try {
            return f8205a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object p(Object obj, long j8) {
        return f8208d.f7625a.getObject(obj, j8);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new b44());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(g44.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j8, byte[] bArr, long j9, long j10) {
        f8208d.d(j8, bArr, j9, j10);
    }

    static void x(Object obj, long j8, boolean z7) {
        f8208d.e(obj, j8, z7);
    }

    static void y(byte[] bArr, long j8, byte b8) {
        f8208d.f(bArr, f8211g + j8, b8);
    }

    static void z(Object obj, long j8, double d8) {
        f8208d.g(obj, j8, d8);
    }
}
