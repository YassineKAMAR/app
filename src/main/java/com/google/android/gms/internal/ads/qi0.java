package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends FrameLayout implements hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj0 f13498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f13499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f13500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gt f13501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final fj0 f13502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f13503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ii0 f13504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f13511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String[] f13512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Bitmap f13513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ImageView f13514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f13515r;

    public qi0(Context context, dj0 dj0Var, int i8, boolean z7, gt gtVar, cj0 cj0Var) {
        super(context);
        this.f13498a = dj0Var;
        this.f13501d = gtVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13499b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        a3.o.j(dj0Var.t());
        ji0 ji0Var = dj0Var.t().f21939a;
        ii0 vj0Var = i8 == 2 ? new vj0(context, new ej0(context, dj0Var.v(), dj0Var.Y(), gtVar, dj0Var.s()), dj0Var, z7, ji0.a(dj0Var), cj0Var) : new gi0(context, dj0Var, z7, ji0.a(dj0Var), cj0Var, new ej0(context, dj0Var.v(), dj0Var.Y(), gtVar, dj0Var.s()));
        this.f13504g = vj0Var;
        View view = new View(context);
        this.f13500c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(vj0Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) h2.y.c().b(ns.F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) h2.y.c().b(ns.C)).booleanValue()) {
            x();
        }
        this.f13514q = new ImageView(context);
        this.f13503f = ((Long) h2.y.c().b(ns.I)).longValue();
        boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.E)).booleanValue();
        this.f13508k = zBooleanValue;
        if (gtVar != null) {
            gtVar.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f13502e = new fj0(this);
        vj0Var.u(this);
    }

    private final void l() {
        if (this.f13498a.r() == null || !this.f13506i || this.f13507j) {
            return;
        }
        this.f13498a.r().getWindow().clearFlags(128);
        this.f13506i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numV = v();
        if (numV != null) {
            map.put("playerId", numV.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f13498a.U("onVideoEvent", map);
    }

    private final boolean u() {
        return this.f13514q.getParent() != null;
    }

    final /* synthetic */ void A(boolean z7) {
        t("windowFocusChanged", "hasWindowFocus", String.valueOf(z7));
    }

    public final void B(Integer num) {
        if (this.f13504g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f13511n)) {
            t("no_src", new String[0]);
        } else {
            this.f13504g.h(this.f13511n, this.f13512o, num);
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void B0(String str, String str2) {
        t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void C() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.f9220b.d(true);
        ii0Var.v();
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void C0(int i8, int i9) {
        if (this.f13508k) {
            fs fsVar = ns.H;
            int iMax = Math.max(i8 / ((Integer) h2.y.c().b(fsVar)).intValue(), 1);
            int iMax2 = Math.max(i9 / ((Integer) h2.y.c().b(fsVar)).intValue(), 1);
            Bitmap bitmap = this.f13513p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f13513p.getHeight() == iMax2) {
                return;
            }
            this.f13513p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f13515r = false;
        }
    }

    final void D() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        long jI = ii0Var.i();
        if (this.f13509l == jI || jI <= 0) {
            return;
        }
        float f8 = jI / 1000.0f;
        if (((Boolean) h2.y.c().b(ns.O1)).booleanValue()) {
            t("timeupdate", com.amazon.a.a.h.a.f3627b, String.valueOf(f8), "totalBytes", String.valueOf(this.f13504g.p()), "qoeCachedBytes", String.valueOf(this.f13504g.n()), "qoeLoadedBytes", String.valueOf(this.f13504g.o()), "droppedFrames", String.valueOf(this.f13504g.j()), "reportTime", String.valueOf(g2.t.b().a()));
        } else {
            t("timeupdate", com.amazon.a.a.h.a.f3627b, String.valueOf(f8));
        }
        this.f13509l = jI;
    }

    public final void E() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.r();
    }

    public final void F() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.s();
    }

    public final void G(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.t(i8);
    }

    public final void H(MotionEvent motionEvent) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.dispatchTouchEvent(motionEvent);
    }

    public final void I(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.B(i8);
    }

    public final void J(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.C(i8);
    }

    public final void a(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.D(i8);
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void b(String str, String str2) {
        t("error", "what", str, "extra", str2);
    }

    public final void c(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.e(i8);
    }

    public final void d(int i8) {
        if (((Boolean) h2.y.c().b(ns.F)).booleanValue()) {
            this.f13499b.setBackgroundColor(i8);
            this.f13500c.setBackgroundColor(i8);
        }
    }

    public final void e(int i8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.g(i8);
    }

    public final void f(String str, String[] strArr) {
        this.f13511n = str;
        this.f13512o = strArr;
    }

    public final void finalize() throws Throwable {
        try {
            this.f13502e.a();
            final ii0 ii0Var = this.f13504g;
            if (ii0Var != null) {
                eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ki0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ii0Var.x();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(int i8, int i9, int i10, int i11) {
        if (j2.v1.m()) {
            j2.v1.k("Set video bounds to x:" + i8 + ";y:" + i9 + ";w:" + i10 + ";h:" + i11);
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.setMargins(i8, i9, 0, 0);
        this.f13499b.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void h(float f8) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.f9220b.e(f8);
        ii0Var.v();
    }

    public final void i(float f8, float f9) {
        ii0 ii0Var = this.f13504g;
        if (ii0Var != null) {
            ii0Var.y(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void j() {
        if (((Boolean) h2.y.c().b(ns.Q1)).booleanValue()) {
            this.f13502e.a();
        }
        t("ended", new String[0]);
        l();
    }

    public final void k() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        ii0Var.f9220b.d(false);
        ii0Var.v();
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void m() {
        if (((Boolean) h2.y.c().b(ns.Q1)).booleanValue()) {
            this.f13502e.b();
        }
        if (this.f13498a.r() != null && !this.f13506i) {
            boolean z7 = (this.f13498a.r().getWindow().getAttributes().flags & 128) != 0;
            this.f13507j = z7;
            if (!z7) {
                this.f13498a.r().getWindow().addFlags(128);
                this.f13506i = true;
            }
        }
        this.f13505h = true;
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void n() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var != null && this.f13510m == 0) {
            float fK = ii0Var.k();
            ii0 ii0Var2 = this.f13504g;
            t("canplaythrough", "duration", String.valueOf(fK / 1000.0f), "videoWidth", String.valueOf(ii0Var2.m()), "videoHeight", String.valueOf(ii0Var2.l()));
        }
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void o() {
        this.f13502e.b();
        j2.k2.f23991k.post(new ni0(this));
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z7) {
        super.onWindowFocusChanged(z7);
        fj0 fj0Var = this.f13502e;
        if (z7) {
            fj0Var.b();
        } else {
            fj0Var.a();
            this.f13510m = this.f13509l;
        }
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11314a.A(z7);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.hi0
    public final void onWindowVisibilityChanged(int i8) {
        boolean z7;
        super.onWindowVisibilityChanged(i8);
        if (i8 == 0) {
            this.f13502e.b();
            z7 = true;
        } else {
            this.f13502e.a();
            this.f13510m = this.f13509l;
            z7 = false;
        }
        j2.k2.f23991k.post(new pi0(this, z7));
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void p() {
        t("pause", new String[0]);
        l();
        this.f13505h = false;
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void q() {
        this.f13500c.setVisibility(4);
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.li0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10732a.z();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void r() {
        if (this.f13515r && this.f13513p != null && !u()) {
            this.f13514q.setImageBitmap(this.f13513p);
            this.f13514q.invalidate();
            this.f13499b.addView(this.f13514q, new FrameLayout.LayoutParams(-1, -1));
            this.f13499b.bringChildToFront(this.f13514q);
        }
        this.f13502e.a();
        this.f13510m = this.f13509l;
        j2.k2.f23991k.post(new oi0(this));
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final void s() {
        if (this.f13505h && u()) {
            this.f13499b.removeView(this.f13514q);
        }
        if (this.f13504g == null || this.f13513p == null) {
            return;
        }
        long jB = g2.t.b().b();
        if (this.f13504g.getBitmap(this.f13513p) != null) {
            this.f13515r = true;
        }
        long jB2 = g2.t.b().b() - jB;
        if (j2.v1.m()) {
            j2.v1.k("Spinner frame grab took " + jB2 + "ms");
        }
        if (jB2 > this.f13503f) {
            qg0.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f13508k = false;
            this.f13513p = null;
            gt gtVar = this.f13501d;
            if (gtVar != null) {
                gtVar.d("spinner_jank", Long.toString(jB2));
            }
        }
    }

    public final Integer v() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var != null) {
            return ii0Var.z();
        }
        return null;
    }

    public final void x() {
        ii0 ii0Var = this.f13504g;
        if (ii0Var == null) {
            return;
        }
        TextView textView = new TextView(ii0Var.getContext());
        Resources resourcesD = g2.t.q().d();
        textView.setText(String.valueOf(resourcesD == null ? "AdMob - " : resourcesD.getString(e2.b.f21375u)).concat(this.f13504g.q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f13499b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f13499b.bringChildToFront(textView);
    }

    public final void y() {
        this.f13502e.a();
        ii0 ii0Var = this.f13504g;
        if (ii0Var != null) {
            ii0Var.x();
        }
        l();
    }

    final /* synthetic */ void z() {
        t("firstFrameRendered", new String[0]);
    }
}
