package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z {
    protected v0() {
        this.f19420a.add(x0.ASSIGN);
        this.f19420a.add(x0.CONST);
        this.f19420a.add(x0.CREATE_ARRAY);
        this.f19420a.add(x0.CREATE_OBJECT);
        this.f19420a.add(x0.EXPRESSION_LIST);
        this.f19420a.add(x0.GET);
        this.f19420a.add(x0.GET_INDEX);
        this.f19420a.add(x0.GET_PROPERTY);
        this.f19420a.add(x0.NULL);
        this.f19420a.add(x0.SET_PROPERTY);
        this.f19420a.add(x0.TYPEOF);
        this.f19420a.add(x0.UNDEFINED);
        this.f19420a.add(x0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        String str2;
        int i8 = 0;
        switch (u0.f19246a[a6.c(str).ordinal()]) {
            case 1:
                a6.f(x0.ASSIGN, 2, list);
                r rVarB = b7Var.b(list.get(0));
                if (!(rVarB instanceof t)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", rVarB.getClass().getCanonicalName()));
                }
                if (!b7Var.g(rVarB.n())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", rVarB.n()));
                }
                r rVarB2 = b7Var.b(list.get(1));
                b7Var.h(rVarB.n(), rVarB2);
                return rVarB2;
            case 2:
                a6.j(x0.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                for (int i9 = 0; i9 < list.size() - 1; i9 += 2) {
                    r rVarB3 = b7Var.b(list.get(i9));
                    if (!(rVarB3 instanceof t)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", rVarB3.getClass().getCanonicalName()));
                    }
                    b7Var.f(rVarB3.n(), b7Var.b(list.get(i9 + 1)));
                }
                return r.L;
            case 3:
                if (list.isEmpty()) {
                    return new g();
                }
                g gVar = new g();
                Iterator<r> it = list.iterator();
                while (it.hasNext()) {
                    r rVarB4 = b7Var.b(it.next());
                    if (rVarB4 instanceof k) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    gVar.B(i8, rVarB4);
                    i8++;
                }
                return gVar;
            case 4:
                if (list.isEmpty()) {
                    return new q();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                q qVar = new q();
                while (i8 < list.size() - 1) {
                    r rVarB5 = b7Var.b(list.get(i8));
                    r rVarB6 = b7Var.b(list.get(i8 + 1));
                    if ((rVarB5 instanceof k) || (rVarB6 instanceof k)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    qVar.i(rVarB5.n(), rVarB6);
                    i8 += 2;
                }
                return qVar;
            case 5:
                a6.j(x0.EXPRESSION_LIST, 1, list);
                r rVarB7 = r.L;
                while (i8 < list.size()) {
                    rVarB7 = b7Var.b(list.get(i8));
                    if (rVarB7 instanceof k) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i8++;
                }
                return rVarB7;
            case 6:
                a6.f(x0.GET, 1, list);
                r rVarB8 = b7Var.b(list.get(0));
                if (rVarB8 instanceof t) {
                    return b7Var.c(rVarB8.n());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", rVarB8.getClass().getCanonicalName()));
            case 7:
            case 8:
                a6.f(x0.GET_PROPERTY, 2, list);
                r rVarB9 = b7Var.b(list.get(0));
                r rVarB10 = b7Var.b(list.get(1));
                if ((rVarB9 instanceof g) && a6.l(rVarB10)) {
                    return ((g) rVarB9).v(rVarB10.m().intValue());
                }
                if (rVarB9 instanceof l) {
                    return ((l) rVarB9).a(rVarB10.n());
                }
                if (rVarB9 instanceof t) {
                    if ("length".equals(rVarB10.n())) {
                        return new j(Double.valueOf(rVarB9.n().length()));
                    }
                    if (a6.l(rVarB10) && rVarB10.m().doubleValue() < rVarB9.n().length()) {
                        return new t(String.valueOf(rVarB9.n().charAt(rVarB10.m().intValue())));
                    }
                }
                return r.L;
            case 9:
                a6.f(x0.NULL, 0, list);
                return r.M;
            case R.styleable.GradientColor_android_endX /* 10 */:
                a6.f(x0.SET_PROPERTY, 3, list);
                r rVarB11 = b7Var.b(list.get(0));
                r rVarB12 = b7Var.b(list.get(1));
                r rVarB13 = b7Var.b(list.get(2));
                if (rVarB11 == r.L || rVarB11 == r.M) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", rVarB12.n(), rVarB11.n()));
                }
                if ((rVarB11 instanceof g) && (rVarB12 instanceof j)) {
                    ((g) rVarB11).B(rVarB12.m().intValue(), rVarB13);
                } else if (rVarB11 instanceof l) {
                    ((l) rVarB11).i(rVarB12.n(), rVarB13);
                }
                return rVarB13;
            case R.styleable.GradientColor_android_endY /* 11 */:
                a6.f(x0.TYPEOF, 1, list);
                r rVarB14 = b7Var.b(list.get(0));
                if (rVarB14 instanceof y) {
                    str2 = "undefined";
                } else if (rVarB14 instanceof h) {
                    str2 = "boolean";
                } else if (rVarB14 instanceof j) {
                    str2 = "number";
                } else if (rVarB14 instanceof t) {
                    str2 = "string";
                } else if (rVarB14 instanceof s) {
                    str2 = "function";
                } else {
                    if ((rVarB14 instanceof u) || (rVarB14 instanceof k)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", rVarB14));
                    }
                    str2 = "object";
                }
                return new t(str2);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                a6.f(x0.UNDEFINED, 0, list);
                return r.L;
            case 13:
                a6.j(x0.VAR, 1, list);
                Iterator<r> it2 = list.iterator();
                while (it2.hasNext()) {
                    r rVarB15 = b7Var.b(it2.next());
                    if (!(rVarB15 instanceof t)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", rVarB15.getClass().getCanonicalName()));
                    }
                    b7Var.e(rVarB15.n(), r.L);
                }
                return r.L;
            default:
                return super.a(str);
        }
    }
}
