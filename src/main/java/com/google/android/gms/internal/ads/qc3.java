package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class qc3 extends tc3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final qc3 f13402a = new qc3();

    private qc3() {
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final tc3 a() {
        return bd3.f5758a;
    }

    @Override // com.google.android.gms.internal.ads.tc3, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
