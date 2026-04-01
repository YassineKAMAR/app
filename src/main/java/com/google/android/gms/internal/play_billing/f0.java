package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements Comparator {
    f0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        e0 e0Var = new e0(n0Var);
        e0 e0Var2 = new e0(n0Var2);
        while (e0Var.hasNext() && e0Var2.hasNext()) {
            int iCompareTo = Integer.valueOf(e0Var.j() & 255).compareTo(Integer.valueOf(e0Var2.j() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(n0Var.g()).compareTo(Integer.valueOf(n0Var2.g()));
    }
}
