package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class bd3 extends tc3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bd3 f5758a = new bd3();

    private bd3() {
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final tc3 a() {
        return qc3.f13402a;
    }

    @Override // com.google.android.gms.internal.ads.tc3, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
