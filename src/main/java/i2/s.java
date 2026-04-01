package i2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.d22;
import com.google.android.gms.internal.ads.e22;
import com.google.android.gms.internal.ads.e53;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.hc1;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.qz2;
import com.google.android.gms.internal.ads.t41;
import j2.k2;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class s extends p80 implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f22518v = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Activity f22519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AdOverlayInfoParcel f22520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    fm0 f22521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    n f22522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    x f22523e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    FrameLayout f22525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f22526h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    m f22529k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f22532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22534p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f22538t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f22524f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f22527i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f22528j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f22530l = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f22539u = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f22531m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22535q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22536r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22537s = true;

    public s(Activity activity) {
        this.f22519a = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U5(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f22520b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            g2.j r0 = r0.f4738o
            if (r0 == 0) goto L10
            boolean r0 = r0.f21968b
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.app.Activity r3 = r5.f22519a
            j2.c r4 = g2.t.s()
            boolean r6 = r4.e(r3, r6)
            boolean r3 = r5.f22528j
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.E0
            com.google.android.gms.internal.ads.ls r3 = h2.y.c()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.fs r6 = com.google.android.gms.internal.ads.ns.D0
            com.google.android.gms.internal.ads.ls r0 = h2.y.c()
            java.lang.Object r6 = r0.b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = 0
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f22520b
            if (r6 == 0) goto L57
            g2.j r6 = r6.f4738o
            if (r6 == 0) goto L57
            boolean r6 = r6.f21973g
            if (r6 == 0) goto L57
            r2 = 1
        L57:
            android.app.Activity r6 = r5.f22519a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12050d1
            com.google.android.gms.internal.ads.ls r3 = h2.y.c()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.U5(android.content.res.Configuration):void");
    }

    private static final void V5(qz2 qz2Var, View view) {
        if (qz2Var == null || view == null) {
            return;
        }
        g2.t.a().f(qz2Var, view);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A() {
        u uVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel == null || (uVar = adOverlayInfoParcel.f4726c) == null) {
            return;
        }
        uVar.y4();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A2(int i8, String[] strArr, int[] iArr) {
        if (i8 == 12345) {
            Activity activity = this.f22519a;
            d22 d22VarE = e22.e();
            d22VarE.a(activity);
            d22VarE.b(this.f22520b.f4734k == 5 ? this : null);
            try {
                this.f22520b.f4745v.K1(strArr, iArr, g3.b.k3(d22VarE.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void B() {
        u uVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel != null && (uVar = adOverlayInfoParcel.f4726c) != null) {
            uVar.h5();
        }
        U5(this.f22519a.getResources().getConfiguration());
        if (((Boolean) h2.y.c().b(ns.I4)).booleanValue()) {
            return;
        }
        fm0 fm0Var = this.f22521c;
        if (fm0Var == null || fm0Var.i()) {
            qg0.g("The webview does not exist. Ignoring action.");
        } else {
            this.f22521c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public void C3(Bundle bundle) {
        if (!this.f22534p) {
            this.f22519a.requestWindowFeature(1);
        }
        this.f22527i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelG = AdOverlayInfoParcel.g(this.f22519a.getIntent());
            this.f22520b = adOverlayInfoParcelG;
            if (adOverlayInfoParcelG == null) {
                throw new l("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelG.f4746w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f22519a.setShowWhenLocked(true);
                } else {
                    this.f22519a.getWindow().addFlags(524288);
                }
            }
            if (this.f22520b.f4736m.f16725c > 7500000) {
                this.f22539u = 4;
            }
            if (this.f22519a.getIntent() != null) {
                this.f22537s = this.f22519a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
            g2.j jVar = adOverlayInfoParcel.f4738o;
            if (jVar != null) {
                boolean z7 = jVar.f21967a;
                this.f22528j = z7;
                if (z7) {
                    if (adOverlayInfoParcel.f4734k != 5 && jVar.f21972f != -1) {
                        new q(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f4734k == 5) {
                this.f22528j = true;
                if (adOverlayInfoParcel.f4734k != 5) {
                    new q(this, null).b();
                }
            } else {
                this.f22528j = false;
            }
            if (bundle == null) {
                if (this.f22537s) {
                    t41 t41Var = this.f22520b.f4743t;
                    if (t41Var != null) {
                        t41Var.m();
                    }
                    u uVar = this.f22520b.f4726c;
                    if (uVar != null) {
                        uVar.G5();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22520b;
                if (adOverlayInfoParcel2.f4734k != 1) {
                    h2.a aVar = adOverlayInfoParcel2.f4725b;
                    if (aVar != null) {
                        aVar.Z();
                    }
                    hc1 hc1Var = this.f22520b.f4744u;
                    if (hc1Var != null) {
                        hc1Var.f0();
                    }
                }
            }
            Activity activity = this.f22519a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f22520b;
            m mVar = new m(activity, adOverlayInfoParcel3.f4737n, adOverlayInfoParcel3.f4736m.f16723a, adOverlayInfoParcel3.f4742s);
            this.f22529k = mVar;
            mVar.setId(1000);
            g2.t.s().k(this.f22519a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f22520b;
            int i8 = adOverlayInfoParcel4.f4734k;
            if (i8 == 1) {
                S5(false);
                return;
            }
            if (i8 == 2) {
                this.f22522d = new n(adOverlayInfoParcel4.f4727d);
                S5(false);
            } else if (i8 == 3) {
                S5(true);
            } else {
                if (i8 != 5) {
                    throw new l("Could not determine ad overlay type.");
                }
                S5(false);
            }
        } catch (l e8) {
            qg0.g(e8.getMessage());
            this.f22539u = 4;
            this.f22519a.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void D() {
        this.f22534p = true;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void E() {
        if (((Boolean) h2.y.c().b(ns.I4)).booleanValue() && this.f22521c != null && (!this.f22519a.isFinishing() || this.f22522d == null)) {
            this.f22521c.onPause();
        }
        T();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void G() {
        if (((Boolean) h2.y.c().b(ns.I4)).booleanValue()) {
            fm0 fm0Var = this.f22521c;
            if (fm0Var == null || fm0Var.i()) {
                qg0.g("The webview does not exist. Ignoring action.");
            } else {
                this.f22521c.onResume();
            }
        }
    }

    public final void N() {
        synchronized (this.f22531m) {
            this.f22533o = true;
            Runnable runnable = this.f22532n;
            if (runnable != null) {
                e53 e53Var = k2.f23991k;
                e53Var.removeCallbacks(runnable);
                e53Var.post(this.f22532n);
            }
        }
    }

    public final void P5(int i8) {
        if (this.f22519a.getApplicationInfo().targetSdkVersion >= ((Integer) h2.y.c().b(ns.U5)).intValue()) {
            if (this.f22519a.getApplicationInfo().targetSdkVersion <= ((Integer) h2.y.c().b(ns.V5)).intValue()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= ((Integer) h2.y.c().b(ns.W5)).intValue()) {
                    if (i9 <= ((Integer) h2.y.c().b(ns.X5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f22519a.setRequestedOrientation(i8);
        } catch (Throwable th) {
            g2.t.q().t(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void Q5(boolean z7) {
        m mVar;
        int i8;
        if (z7) {
            mVar = this.f22529k;
            i8 = 0;
        } else {
            mVar = this.f22529k;
            i8 = -16777216;
        }
        mVar.setBackgroundColor(i8);
    }

    public final void R5(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f22519a);
        this.f22525g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f22525g.addView(view, -1, -1);
        this.f22519a.setContentView(this.f22525g);
        this.f22534p = true;
        this.f22526h = customViewCallback;
        this.f22524f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void S5(boolean r27) throws i2.l {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s.S5(boolean):void");
    }

    protected final void T() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        u uVar;
        if (!this.f22519a.isFinishing() || this.f22535q) {
            return;
        }
        this.f22535q = true;
        fm0 fm0Var = this.f22521c;
        if (fm0Var != null) {
            fm0Var.i1(this.f22539u - 1);
            synchronized (this.f22531m) {
                if (!this.f22533o && this.f22521c.J0()) {
                    if (((Boolean) h2.y.c().b(ns.G4)).booleanValue() && !this.f22536r && (adOverlayInfoParcel = this.f22520b) != null && (uVar = adOverlayInfoParcel.f4726c) != null) {
                        uVar.k0();
                    }
                    Runnable runnable = new Runnable() { // from class: i2.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22507a.l();
                        }
                    };
                    this.f22532n = runnable;
                    k2.f23991k.postDelayed(runnable, ((Long) h2.y.c().b(ns.W0)).longValue());
                    return;
                }
            }
        }
        l();
    }

    public final void T5(String str) {
        TextView textView = this.f22538t;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void W() {
        this.f22529k.removeView(this.f22523e);
        X5(true);
    }

    public final void W5(e22 e22Var) throws l {
        j80 j80Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel == null || (j80Var = adOverlayInfoParcel.f4745v) == null) {
            throw new l("noioou");
        }
        j80Var.D0(g3.b.k3(e22Var));
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void X1(int i8, int i9, Intent intent) {
    }

    public final void X5(boolean z7) {
        int iIntValue = ((Integer) h2.y.c().b(ns.L4)).intValue();
        boolean z8 = ((Boolean) h2.y.c().b(ns.Z0)).booleanValue() || z7;
        w wVar = new w();
        wVar.f22544d = 50;
        wVar.f22541a = true != z8 ? 0 : iIntValue;
        wVar.f22542b = true != z8 ? iIntValue : 0;
        wVar.f22543c = iIntValue;
        this.f22523e = new x(this.f22519a, wVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (!this.f22520b.f4746w || this.f22521c == null) {
            layoutParams.addRule(true != z8 ? 9 : 11);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.f22521c.T().getId());
        }
        Y5(z7, this.f22520b.f4730g);
        this.f22529k.addView(this.f22523e, layoutParams);
    }

    public final void Y5(boolean z7, boolean z8) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        g2.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        g2.j jVar2;
        boolean z9 = true;
        boolean z10 = ((Boolean) h2.y.c().b(ns.X0)).booleanValue() && (adOverlayInfoParcel2 = this.f22520b) != null && (jVar2 = adOverlayInfoParcel2.f4738o) != null && jVar2.f21974h;
        boolean z11 = ((Boolean) h2.y.c().b(ns.Y0)).booleanValue() && (adOverlayInfoParcel = this.f22520b) != null && (jVar = adOverlayInfoParcel.f4738o) != null && jVar.f21975i;
        if (z7 && z8 && z10 && !z11) {
            new a80(this.f22521c, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        x xVar = this.f22523e;
        if (xVar != null) {
            if (!z11 && (!z8 || z10)) {
                z9 = false;
            }
            xVar.b(z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final boolean h0() {
        this.f22539u = 1;
        if (this.f22521c == null) {
            return true;
        }
        if (((Boolean) h2.y.c().b(ns.F8)).booleanValue() && this.f22521c.canGoBack()) {
            this.f22521c.goBack();
            return false;
        }
        boolean zO0 = this.f22521c.O0();
        if (!zO0) {
            this.f22521c.U("onbackblocked", Collections.emptyMap());
        }
        return zO0;
    }

    public final void k() {
        this.f22539u = 3;
        this.f22519a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f4734k != 5) {
            return;
        }
        this.f22519a.overridePendingTransition(0, 0);
    }

    final void l() {
        fm0 fm0Var;
        u uVar;
        if (this.f22536r) {
            return;
        }
        this.f22536r = true;
        fm0 fm0Var2 = this.f22521c;
        if (fm0Var2 != null) {
            this.f22529k.removeView(fm0Var2.T());
            n nVar = this.f22522d;
            if (nVar != null) {
                this.f22521c.V0(nVar.f22514d);
                this.f22521c.h1(false);
                ViewGroup viewGroup = this.f22522d.f22513c;
                View viewT = this.f22521c.T();
                n nVar2 = this.f22522d;
                viewGroup.addView(viewT, nVar2.f22511a, nVar2.f22512b);
                this.f22522d = null;
            } else if (this.f22519a.getApplicationContext() != null) {
                this.f22521c.V0(this.f22519a.getApplicationContext());
            }
            this.f22521c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel != null && (uVar = adOverlayInfoParcel.f4726c) != null) {
            uVar.v0(this.f22539u);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22520b;
        if (adOverlayInfoParcel2 == null || (fm0Var = adOverlayInfoParcel2.f4727d) == null) {
            return;
        }
        V5(fm0Var.F0(), this.f22520b.f4727d.T());
    }

    protected final void m() {
        this.f22521c.l0();
    }

    public final void p() {
        this.f22529k.f22510b = true;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void p0(g3.a aVar) {
        U5((Configuration) g3.b.H0(aVar));
    }

    public final void q() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel != null && this.f22524f) {
            P5(adOverlayInfoParcel.f4733j);
        }
        if (this.f22525g != null) {
            this.f22519a.setContentView(this.f22529k);
            this.f22534p = true;
            this.f22525g.removeAllViews();
            this.f22525g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f22526h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f22526h = null;
        }
        this.f22524f = false;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void r() {
        this.f22539u = 1;
    }

    @Override // i2.e
    public final void t() {
        this.f22539u = 2;
        this.f22519a.finish();
    }

    public final void v() {
        if (this.f22530l) {
            this.f22530l = false;
            m();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void w() {
        u uVar;
        q();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22520b;
        if (adOverlayInfoParcel != null && (uVar = adOverlayInfoParcel.f4726c) != null) {
            uVar.q3();
        }
        if (!((Boolean) h2.y.c().b(ns.I4)).booleanValue() && this.f22521c != null && (!this.f22519a.isFinishing() || this.f22522d == null)) {
            this.f22521c.onPause();
        }
        T();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x() {
        fm0 fm0Var = this.f22521c;
        if (fm0Var != null) {
            try {
                this.f22529k.removeView(fm0Var.T());
            } catch (NullPointerException unused) {
            }
        }
        T();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f22527i);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void z() {
    }
}
