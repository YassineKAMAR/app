package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a6 {
    public static double a(double d8) {
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (Double.isInfinite(d8) || d8 == 0.0d || d8 == -0.0d) {
            return d8;
        }
        return ((double) (d8 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d8));
    }

    public static int b(b7 b7Var) {
        int i8 = i(b7Var.c("runtime.counter").m().doubleValue() + 1.0d);
        if (i8 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        b7Var.h("runtime.counter", new j(Double.valueOf(i8)));
        return i8;
    }

    public static x0 c(String str) {
        x0 x0VarA = (str == null || str.isEmpty()) ? null : x0.a(Integer.parseInt(str));
        if (x0VarA != null) {
            return x0VarA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(r rVar) {
        if (r.M.equals(rVar)) {
            return null;
        }
        if (r.L.equals(rVar)) {
            return "";
        }
        if (rVar instanceof q) {
            return e((q) rVar);
        }
        if (!(rVar instanceof g)) {
            return !rVar.m().isNaN() ? rVar.m() : rVar.n();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = ((g) rVar).iterator();
        while (it.hasNext()) {
            Object objD = d(it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> e(q qVar) {
        HashMap map = new HashMap();
        for (String str : qVar.b()) {
            Object objD = d(qVar.a(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void f(x0 x0Var, int i8, List<r> list) {
        g(x0Var.name(), i8, list);
    }

    public static void g(String str, int i8, List<r> list) {
        if (list.size() != i8) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof y) || (rVar instanceof p)) {
            return true;
        }
        if (!(rVar instanceof j)) {
            return rVar instanceof t ? rVar.n().equals(rVar2.n()) : rVar instanceof h ? rVar.p().equals(rVar2.p()) : rVar == rVar2;
        }
        if (Double.isNaN(rVar.m().doubleValue()) || Double.isNaN(rVar2.m().doubleValue())) {
            return false;
        }
        return rVar.m().equals(rVar2.m());
    }

    public static int i(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8) || d8 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d8 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d8))) % 4.294967296E9d);
    }

    public static void j(x0 x0Var, int i8, List<r> list) {
        k(x0Var.name(), i8, list);
    }

    public static void k(String str, int i8, List<r> list) {
        if (list.size() < i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double dM = rVar.m();
        return !dM.isNaN() && dM.doubleValue() >= 0.0d && dM.equals(Double.valueOf(Math.floor(dM.doubleValue())));
    }

    public static long m(double d8) {
        return ((long) i(d8)) & 4294967295L;
    }

    public static void n(String str, int i8, List<r> list) {
        if (list.size() > i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i8), Integer.valueOf(list.size())));
        }
    }
}
