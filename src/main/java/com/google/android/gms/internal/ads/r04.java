package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class r04 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r04 f13851d = new r04(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r34 f13852a = new h34(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13854c;

    private r04() {
    }

    private r04(boolean z7) {
        b();
        b();
    }

    public static r04 a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(com.google.android.gms.internal.ads.q04 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.m44 r0 = r4.k()
            byte[] r1 = com.google.android.gms.internal.ads.k14.f9887d
            r5.getClass()
            com.google.android.gms.internal.ads.m44 r1 = com.google.android.gms.internal.ads.m44.f11159b
            com.google.android.gms.internal.ads.n44 r1 = com.google.android.gms.internal.ads.n44.INT
            com.google.android.gms.internal.ads.n44 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.k24
            if (r0 == 0) goto L44
            goto L43
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.c14
            if (r0 == 0) goto L44
            goto L43
        L27:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.rz3
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
            goto L43
        L30:
            boolean r0 = r5 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r5 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r5 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r5 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r5 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.m44 r4 = r4.k()
            com.google.android.gms.internal.ads.n44 r4 = r4.a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r04.d(com.google.android.gms.internal.ads.q04, java.lang.Object):void");
    }

    public final void b() {
        if (this.f13853b) {
            return;
        }
        for (int i8 = 0; i8 < this.f13852a.b(); i8++) {
            Map.Entry entryH = this.f13852a.h(i8);
            if (entryH.getValue() instanceof z04) {
                ((z04) entryH.getValue()).C();
            }
        }
        this.f13852a.a();
        this.f13853b = true;
    }

    public final void c(q04 q04Var, Object obj) {
        if (!q04Var.l()) {
            d(q04Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                d(q04Var, arrayList.get(i8));
            }
            obj = arrayList;
        }
        this.f13852a.put(q04Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        r04 r04Var = new r04();
        for (int i8 = 0; i8 < this.f13852a.b(); i8++) {
            Map.Entry entryH = this.f13852a.h(i8);
            r04Var.c((q04) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f13852a.c()) {
            r04Var.c((q04) entry.getKey(), entry.getValue());
        }
        r04Var.f13854c = this.f13854c;
        return r04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r04) {
            return this.f13852a.equals(((r04) obj).f13852a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13852a.hashCode();
    }
}
