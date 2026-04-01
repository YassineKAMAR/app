package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6241e;

    public ca(int i8, int i9, int i10) {
        String str;
        if (i8 != Integer.MIN_VALUE) {
            str = i8 + "/";
        } else {
            str = "";
        }
        this.f6237a = str;
        this.f6238b = i9;
        this.f6239c = i10;
        this.f6240d = Integer.MIN_VALUE;
        this.f6241e = "";
    }

    private final void d() {
        if (this.f6240d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.f6240d;
    }

    public final String b() {
        d();
        return this.f6241e;
    }

    public final void c() {
        int i8 = this.f6240d;
        int i9 = i8 == Integer.MIN_VALUE ? this.f6238b : i8 + this.f6239c;
        this.f6240d = i9;
        this.f6241e = this.f6237a + i9;
    }
}
