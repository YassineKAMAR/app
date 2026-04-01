package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ol2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f12535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final u80 f12536c;

    public ol2(u80 u80Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f12536c = u80Var;
        this.f12534a = scheduledExecutorService;
        this.f12535b = context;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.m(zf3.o(zf3.h(new Bundle()), ((Long) h2.y.c().b(ns.V3)).longValue(), TimeUnit.MILLISECONDS, this.f12534a), new z73() { // from class: com.google.android.gms.internal.ads.nl2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return new pl2((Bundle) obj);
            }
        }, eh0.f7322a);
    }
}
