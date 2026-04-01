package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f18699a = E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dc<?, ?> f18700b = A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dc<?, ?> f18701c = new fc();

    private static dc<?, ?> A() {
        try {
            Class<?> clsI = I();
            if (clsI == null) {
                return null;
            }
            return (dc) clsI.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.a(i8, list, z7);
    }

    static int C(int i8, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * h8.T(i8, 0L);
    }

    static int D(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.C(i8, list, z7);
    }

    static int G(int i8, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * h8.w0(i8));
    }

    static int H(List<Integer> list) {
        int iK0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c9) {
            c9 c9Var = (c9) list;
            iK0 = 0;
            while (i8 < size) {
                iK0 += h8.k0(c9Var.e(i8));
                i8++;
            }
        } else {
            iK0 = 0;
            while (i8 < size) {
                iK0 += h8.k0(list.get(i8).intValue());
                i8++;
            }
        }
        return iK0;
    }

    private static Class<?> I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i8, List<Long> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.y(i8, list, z7);
    }

    static int K(int i8, List<Long> list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * h8.w0(i8));
    }

    static int L(List<Long> list) {
        int iE0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aa) {
            aa aaVar = (aa) list;
            iE0 = 0;
            while (i8 < size) {
                iE0 += h8.e0(aaVar.d(i8));
                i8++;
            }
        } else {
            iE0 = 0;
            while (i8 < size) {
                iE0 += h8.e0(list.get(i8).longValue());
                i8++;
            }
        }
        return iE0;
    }

    public static void M(int i8, List<Float> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.K(i8, list, z7);
    }

    static int N(int i8, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * h8.w0(i8));
    }

    static int O(List<Integer> list) {
        int iS0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c9) {
            c9 c9Var = (c9) list;
            iS0 = 0;
            while (i8 < size) {
                iS0 += h8.s0(c9Var.e(i8));
                i8++;
            }
        } else {
            iS0 = 0;
            while (i8 < size) {
                iS0 += h8.s0(list.get(i8).intValue());
                i8++;
            }
        }
        return iS0;
    }

    public static void P(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.i(i8, list, z7);
    }

    static int Q(int i8, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * h8.w0(i8));
    }

    static int R(List<Long> list) {
        int iN0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aa) {
            aa aaVar = (aa) list;
            iN0 = 0;
            while (i8 < size) {
                iN0 += h8.n0(aaVar.d(i8));
                i8++;
            }
        } else {
            iN0 = 0;
            while (i8 < size) {
                iN0 += h8.n0(list.get(i8).longValue());
                i8++;
            }
        }
        return iN0;
    }

    public static void S(int i8, List<Long> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.p(i8, list, z7);
    }

    static int T(int i8, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * h8.w0(i8));
    }

    static int U(List<Integer> list) {
        int iZ0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c9) {
            c9 c9Var = (c9) list;
            iZ0 = 0;
            while (i8 < size) {
                iZ0 += h8.z0(c9Var.e(i8));
                i8++;
            }
        } else {
            iZ0 = 0;
            while (i8 < size) {
                iZ0 += h8.z0(list.get(i8).intValue());
                i8++;
            }
        }
        return iZ0;
    }

    public static void V(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.l(i8, list, z7);
    }

    static int W(int i8, List<Long> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * h8.w0(i8));
    }

    static int X(List<Long> list) {
        int iR0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aa) {
            aa aaVar = (aa) list;
            iR0 = 0;
            while (i8 < size) {
                iR0 += h8.r0(aaVar.d(i8));
                i8++;
            }
        } else {
            iR0 = 0;
            while (i8 < size) {
                iR0 += h8.r0(list.get(i8).longValue());
                i8++;
            }
        }
        return iR0;
    }

    public static void Y(int i8, List<Long> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.g(i8, list, z7);
    }

    public static void Z(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.u(i8, list, z7);
    }

    static int a(int i8, Object obj, eb ebVar) {
        return obj instanceof p9 ? h8.z(i8, (p9) obj) : h8.V(i8, (ma) obj, ebVar);
    }

    public static void a0(int i8, List<Long> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.e(i8, list, z7);
    }

    static int b(int i8, List<o7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = size * h8.w0(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            iW0 += h8.E(list.get(i9));
        }
        return iW0;
    }

    public static void b0(int i8, List<Integer> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.E(i8, list, z7);
    }

    static int c(int i8, List<ma> list, eb ebVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iB += h8.B(i8, list.get(i9), ebVar);
        }
        return iB;
    }

    public static void c0(int i8, List<Long> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.h(i8, list, z7);
    }

    static int d(int i8, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * h8.D(i8, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static dc<?, ?> f() {
        return f18700b;
    }

    static <UT, UB> UB g(Object obj, int i8, int i9, UB ub, dc<UT, UB> dcVar) {
        if (ub == null) {
            ub = dcVar.i(obj);
        }
        dcVar.f(ub, i8, i9);
        return ub;
    }

    static <UT, UB> UB h(Object obj, int i8, List<Integer> list, g9 g9Var, UB ub, dc<UT, UB> dcVar) {
        if (g9Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                int iIntValue = list.get(i10).intValue();
                if (g9Var.b(iIntValue)) {
                    if (i10 != i9) {
                        list.set(i9, Integer.valueOf(iIntValue));
                    }
                    i9++;
                } else {
                    ub = (UB) g(obj, i8, iIntValue, ub, dcVar);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!g9Var.b(iIntValue2)) {
                    ub = (UB) g(obj, i8, iIntValue2, ub, dcVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void i(int i8, List<o7> list, zc zcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.N(i8, list);
    }

    public static void j(int i8, List<?> list, zc zcVar, eb ebVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.O(i8, list, ebVar);
    }

    public static void k(int i8, List<Boolean> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.o(i8, list, z7);
    }

    static <T, FT extends t8<FT>> void l(n8<FT> n8Var, T t7, T t8) {
        r8<T> r8VarB = n8Var.b(t8);
        if (r8VarB.f19135a.isEmpty()) {
            return;
        }
        n8Var.f(t7).h(r8VarB);
    }

    static <T> void m(ja jaVar, T t7, T t8, long j8) {
        jc.j(t7, j8, jaVar.g(jc.B(t7, j8), jc.B(t8, j8)));
    }

    static <T, UT, UB> void n(dc<UT, UB> dcVar, T t7, T t8) {
        dcVar.j(t7, dcVar.b(dcVar.k(t7), dcVar.k(t8)));
    }

    public static void o(Class<?> cls) {
        Class<?> cls2;
        if (!y8.class.isAssignableFrom(cls) && (cls2 = f18699a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i8, List<?> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int iW0 = h8.w0(i8) * size;
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            while (i9 < size) {
                Object objD = r9Var.d(i9);
                iW0 += objD instanceof o7 ? h8.E((o7) objD) : h8.G((String) objD);
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                iW0 += obj instanceof o7 ? h8.E((o7) obj) : h8.G((String) obj);
                i9++;
            }
        }
        return iW0;
    }

    static int r(int i8, List<?> list, eb ebVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = h8.w0(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            iW0 += obj instanceof p9 ? h8.h((p9) obj) : h8.i((ma) obj, ebVar);
        }
        return iW0;
    }

    static int s(int i8, List<Integer> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * h8.w0(i8));
    }

    static int t(List<Integer> list) {
        int iB0;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c9) {
            c9 c9Var = (c9) list;
            iB0 = 0;
            while (i8 < size) {
                iB0 += h8.b0(c9Var.e(i8));
                i8++;
            }
        } else {
            iB0 = 0;
            while (i8 < size) {
                iB0 += h8.b0(list.get(i8).intValue());
                i8++;
            }
        }
        return iB0;
    }

    public static dc<?, ?> u() {
        return f18701c;
    }

    public static void v(int i8, List<String> list, zc zcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.F(i8, list);
    }

    public static void w(int i8, List<?> list, zc zcVar, eb ebVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.H(i8, list, ebVar);
    }

    public static void x(int i8, List<Double> list, zc zcVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zcVar.t(i8, list, z7);
    }

    static int y(int i8, List<?> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * h8.l0(i8, 0);
    }

    static int z(List<?> list) {
        return list.size() << 2;
    }
}
