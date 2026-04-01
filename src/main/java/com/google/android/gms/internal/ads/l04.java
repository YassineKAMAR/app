package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class l04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10409b;

    l04(Object obj, int i8) {
        this.f10408a = obj;
        this.f10409b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l04)) {
            return false;
        }
        l04 l04Var = (l04) obj;
        return this.f10408a == l04Var.f10408a && this.f10409b == l04Var.f10409b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f10408a) * 65535) + this.f10409b;
    }
}
