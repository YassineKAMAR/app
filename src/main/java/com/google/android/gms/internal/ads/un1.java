package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class un1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15780a = new HashMap();

    un1() {
    }

    public final synchronized tn1 a(String str) {
        return (tn1) this.f15780a.get(str);
    }

    public final tn1 b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tn1 tn1VarA = a((String) it.next());
            if (tn1VarA != null) {
                return tn1VarA;
            }
        }
        return null;
    }

    public final String c(String str) {
        m70 m70Var;
        tn1 tn1VarA = a(str);
        return (tn1VarA == null || (m70Var = tn1VarA.f15172b) == null) ? "" : m70Var.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void d(java.lang.String r7, com.google.android.gms.internal.ads.qt2 r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f15780a     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.google.android.gms.internal.ads.tn1 r0 = new com.google.android.gms.internal.ads.tn1     // Catch: java.lang.Throwable -> L47
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.m70 r2 = r8.j()     // Catch: com.google.android.gms.internal.ads.ys2 -> L17 java.lang.Throwable -> L47
            goto L19
        L17:
            goto L10
        L19:
            if (r8 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.m70 r1 = r8.k()     // Catch: com.google.android.gms.internal.ads.ys2 -> L20 java.lang.Throwable -> L47
        L20:
            com.google.android.gms.internal.ads.fs r3 = com.google.android.gms.internal.ads.ns.c9     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.ls r4 = h2.y.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L47
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L47
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L36
        L34:
            r4 = 1
            goto L3d
        L36:
            if (r8 != 0) goto L39
            goto L3d
        L39:
            r8.c()     // Catch: com.google.android.gms.internal.ads.ys2 -> L3d java.lang.Throwable -> L47
            goto L34
        L3d:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L47
            java.util.Map r8 = r6.f15780a     // Catch: java.lang.Throwable -> L47
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r6)
            return
        L47:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.un1.d(java.lang.String, com.google.android.gms.internal.ads.qt2):void");
    }

    final synchronized void e(String str, y60 y60Var) {
        if (this.f15780a.containsKey(str)) {
            return;
        }
        try {
            this.f15780a.put(str, new tn1(str, y60Var.n(), y60Var.q(), true));
        } catch (Throwable unused) {
        }
    }
}
