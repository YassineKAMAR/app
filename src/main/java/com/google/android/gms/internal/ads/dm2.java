package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dm2 implements j84 {
    public static ri2 a(Context context, lf0 lf0Var, mf0 mf0Var, Object obj, qj2 qj2Var, il2 il2Var, c84 c84Var, c84 c84Var2, c84 c84Var3, c84 c84Var4, c84 c84Var5, c84 c84Var6, c84 c84Var7, c84 c84Var8, c84 c84Var9, Executor executor, qy2 qy2Var, eq1 eq1Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((bl2) obj);
        hashSet.add(qj2Var);
        hashSet.add(il2Var);
        if (((Boolean) h2.y.c().b(ns.G5)).booleanValue()) {
            hashSet.add((oi2) c84Var.k());
        }
        if (((Boolean) h2.y.c().b(ns.H5)).booleanValue()) {
            hashSet.add((oi2) c84Var2.k());
        }
        if (((Boolean) h2.y.c().b(ns.I5)).booleanValue()) {
            hashSet.add((oi2) c84Var3.k());
        }
        if (((Boolean) h2.y.c().b(ns.J5)).booleanValue()) {
            hashSet.add((oi2) c84Var4.k());
        }
        if (((Boolean) h2.y.c().b(ns.N5)).booleanValue()) {
            hashSet.add((oi2) c84Var6.k());
        }
        if (((Boolean) h2.y.c().b(ns.O5)).booleanValue()) {
            hashSet.add((oi2) c84Var7.k());
        }
        if (((Boolean) h2.y.c().b(ns.F2)).booleanValue()) {
            hashSet.add((oi2) c84Var9.k());
        }
        return new ri2(context, executor, hashSet, qy2Var, eq1Var);
    }
}
