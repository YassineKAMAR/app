package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends cb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object[] f11810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11811e;

    nb3(int i8) {
        super(i8);
        this.f11810d = new Object[ob3.v(i8)];
    }

    @Override // com.google.android.gms.internal.ads.db3
    public final /* bridge */ /* synthetic */ db3 a(Object obj) {
        g(obj);
        return this;
    }

    public final nb3 g(Object obj) {
        obj.getClass();
        if (this.f11810d != null) {
            int iV = ob3.v(this.f6300b);
            int length = this.f11810d.length;
            if (iV <= length) {
                int iHashCode = obj.hashCode();
                int iA = bb3.a(iHashCode);
                while (true) {
                    Object[] objArr = this.f11810d;
                    int i8 = iA & (length - 1);
                    Object obj2 = objArr[i8];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iA = i8 + 1;
                    } else {
                        objArr[i8] = obj;
                        this.f11811e += iHashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f11810d = null;
        super.c(obj);
        return this;
    }

    public final nb3 h(Iterable iterable) {
        iterable.getClass();
        if (this.f11810d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final ob3 i() {
        ob3 ob3VarI;
        int i8 = this.f6300b;
        if (i8 == 0) {
            return ad3.f5217i;
        }
        if (i8 == 1) {
            Object obj = this.f6299a[0];
            obj.getClass();
            return new hd3(obj);
        }
        if (this.f11810d == null || ob3.v(i8) != this.f11810d.length) {
            ob3VarI = ob3.I(this.f6300b, this.f6299a);
            this.f6300b = ob3VarI.size();
        } else {
            int i9 = this.f6300b;
            Object[] objArrCopyOf = this.f6299a;
            if (ob3.J(i9, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i9);
            }
            ob3VarI = new ad3(objArrCopyOf, this.f11811e, this.f11810d, r6.length - 1, this.f6300b);
        }
        this.f6301c = true;
        this.f11810d = null;
        return ob3VarI;
    }
}
