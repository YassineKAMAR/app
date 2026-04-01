package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class iz3 implements Comparator {
    iz3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        rz3 rz3Var = (rz3) obj;
        rz3 rz3Var2 = (rz3) obj2;
        lz3 it = rz3Var.iterator();
        lz3 it2 = rz3Var2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.j() & 255).compareTo(Integer.valueOf(it2.j() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(rz3Var.n()).compareTo(Integer.valueOf(rz3Var2.n()));
    }
}
