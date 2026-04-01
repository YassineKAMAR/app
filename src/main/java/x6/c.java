package x6;

import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.q;
import t6.i;
import t6.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j8, int i8) {
        return a.n((j8 << 1) + ((long) i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j8) {
        return a.n((j8 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j8) {
        return new i(-4611686018426L, 4611686018426L).i(j8) ? l(n(j8)) : j(l.g(j8, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j8) {
        return a.n(j8 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j8) {
        return new i(-4611686018426999999L, 4611686018426999999L).i(j8) ? l(j8) : j(o(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j8) {
        return j8 * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j8) {
        return j8 / ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a6 A[EDGE_INSN: B:170:0x00a6->B:49:0x00a6 BREAK  A[LOOP:1: B:36:0x006c->B:47:0x0098], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098 A[LOOP:1: B:36:0x006c->B:47:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long p(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c.p(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long q(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            char r5 = r9.charAt(r4)
            java.lang.String r6 = "+-"
            boolean r5 = w6.m.y(r6, r5, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            t6.f r0 = new t6.f
            int r6 = w6.m.E(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = 1
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            f6.e0 r5 = (f6.e0) r5
            int r5 = r5.nextInt()
            t6.c r6 = new t6.c
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.i(r5)
            if (r5 != 0) goto L3a
            r0 = 0
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = w6.m.u(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = w6.m.s0(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c.q(java.lang.String):long");
    }

    public static final long r(double d8, d unit) {
        q.f(unit, "unit");
        double dA = e.a(d8, unit, d.f27331b);
        if (!(!Double.isNaN(dA))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jA = q6.c.a(dA);
        return new i(-4611686018426999999L, 4611686018426999999L).i(jA) ? l(jA) : k(q6.c.a(e.a(d8, unit, d.f27333d)));
    }

    public static final long s(int i8, d unit) {
        q.f(unit, "unit");
        return unit.compareTo(d.f27334e) <= 0 ? l(e.c(i8, unit, d.f27331b)) : t(i8, unit);
    }

    public static final long t(long j8, d unit) {
        q.f(unit, "unit");
        d dVar = d.f27331b;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return new i(-jC, jC).i(j8) ? l(e.c(j8, unit, dVar)) : j(l.g(e.b(j8, unit, d.f27333d), -4611686018427387903L, 4611686018427387903L));
    }
}
