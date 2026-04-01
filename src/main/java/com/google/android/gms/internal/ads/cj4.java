package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class cj4 implements lh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj4 f6382a;

    /* synthetic */ cj4(dj4 dj4Var, bj4 bj4Var) {
        this.f6382a = dj4Var;
    }

    @Override // com.google.android.gms.internal.ads.lh4
    public final void a(Exception exc) {
        pf2.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f6382a.P0.b(exc);
    }

    @Override // com.google.android.gms.internal.ads.lh4
    public final void k() {
        dj4 dj4Var = this.f6382a;
        if (dj4Var.Y0 != null) {
            dj4Var.Y0.k();
        }
    }
}
