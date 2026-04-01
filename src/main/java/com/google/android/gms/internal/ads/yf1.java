package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class yf1 extends sv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg1 f17751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g3.a f17752b;

    public yf1(qg1 qg1Var) {
        this.f17751a = qg1Var;
    }

    private static float O5(g3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) g3.b.H0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final void b0(g3.a aVar) {
        this.f17752b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final float m() {
        if (!((Boolean) h2.y.c().b(ns.f12100i6)).booleanValue()) {
            return 0.0f;
        }
        if (this.f17751a.O() != 0.0f) {
            return this.f17751a.O();
        }
        if (this.f17751a.W() != null) {
            try {
                return this.f17751a.W().m();
            } catch (RemoteException e8) {
                qg0.e("Remote exception getting video controller aspect ratio.", e8);
                return 0.0f;
            }
        }
        g3.a aVar = this.f17752b;
        if (aVar != null) {
            return O5(aVar);
        }
        wv wvVarZ = this.f17751a.Z();
        if (wvVarZ == null) {
            return 0.0f;
        }
        float fP = (wvVarZ.p() == -1 || wvVarZ.l() == -1) ? 0.0f : wvVarZ.p() / wvVarZ.l();
        return fP == 0.0f ? O5(wvVarZ.n()) : fP;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final float n() {
        if (((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue() && this.f17751a.W() != null) {
            return this.f17751a.W().n();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final h2.p2 o() {
        if (((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue()) {
            return this.f17751a.W();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final float q() {
        if (((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue() && this.f17751a.W() != null) {
            return this.f17751a.W().q();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final g3.a r() {
        g3.a aVar = this.f17752b;
        if (aVar != null) {
            return aVar;
        }
        wv wvVarZ = this.f17751a.Z();
        if (wvVarZ == null) {
            return null;
        }
        return wvVarZ.n();
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final boolean s() {
        if (((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue()) {
            return this.f17751a.G();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final void t5(dx dxVar) {
        if (((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue() && (this.f17751a.W() instanceof bn0)) {
            ((bn0) this.f17751a.W()).U5(dxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.tv
    public final boolean u() {
        return ((Boolean) h2.y.c().b(ns.f12109j6)).booleanValue() && this.f17751a.W() != null;
    }
}
