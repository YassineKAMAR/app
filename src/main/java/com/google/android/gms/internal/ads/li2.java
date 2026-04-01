package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class li2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f10735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10736b;

    li2(lg3 lg3Var, Context context) {
        this.f10735a = lg3Var;
        this.f10736b = context;
    }

    final /* synthetic */ ni2 a() {
        final Bundle bundleB = j2.e.b(this.f10736b, (String) h2.y.c().b(ns.f12037b6));
        if (bundleB.isEmpty()) {
            return null;
        }
        return new ni2() { // from class: com.google.android.gms.internal.ads.ki2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", bundleB);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f10735a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.ji2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9639a.a();
            }
        });
    }
}
