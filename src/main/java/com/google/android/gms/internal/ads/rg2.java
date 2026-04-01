package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f14116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f14118c;

    public rg2(lg3 lg3Var, Context context, Set set) {
        this.f14116a = lg3Var;
        this.f14117b = context;
        this.f14118c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.sg2 a() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.S4
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.Z4
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.f14118c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r0 = r3.f14117b
            com.google.android.gms.internal.ads.sg2 r1 = new com.google.android.gms.internal.ads.sg2
            com.google.android.gms.internal.ads.q22 r2 = g2.t.a()
            java.lang.String r0 = r2.h(r0)
            r1.<init>(r0)
            return r1
        L56:
            com.google.android.gms.internal.ads.sg2 r0 = new com.google.android.gms.internal.ads.sg2
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rg2.a():com.google.android.gms.internal.ads.sg2");
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f14116a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.pg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12866a.a();
            }
        });
    }
}
