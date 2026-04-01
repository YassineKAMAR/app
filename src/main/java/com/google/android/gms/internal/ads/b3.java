package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b3 extends d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f5589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f5590d;

    public b3() {
        super(new o0());
        this.f5588b = -9223372036854775807L;
        this.f5589c = new long[0];
        this.f5590d = new long[0];
    }

    private static Double g(dq2 dq2Var) {
        return Double.valueOf(Double.longBitsToDouble(dq2Var.B()));
    }

    private static Object h(dq2 dq2Var, int i8) {
        if (i8 == 0) {
            return g(dq2Var);
        }
        if (i8 == 1) {
            return Boolean.valueOf(dq2Var.u() == 1);
        }
        if (i8 == 2) {
            return i(dq2Var);
        }
        if (i8 != 3) {
            if (i8 == 8) {
                return j(dq2Var);
            }
            if (i8 != 10) {
                if (i8 != 11) {
                    return null;
                }
                Date date = new Date((long) g(dq2Var).doubleValue());
                dq2Var.h(2);
                return date;
            }
            int iX = dq2Var.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i9 = 0; i9 < iX; i9++) {
                Object objH = h(dq2Var, dq2Var.u());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(dq2Var);
            int iU = dq2Var.u();
            if (iU == 9) {
                return map;
            }
            Object objH2 = h(dq2Var, iU);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    private static String i(dq2 dq2Var) {
        int iY = dq2Var.y();
        int iL = dq2Var.l();
        dq2Var.h(iY);
        return new String(dq2Var.i(), iL, iY);
    }

    private static HashMap j(dq2 dq2Var) {
        int iX = dq2Var.x();
        HashMap map = new HashMap(iX);
        for (int i8 = 0; i8 < iX; i8++) {
            String strI = i(dq2Var);
            Object objH = h(dq2Var, dq2Var.u());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean a(dq2 dq2Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d3
    protected final boolean b(dq2 dq2Var, long j8) {
        if (dq2Var.u() != 2 || !"onMetaData".equals(i(dq2Var)) || dq2Var.j() == 0 || dq2Var.u() != 8) {
            return false;
        }
        HashMap mapJ = j(dq2Var);
        Object obj = mapJ.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f5588b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapJ.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f5589c = new long[size];
                this.f5590d = new long[size];
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj5 = list.get(i8);
                    Object obj6 = list2.get(i8);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f5589c = new long[0];
                        this.f5590d = new long[0];
                        break;
                    }
                    this.f5589c[i8] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f5590d[i8] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f5588b;
    }

    public final long[] e() {
        return this.f5590d;
    }

    public final long[] f() {
        return this.f5589c;
    }
}
