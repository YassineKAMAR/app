package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f20427d;

    private r4(String str, String str2, Bundle bundle, long j8) {
        this.f20424a = str;
        this.f20425b = str2;
        this.f20427d = bundle == null ? new Bundle() : bundle;
        this.f20426c = j8;
    }

    public static r4 b(d0 d0Var) {
        return new r4(d0Var.f19888a, d0Var.f19890c, d0Var.f19889b.p(), d0Var.f19891d);
    }

    public final d0 a() {
        return new d0(this.f20424a, new z(new Bundle(this.f20427d)), this.f20425b, this.f20426c);
    }

    public final String toString() {
        return "origin=" + this.f20425b + ",name=" + this.f20424a + ",params=" + String.valueOf(this.f20427d);
    }
}
