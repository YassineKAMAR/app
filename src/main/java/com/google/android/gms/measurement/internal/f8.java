package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class f8 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f20016a;

    f8(b7 b7Var) {
        this.f20016a = b7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.f8 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f8.a(com.google.android.gms.measurement.internal.f8, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.b7 r0 = r8.f20016a     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            com.google.android.gms.measurement.internal.n4 r0 = r0.t()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            com.google.android.gms.measurement.internal.p4 r0 = r0.K()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            java.lang.String r1 = "onActivityCreated"
            r0.a(r1)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r0 != 0) goto L1f
        L15:
            com.google.android.gms.measurement.internal.b7 r0 = r8.f20016a
            com.google.android.gms.measurement.internal.o8 r0 = r0.q()
            r0.F(r9, r10)
            return
        L1f:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r1 == 0) goto L2c
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r2 == 0) goto L2c
            goto L44
        L2c:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r1 == 0) goto L43
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r2 != 0) goto L43
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            goto L44
        L43:
            r1 = 0
        L44:
            r5 = r1
            if (r5 == 0) goto L15
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r1 != 0) goto L4e
            goto L15
        L4e:
            com.google.android.gms.measurement.internal.b7 r1 = r8.f20016a     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            r1.f()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            boolean r0 = com.google.android.gms.measurement.internal.ib.e0(r0)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r0 == 0) goto L5c
            java.lang.String r0 = "gs"
            goto L5e
        L5c:
            java.lang.String r0 = "auto"
        L5e:
            r6 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            if (r10 != 0) goto L6a
            r0 = 1
            r4 = 1
            goto L6c
        L6a:
            r0 = 0
            r4 = 0
        L6c:
            com.google.android.gms.measurement.internal.b7 r0 = r8.f20016a     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            com.google.android.gms.measurement.internal.q5 r0 = r0.u()     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            com.google.android.gms.measurement.internal.i8 r1 = new com.google.android.gms.measurement.internal.i8     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            r0.D(r1)     // Catch: java.lang.Throwable -> L7d java.lang.RuntimeException -> L7f
            goto L15
        L7d:
            r0 = move-exception
            goto L90
        L7f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b7 r1 = r8.f20016a     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.measurement.internal.n4 r1 = r1.t()     // Catch: java.lang.Throwable -> L7d
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.b(r2, r0)     // Catch: java.lang.Throwable -> L7d
            goto L15
        L90:
            com.google.android.gms.measurement.internal.b7 r1 = r8.f20016a
            com.google.android.gms.measurement.internal.o8 r1 = r1.q()
            r1.F(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f8.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f20016a.q().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f20016a.q().Q(activity);
        da daVarS = this.f20016a.s();
        daVarS.u().D(new ea(daVarS, daVarS.k().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        da daVarS = this.f20016a.s();
        daVarS.u().D(new ga(daVarS, daVarS.k().b()));
        this.f20016a.q().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f20016a.q().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
