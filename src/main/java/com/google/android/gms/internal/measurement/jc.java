package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f18835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f18836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f18837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f18838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f18839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f18840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f18841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f18842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f18843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f18844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f18845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f18846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f18847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f18848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f18849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f18850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f18851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f18852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f18853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f18854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f18855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f18856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f18857w;

    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final double a(Object obj, long j8) {
            return Double.longBitsToDouble(m(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void b(Object obj, long j8, byte b8) {
            if (jc.f18857w) {
                jc.u(obj, j8, b8);
            } else {
                jc.y(obj, j8, b8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void c(Object obj, long j8, double d8) {
            f(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void d(Object obj, long j8, float f8) {
            e(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void g(Object obj, long j8, boolean z7) {
            if (jc.f18857w) {
                jc.k(obj, j8, z7);
            } else {
                jc.r(obj, j8, z7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final float i(Object obj, long j8) {
            return Float.intBitsToFloat(l(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final boolean k(Object obj, long j8) {
            return jc.f18857w ? jc.D(obj, j8) : jc.E(obj, j8);
        }
    }

    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final double a(Object obj, long j8) {
            return Double.longBitsToDouble(m(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void b(Object obj, long j8, byte b8) {
            if (jc.f18857w) {
                jc.u(obj, j8, b8);
            } else {
                jc.y(obj, j8, b8);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void c(Object obj, long j8, double d8) {
            f(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void d(Object obj, long j8, float f8) {
            e(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final void g(Object obj, long j8, boolean z7) {
            if (jc.f18857w) {
                jc.k(obj, j8, z7);
            } else {
                jc.r(obj, j8, z7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final float i(Object obj, long j8) {
            return Float.intBitsToFloat(l(obj, j8));
        }

        @Override // com.google.android.gms.internal.measurement.jc.c
        public final boolean k(Object obj, long j8) {
            return jc.f18857w ? jc.D(obj, j8) : jc.E(obj, j8);
        }
    }

    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f18858a;

        c(Unsafe unsafe) {
            this.f18858a = unsafe;
        }

        public abstract double a(Object obj, long j8);

        public abstract void b(Object obj, long j8, byte b8);

        public abstract void c(Object obj, long j8, double d8);

        public abstract void d(Object obj, long j8, float f8);

        public final void e(Object obj, long j8, int i8) {
            this.f18858a.putInt(obj, j8, i8);
        }

        public final void f(Object obj, long j8, long j9) {
            this.f18858a.putLong(obj, j8, j9);
        }

        public abstract void g(Object obj, long j8, boolean z7);

        public final boolean h() {
            Unsafe unsafe = this.f18858a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                jc.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j8);

        public final boolean j() {
            Unsafe unsafe = this.f18858a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return jc.C() != null;
            } catch (Throwable th) {
                jc.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j8);

        public final int l(Object obj, long j8) {
            return this.f18858a.getInt(obj, j8);
        }

        public final long m(Object obj, long j8) {
            return this.f18858a.getLong(obj, j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    static {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jc.<clinit>():void");
    }

    private jc() {
    }

    private static boolean A(Class<?> cls) {
        try {
            Class<?> cls2 = f18836b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    static Object B(Object obj, long j8) {
        return f18839e.f18858a.getObject(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field C() {
        Field fieldD = d(Buffer.class, "effectiveDirectAddress");
        if (fieldD != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    static /* synthetic */ boolean D(Object obj, long j8) {
        return ((byte) (t(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j8) {
        return ((byte) (t(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j8) {
        return f18839e.k(obj, j8);
    }

    static double a(Object obj, long j8) {
        return f18839e.a(obj, j8);
    }

    static <T> T b(Class<T> cls) {
        try {
            return (T) f18835a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j8, double d8) {
        f18839e.c(obj, j8, d8);
    }

    static void g(Object obj, long j8, float f8) {
        f18839e.d(obj, j8, f8);
    }

    static void h(Object obj, long j8, int i8) {
        f18839e.e(obj, j8, i8);
    }

    static void i(Object obj, long j8, long j9) {
        f18839e.f(obj, j8, j9);
    }

    static void j(Object obj, long j8, Object obj2) {
        f18839e.f18858a.putObject(obj, j8, obj2);
    }

    static /* synthetic */ void k(Object obj, long j8, boolean z7) {
        u(obj, j8, z7 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(jc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static void m(byte[] bArr, long j8, byte b8) {
        f18839e.b(bArr, f18842h + j8, b8);
    }

    static float n(Object obj, long j8) {
        return f18839e.i(obj, j8);
    }

    private static int o(Class<?> cls) {
        if (f18841g) {
            return f18839e.f18858a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ic());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void r(Object obj, long j8, boolean z7) {
        y(obj, j8, z7 ? (byte) 1 : (byte) 0);
    }

    private static int s(Class<?> cls) {
        if (f18841g) {
            return f18839e.f18858a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j8) {
        return f18839e.l(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int iT = t(obj, j9);
        int i8 = ((~((int) j8)) & 3) << 3;
        h(obj, j9, ((255 & b8) << i8) | (iT & (~(255 << i8))));
    }

    static void v(Object obj, long j8, boolean z7) {
        f18839e.g(obj, j8, z7);
    }

    static boolean w() {
        return f18841g;
    }

    static long x(Object obj, long j8) {
        return f18839e.m(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j8, byte b8) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        h(obj, j9, ((255 & b8) << i8) | (t(obj, j9) & (~(255 << i8))));
    }

    static boolean z() {
        return f18840f;
    }
}
