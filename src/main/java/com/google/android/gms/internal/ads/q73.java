package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class q73 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13324b = 2;

    protected q73() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f13324b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l83.i(this.f13324b != 4);
        int i8 = this.f13324b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f13324b = 4;
            this.f13323a = a();
            if (this.f13324b != 3) {
                this.f13324b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13324b = 2;
        Object obj = this.f13323a;
        this.f13323a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
