package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8709a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8710b;

    public final int a() {
        return this.f8710b;
    }

    public final int b() {
        return this.f8709a;
    }

    public final void c(dc dcVar) throws dc {
        int i8 = this.f8710b + 1;
        this.f8710b = i8;
        int i9 = this.f8709a;
        this.f8709a = i9 + i9;
        if (i8 > 1) {
            throw dcVar;
        }
    }
}
