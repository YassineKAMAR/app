package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class v34 {
    v34() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i8, int i9);

    abstract void i(Object obj, int i8, long j8);

    abstract void j(Object obj, int i8, Object obj2);

    abstract void k(Object obj, int i8, rz3 rz3Var);

    abstract void l(Object obj, int i8, long j8);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    final boolean p(Object obj, v24 v24Var) throws m14 {
        int iP = v24Var.p();
        int i8 = iP >>> 3;
        int i9 = iP & 7;
        if (i9 == 0) {
            l(obj, i8, v24Var.u());
            return true;
        }
        if (i9 == 1) {
            i(obj, i8, v24Var.s());
            return true;
        }
        if (i9 == 2) {
            k(obj, i8, v24Var.y());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw m14.a();
            }
            h(obj, i8, v24Var.n());
            return true;
        }
        Object objF = f();
        int i10 = i8 << 3;
        while (v24Var.l() != Integer.MAX_VALUE && p(objF, v24Var)) {
        }
        if ((4 | i10) != v24Var.p()) {
            throw m14.b();
        }
        g(objF);
        j(obj, i8, objF);
        return true;
    }

    abstract boolean q(v24 v24Var);

    abstract void r(Object obj, i04 i04Var);
}
