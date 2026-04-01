package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class ua extends ra {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20536c;

    ua(va vaVar) {
        super(vaVar);
        this.f20461b.r0();
    }

    protected final void s() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f20536c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.f20461b.q0();
        this.f20536c = true;
    }

    final boolean w() {
        return this.f20536c;
    }

    protected abstract boolean x();
}
