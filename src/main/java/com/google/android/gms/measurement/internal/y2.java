package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class y2 extends z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20694b;

    y2(w5 w5Var) {
        super(w5Var);
        this.f20556a.i();
    }

    protected abstract boolean A();

    protected final void v() {
        if (!z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f20694b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        this.f20556a.R();
        this.f20694b = true;
    }

    public final void x() {
        if (this.f20694b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        y();
        this.f20556a.R();
        this.f20694b = true;
    }

    protected void y() {
    }

    final boolean z() {
        return this.f20694b;
    }
}
