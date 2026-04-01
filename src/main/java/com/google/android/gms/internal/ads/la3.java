package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class la3 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ sa3 f10564a;

    la3(sa3 sa3Var) {
        this.f10564a = sa3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10564a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapK = this.f10564a.k();
        if (mapK != null) {
            return mapK.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iR = this.f10564a.r(entry.getKey());
            if (iR != -1) {
                Object[] objArr = this.f10564a.f14585d;
                objArr.getClass();
                if (g83.a(objArr[iR], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        sa3 sa3Var = this.f10564a;
        Map mapK = sa3Var.k();
        return mapK != null ? mapK.entrySet().iterator() : new ja3(sa3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.f10564a.k();
        if (mapK != null) {
            return mapK.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        sa3 sa3Var = this.f10564a;
        if (sa3Var.p()) {
            return false;
        }
        int iQ = sa3Var.q();
        Object key = entry.getKey();
        Object value = entry.getValue();
        sa3 sa3Var2 = this.f10564a;
        Object objI = sa3.i(sa3Var2);
        int[] iArr = sa3Var2.f14583b;
        iArr.getClass();
        sa3 sa3Var3 = this.f10564a;
        Object[] objArr = sa3Var3.f14584c;
        objArr.getClass();
        Object[] objArr2 = sa3Var3.f14585d;
        objArr2.getClass();
        int iB = ta3.b(key, value, iQ, objI, iArr, objArr, objArr2);
        if (iB == -1) {
            return false;
        }
        this.f10564a.o(iB, iQ);
        sa3 sa3Var4 = this.f10564a;
        sa3Var4.f14587f--;
        this.f10564a.m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10564a.size();
    }
}
