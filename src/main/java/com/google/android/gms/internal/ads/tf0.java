package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class tf0 extends j2.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zf0 f15079c;

    tf0(zf0 zf0Var) {
        this.f15079c = zf0Var;
    }

    @Override // j2.b0
    public final void a() {
        zf0 zf0Var = this.f15079c;
        ts tsVar = new ts(zf0Var.f18186e, zf0Var.f18187f.f16723a);
        synchronized (this.f15079c.f18182a) {
            try {
                g2.t.g();
                ws.a(this.f15079c.f18189h, tsVar);
            } catch (IllegalArgumentException e8) {
                qg0.h("Cannot config CSI reporter.", e8);
            }
        }
    }
}
