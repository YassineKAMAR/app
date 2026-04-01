package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z {
    protected i0() {
        this.f19420a.add(x0.AND);
        this.f19420a.add(x0.NOT);
        this.f19420a.add(x0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        int i8 = l0.f18909a[a6.c(str).ordinal()];
        if (i8 == 1) {
            a6.f(x0.AND, 2, list);
            r rVarB = b7Var.b(list.get(0));
            if (!rVarB.p().booleanValue()) {
                return rVarB;
            }
        } else {
            if (i8 == 2) {
                a6.f(x0.NOT, 1, list);
                return new h(Boolean.valueOf(!b7Var.b(list.get(0)).p().booleanValue()));
            }
            if (i8 != 3) {
                return super.a(str);
            }
            a6.f(x0.OR, 2, list);
            r rVarB2 = b7Var.b(list.get(0));
            if (rVarB2.p().booleanValue()) {
                return rVarB2;
            }
        }
        return b7Var.b(list.get(1));
    }
}
