package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4493a;

    /* synthetic */ c0(j1.l0 l0Var) {
    }

    public final c0 a() {
        this.f4493a = true;
        return this;
    }

    public final d0 b() {
        if (this.f4493a) {
            return new d0(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
