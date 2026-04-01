package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class yh0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17766b;

    protected yh0(String str, Throwable th, boolean z7, int i8) {
        super(str, th);
        this.f17765a = z7;
        this.f17766b = i8;
    }

    public static yh0 a(String str, Throwable th) {
        return new yh0(str, th, true, 1);
    }

    public static yh0 b(String str, Throwable th) {
        return new yh0(str, th, true, 0);
    }

    public static yh0 c(String str) {
        return new yh0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f17765a + ", dataType=" + this.f17766b + "}";
    }
}
