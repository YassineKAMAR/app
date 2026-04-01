package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class u6 extends v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20529b;

    u6(w5 w5Var) {
        super(w5Var);
        this.f20556a.i();
    }

    protected final void l() {
        if (!o()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f20529b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (q()) {
            return;
        }
        this.f20556a.R();
        this.f20529b = true;
    }

    public final void n() {
        if (this.f20529b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f20556a.R();
        this.f20529b = true;
    }

    final boolean o() {
        return this.f20529b;
    }

    protected abstract boolean q();

    protected void r() {
    }
}
