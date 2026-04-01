package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i01 implements i2.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o51 f9028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9029b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9030c = new AtomicBoolean(false);

    public i01(o51 o51Var) {
        this.f9028a = o51Var;
    }

    private final void b() {
        if (this.f9030c.get()) {
            return;
        }
        this.f9030c.set(true);
        this.f9028a.j();
    }

    @Override // i2.u
    public final void G5() {
        this.f9028a.l();
    }

    public final boolean a() {
        return this.f9029b.get();
    }

    @Override // i2.u
    public final void h5() {
    }

    @Override // i2.u
    public final void k0() {
        b();
    }

    @Override // i2.u
    public final void q3() {
    }

    @Override // i2.u
    public final void v0(int i8) {
        this.f9029b.set(true);
        b();
    }

    @Override // i2.u
    public final void y4() {
    }
}
