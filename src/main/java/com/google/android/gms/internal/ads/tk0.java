package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends pk0 {
    public tk0(dj0 dj0Var) {
        super(dj0Var);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final boolean u(String str) {
        String strI = jg0.i(str);
        dj0 dj0Var = (dj0) this.f12920c.get();
        if (dj0Var != null && strI != null) {
            dj0Var.y(strI, this);
        }
        qg0.g("VideoStreamNoopCache is doing nothing.");
        k(str, strI, "noop", "Noop cache is a noop.");
        return false;
    }
}
