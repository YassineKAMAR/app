package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class py2 {
    public static void a(x3.d dVar, qy2 qy2Var, ey2 ey2Var) {
        g(dVar, qy2Var, ey2Var, false);
    }

    public static void b(x3.d dVar, qy2 qy2Var, ey2 ey2Var) {
        g(dVar, qy2Var, ey2Var, true);
    }

    public static void c(x3.d dVar, qy2 qy2Var, ey2 ey2Var) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            zf3.r(qf3.C(dVar), new oy2(qy2Var, ey2Var), eh0.f7327f);
        }
    }

    public static void d(x3.d dVar, ey2 ey2Var) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            zf3.r(qf3.C(dVar), new my2(ey2Var), eh0.f7327f);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) h2.y.c().b(ns.z8), str);
    }

    public static int f(ts2 ts2Var) {
        int iE = p2.y.e(ts2Var) - 1;
        return (iE == 0 || iE == 1) ? 7 : 23;
    }

    private static void g(x3.d dVar, qy2 qy2Var, ey2 ey2Var, boolean z7) {
        if (((Boolean) bu.f6041c.e()).booleanValue()) {
            zf3.r(qf3.C(dVar), new ny2(qy2Var, ey2Var, z7), eh0.f7327f);
        }
    }
}
