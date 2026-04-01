package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class na3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11763c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ sa3 f11764d;

    /* synthetic */ na3(sa3 sa3Var, ma3 ma3Var) {
        this.f11764d = sa3Var;
        this.f11761a = sa3Var.f14586e;
        this.f11762b = sa3Var.f();
    }

    private final void b() {
        if (this.f11764d.f14586e != this.f11761a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i8);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11762b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f11762b;
        this.f11763c = i8;
        Object objA = a(i8);
        this.f11762b = this.f11764d.g(this.f11762b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        l83.j(this.f11763c >= 0, "no calls to next() since the last call to remove()");
        this.f11761a += 32;
        sa3 sa3Var = this.f11764d;
        int i8 = this.f11763c;
        Object[] objArr = sa3Var.f14584c;
        objArr.getClass();
        sa3Var.remove(objArr[i8]);
        this.f11762b--;
        this.f11763c = -1;
    }
}
