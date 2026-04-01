package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final class h4<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f20046h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g4<V> f20048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f20049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V f20050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f20051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile V f20052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile V f20053g;

    private h4(String str, V v7, V v8, g4<V> g4Var) {
        this.f20051e = new Object();
        this.f20052f = null;
        this.f20053g = null;
        this.f20047a = str;
        this.f20049c = v7;
        this.f20050d = v8;
        this.f20048b = g4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20051e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.e r4 = com.google.android.gms.measurement.internal.f4.f20006a
            if (r4 != 0) goto Le
            V r4 = r3.f20049c
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h4.f20046h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.e.a()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L22
            V r0 = r3.f20053g     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L1e
            V r0 = r3.f20049c     // Catch: java.lang.Throwable -> L6b
            goto L20
        L1e:
            V r0 = r3.f20053g     // Catch: java.lang.Throwable -> L6b
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            return r0
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            java.util.List r4 = com.google.android.gms.measurement.internal.e0.z0()     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            com.google.android.gms.measurement.internal.h4 r0 = (com.google.android.gms.measurement.internal.h4) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = com.google.android.gms.measurement.internal.e.a()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            com.google.android.gms.measurement.internal.g4<V> r2 = r0.f20048b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.j()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.h4.f20046h     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f20053g = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
        L59:
            com.google.android.gms.measurement.internal.g4<V> r4 = r3.f20048b
            if (r4 != 0) goto L60
            V r4 = r3.f20049c
            return r4
        L60:
            java.lang.Object r4 = r4.j()     // Catch: java.lang.IllegalStateException -> L65 java.lang.SecurityException -> L68
            return r4
        L65:
            V r4 = r3.f20049c
            return r4
        L68:
            V r4 = r3.f20049c
            return r4
        L6b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r4
        L70:
            r4 = move-exception
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h4.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f20047a;
    }
}
