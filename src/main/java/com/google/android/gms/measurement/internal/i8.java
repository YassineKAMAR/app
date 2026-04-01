package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
final class i8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f20118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f20119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f20121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ f8 f20122e;

    i8(f8 f8Var, boolean z7, Uri uri, String str, String str2) {
        this.f20122e = f8Var;
        this.f20118a = z7;
        this.f20119b = uri;
        this.f20120c = str;
        this.f20121d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f8.a(this.f20122e, this.f20118a, this.f20119b, this.f20120c, this.f20121d);
    }
}
