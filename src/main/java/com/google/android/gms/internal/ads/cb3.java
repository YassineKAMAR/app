package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class cb3 extends db3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f6299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6300b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f6301c;

    cb3(int i8) {
        this.f6299a = new Object[i8];
    }

    private final void f(int i8) {
        Object[] objArr = this.f6299a;
        int length = objArr.length;
        if (length < i8) {
            this.f6299a = Arrays.copyOf(objArr, db3.b(length, i8));
        } else if (!this.f6301c) {
            return;
        } else {
            this.f6299a = (Object[]) objArr.clone();
        }
        this.f6301c = false;
    }

    public final cb3 c(Object obj) {
        obj.getClass();
        f(this.f6300b + 1);
        Object[] objArr = this.f6299a;
        int i8 = this.f6300b;
        this.f6300b = i8 + 1;
        objArr[i8] = obj;
        return this;
    }

    public final db3 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(this.f6300b + collection.size());
            if (collection instanceof eb3) {
                this.f6300b = ((eb3) collection).a(this.f6299a, this.f6300b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    final void e(Object[] objArr, int i8) {
        sc3.b(objArr, 2);
        f(this.f6300b + 2);
        System.arraycopy(objArr, 0, this.f6299a, this.f6300b, 2);
        this.f6300b += 2;
    }
}
