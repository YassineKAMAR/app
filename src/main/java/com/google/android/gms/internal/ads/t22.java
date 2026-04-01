package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes.dex */
public final class t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0.a f14922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14923b;

    t22(Context context) {
        this.f14923b = context;
    }

    public final x3.d a() {
        j0.a aVarA = j0.a.a(this.f14923b);
        this.f14922a = aVarA;
        return aVarA == null ? zf3.g(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.b();
    }

    public final x3.d b(Uri uri, InputEvent inputEvent) {
        j0.a aVar = this.f14922a;
        aVar.getClass();
        return aVar.c(uri, inputEvent);
    }
}
