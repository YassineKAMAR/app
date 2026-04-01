package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
final class w9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ s9 f20651a;

    w9(s9 s9Var) {
        this.f20651a = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v8.K(this.f20651a.f20489c, new ComponentName(this.f20651a.f20489c.j(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
