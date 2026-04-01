package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class z93 extends x93 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ aa3 f18123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z93(aa3 aa3Var) {
        super(aa3Var);
        this.f18123d = aa3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z93(aa3 aa3Var, int i8) {
        super(aa3Var, ((List) aa3Var.f17703b).listIterator(i8));
        this.f18123d = aa3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f18123d.isEmpty();
        a();
        ((ListIterator) this.f17140a).add(obj);
        this.f18123d.f5170f.f5680e++;
        if (zIsEmpty) {
            this.f18123d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f17140a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f17140a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f17140a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f17140a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f17140a).set(obj);
    }
}
