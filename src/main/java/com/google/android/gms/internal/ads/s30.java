package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f14502a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f14503b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c40 f14504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c40 f14505d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final c40 a(Context context, wg0 wg0Var, ty2 ty2Var) {
        c40 c40Var;
        synchronized (this.f14502a) {
            if (this.f14504c == null) {
                this.f14504c = new c40(c(context), wg0Var, (String) h2.y.c().b(ns.f12021a), ty2Var);
            }
            c40Var = this.f14504c;
        }
        return c40Var;
    }

    public final c40 b(Context context, wg0 wg0Var, ty2 ty2Var) {
        c40 c40Var;
        synchronized (this.f14503b) {
            if (this.f14505d == null) {
                this.f14505d = new c40(c(context), wg0Var, (String) tu.f15331b.e(), ty2Var);
            }
            c40Var = this.f14505d;
        }
        return c40Var;
    }
}
