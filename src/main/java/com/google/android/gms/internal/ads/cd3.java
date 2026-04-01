package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class cd3 extends tc3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final tc3 f6320a;

    cd3(tc3 tc3Var) {
        this.f6320a = tc3Var;
    }

    @Override // com.google.android.gms.internal.ads.tc3
    public final tc3 a() {
        return this.f6320a;
    }

    @Override // com.google.android.gms.internal.ads.tc3, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f6320a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cd3) {
            return this.f6320a.equals(((cd3) obj).f6320a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f6320a.hashCode();
    }

    public final String toString() {
        return this.f6320a.toString().concat(".reverse()");
    }
}
