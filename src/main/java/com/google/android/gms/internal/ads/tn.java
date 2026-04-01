package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f15166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15170e;

    private tn(InputStream inputStream, boolean z7, boolean z8, long j8, boolean z9) {
        this.f15166a = inputStream;
        this.f15167b = z7;
        this.f15168c = z8;
        this.f15169d = j8;
        this.f15170e = z9;
    }

    public static tn b(InputStream inputStream, boolean z7, boolean z8, long j8, boolean z9) {
        return new tn(inputStream, z7, z8, j8, z9);
    }

    public final long a() {
        return this.f15169d;
    }

    public final InputStream c() {
        return this.f15166a;
    }

    public final boolean d() {
        return this.f15167b;
    }

    public final boolean e() {
        return this.f15170e;
    }

    public final boolean f() {
        return this.f15168c;
    }
}
