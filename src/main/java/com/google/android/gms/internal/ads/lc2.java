package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lc2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x3.d f10585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f10586b;

    public lc2(x3.d dVar, Executor executor) {
        this.f10585a = dVar;
        this.f10586b = executor;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.n(this.f10585a, new gf3() { // from class: com.google.android.gms.internal.ads.kc2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                final String str = (String) obj;
                return zf3.h(new ni2() { // from class: com.google.android.gms.internal.ads.jc2
                    @Override // com.google.android.gms.internal.ads.ni2
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f10586b);
    }
}
