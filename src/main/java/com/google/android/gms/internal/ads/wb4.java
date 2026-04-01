package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
final class wb4 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f, ih4, xo4, tl4, y94, t94, ka4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bc4 f16679a;

    /* synthetic */ wb4(bc4 bc4Var, vb4 vb4Var) {
        this.f16679a = bc4Var;
    }

    @Override // com.google.android.gms.internal.ads.ka4
    public final void a(boolean z7) {
        this.f16679a.n0();
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void b(final boolean z7) {
        bc4 bc4Var = this.f16679a;
        if (bc4Var.V == z7) {
            return;
        }
        bc4Var.V = z7;
        mc2 mc2Var = this.f16679a.f5736k;
        mc2Var.d(23, new j92() { // from class: com.google.android.gms.internal.ads.sb4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ir0) obj).Y(z7);
            }
        });
        mc2Var.c();
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void c(Exception exc) {
        this.f16679a.f5742q.U(exc);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void c0(String str) {
        this.f16679a.f5742q.m(str);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void d(String str, long j8, long j9) {
        this.f16679a.f5742q.N(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void d0(ba4 ba4Var) {
        this.f16679a.f5742q.J(ba4Var);
        this.f16679a.J = null;
        this.f16679a.Q = null;
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void e(Exception exc) {
        this.f16679a.f5742q.T(exc);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void e0(nb nbVar, ca4 ca4Var) {
        this.f16679a.J = nbVar;
        this.f16679a.f5742q.Q(nbVar, ca4Var);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void f(nb nbVar, ca4 ca4Var) {
        this.f16679a.K = nbVar;
        this.f16679a.f5742q.k(nbVar, ca4Var);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void f0(int i8, long j8) {
        this.f16679a.f5742q.G(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void g(int i8, long j8, long j9) {
        this.f16679a.f5742q.M(i8, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void g0(long j8, int i8) {
        this.f16679a.f5742q.A(j8, i8);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void h(String str) {
        this.f16679a.f5742q.I(str);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void h0(ba4 ba4Var) {
        this.f16679a.Q = ba4Var;
        this.f16679a.f5742q.x(ba4Var);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void i(ba4 ba4Var) {
        this.f16679a.R = ba4Var;
        this.f16679a.f5742q.f(ba4Var);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void i0(final jj1 jj1Var) {
        this.f16679a.f5720a0 = jj1Var;
        mc2 mc2Var = this.f16679a.f5736k;
        mc2Var.d(25, new j92() { // from class: com.google.android.gms.internal.ads.tb4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                ((ir0) obj).e(jj1Var);
            }
        });
        mc2Var.c();
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void j(ba4 ba4Var) {
        this.f16679a.f5742q.l(ba4Var);
        this.f16679a.K = null;
        this.f16679a.R = null;
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void j0(Exception exc) {
        this.f16679a.f5742q.u(exc);
    }

    @Override // com.google.android.gms.internal.ads.ih4
    public final void k(long j8) {
        this.f16679a.f5742q.a(j8);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void k0(String str, long j8, long j9) {
        this.f16679a.f5742q.q(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.f
    public final void l0(Object obj, long j8) {
        this.f16679a.f5742q.s(obj, j8);
        bc4 bc4Var = this.f16679a;
        if (bc4Var.M == obj) {
            mc2 mc2Var = bc4Var.f5736k;
            mc2Var.d(26, new j92() { // from class: com.google.android.gms.internal.ads.ub4
                @Override // com.google.android.gms.internal.ads.j92
                public final void a(Object obj2) {
                }
            });
            mc2Var.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        bc4.P(this.f16679a, surfaceTexture);
        this.f16679a.g0(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f16679a.j0(null);
        this.f16679a.g0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f16679a.g0(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f16679a.g0(i9, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f16679a.g0(0, 0);
    }
}
