package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class u94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s94 f15583b;

    public u94(Context context, Handler handler, t94 t94Var) {
        this.f15582a = context.getApplicationContext();
        this.f15583b = new s94(this, handler, t94Var);
    }
}
