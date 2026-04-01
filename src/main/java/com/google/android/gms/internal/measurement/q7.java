package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class q7 implements Comparator<o7> {
    q7() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(o7 o7Var, o7 o7Var2) {
        o7 o7Var3 = o7Var;
        o7 o7Var4 = o7Var2;
        u7 u7Var = (u7) o7Var3.iterator();
        u7 u7Var2 = (u7) o7Var4.iterator();
        while (u7Var.hasNext() && u7Var2.hasNext()) {
            int iCompareTo = Integer.valueOf(o7.g(u7Var.j())).compareTo(Integer.valueOf(o7.g(u7Var2.j())));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(o7Var3.y()).compareTo(Integer.valueOf(o7Var4.y()));
    }
}
