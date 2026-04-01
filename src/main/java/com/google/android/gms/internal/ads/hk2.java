package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg3 f8809c;

    public hk2(ab0 ab0Var, Context context, String str, lg3 lg3Var) {
        this.f8807a = context;
        this.f8808b = str;
        this.f8809c = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f8809c.Z(new Callable() { // from class: com.google.android.gms.internal.ads.gk2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ik2(new JSONObject());
            }
        });
    }
}
