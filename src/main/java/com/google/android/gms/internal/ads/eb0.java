package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class eb0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f7245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb0 f7246b;

    eb0(gb0 gb0Var, Context context) {
        this.f7246b = gb0Var;
        this.f7245a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.gb0 r0 = r6.f7246b
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.gb0.a(r0)
            android.content.Context r1 = r6.f7245a
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.fb0 r0 = (com.google.android.gms.internal.ads.fb0) r0
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ut r1 = com.google.android.gms.internal.ads.yt.f17919a
            java.lang.Object r1 = r1.e()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = r0.f7707a
            long r3 = r3 + r1
            e3.e r1 = g2.t.b()
            long r1 = r1.a()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L2c
            goto L3a
        L2c:
            android.content.Context r1 = r6.f7245a
            com.google.android.gms.internal.ads.db0 r0 = r0.f7708b
            com.google.android.gms.internal.ads.cb0 r2 = new com.google.android.gms.internal.ads.cb0
            r2.<init>(r1, r0)
            com.google.android.gms.internal.ads.db0 r0 = r2.a()
            goto L45
        L3a:
            android.content.Context r0 = r6.f7245a
            com.google.android.gms.internal.ads.cb0 r1 = new com.google.android.gms.internal.ads.cb0
            r1.<init>(r0)
            com.google.android.gms.internal.ads.db0 r0 = r1.a()
        L45:
            com.google.android.gms.internal.ads.gb0 r1 = r6.f7246b
            android.content.Context r2 = r6.f7245a
            java.util.WeakHashMap r3 = com.google.android.gms.internal.ads.gb0.a(r1)
            com.google.android.gms.internal.ads.fb0 r4 = new com.google.android.gms.internal.ads.fb0
            r4.<init>(r1, r0)
            r3.put(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eb0.call():java.lang.Object");
    }
}
