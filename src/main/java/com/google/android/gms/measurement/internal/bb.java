package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class bb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f19842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f19843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f19844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ cb f19845d;

    bb(cb cbVar, String str, String str2, Bundle bundle) {
        this.f19845d = cbVar;
        this.f19842a = str;
        this.f19843b = str2;
        this.f19844c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19845d.f19876a.s((d0) a3.o.j(this.f19845d.f19876a.n0().G(this.f19842a, this.f19843b, this.f19844c, "auto", this.f19845d.f19876a.k().a(), false, true)), this.f19842a);
    }
}
