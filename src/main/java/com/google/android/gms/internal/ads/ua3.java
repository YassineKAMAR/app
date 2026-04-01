package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class ua3 extends tc3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f15586a;

    ua3(Comparator comparator) {
        this.f15586a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.tc3, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15586a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ua3) {
            return this.f15586a.equals(((ua3) obj).f15586a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15586a.hashCode();
    }

    public final String toString() {
        return this.f15586a.toString();
    }
}
