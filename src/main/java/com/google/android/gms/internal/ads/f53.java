package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7628b;

    public f53() {
        this.f7627a = null;
        this.f7628b = -1L;
    }

    public f53(String str, long j8) {
        this.f7627a = str;
        this.f7628b = j8;
    }

    public final long a() {
        return this.f7628b;
    }

    public final String b() {
        return this.f7627a;
    }

    public final boolean c() {
        return this.f7627a != null && this.f7628b >= 0;
    }
}
