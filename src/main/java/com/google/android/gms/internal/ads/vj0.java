package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vj0 extends ii0 implements TextureView.SurfaceTextureListener, si0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj0 f16288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ej0 f16289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cj0 f16290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hi0 f16291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Surface f16292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ti0 f16293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f16294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String[] f16295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private bj0 f16298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f16299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16304s;

    public vj0(Context context, ej0 ej0Var, dj0 dj0Var, boolean z7, boolean z8, cj0 cj0Var) {
        super(context);
        this.f16297l = 1;
        this.f16288c = dj0Var;
        this.f16289d = ej0Var;
        this.f16299n = z7;
        this.f16290e = cj0Var;
        setSurfaceTextureListener(this);
        ej0Var.a(this);
    }

    private static String T(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + exc.getMessage();
    }

    private final void U() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.H(true);
        }
    }

    private final void V() {
        if (this.f16300o) {
            return;
        }
        this.f16300o = true;
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15696a.I();
            }
        });
        v();
        this.f16289d.b();
        if (this.f16301p) {
            s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(boolean r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vj0.W(boolean, java.lang.Integer):void");
    }

    private final void X() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.H(false);
        }
    }

    private final void Y() {
        if (this.f16293h != null) {
            Z(null, true);
            ti0 ti0Var = this.f16293h;
            if (ti0Var != null) {
                ti0Var.C(null);
                this.f16293h.y();
                this.f16293h = null;
            }
            this.f16297l = 1;
            this.f16296k = false;
            this.f16300o = false;
            this.f16301p = false;
        }
    }

    private final void Z(Surface surface, boolean z7) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var == null) {
            qg0.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            ti0Var.J(surface, z7);
        } catch (IOException e8) {
            qg0.h("", e8);
        }
    }

    private final void a0() {
        b0(this.f16302q, this.f16303r);
    }

    private final void b0(int i8, int i9) {
        float f8 = i9 > 0 ? i8 / i9 : 1.0f;
        if (this.f16304s != f8) {
            this.f16304s = f8;
            requestLayout();
        }
    }

    private final boolean c0() {
        return d0() && this.f16297l != 1;
    }

    private final boolean d0() {
        ti0 ti0Var = this.f16293h;
        return (ti0Var == null || !ti0Var.M() || this.f16296k) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void A() {
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ij0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9242a.L();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void B(int i8) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.A(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void C(int i8) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.B(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void D(int i8) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.D(i8);
        }
    }

    final ti0 E(Integer num) {
        cj0 cj0Var = this.f16290e;
        dj0 dj0Var = this.f16288c;
        rl0 rl0Var = new rl0(dj0Var.getContext(), cj0Var, dj0Var, num);
        qg0.f("ExoPlayerAdapter initialized.");
        return rl0Var;
    }

    final String F() {
        dj0 dj0Var = this.f16288c;
        return g2.t.r().D(dj0Var.getContext(), dj0Var.v().f16723a);
    }

    final /* synthetic */ void G(String str) {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.b("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void H() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.j();
        }
    }

    final /* synthetic */ void I() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.n();
        }
    }

    final /* synthetic */ void J(boolean z7, long j8) {
        this.f16288c.w0(z7, j8);
    }

    final /* synthetic */ void K(String str) {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.B0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void L() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.q();
        }
    }

    final /* synthetic */ void M() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.o();
        }
    }

    final /* synthetic */ void N() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.r();
        }
    }

    final /* synthetic */ void O(int i8, int i9) {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.C0(i8, i9);
        }
    }

    final /* synthetic */ void P() {
        float fA = this.f9220b.a();
        ti0 ti0Var = this.f16293h;
        if (ti0Var == null) {
            qg0.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            ti0Var.K(fA, false);
        } catch (IOException e8) {
            qg0.h("", e8);
        }
    }

    final /* synthetic */ void Q(int i8) {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.onWindowVisibilityChanged(i8);
        }
    }

    final /* synthetic */ void R() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.p();
        }
    }

    final /* synthetic */ void S() {
        hi0 hi0Var = this.f16291f;
        if (hi0Var != null) {
            hi0Var.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void a(int i8) {
        if (this.f16297l != i8) {
            this.f16297l = i8;
            if (i8 == 3) {
                V();
                return;
            }
            if (i8 != 4) {
                return;
            }
            if (this.f16290e.f6358a) {
                X();
            }
            this.f16289d.e();
            this.f9220b.c();
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.tj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15128a.H();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void b(String str, Exception exc) {
        final String strT = T("onLoadException", exc);
        qg0.g("ExoPlayerAdapter exception: ".concat(strT));
        g2.t.q().t(exc, "AdExoPlayerView.onException");
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12907a.K(strT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void c(final boolean z7, final long j8) {
        if (this.f16288c != null) {
            eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12495a.J(z7, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void d(String str, Exception exc) {
        final String strT = T(str, exc);
        qg0.g("ExoPlayerAdapter error: ".concat(strT));
        this.f16296k = true;
        if (this.f16290e.f6358a) {
            X();
        }
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14713a.G(strT);
            }
        });
        g2.t.q().t(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void e(int i8) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.E(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.si0
    public final void f(int i8, int i9) {
        this.f16302q = i8;
        this.f16303r = i9;
        a0();
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void g(int i8) {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            ti0Var.I(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void h(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f16295j = new String[]{str};
        } else {
            this.f16295j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f16294i;
        boolean z7 = this.f16290e.f6369l && str2 != null && !str.equals(str2) && this.f16297l == 4;
        this.f16294i = str;
        W(z7, num);
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int i() {
        if (c0()) {
            return (int) this.f16293h.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int j() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            return ti0Var.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int k() {
        if (c0()) {
            return (int) this.f16293h.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int l() {
        return this.f16303r;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int m() {
        return this.f16302q;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long n() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            return ti0Var.T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long o() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            return ti0Var.r();
        }
        return -1L;
    }

    @Override // android.view.View
    protected final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f8 = this.f16304s;
        if (f8 != 0.0f && this.f16298m == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f8 > f10) {
                measuredHeight = (int) (f9 / f8);
            }
            if (f8 < f10) {
                measuredWidth = (int) (measuredHeight * f8);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        bj0 bj0Var = this.f16298m;
        if (bj0Var != null) {
            bj0Var.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        if (this.f16299n) {
            bj0 bj0Var = new bj0(getContext());
            this.f16298m = bj0Var;
            bj0Var.c(surfaceTexture, i8, i9);
            this.f16298m.start();
            SurfaceTexture surfaceTextureA = this.f16298m.a();
            if (surfaceTextureA != null) {
                surfaceTexture = surfaceTextureA;
            } else {
                this.f16298m.d();
                this.f16298m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f16292g = surface;
        if (this.f16293h == null) {
            W(false, null);
        } else {
            Z(surface, true);
            if (!this.f16290e.f6358a) {
                U();
            }
        }
        if (this.f16302q == 0 || this.f16303r == 0) {
            b0(i8, i9);
        } else {
            a0();
        }
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14154a.M();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r();
        bj0 bj0Var = this.f16298m;
        if (bj0Var != null) {
            bj0Var.d();
            this.f16298m = null;
        }
        if (this.f16293h != null) {
            X();
            Surface surface = this.f16292g;
            if (surface != null) {
                surface.release();
            }
            this.f16292g = null;
            Z(null, true);
        }
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11900a.N();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i8, final int i9) {
        bj0 bj0Var = this.f16298m;
        if (bj0Var != null) {
            bj0Var.b(i8, i9);
        }
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11326a.O(i8, i9);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f16289d.f(this);
        this.f9219a.a(surfaceTexture, this.f16291f);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        j2.v1.k("AdExoPlayerView3 window visibility changed to " + i8);
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.lj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10738a.Q(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long p() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            return ti0Var.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final String q() {
        return "ExoPlayer/2".concat(true != this.f16299n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void r() {
        if (c0()) {
            if (this.f16290e.f6358a) {
                X();
            }
            this.f16293h.F(false);
            this.f16289d.e();
            this.f9220b.c();
            j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13528a.R();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void s() {
        if (!c0()) {
            this.f16301p = true;
            return;
        }
        if (this.f16290e.f6358a) {
            U();
        }
        this.f16293h.F(true);
        this.f16289d.c();
        this.f9220b.b();
        this.f9219a.b();
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9648a.S();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void t(int i8) {
        if (c0()) {
            this.f16293h.z(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void u(hi0 hi0Var) {
        this.f16291f = hi0Var;
    }

    @Override // com.google.android.gms.internal.ads.ii0, com.google.android.gms.internal.ads.gj0
    public final void v() {
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10108a.P();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void w(String str) {
        if (str != null) {
            h(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void x() {
        if (d0()) {
            this.f16293h.L();
            Y();
        }
        this.f16289d.e();
        this.f9220b.c();
        this.f16289d.d();
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void y(float f8, float f9) {
        bj0 bj0Var = this.f16298m;
        if (bj0Var != null) {
            bj0Var.e(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final Integer z() {
        ti0 ti0Var = this.f16293h;
        if (ti0Var != null) {
            return ti0Var.t();
        }
        return null;
    }
}
