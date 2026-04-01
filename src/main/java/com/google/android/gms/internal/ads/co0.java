package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class co0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wg0 f6408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f6410c;

    public final co0 c(Context context) {
        this.f6410c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f6409b = context;
        return this;
    }

    public final co0 d(wg0 wg0Var) {
        this.f6408a = wg0Var;
        return this;
    }
}
