package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i93 extends kd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f9109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9110b = 2;

    protected i93() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.f9110b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l83.i(this.f9110b != 4);
        int i8 = this.f9110b;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        if (i9 == 0) {
            return true;
        }
        if (i9 != 2) {
            this.f9110b = 4;
            this.f9109a = a();
            if (this.f9110b != 3) {
                this.f9110b = 1;
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
        this.f9110b = 2;
        Object obj = this.f9109a;
        this.f9109a = null;
        return obj;
    }
}
