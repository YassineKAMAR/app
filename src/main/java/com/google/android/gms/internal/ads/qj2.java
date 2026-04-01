package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qj2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageInfo f13532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final of0 f13533d;

    public qj2(of0 of0Var, Executor executor, String str, PackageInfo packageInfo, int i8) {
        this.f13533d = of0Var;
        this.f13530a = executor;
        this.f13531b = str;
        this.f13532c = packageInfo;
    }

    final /* synthetic */ x3.d a(Throwable th) {
        return zf3.h(new rj2(this.f13531b));
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.f(zf3.m(zf3.h(this.f13531b), new z73() { // from class: com.google.android.gms.internal.ads.oj2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return new rj2((String) obj);
            }
        }, this.f13530a), Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.pj2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f12910a.a((Throwable) obj);
            }
        }, this.f13530a);
    }
}
