package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class g34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f8187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v34 f8188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v34 f8189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8190d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        v34 v34Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8187a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                v34Var = (v34) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f8188b = v34Var;
        f8189c = new x34();
    }

    public static void A(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.n(i8, list, z7);
    }

    public static void B(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.r(i8, list, z7);
    }

    public static void C(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.u(i8, list, z7);
    }

    public static void D(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.w(i8, list, z7);
    }

    public static void E(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.y(i8, list, z7);
    }

    public static void F(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.A(i8, list, z7);
    }

    public static void G(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.D(i8, list, z7);
    }

    public static void a(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.F(i8, list, z7);
    }

    public static void b(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.I(i8, list, z7);
    }

    public static void c(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.K(i8, list, z7);
    }

    public static void d(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.b(i8, list, z7);
    }

    public static void e(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.d(i8, list, z7);
    }

    public static void f(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.i(i8, list, z7);
    }

    public static void g(int i8, List list, i04 i04Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i04Var.k(i8, list, z7);
    }

    static int h(List list) {
        int iA;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b14) {
            b14 b14Var = (b14) list;
            iA = 0;
            while (i8 < size) {
                iA += h04.A(b14Var.e(i8));
                i8++;
            }
        } else {
            iA = 0;
            while (i8 < size) {
                iA += h04.A(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iA;
    }

    static int i(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (h04.b(i8 << 3) + 4);
    }

    static int j(List list) {
        return list.size() * 4;
    }

    static int k(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (h04.b(i8 << 3) + 8);
    }

    static int l(List list) {
        return list.size() * 8;
    }

    static int m(List list) {
        int iA;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b14) {
            b14 b14Var = (b14) list;
            iA = 0;
            while (i8 < size) {
                iA += h04.A(b14Var.e(i8));
                i8++;
            }
        } else {
            iA = 0;
            while (i8 < size) {
                iA += h04.A(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iA;
    }

    static int n(List list) {
        int iC;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y14) {
            y14 y14Var = (y14) list;
            iC = 0;
            while (i8 < size) {
                iC += h04.c(y14Var.e(i8));
                i8++;
            }
        } else {
            iC = 0;
            while (i8 < size) {
                iC += h04.c(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iC;
    }

    static int o(int i8, Object obj, e34 e34Var) {
        int i9 = i8 << 3;
        if (!(obj instanceof p14)) {
            return h04.b(i9) + h04.B((k24) obj, e34Var);
        }
        int i10 = h04.f8589d;
        int iA = ((p14) obj).a();
        return h04.b(i9) + h04.b(iA) + iA;
    }

    static int p(List list) {
        int iB;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b14) {
            b14 b14Var = (b14) list;
            iB = 0;
            while (i8 < size) {
                int iE = b14Var.e(i8);
                iB += h04.b((iE >> 31) ^ (iE + iE));
                i8++;
            }
        } else {
            iB = 0;
            while (i8 < size) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                iB += h04.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i8++;
            }
        }
        return iB;
    }

    static int q(List list) {
        int iC;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y14) {
            y14 y14Var = (y14) list;
            iC = 0;
            while (i8 < size) {
                long jE = y14Var.e(i8);
                iC += h04.c((jE >> 63) ^ (jE + jE));
                i8++;
            }
        } else {
            iC = 0;
            while (i8 < size) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                iC += h04.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i8++;
            }
        }
        return iC;
    }

    static int r(List list) {
        int iB;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b14) {
            b14 b14Var = (b14) list;
            iB = 0;
            while (i8 < size) {
                iB += h04.b(b14Var.e(i8));
                i8++;
            }
        } else {
            iB = 0;
            while (i8 < size) {
                iB += h04.b(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iB;
    }

    static int s(List list) {
        int iC;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y14) {
            y14 y14Var = (y14) list;
            iC = 0;
            while (i8 < size) {
                iC += h04.c(y14Var.e(i8));
                i8++;
            }
        } else {
            iC = 0;
            while (i8 < size) {
                iC += h04.c(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iC;
    }

    public static v34 t() {
        return f8188b;
    }

    public static v34 u() {
        return f8189c;
    }

    static Object v(Object obj, int i8, List list, e14 e14Var, Object obj2, v34 v34Var) {
        if (e14Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                if (e14Var.b(iIntValue)) {
                    if (i10 != i9) {
                        list.set(i9, Integer.valueOf(iIntValue));
                    }
                    i9++;
                } else {
                    obj2 = w(obj, i8, iIntValue, obj2, v34Var);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!e14Var.b(iIntValue2)) {
                    obj2 = w(obj, i8, iIntValue2, obj2, v34Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object w(Object obj, int i8, int i9, Object obj2, v34 v34Var) {
        if (obj2 == null) {
            obj2 = v34Var.c(obj);
        }
        v34Var.l(obj2, i8, i9);
        return obj2;
    }

    static void x(v34 v34Var, Object obj, Object obj2) {
        v34Var.o(obj, v34Var.e(v34Var.d(obj), v34Var.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!z04.class.isAssignableFrom(cls) && (cls2 = f8187a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
