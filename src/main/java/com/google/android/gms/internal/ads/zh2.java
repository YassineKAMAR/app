package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zh2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final se0 f18237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f18238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f18239c;

    public zh2(se0 se0Var, lg3 lg3Var, Context context) {
        this.f18237a = se0Var;
        this.f18238b = lg3Var;
        this.f18239c = context;
    }

    final /* synthetic */ ai2 a() {
        if (!this.f18237a.z(this.f18239c)) {
            return new ai2(null, null, null, null, null);
        }
        String strJ = this.f18237a.j(this.f18239c);
        String str = strJ == null ? "" : strJ;
        String strH = this.f18237a.h(this.f18239c);
        String str2 = strH == null ? "" : strH;
        String strF = this.f18237a.f(this.f18239c);
        String str3 = strF == null ? "" : strF;
        String strG = this.f18237a.g(this.f18239c);
        return new ai2(str, str2, str3, strG == null ? "" : strG, "TIME_OUT".equals(str2) ? (Long) h2.y.c().b(ns.f12067f0) : null);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f18238b.Z(new Callable() { // from class: com.google.android.gms.internal.ads.yh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17768a.a();
            }
        });
    }
}
