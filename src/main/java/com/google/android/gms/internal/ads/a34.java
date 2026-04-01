package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class a34 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f5011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mz3 f5012b;

    /* synthetic */ a34(rz3 rz3Var, z24 z24Var) {
        mz3 mz3VarB;
        if (rz3Var instanceof d34) {
            d34 d34Var = (d34) rz3Var;
            ArrayDeque arrayDeque = new ArrayDeque(d34Var.u());
            this.f5011a = arrayDeque;
            arrayDeque.push(d34Var);
            mz3VarB = b(d34Var.f6560f);
        } else {
            this.f5011a = null;
            mz3VarB = (mz3) rz3Var;
        }
        this.f5012b = mz3VarB;
    }

    private final mz3 b(rz3 rz3Var) {
        while (rz3Var instanceof d34) {
            d34 d34Var = (d34) rz3Var;
            this.f5011a.push(d34Var);
            rz3Var = d34Var.f6560f;
        }
        return (mz3) rz3Var;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mz3 next() {
        mz3 mz3VarB;
        mz3 mz3Var = this.f5012b;
        if (mz3Var == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f5011a;
            mz3VarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            mz3VarB = b(((d34) this.f5011a.pop()).f6561g);
        } while (mz3VarB.n() == 0);
        this.f5012b = mz3VarB;
        return mz3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5012b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
