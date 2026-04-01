package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t3 f19486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t3 f19487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19488d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        t3 t3Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f19485a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                t3Var = (t3) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f19486b = t3Var;
        f19487c = new v3();
    }

    public static void A(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.e(i8, list, z7);
    }

    public static void B(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.h(i8, list, z7);
    }

    public static void C(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.G(i8, list, z7);
    }

    public static void D(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.u(i8, list, z7);
    }

    public static void E(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.C(i8, list, z7);
    }

    public static void F(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.E(i8, list, z7);
    }

    public static void a(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.j(i8, list, z7);
    }

    public static void b(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.B(i8, list, z7);
    }

    public static void c(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.H(i8, list, z7);
    }

    public static void d(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.t(i8, list, z7);
    }

    public static void e(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.D(i8, list, z7);
    }

    static boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int g(List list) {
        int iV;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iV = 0;
            while (i8 < size) {
                iV += v0.v(o1Var.e(i8));
                i8++;
            }
        } else {
            iV = 0;
            while (i8 < size) {
                iV += v0.v(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iV;
    }

    static int h(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (v0.y(i8 << 3) + 4);
    }

    static int i(List list) {
        return list.size() * 4;
    }

    static int j(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (v0.y(i8 << 3) + 8);
    }

    static int k(List list) {
        return list.size() * 8;
    }

    static int l(List list) {
        int iV;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iV = 0;
            while (i8 < size) {
                iV += v0.v(o1Var.e(i8));
                i8++;
            }
        } else {
            iV = 0;
            while (i8 < size) {
                iV += v0.v(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iV;
    }

    static int m(List list) {
        int iZ;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f2) {
            f2 f2Var = (f2) list;
            iZ = 0;
            while (i8 < size) {
                iZ += v0.z(f2Var.e(i8));
                i8++;
            }
        } else {
            iZ = 0;
            while (i8 < size) {
                iZ += v0.z(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iZ;
    }

    static int n(int i8, Object obj, b3 b3Var) {
        int i9 = i8 << 3;
        if (!(obj instanceof w1)) {
            return v0.y(i9) + v0.w((r2) obj, b3Var);
        }
        int i10 = v0.f19701d;
        int iA = ((w1) obj).a();
        return v0.y(i9) + v0.y(iA) + iA;
    }

    static int o(List list) {
        int iY;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iY = 0;
            while (i8 < size) {
                int iE = o1Var.e(i8);
                iY += v0.y((iE >> 31) ^ (iE + iE));
                i8++;
            }
        } else {
            iY = 0;
            while (i8 < size) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                iY += v0.y((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
        }
        return iY;
    }

    static int p(List list) {
        int iZ;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f2) {
            f2 f2Var = (f2) list;
            iZ = 0;
            while (i8 < size) {
                long jE = f2Var.e(i8);
                iZ += v0.z((jE >> 63) ^ (jE + jE));
                i8++;
            }
        } else {
            iZ = 0;
            while (i8 < size) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                iZ += v0.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i8++;
            }
        }
        return iZ;
    }

    static int q(List list) {
        int iY;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iY = 0;
            while (i8 < size) {
                iY += v0.y(o1Var.e(i8));
                i8++;
            }
        } else {
            iY = 0;
            while (i8 < size) {
                iY += v0.y(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iY;
    }

    static int r(List list) {
        int iZ;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f2) {
            f2 f2Var = (f2) list;
            iZ = 0;
            while (i8 < size) {
                iZ += v0.z(f2Var.e(i8));
                i8++;
            }
        } else {
            iZ = 0;
            while (i8 < size) {
                iZ += v0.z(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iZ;
    }

    public static t3 s() {
        return f19486b;
    }

    public static t3 t() {
        return f19487c;
    }

    static Object u(Object obj, int i8, int i9, Object obj2, t3 t3Var) {
        if (obj2 == null) {
            obj2 = t3Var.c(obj);
        }
        t3Var.f(obj2, i8, i9);
        return obj2;
    }

    static void v(t3 t3Var, Object obj, Object obj2) {
        t3Var.h(obj, t3Var.e(t3Var.d(obj), t3Var.d(obj2)));
    }

    public static void w(Class cls) {
        Class cls2;
        if (!n1.class.isAssignableFrom(cls) && (cls2 = f19485a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void x(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.a(i8, list, z7);
    }

    public static void y(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.i(i8, list, z7);
    }

    public static void z(int i8, List list, l4 l4Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l4Var.g(i8, list, z7);
    }
}
