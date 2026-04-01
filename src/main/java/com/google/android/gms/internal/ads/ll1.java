package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ll1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ll1 f10770e = new ll1(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10774d;

    public ll1(int i8, int i9, int i10) {
        this.f10771a = i8;
        this.f10772b = i9;
        this.f10773c = i10;
        this.f10774d = nz2.f(i10) ? nz2.x(i10, i9) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return this.f10771a == ll1Var.f10771a && this.f10772b == ll1Var.f10772b && this.f10773c == ll1Var.f10773c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10771a), Integer.valueOf(this.f10772b), Integer.valueOf(this.f10773c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f10771a + ", channelCount=" + this.f10772b + ", encoding=" + this.f10773c + "]";
    }
}
