package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class aa3 extends y93 implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ba3 f5170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa3(ba3 ba3Var, Object obj, List list, y93 y93Var) {
        super(ba3Var, obj, list, y93Var);
        this.f5170f = ba3Var;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        k();
        boolean zIsEmpty = this.f17703b.isEmpty();
        ((List) this.f17703b).add(i8, obj);
        this.f5170f.f5680e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f17703b).addAll(i8, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f17703b.size();
        this.f5170f.f5680e += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        k();
        return ((List) this.f17703b).get(i8);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        k();
        return ((List) this.f17703b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        return ((List) this.f17703b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        k();
        return new z93(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        k();
        return new z93(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        k();
        Object objRemove = ((List) this.f17703b).remove(i8);
        ba3 ba3Var = this.f5170f;
        ba3Var.f5680e--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        k();
        return ((List) this.f17703b).set(i8, obj);
    }

    @Override // java.util.List
    public final List subList(int i8, int i9) {
        k();
        List listSubList = ((List) this.f17703b).subList(i8, i9);
        y93 y93Var = this.f17704c;
        if (y93Var == null) {
            y93Var = this;
        }
        return this.f5170f.k(this.f17702a, listSubList, y93Var);
    }
}
