package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f10574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    kb3 f10576c;

    public lb3() {
        this(4);
    }

    lb3(int i8) {
        this.f10574a = new Object[i8 + i8];
        this.f10575b = 0;
    }

    private final void d(int i8) {
        Object[] objArr = this.f10574a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f10574a = Arrays.copyOf(objArr, db3.b(length, i9));
        }
    }

    public final lb3 a(Object obj, Object obj2) {
        d(this.f10575b + 1);
        fa3.b(obj, obj2);
        Object[] objArr = this.f10574a;
        int i8 = this.f10575b;
        int i9 = i8 + i8;
        objArr[i9] = obj;
        objArr[i9 + 1] = obj2;
        this.f10575b = i8 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lb3 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f10575b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final mb3 c() {
        kb3 kb3Var = this.f10576c;
        if (kb3Var != null) {
            throw kb3Var.a();
        }
        zc3 zc3VarK = zc3.k(this.f10575b, this.f10574a, this);
        kb3 kb3Var2 = this.f10576c;
        if (kb3Var2 == null) {
            return zc3VarK;
        }
        throw kb3Var2.a();
    }
}
