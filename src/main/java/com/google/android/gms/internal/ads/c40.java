package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final j2.f0 f6145b = new z30();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final j2.f0 f6146c = new a40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n30 f6147a;

    public c40(Context context, wg0 wg0Var, String str, ty2 ty2Var) {
        this.f6147a = new n30(context, wg0Var, str, f6145b, f6146c, ty2Var);
    }

    public final r30 a(String str, u30 u30Var, t30 t30Var) {
        return new g40(this.f6147a, str, u30Var, t30Var);
    }

    public final l40 b() {
        return new l40(this.f6147a);
    }
}
