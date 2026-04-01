package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final lg3 f17319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f17320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final kn f17321c;

    public xk2(kn knVar, lg3 lg3Var, Context context) {
        this.f17321c = knVar;
        this.f17319a = lg3Var;
        this.f17320b = context;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f17319a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.wk2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new yk2(new JSONObject());
            }
        });
    }
}
