package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m03 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final m03 f11113b = new m03();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11114a;

    private m03() {
    }

    public static m03 b() {
        return f11113b;
    }

    public final Context a() {
        return this.f11114a;
    }

    public final void c(Context context) {
        this.f11114a = context != null ? context.getApplicationContext() : null;
    }
}
