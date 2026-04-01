package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.t8;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class r8<T extends t8<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r8 f19134d = new r8(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ib<T, Object> f19135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19137c;

    private r8() {
        this.f19135a = ib.b(16);
    }

    private r8(ib<T, Object> ibVar) {
        this.f19135a = ibVar;
        q();
    }

    private r8(boolean z7) {
        this(ib.b(0));
        q();
    }

    public static int b(t8<?> t8Var, Object obj) {
        qc qcVarK = t8Var.k();
        int iJ = t8Var.j();
        if (!t8Var.m()) {
            return c(qcVarK, iJ, obj);
        }
        List list = (List) obj;
        int iC = 0;
        if (!t8Var.p()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC += c(qcVarK, iJ, it.next());
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iC += d(qcVarK, it2.next());
        }
        return h8.w0(iJ) + iC + h8.z0(iC);
    }

    static int c(qc qcVar, int i8, Object obj) {
        int iW0 = h8.w0(i8);
        if (qcVar == qc.f19092l) {
            a9.g((ma) obj);
            iW0 <<= 1;
        }
        return iW0 + d(qcVar, obj);
    }

    private static int d(qc qcVar, Object obj) {
        switch (q8.f19062b[qcVar.ordinal()]) {
            case 1:
                return h8.c(((Double) obj).doubleValue());
            case 2:
                return h8.d(((Float) obj).floatValue());
            case 3:
                return h8.e0(((Long) obj).longValue());
            case 4:
                return h8.r0(((Long) obj).longValue());
            case 5:
                return h8.k0(((Integer) obj).intValue());
            case 6:
                return h8.W(((Long) obj).longValue());
            case 7:
                return h8.g0(((Integer) obj).intValue());
            case 8:
                return h8.j(((Boolean) obj).booleanValue());
            case 9:
                return h8.F((ma) obj);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return obj instanceof l9 ? h8.h((l9) obj) : h8.X((ma) obj);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return obj instanceof o7 ? h8.E((o7) obj) : h8.G((String) obj);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return obj instanceof o7 ? h8.E((o7) obj) : h8.k((byte[]) obj);
            case 13:
                return h8.z0(((Integer) obj).intValue());
            case 14:
                return h8.o0(((Integer) obj).intValue());
            case 15:
                return h8.j0(((Long) obj).longValue());
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return h8.s0(((Integer) obj).intValue());
            case 17:
                return h8.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof e9 ? h8.b0(((e9) obj).j()) : h8.b0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.l() != ad.MESSAGE || key.m() || key.p()) {
            return b(key, value);
        }
        boolean z7 = value instanceof l9;
        int iJ = entry.getKey().j();
        return z7 ? h8.g(iJ, (l9) value) : h8.A(iJ, (ma) value);
    }

    private final Object f(T t7) {
        Object obj = this.f19135a.get(t7);
        if (!(obj instanceof l9)) {
            return obj;
        }
        return l9.e();
    }

    private static Object g(Object obj) {
        if (obj instanceof ua) {
            return ((ua) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends t8<T>> r8<T> i() {
        return f19134d;
    }

    private final void j(T t7, Object obj) {
        if (!t7.m()) {
            n(t7, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj2 = arrayList.get(i8);
                i8++;
                n(t7, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof l9) {
            this.f19137c = true;
        }
        this.f19135a.put(t7, obj);
    }

    private final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof l9) {
            value = l9.e();
        }
        if (key.m()) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objF).add(g(it.next()));
            }
            this.f19135a.put(key, objF);
            return;
        }
        if (key.l() != ad.MESSAGE) {
            this.f19135a.put(key, g(value));
            return;
        }
        Object objF2 = f(key);
        if (objF2 == null) {
            this.f19135a.put(key, g(value));
        } else {
            this.f19135a.put(key, objF2 instanceof ua ? key.f((ua) objF2, (ua) value) : key.b(((ma) objF2).l0(), (ma) value).d());
        }
    }

    private static boolean l(Object obj) {
        if (obj instanceof oa) {
            return ((oa) obj).e();
        }
        if (obj instanceof l9) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.qc r0 = r5.k()
            com.google.android.gms.internal.measurement.a9.e(r6)
            int[] r1 = com.google.android.gms.internal.measurement.q8.f19061a
            com.google.android.gms.internal.measurement.ad r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.ma
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.l9
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.e9
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.o7
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = 1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.j()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.qc r5 = r5.k()
            com.google.android.gms.internal.measurement.ad r5 = r5.a()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r8.n(com.google.android.gms.internal.measurement.t8, java.lang.Object):void");
    }

    private static <T extends t8<T>> boolean o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.l() != ad.MESSAGE) {
            return true;
        }
        boolean zM = key.m();
        Object value = entry.getValue();
        if (!zM) {
            return l(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int iE = 0;
        for (int i8 = 0; i8 < this.f19135a.h(); i8++) {
            iE += e(this.f19135a.i(i8));
        }
        Iterator it = this.f19135a.k().iterator();
        while (it.hasNext()) {
            iE += e((Map.Entry) it.next());
        }
        return iE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        r8 r8Var = new r8();
        for (int i8 = 0; i8 < this.f19135a.h(); i8++) {
            Map.Entry<K, Object> entryI = this.f19135a.i(i8);
            r8Var.j((t8) entryI.getKey(), entryI.getValue());
        }
        Iterator it = this.f19135a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r8Var.j((t8) entry.getKey(), entry.getValue());
        }
        r8Var.f19137c = this.f19137c;
        return r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8) {
            return this.f19135a.equals(((r8) obj).f19135a);
        }
        return false;
    }

    public final void h(r8<T> r8Var) {
        for (int i8 = 0; i8 < r8Var.f19135a.h(); i8++) {
            k(r8Var.f19135a.i(i8));
        }
        Iterator it = r8Var.f19135a.k().iterator();
        while (it.hasNext()) {
            k((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f19135a.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> m() {
        return this.f19137c ? new q9(this.f19135a.n().iterator()) : this.f19135a.n().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f19137c ? new q9(this.f19135a.entrySet().iterator()) : this.f19135a.entrySet().iterator();
    }

    public final void q() {
        if (this.f19136b) {
            return;
        }
        for (int i8 = 0; i8 < this.f19135a.h(); i8++) {
            Map.Entry<K, Object> entryI = this.f19135a.i(i8);
            if (entryI.getValue() instanceof y8) {
                ((y8) entryI.getValue()).C();
            }
        }
        this.f19135a.g();
        this.f19136b = true;
    }

    public final boolean r() {
        return this.f19136b;
    }

    public final boolean s() {
        for (int i8 = 0; i8 < this.f19135a.h(); i8++) {
            if (!o(this.f19135a.i(i8))) {
                return false;
            }
        }
        Iterator it = this.f19135a.k().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
