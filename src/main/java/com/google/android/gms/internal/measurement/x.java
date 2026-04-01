package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z {
    public x() {
        this.f19420a.add(x0.BITWISE_AND);
        this.f19420a.add(x0.BITWISE_LEFT_SHIFT);
        this.f19420a.add(x0.BITWISE_NOT);
        this.f19420a.add(x0.BITWISE_OR);
        this.f19420a.add(x0.BITWISE_RIGHT_SHIFT);
        this.f19420a.add(x0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f19420a.add(x0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        switch (a0.f18537a[a6.c(str).ordinal()]) {
            case 1:
                a6.f(x0.BITWISE_AND, 2, list);
                return new j(Double.valueOf(a6.i(b7Var.b(list.get(0)).m().doubleValue()) & a6.i(b7Var.b(list.get(1)).m().doubleValue())));
            case 2:
                a6.f(x0.BITWISE_LEFT_SHIFT, 2, list);
                return new j(Double.valueOf(a6.i(b7Var.b(list.get(0)).m().doubleValue()) << ((int) (a6.m(b7Var.b(list.get(1)).m().doubleValue()) & 31))));
            case 3:
                a6.f(x0.BITWISE_NOT, 1, list);
                return new j(Double.valueOf(~a6.i(b7Var.b(list.get(0)).m().doubleValue())));
            case 4:
                a6.f(x0.BITWISE_OR, 2, list);
                return new j(Double.valueOf(a6.i(b7Var.b(list.get(0)).m().doubleValue()) | a6.i(b7Var.b(list.get(1)).m().doubleValue())));
            case 5:
                a6.f(x0.BITWISE_RIGHT_SHIFT, 2, list);
                return new j(Double.valueOf(a6.i(b7Var.b(list.get(0)).m().doubleValue()) >> ((int) (a6.m(b7Var.b(list.get(1)).m().doubleValue()) & 31))));
            case 6:
                a6.f(x0.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new j(Double.valueOf(a6.m(b7Var.b(list.get(0)).m().doubleValue()) >>> ((int) (a6.m(b7Var.b(list.get(1)).m().doubleValue()) & 31))));
            case 7:
                a6.f(x0.BITWISE_XOR, 2, list);
                return new j(Double.valueOf(a6.i(b7Var.b(list.get(0)).m().doubleValue()) ^ a6.i(b7Var.b(list.get(1)).m().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
