package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z {
    protected e0() {
        this.f19420a.add(x0.APPLY);
        this.f19420a.add(x0.BLOCK);
        this.f19420a.add(x0.BREAK);
        this.f19420a.add(x0.CASE);
        this.f19420a.add(x0.DEFAULT);
        this.f19420a.add(x0.CONTINUE);
        this.f19420a.add(x0.DEFINE_FUNCTION);
        this.f19420a.add(x0.FN);
        this.f19420a.add(x0.IF);
        this.f19420a.add(x0.QUOTE);
        this.f19420a.add(x0.RETURN);
        this.f19420a.add(x0.SWITCH);
        this.f19420a.add(x0.TERNARY);
    }

    private static r c(b7 b7Var, List<r> list) {
        a6.j(x0.FN, 2, list);
        r rVarB = b7Var.b(list.get(0));
        r rVarB2 = b7Var.b(list.get(1));
        if (!(rVarB2 instanceof g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", rVarB2.getClass().getCanonicalName()));
        }
        List<r> listE = ((g) rVarB2).E();
        List<r> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new s(rVarB.n(), listE, arrayList, b7Var);
    }

    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        int i8 = 0;
        switch (h0.f18758a[a6.c(str).ordinal()]) {
            case 1:
                a6.f(x0.APPLY, 3, list);
                r rVarB = b7Var.b(list.get(0));
                String strN = b7Var.b(list.get(1)).n();
                r rVarB2 = b7Var.b(list.get(2));
                if (!(rVarB2 instanceof g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", rVarB2.getClass().getCanonicalName()));
                }
                if (strN.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return rVarB.g(strN, b7Var, ((g) rVarB2).E());
            case 2:
                return b7Var.d().a(new g(list));
            case 3:
                a6.f(x0.BREAK, 0, list);
                return r.O;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    r rVarB3 = b7Var.b(list.get(0));
                    if (rVarB3 instanceof g) {
                        return b7Var.a((g) rVarB3);
                    }
                }
                return r.L;
            case 6:
                a6.f(x0.BREAK, 0, list);
                return r.N;
            case 7:
                a6.j(x0.DEFINE_FUNCTION, 2, list);
                s sVar = (s) c(b7Var, list);
                b7Var.h(sVar.c() == null ? "" : sVar.c(), sVar);
                return sVar;
            case 8:
                return c(b7Var, list);
            case 9:
                a6.j(x0.IF, 2, list);
                r rVarB4 = b7Var.b(list.get(0));
                r rVarB5 = b7Var.b(list.get(1));
                r rVarB6 = list.size() > 2 ? b7Var.b(list.get(2)) : null;
                r rVar = r.L;
                r rVarA = rVarB4.p().booleanValue() ? b7Var.a((g) rVarB5) : rVarB6 != null ? b7Var.a((g) rVarB6) : rVar;
                return rVarA instanceof k ? rVarA : rVar;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new g(list);
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (list.isEmpty()) {
                    return r.P;
                }
                a6.f(x0.RETURN, 1, list);
                return new k("return", b7Var.b(list.get(0)));
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                a6.f(x0.SWITCH, 3, list);
                r rVarB7 = b7Var.b(list.get(0));
                r rVarB8 = b7Var.b(list.get(1));
                r rVarB9 = b7Var.b(list.get(2));
                if (!(rVarB8 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(rVarB9 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                g gVar = (g) rVarB8;
                g gVar2 = (g) rVarB9;
                boolean z7 = false;
                while (true) {
                    if (i8 < gVar.y()) {
                        if (z7 || rVarB7.equals(b7Var.b(gVar.v(i8)))) {
                            r rVarB10 = b7Var.b(gVar2.v(i8));
                            if (!(rVarB10 instanceof k)) {
                                z7 = true;
                            } else if (!((k) rVarB10).b().equals("break")) {
                                return rVarB10;
                            }
                        }
                        i8++;
                    } else if (gVar.y() + 1 == gVar2.y()) {
                        r rVarB11 = b7Var.b(gVar2.v(gVar.y()));
                        if (rVarB11 instanceof k) {
                            String strB = ((k) rVarB11).b();
                            if (strB.equals("return") || strB.equals("continue")) {
                                return rVarB11;
                            }
                        }
                    }
                }
                return r.L;
            case 13:
                a6.f(x0.TERNARY, 3, list);
                return b7Var.b(list.get(0)).p().booleanValue() ? b7Var.b(list.get(1)) : b7Var.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}
