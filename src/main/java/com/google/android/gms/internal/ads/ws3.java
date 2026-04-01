package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ws3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ws3 f16937b = new us3().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16938a;

    public final Map a() {
        return this.f16938a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ws3) {
            return this.f16938a.equals(((ws3) obj).f16938a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16938a.hashCode();
    }

    public final String toString() {
        return this.f16938a.toString();
    }
}
