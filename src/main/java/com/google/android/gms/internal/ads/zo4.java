package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18309b;

    public zo4(long j8, long j9) {
        this.f18308a = j8;
        this.f18309b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo4)) {
            return false;
        }
        zo4 zo4Var = (zo4) obj;
        return this.f18308a == zo4Var.f18308a && this.f18309b == zo4Var.f18309b;
    }

    public final int hashCode() {
        return (((int) this.f18308a) * 31) + ((int) this.f18309b);
    }
}
