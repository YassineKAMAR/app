package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases_flutter.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends z {
    protected q0() {
        this.f19420a.add(x0.ADD);
        this.f19420a.add(x0.DIVIDE);
        this.f19420a.add(x0.MODULUS);
        this.f19420a.add(x0.MULTIPLY);
        this.f19420a.add(x0.NEGATE);
        this.f19420a.add(x0.POST_DECREMENT);
        this.f19420a.add(x0.POST_INCREMENT);
        this.f19420a.add(x0.PRE_DECREMENT);
        this.f19420a.add(x0.PRE_INCREMENT);
        this.f19420a.add(x0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        switch (t0.f19218a[a6.c(str).ordinal()]) {
            case 1:
                a6.f(x0.ADD, 2, list);
                r rVarB = b7Var.b(list.get(0));
                r rVarB2 = b7Var.b(list.get(1));
                if (!(rVarB instanceof l) && !(rVarB instanceof t) && !(rVarB2 instanceof l) && !(rVarB2 instanceof t)) {
                    return new j(Double.valueOf(rVarB.m().doubleValue() + rVarB2.m().doubleValue()));
                }
                return new t(rVarB.n() + rVarB2.n());
            case 2:
                a6.f(x0.DIVIDE, 2, list);
                return new j(Double.valueOf(b7Var.b(list.get(0)).m().doubleValue() / b7Var.b(list.get(1)).m().doubleValue()));
            case 3:
                a6.f(x0.MODULUS, 2, list);
                return new j(Double.valueOf(b7Var.b(list.get(0)).m().doubleValue() % b7Var.b(list.get(1)).m().doubleValue()));
            case 4:
                a6.f(x0.MULTIPLY, 2, list);
                return new j(Double.valueOf(b7Var.b(list.get(0)).m().doubleValue() * b7Var.b(list.get(1)).m().doubleValue()));
            case 5:
                a6.f(x0.NEGATE, 1, list);
                return new j(Double.valueOf(b7Var.b(list.get(0)).m().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                a6.g(str, 2, list);
                r rVarB3 = b7Var.b(list.get(0));
                b7Var.b(list.get(1));
                return rVarB3;
            case 8:
            case 9:
                a6.g(str, 1, list);
                return b7Var.b(list.get(0));
            case R.styleable.GradientColor_android_endX /* 10 */:
                a6.f(x0.SUBTRACT, 2, list);
                return new j(Double.valueOf(b7Var.b(list.get(0)).m().doubleValue() + new j(Double.valueOf(b7Var.b(list.get(1)).m().doubleValue() * (-1.0d))).m().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
