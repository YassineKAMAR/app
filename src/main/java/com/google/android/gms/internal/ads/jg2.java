package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class jg2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f9610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f9611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageInfo f9612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2.x1 f9613d;

    public jg2(lg3 lg3Var, ts2 ts2Var, PackageInfo packageInfo, j2.x1 x1Var) {
        this.f9610a = lg3Var;
        this.f9611b = ts2Var;
        this.f9612c = packageInfo;
        this.f9613d = x1Var;
    }

    public static /* synthetic */ kg2 a(final jg2 jg2Var) {
        final ArrayList arrayList = jg2Var.f9611b.f15305g;
        return arrayList == null ? new kg2() { // from class: com.google.android.gms.internal.ads.gg2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
            }
        } : arrayList.isEmpty() ? new kg2() { // from class: com.google.android.gms.internal.ads.hg2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new kg2() { // from class: com.google.android.gms.internal.ads.ig2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                this.f9179a.b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jg2.b(java.util.ArrayList, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f9610a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.fg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jg2.a(this.f7752a);
            }
        });
    }
}
