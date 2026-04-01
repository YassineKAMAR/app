package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class km2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f10165a;

    public km2(lg3 lg3Var) {
        this.f10165a = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f10165a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.jm2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) h2.y.c().b(ns.K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) h2.y.c().b(ns.L)).intValue()) {
                        for (String str2 : str.split(com.amazon.a.a.o.b.f.f3942a, -1)) {
                            map.put(str2, j2.s1.a(str2));
                        }
                    }
                }
                return new lm2(map);
            }
        });
    }
}
