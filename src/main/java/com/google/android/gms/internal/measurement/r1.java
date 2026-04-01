package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f19110a;

    public r1(Looper looper) {
        super(looper);
        this.f19110a = Looper.getMainLooper();
    }
}
