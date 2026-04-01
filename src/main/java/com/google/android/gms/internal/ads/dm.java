package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f6804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f6805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f6806c;

    dm(long j8, String str, int i8) {
        this.f6804a = j8;
        this.f6805b = str;
        this.f6806c = i8;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dm)) {
            dm dmVar = (dm) obj;
            if (dmVar.f6804a == this.f6804a && dmVar.f6806c == this.f6806c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f6804a;
    }
}
