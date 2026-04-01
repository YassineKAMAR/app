package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<r> f19245b;

    public u(String str, List<r> list) {
        this.f19244a = str;
        ArrayList<r> arrayList = new ArrayList<>();
        this.f19245b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f19244a;
    }

    public final ArrayList<r> b() {
        return this.f19245b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String str = this.f19244a;
        if (str == null ? uVar.f19244a != null : !str.equals(uVar.f19244a)) {
            return false;
        }
        ArrayList<r> arrayList = this.f19245b;
        ArrayList<r> arrayList2 = uVar.f19245b;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f19244a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<r> arrayList = this.f19245b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
