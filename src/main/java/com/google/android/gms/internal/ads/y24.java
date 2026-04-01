package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class y24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f17569a = new ArrayDeque();

    /* synthetic */ y24(x24 x24Var) {
    }

    static /* bridge */ /* synthetic */ rz3 a(y24 y24Var, rz3 rz3Var, rz3 rz3Var2) {
        y24Var.b(rz3Var);
        y24Var.b(rz3Var2);
        rz3 d34Var = (rz3) y24Var.f17569a.pop();
        while (!y24Var.f17569a.isEmpty()) {
            d34Var = new d34((rz3) y24Var.f17569a.pop(), d34Var);
        }
        return d34Var;
    }

    private final void b(rz3 rz3Var) {
        c34 c34Var;
        if (!rz3Var.v()) {
            if (!(rz3Var instanceof d34)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(rz3Var.getClass())));
            }
            d34 d34Var = (d34) rz3Var;
            b(d34Var.f6560f);
            b(d34Var.f6561g);
            return;
        }
        int iC = c(rz3Var.n());
        ArrayDeque arrayDeque = this.f17569a;
        int iU = d34.U(iC + 1);
        if (arrayDeque.isEmpty() || ((rz3) this.f17569a.peek()).n() >= iU) {
            this.f17569a.push(rz3Var);
            return;
        }
        int iU2 = d34.U(iC);
        rz3 d34Var2 = (rz3) this.f17569a.pop();
        while (true) {
            c34Var = null;
            if (this.f17569a.isEmpty() || ((rz3) this.f17569a.peek()).n() >= iU2) {
                break;
            } else {
                d34Var2 = new d34((rz3) this.f17569a.pop(), d34Var2);
            }
        }
        d34 d34Var3 = new d34(d34Var2, rz3Var);
        while (!this.f17569a.isEmpty()) {
            int iC2 = c(d34Var3.n()) + 1;
            ArrayDeque arrayDeque2 = this.f17569a;
            if (((rz3) arrayDeque2.peek()).n() >= d34.U(iC2)) {
                break;
            } else {
                d34Var3 = new d34((rz3) this.f17569a.pop(), d34Var3);
            }
        }
        this.f17569a.push(d34Var3);
    }

    private static final int c(int i8) {
        int iBinarySearch = Arrays.binarySearch(d34.f6558j, i8);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
