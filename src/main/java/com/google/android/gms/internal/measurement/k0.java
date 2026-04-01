package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends z {
    protected k0() {
        this.f19420a.add(x0.FOR_IN);
        this.f19420a.add(x0.FOR_IN_CONST);
        this.f19420a.add(x0.FOR_IN_LET);
        this.f19420a.add(x0.FOR_LET);
        this.f19420a.add(x0.FOR_OF);
        this.f19420a.add(x0.FOR_OF_CONST);
        this.f19420a.add(x0.FOR_OF_LET);
        this.f19420a.add(x0.WHILE);
    }

    private static r c(o0 o0Var, r rVar, r rVar2) {
        return d(o0Var, rVar.o(), rVar2);
    }

    private static r d(o0 o0Var, Iterator<r> it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r rVarA = o0Var.a(it.next()).a((g) rVar);
                if (rVarA instanceof k) {
                    k kVar = (k) rVarA;
                    if ("break".equals(kVar.b())) {
                        return r.L;
                    }
                    if ("return".equals(kVar.b())) {
                        return kVar;
                    }
                }
            }
        }
        return r.L;
    }

    private static r e(o0 o0Var, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return d(o0Var, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.r b(java.lang.String r11, com.google.android.gms.internal.measurement.b7 r12, java.util.List<com.google.android.gms.internal.measurement.r> r13) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k0.b(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.List):com.google.android.gms.internal.measurement.r");
    }
}
