package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f1 f19506d = new f1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final o3 f19507a = new e3(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19509c;

    private f1() {
    }

    private f1(boolean z7) {
        b();
        b();
    }

    public static f1 a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(com.google.android.gms.internal.play_billing.e1 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.j4 r0 = r4.k()
            byte[] r1 = com.google.android.gms.internal.play_billing.s1.f19671d
            r5.getClass()
            com.google.android.gms.internal.play_billing.j4 r1 = com.google.android.gms.internal.play_billing.j4.f19585b
            com.google.android.gms.internal.play_billing.k4 r1 = com.google.android.gms.internal.play_billing.k4.INT
            com.google.android.gms.internal.play_billing.k4 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L23;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L40
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.r2
            if (r0 == 0) goto L40
            goto L3f
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L40
            goto L3f
        L23:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.n0
            if (r0 != 0) goto L3f
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L40
            goto L3f
        L2c:
            boolean r0 = r5 instanceof java.lang.String
            goto L3d
        L2f:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3d
        L32:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3d
        L35:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3d
        L38:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3d
        L3b:
            boolean r0 = r5 instanceof java.lang.Integer
        L3d:
            if (r0 == 0) goto L40
        L3f:
            return
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.play_billing.j4 r4 = r4.k()
            com.google.android.gms.internal.play_billing.k4 r4 = r4.a()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f1.d(com.google.android.gms.internal.play_billing.e1, java.lang.Object):void");
    }

    public final void b() {
        if (this.f19508b) {
            return;
        }
        for (int i8 = 0; i8 < this.f19507a.b(); i8++) {
            Map.Entry entryH = this.f19507a.h(i8);
            if (entryH.getValue() instanceof n1) {
                ((n1) entryH.getValue()).l();
            }
        }
        this.f19507a.a();
        this.f19508b = true;
    }

    public final void c(e1 e1Var, Object obj) {
        if (!e1Var.l()) {
            d(e1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                d(e1Var, arrayList.get(i8));
            }
            obj = arrayList;
        }
        this.f19507a.put(e1Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        f1 f1Var = new f1();
        for (int i8 = 0; i8 < this.f19507a.b(); i8++) {
            Map.Entry entryH = this.f19507a.h(i8);
            f1Var.c((e1) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f19507a.c()) {
            f1Var.c((e1) entry.getKey(), entry.getValue());
        }
        f1Var.f19509c = this.f19509c;
        return f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return this.f19507a.equals(((f1) obj).f19507a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19507a.hashCode();
    }
}
