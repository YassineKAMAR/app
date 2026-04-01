package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class el2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final lg3 f7420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f7421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final lf0 f7422c;

    public el2(lf0 lf0Var, lg3 lg3Var, String str) {
        this.f7422c = lf0Var;
        this.f7420a = lg3Var;
        this.f7421b = str;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        final x3.d dVarH = zf3.h(null);
        if (((Boolean) h2.y.c().b(ns.L5)).booleanValue()) {
            dVarH = zf3.h(null);
        }
        final x3.d dVarH2 = zf3.h(null);
        return zf3.c(dVarH, dVarH2).a(new Callable() { // from class: com.google.android.gms.internal.ads.dl2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new fl2((String) dVarH.get(), (String) dVarH2.get());
            }
        }, eh0.f7322a);
    }
}
