package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile u3.g<Boolean> f18945a = u3.g.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f18946b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: all -> 0x0098, TryCatch #0 {, blocks: (B:12:0x003c, B:14:0x0044, B:15:0x0050, B:17:0x0052, B:31:0x0085, B:34:0x008c, B:35:0x0096, B:20:0x0061, B:24:0x0071, B:26:0x0077), top: B:40:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r6, android.net.Uri r7) {
        /*
            java.lang.String r7 = r7.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r7)
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.String r6 = "PhenotypeClientHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r6, r7)
            return r1
        L24:
            u3.g<java.lang.Boolean> r7 = com.google.android.gms.internal.measurement.m6.f18945a
            boolean r7 = r7.c()
            if (r7 == 0) goto L39
        L2c:
            u3.g<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.m6.f18945a
            java.lang.Object r6 = r6.b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L39:
            java.lang.Object r7 = com.google.android.gms.internal.measurement.m6.f18946b
            monitor-enter(r7)
            u3.g<java.lang.Boolean> r0 = com.google.android.gms.internal.measurement.m6.f18945a     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L52
            u3.g<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.m6.f18945a     // Catch: java.lang.Throwable -> L98
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L98
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L98
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            return r6
        L52:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r6.getPackageName()     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L98
            r2 = 1
            if (r0 == 0) goto L61
        L5f:
            r0 = 1
            goto L83
        L61:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "com.google.android.gms.phenotype"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L98
            r5 = 29
            if (r4 >= r5) goto L6f
            r4 = 0
            goto L71
        L6f:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L71:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r3, r4)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L82
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L98
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L82
            goto L5f
        L82:
            r0 = 0
        L83:
            if (r0 == 0) goto L8c
            boolean r6 = a(r6)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L8c
            r1 = 1
        L8c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L98
            u3.g r6 = u3.g.d(r6)     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.m6.f18945a = r6     // Catch: java.lang.Throwable -> L98
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            goto L2c
        L98:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L98
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m6.b(android.content.Context, android.net.Uri):boolean");
    }
}
