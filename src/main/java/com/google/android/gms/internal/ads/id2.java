package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class id2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zf0 f9158b;

    id2(Executor executor, zf0 zf0Var) {
        this.f9157a = executor;
        this.f9158b = zf0Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if (((Boolean) h2.y.c().b(ns.f12235y2)).booleanValue()) {
            return zf3.h(null);
        }
        zf0 zf0Var = this.f9158b;
        return zf3.m(zf0Var.j(), new z73() { // from class: com.google.android.gms.internal.ads.hd2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ni2() { // from class: com.google.android.gms.internal.ads.gd2
                    @Override // com.google.android.gms.internal.ads.ni2
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f9157a);
    }
}
