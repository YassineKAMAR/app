package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z {
    public c0() {
        this.f19420a.add(x0.EQUALS);
        this.f19420a.add(x0.GREATER_THAN);
        this.f19420a.add(x0.GREATER_THAN_EQUALS);
        this.f19420a.add(x0.IDENTITY_EQUALS);
        this.f19420a.add(x0.IDENTITY_NOT_EQUALS);
        this.f19420a.add(x0.LESS_THAN);
        this.f19420a.add(x0.LESS_THAN_EQUALS);
        this.f19420a.add(x0.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        r jVar;
        r jVar2;
        while (!rVar.getClass().equals(rVar2.getClass())) {
            if (((rVar instanceof y) || (rVar instanceof p)) && ((rVar2 instanceof y) || (rVar2 instanceof p))) {
                return true;
            }
            boolean z7 = rVar instanceof j;
            if (z7 && (rVar2 instanceof t)) {
                jVar2 = new j(rVar2.m());
            } else {
                boolean z8 = rVar instanceof t;
                if (z8 && (rVar2 instanceof j)) {
                    jVar = new j(rVar.m());
                } else if (rVar instanceof h) {
                    jVar = new j(rVar.m());
                } else if (rVar2 instanceof h) {
                    jVar2 = new j(rVar2.m());
                } else if ((z8 || z7) && (rVar2 instanceof l)) {
                    jVar2 = new t(rVar2.n());
                } else {
                    if (!(rVar instanceof l) || (!(rVar2 instanceof t) && !(rVar2 instanceof j))) {
                        return false;
                    }
                    jVar = new t(rVar.n());
                }
                rVar = jVar;
            }
            rVar2 = jVar2;
        }
        if ((rVar instanceof y) || (rVar instanceof p)) {
            return true;
        }
        return rVar instanceof j ? (Double.isNaN(rVar.m().doubleValue()) || Double.isNaN(rVar2.m().doubleValue()) || rVar.m().doubleValue() != rVar2.m().doubleValue()) ? false : true : rVar instanceof t ? rVar.n().equals(rVar2.n()) : rVar instanceof h ? rVar.p().equals(rVar2.p()) : rVar == rVar2;
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar instanceof l) {
            rVar = new t(rVar.n());
        }
        if (rVar2 instanceof l) {
            rVar2 = new t(rVar2.n());
        }
        if ((rVar instanceof t) && (rVar2 instanceof t)) {
            return rVar.n().compareTo(rVar2.n()) < 0;
        }
        double dDoubleValue = rVar.m().doubleValue();
        double dDoubleValue2 = rVar2.m().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof l) {
            rVar = new t(rVar.n());
        }
        if (rVar2 instanceof l) {
            rVar2 = new t(rVar2.n());
        }
        return (((rVar instanceof t) && (rVar2 instanceof t)) || !(Double.isNaN(rVar.m().doubleValue()) || Double.isNaN(rVar2.m().doubleValue()))) && !d(rVar2, rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.r b(java.lang.String r4, com.google.android.gms.internal.measurement.b7 r5, java.util.List<com.google.android.gms.internal.measurement.r> r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.x0 r0 = com.google.android.gms.internal.measurement.a6.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.a6.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.r r0 = (com.google.android.gms.internal.measurement.r) r0
            com.google.android.gms.internal.measurement.r r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.r r6 = (com.google.android.gms.internal.measurement.r) r6
            com.google.android.gms.internal.measurement.r r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.f0.f18692a
            com.google.android.gms.internal.measurement.x0 r2 = com.google.android.gms.internal.measurement.a6.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L41;
                case 6: goto L3c;
                case 7: goto L37;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.r r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
            goto L45
        L37:
            boolean r4 = e(r0, r5)
            goto L5a
        L3c:
            boolean r4 = d(r0, r5)
            goto L5a
        L41:
            boolean r4 = com.google.android.gms.internal.measurement.a6.h(r0, r5)
        L45:
            r4 = r4 ^ r1
            goto L5a
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.a6.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.r r4 = com.google.android.gms.internal.measurement.r.Q
            return r4
        L5f:
            com.google.android.gms.internal.measurement.r r4 = com.google.android.gms.internal.measurement.r.R
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c0.b(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.List):com.google.android.gms.internal.measurement.r");
    }
}
