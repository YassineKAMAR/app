package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class sa<T> implements eb<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ma f19204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc<?, ?> f19205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n8<?> f19207d;

    private sa(dc<?, ?> dcVar, n8<?> n8Var, ma maVar) {
        this.f19205b = dcVar;
        this.f19206c = n8Var.e(maVar);
        this.f19207d = n8Var;
        this.f19204a = maVar;
    }

    static <T> sa<T> i(dc<?, ?> dcVar, n8<?> n8Var, ma maVar) {
        return new sa<>(dcVar, n8Var, maVar);
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final int a(T t7) {
        dc<?, ?> dcVar = this.f19205b;
        int iE = dcVar.e(dcVar.k(t7)) + 0;
        return this.f19206c ? iE + this.f19207d.b(t7).a() : iE;
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final int b(T t7) {
        int iHashCode = this.f19205b.k(t7).hashCode();
        return this.f19206c ? (iHashCode * 53) + this.f19207d.b(t7).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final void c(T t7, zc zcVar) {
        Iterator itP = this.f19207d.b(t7).p();
        while (itP.hasNext()) {
            Map.Entry entry = (Map.Entry) itP.next();
            t8 t8Var = (t8) entry.getKey();
            if (t8Var.l() != ad.MESSAGE || t8Var.m() || t8Var.p()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zcVar.s(t8Var.j(), entry instanceof o9 ? ((o9) entry).a().d() : entry.getValue());
        }
        dc<?, ?> dcVar = this.f19205b;
        dcVar.d(dcVar.k(t7), zcVar);
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final boolean d(T t7) {
        return this.f19207d.b(t7).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.n7 r14) throws com.google.android.gms.internal.measurement.k9 {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.y8 r0 = (com.google.android.gms.internal.measurement.y8) r0
            com.google.android.gms.internal.measurement.bc r1 = r0.zzb
            com.google.android.gms.internal.measurement.bc r2 = com.google.android.gms.internal.measurement.bc.k()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.bc r1 = com.google.android.gms.internal.measurement.bc.l()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.y8$d r10 = (com.google.android.gms.internal.measurement.y8.d) r10
            r10.F()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.k7.p(r11, r12, r14)
            int r2 = r14.f18978a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.n8<?> r12 = r9.f19207d
            com.google.android.gms.internal.measurement.l8 r0 = r14.f18981d
            com.google.android.gms.internal.measurement.ma r3 = r9.f19204a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.y8$f r0 = (com.google.android.gms.internal.measurement.y8.f) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.k7.d(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.za.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.k7.b(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.k7.p(r11, r4, r14)
            int r5 = r14.f18978a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.k7.k(r11, r4, r14)
            java.lang.Object r2 = r14.f18980c
            com.google.android.gms.internal.measurement.o7 r2 = (com.google.android.gms.internal.measurement.o7) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.za.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.k7.p(r11, r4, r14)
            int r12 = r14.f18978a
            com.google.android.gms.internal.measurement.n8<?> r0 = r9.f19207d
            com.google.android.gms.internal.measurement.l8 r5 = r14.f18981d
            com.google.android.gms.internal.measurement.ma r6 = r9.f19204a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.y8$f r0 = (com.google.android.gms.internal.measurement.y8.f) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.k7.b(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.k9 r10 = com.google.android.gms.internal.measurement.k9.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.sa.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.n7):void");
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final void f(T t7) {
        this.f19205b.l(t7);
        this.f19207d.g(t7);
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final void g(T t7, T t8) {
        fb.n(this.f19205b, t7, t8);
        if (this.f19206c) {
            fb.l(this.f19207d, t7, t8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final boolean h(T t7, T t8) {
        if (!this.f19205b.k(t7).equals(this.f19205b.k(t8))) {
            return false;
        }
        if (this.f19206c) {
            return this.f19207d.b(t7).equals(this.f19207d.b(t8));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.eb
    public final T j() {
        ma maVar = this.f19204a;
        return maVar instanceof y8 ? (T) ((y8) maVar).y() : (T) maVar.m0().f();
    }
}
