package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class f43 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7624a;

    public f43(int i8, String str) {
        super(str);
        this.f7624a = i8;
    }

    public f43(int i8, Throwable th) {
        super(th);
        this.f7624a = i8;
    }

    public final int a() {
        return this.f7624a;
    }
}
