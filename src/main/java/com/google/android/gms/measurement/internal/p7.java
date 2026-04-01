package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class p7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f20357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Bundle f20358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f20359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f20360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f20361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f20362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ b7 f20363i;

    p7(b7 b7Var, String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f20363i = b7Var;
        this.f20355a = str;
        this.f20356b = str2;
        this.f20357c = j8;
        this.f20358d = bundle;
        this.f20359e = z7;
        this.f20360f = z8;
        this.f20361g = z9;
        this.f20362h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20363i.T(this.f20355a, this.f20356b, this.f20357c, this.f20358d, this.f20359e, this.f20360f, this.f20361g, this.f20362h);
    }
}
