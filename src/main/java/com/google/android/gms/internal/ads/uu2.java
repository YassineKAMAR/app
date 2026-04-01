package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uu2 implements su2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15878a;

    public uu2(String str) {
        this.f15878a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uu2) {
            return this.f15878a.equals(((uu2) obj).f15878a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15878a.hashCode();
    }

    public final String toString() {
        return this.f15878a;
    }
}
