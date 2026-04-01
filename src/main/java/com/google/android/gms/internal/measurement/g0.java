package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    private static g a(g gVar, b7 b7Var, m mVar) {
        return b(gVar, b7Var, mVar, null, null);
    }

    private static g b(g gVar, b7 b7Var, m mVar, Boolean bool, Boolean bool2) {
        g gVar2 = new g();
        Iterator<Integer> itD = gVar.D();
        while (itD.hasNext()) {
            int iIntValue = itD.next().intValue();
            if (gVar.C(iIntValue)) {
                r rVarB = mVar.b(b7Var, Arrays.asList(gVar.v(iIntValue), new j(Double.valueOf(iIntValue)), gVar));
                if (rVarB.p().equals(bool)) {
                    return gVar2;
                }
                if (bool2 == null || rVarB.p().equals(bool2)) {
                    gVar2.B(iIntValue, rVarB);
                }
            }
        }
        return gVar2;
    }

    private static r c(g gVar, b7 b7Var, List<r> list, boolean z7) {
        r rVarB;
        a6.k("reduce", 1, list);
        a6.n("reduce", 2, list);
        r rVarB2 = b7Var.b(list.get(0));
        if (!(rVarB2 instanceof m)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            rVarB = b7Var.b(list.get(1));
            if (rVarB instanceof k) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            rVarB = null;
            if (gVar.y() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
        }
        m mVar = (m) rVarB2;
        int iY = gVar.y();
        int i8 = z7 ? 0 : iY - 1;
        int i9 = z7 ? iY - 1 : 0;
        int i10 = z7 ? 1 : -1;
        if (rVarB == null) {
            rVarB = gVar.v(i8);
            i8 += i10;
        }
        while ((i9 - i8) * i10 >= 0) {
            if (gVar.C(i8)) {
                rVarB = mVar.b(b7Var, Arrays.asList(rVarB, gVar.v(i8), new j(Double.valueOf(i8)), gVar));
                if (rVarB instanceof k) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i8 += i10;
            } else {
                i8 += i10;
            }
        }
        return rVarB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static r d(String str, g gVar, b7 b7Var, List<r> list) {
        String strN;
        m mVar;
        b7 b7Var2;
        str.hashCode();
        byte b8 = -1;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    b8 = 0;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b8 = 1;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b8 = 2;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b8 = 3;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b8 = 4;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b8 = 5;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b8 = 6;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b8 = 7;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b8 = 8;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b8 = 9;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b8 = 10;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b8 = 11;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b8 = 12;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b8 = 13;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    b8 = 14;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b8 = 15;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b8 = 16;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b8 = 17;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b8 = 18;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b8 = 19;
                }
                break;
        }
        double dY = 0.0d;
        switch (b8) {
            case 0:
                a6.g("toString", 0, list);
                return new t(gVar.toString());
            case 1:
                g gVar2 = (g) gVar.l();
                if (!list.isEmpty()) {
                    Iterator<r> it = list.iterator();
                    while (it.hasNext()) {
                        r rVarB = b7Var.b(it.next());
                        if (rVarB instanceof k) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iY = gVar2.y();
                        if (rVarB instanceof g) {
                            g gVar3 = (g) rVarB;
                            Iterator<Integer> itD = gVar3.D();
                            while (itD.hasNext()) {
                                Integer next = itD.next();
                                gVar2.B(next.intValue() + iY, gVar3.v(next.intValue()));
                            }
                        } else {
                            gVar2.B(iY, rVarB);
                        }
                    }
                }
                return gVar2;
            case 2:
                a6.g("filter", 1, list);
                r rVarB2 = b7Var.b(list.get(0));
                if (!(rVarB2 instanceof s)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (gVar.u() == 0) {
                    return new g();
                }
                g gVar4 = (g) gVar.l();
                g gVarB = b(gVar, b7Var, (s) rVarB2, null, Boolean.TRUE);
                g gVar5 = new g();
                Iterator<Integer> itD2 = gVarB.D();
                while (itD2.hasNext()) {
                    gVar5.x(gVar4.v(itD2.next().intValue()));
                }
                return gVar5;
            case 3:
                return c(gVar, b7Var, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new g();
                }
                int iA = (int) a6.a(b7Var.b(list.get(0)).m().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + gVar.y());
                } else if (iA > gVar.y()) {
                    iA = gVar.y();
                }
                int iY2 = gVar.y();
                g gVar6 = new g();
                if (list.size() <= 1) {
                    while (iA < iY2) {
                        gVar6.x(gVar.v(iA));
                        gVar.B(iA, null);
                        iA++;
                    }
                    return gVar6;
                }
                int iMax = Math.max(0, (int) a6.a(b7Var.b(list.get(1)).m().doubleValue()));
                if (iMax > 0) {
                    for (int i8 = iA; i8 < Math.min(iY2, iA + iMax); i8++) {
                        gVar6.x(gVar.v(iA));
                        gVar.A(iA);
                    }
                }
                if (list.size() > 2) {
                    for (int i9 = 2; i9 < list.size(); i9++) {
                        r rVarB3 = b7Var.b(list.get(i9));
                        if (rVarB3 instanceof k) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        gVar.w((iA + i9) - 2, rVarB3);
                    }
                }
                return gVar6;
            case 5:
                a6.g("forEach", 1, list);
                r rVarB4 = b7Var.b(list.get(0));
                if (!(rVarB4 instanceof s)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (gVar.u() == 0) {
                    return r.L;
                }
                a(gVar, b7Var, (s) rVarB4);
                return r.L;
            case 6:
                a6.n("lastIndexOf", 2, list);
                r rVarB5 = r.L;
                if (!list.isEmpty()) {
                    rVarB5 = b7Var.b(list.get(0));
                }
                double dY2 = gVar.y() - 1;
                if (list.size() > 1) {
                    r rVarB6 = b7Var.b(list.get(1));
                    dY2 = Double.isNaN(rVarB6.m().doubleValue()) ? gVar.y() - 1 : a6.a(rVarB6.m().doubleValue());
                    if (dY2 < 0.0d) {
                        dY2 += (double) gVar.y();
                    }
                }
                if (dY2 < 0.0d) {
                    return new j(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(gVar.y(), dY2); iMin >= 0; iMin--) {
                    if (gVar.C(iMin) && a6.h(gVar.v(iMin), rVarB5)) {
                        return new j(Double.valueOf(iMin));
                    }
                }
                return new j(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    g gVar7 = new g();
                    Iterator<r> it2 = list.iterator();
                    while (it2.hasNext()) {
                        r rVarB7 = b7Var.b(it2.next());
                        if (rVarB7 instanceof k) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        gVar7.x(rVarB7);
                    }
                    int iY3 = gVar7.y();
                    Iterator<Integer> itD3 = gVar.D();
                    while (itD3.hasNext()) {
                        Integer next2 = itD3.next();
                        gVar7.B(next2.intValue() + iY3, gVar.v(next2.intValue()));
                    }
                    gVar.H();
                    Iterator<Integer> itD4 = gVar7.D();
                    while (itD4.hasNext()) {
                        Integer next3 = itD4.next();
                        gVar.B(next3.intValue(), gVar7.v(next3.intValue()));
                    }
                }
                return new j(Double.valueOf(gVar.y()));
            case 8:
                a6.g("map", 1, list);
                r rVarB8 = b7Var.b(list.get(0));
                if (rVarB8 instanceof s) {
                    return gVar.y() == 0 ? new g() : a(gVar, b7Var, (s) rVarB8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 9:
                a6.g("pop", 0, list);
                int iY4 = gVar.y();
                if (iY4 == 0) {
                    return r.L;
                }
                int i10 = iY4 - 1;
                r rVarV = gVar.v(i10);
                gVar.A(i10);
                return rVarV;
            case R.styleable.GradientColor_android_endX /* 10 */:
                a6.n("join", 1, list);
                if (gVar.y() == 0) {
                    return r.S;
                }
                if (list.isEmpty()) {
                    strN = com.amazon.a.a.o.b.f.f3942a;
                } else {
                    r rVarB9 = b7Var.b(list.get(0));
                    strN = ((rVarB9 instanceof p) || (rVarB9 instanceof y)) ? "" : rVarB9.n();
                }
                return new t(gVar.z(strN));
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (!list.isEmpty()) {
                    Iterator<r> it3 = list.iterator();
                    while (it3.hasNext()) {
                        gVar.x(b7Var.b(it3.next()));
                    }
                }
                return new j(Double.valueOf(gVar.y()));
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                a6.g("some", 1, list);
                r rVarB10 = b7Var.b(list.get(0));
                if (!(rVarB10 instanceof m)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (gVar.y() != 0) {
                    m mVar2 = (m) rVarB10;
                    Iterator<Integer> itD5 = gVar.D();
                    while (itD5.hasNext()) {
                        int iIntValue = itD5.next().intValue();
                        if (gVar.C(iIntValue) && mVar2.b(b7Var, Arrays.asList(gVar.v(iIntValue), new j(Double.valueOf(iIntValue)), gVar)).p().booleanValue()) {
                            return r.Q;
                        }
                    }
                }
                return r.R;
            case 13:
                a6.n("sort", 1, list);
                if (gVar.y() >= 2) {
                    List<r> listE = gVar.E();
                    if (list.isEmpty()) {
                        mVar = null;
                    } else {
                        r rVarB11 = b7Var.b(list.get(0));
                        if (!(rVarB11 instanceof m)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        mVar = (m) rVarB11;
                    }
                    Collections.sort(listE, new j0(mVar, b7Var));
                    gVar.H();
                    Iterator<r> it4 = listE.iterator();
                    int i11 = 0;
                    while (it4.hasNext()) {
                        gVar.B(i11, it4.next());
                        i11++;
                    }
                }
                return gVar;
            case 14:
                a6.g("every", 1, list);
                r rVarB12 = b7Var.b(list.get(0));
                if (rVarB12 instanceof s) {
                    return (gVar.y() == 0 || b(gVar, b7Var, (s) rVarB12, Boolean.FALSE, Boolean.TRUE).y() == gVar.y()) ? r.Q : r.R;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                a6.g("shift", 0, list);
                if (gVar.y() == 0) {
                    return r.L;
                }
                r rVarV2 = gVar.v(0);
                gVar.A(0);
                return rVarV2;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                a6.n("slice", 2, list);
                if (list.isEmpty()) {
                    return gVar.l();
                }
                double dY3 = gVar.y();
                double dA = a6.a(b7Var.b(list.get(0)).m().doubleValue());
                double dMax = dA < 0.0d ? Math.max(dA + dY3, 0.0d) : Math.min(dA, dY3);
                if (list.size() == 2) {
                    double dA2 = a6.a(b7Var.b(list.get(1)).m().doubleValue());
                    dY3 = dA2 < 0.0d ? Math.max(dY3 + dA2, 0.0d) : Math.min(dY3, dA2);
                }
                g gVar8 = new g();
                for (int i12 = (int) dMax; i12 < dY3; i12++) {
                    gVar8.x(gVar.v(i12));
                }
                return gVar8;
            case 17:
                return c(gVar, b7Var, list, false);
            case 18:
                a6.g("reverse", 0, list);
                int iY5 = gVar.y();
                if (iY5 != 0) {
                    for (int i13 = 0; i13 < iY5 / 2; i13++) {
                        if (gVar.C(i13)) {
                            r rVarV3 = gVar.v(i13);
                            gVar.B(i13, null);
                            int i14 = (iY5 - 1) - i13;
                            if (gVar.C(i14)) {
                                gVar.B(i13, gVar.v(i14));
                            }
                            gVar.B(i14, rVarV3);
                        }
                    }
                }
                return gVar;
            case 19:
                a6.n("indexOf", 2, list);
                r rVarB13 = r.L;
                if (list.isEmpty()) {
                    b7Var2 = b7Var;
                } else {
                    b7Var2 = b7Var;
                    rVarB13 = b7Var2.b(list.get(0));
                }
                if (list.size() > 1) {
                    double dA3 = a6.a(b7Var2.b(list.get(1)).m().doubleValue());
                    if (dA3 >= gVar.y()) {
                        return new j(Double.valueOf(-1.0d));
                    }
                    dY = dA3 < 0.0d ? ((double) gVar.y()) + dA3 : dA3;
                }
                Iterator<Integer> itD6 = gVar.D();
                while (itD6.hasNext()) {
                    int iIntValue2 = itD6.next().intValue();
                    double d8 = iIntValue2;
                    if (d8 >= dY && a6.h(gVar.v(iIntValue2), rVarB13)) {
                        return new j(Double.valueOf(d8));
                    }
                }
                return new j(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
