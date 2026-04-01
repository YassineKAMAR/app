package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class gu1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8508a;

    public gu1(int i8) {
        this.f8508a = i8;
    }

    public gu1(int i8, String str) {
        super(str);
        this.f8508a = i8;
    }

    public gu1(int i8, String str, Throwable th) {
        super(str, th);
        this.f8508a = 1;
    }

    public final int a() {
        return this.f8508a;
    }
}
