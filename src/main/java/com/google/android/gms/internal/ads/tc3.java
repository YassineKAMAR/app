package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc3 implements Comparator {
    protected tc3() {
    }

    public static tc3 b(Comparator comparator) {
        return comparator instanceof tc3 ? (tc3) comparator : new ua3(comparator);
    }

    public static tc3 c() {
        return qc3.f13402a;
    }

    public tc3 a() {
        return new cd3(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
