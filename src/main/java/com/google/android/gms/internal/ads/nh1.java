package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends zv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, oi1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final jb3 f11870o = jb3.C("2011", "1009", "3010");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11871a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f11873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f11874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg3 f11875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f11876f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private lg1 f11878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private uk f11879i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private tv f11881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11882l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private GestureDetector f11884n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f11872b = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g3.a f11880j = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11883m = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11877g = 233702000;

    public nh1(FrameLayout frameLayout, FrameLayout frameLayout2, int i8) {
        this.f11873c = frameLayout;
        this.f11874d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f11871a = str;
        g2.t.z();
        rh0.a(frameLayout, this);
        g2.t.z();
        rh0.b(frameLayout, this);
        this.f11875e = eh0.f7326e;
        this.f11879i = new uk(this.f11873c.getContext(), this.f11873c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void A() {
        if (!((Boolean) h2.y.c().b(ns.ya)).booleanValue() || this.f11878h.H() == 0) {
            return;
        }
        this.f11884n = new GestureDetector(this.f11873c.getContext(), new th1(this.f11878h, this));
    }

    private final synchronized void E() {
        this.f11875e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mh1
            @Override // java.lang.Runnable
            public final void run() {
                this.f11307a.Q5();
            }
        });
    }

    private final synchronized void M0(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.f11874d.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f11874d.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e8) {
                    qg0.h("Encountered invalid base64 watermark.", e8);
                }
            }
        }
        this.f11874d.addView(frameLayout);
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized void H0(String str, View view, boolean z7) {
        if (this.f11883m) {
            return;
        }
        if (view == null) {
            this.f11872b.remove(str);
            return;
        }
        this.f11872b.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (j2.b1.i(this.f11877g)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void J4(tv tvVar) {
        if (this.f11883m) {
            return;
        }
        this.f11882l = true;
        this.f11881k = tvVar;
        lg1 lg1Var = this.f11878h;
        if (lg1Var != null) {
            lg1Var.M().b(tvVar);
        }
    }

    public final FrameLayout P5() {
        return this.f11873c;
    }

    final /* synthetic */ void Q5() {
        if (this.f11876f == null) {
            View view = new View(this.f11873c.getContext());
            this.f11876f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f11873c != this.f11876f.getParent()) {
            this.f11873c.addView(this.f11876f);
        }
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void T1(g3.a aVar, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void U0(String str, g3.a aVar) {
        H0(str, (View) g3.b.H0(aVar), true);
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized g3.a c(String str) {
        return g3.b.k3(g0(str));
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized View g0(String str) {
        if (this.f11883m) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f11872b.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void i2(g3.a aVar) {
        if (this.f11883m) {
            return;
        }
        this.f11880j = aVar;
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void l() {
        if (this.f11883m) {
            return;
        }
        lg1 lg1Var = this.f11878h;
        if (lg1Var != null) {
            lg1Var.x(this);
            this.f11878h = null;
        }
        this.f11872b.clear();
        this.f11873c.removeAllViews();
        this.f11874d.removeAllViews();
        this.f11872b = null;
        this.f11873c = null;
        this.f11874d = null;
        this.f11876f = null;
        this.f11879i = null;
        this.f11883m = true;
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final void m0(g3.a aVar) {
        onTouch(this.f11873c, (MotionEvent) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final /* synthetic */ View n() {
        return this.f11873c;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final FrameLayout o() {
        return this.f11874d;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        lg1 lg1Var = this.f11878h;
        if (lg1Var == null || !lg1Var.z()) {
            return;
        }
        this.f11878h.X();
        this.f11878h.i(view, this.f11873c, u(), x(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        lg1 lg1Var = this.f11878h;
        if (lg1Var != null) {
            FrameLayout frameLayout = this.f11873c;
            lg1Var.d0(frameLayout, u(), x(), lg1.C(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        lg1 lg1Var = this.f11878h;
        if (lg1Var != null) {
            FrameLayout frameLayout = this.f11873c;
            lg1Var.d0(frameLayout, u(), x(), lg1.C(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        lg1 lg1Var = this.f11878h;
        if (lg1Var == null) {
            return false;
        }
        lg1Var.p(view, motionEvent, this.f11873c);
        if (((Boolean) h2.y.c().b(ns.ya)).booleanValue() && this.f11884n != null && this.f11878h.H() != 0) {
            this.f11884n.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final uk r() {
        return this.f11879i;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized String s() {
        return this.f11871a;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final g3.a t() {
        return this.f11880j;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map u() {
        return this.f11872b;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map v() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void v3(g3.a aVar) {
        this.f11878h.r((View) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized JSONObject w() {
        lg1 lg1Var = this.f11878h;
        if (lg1Var == null) {
            return null;
        }
        return lg1Var.S(this.f11873c, u(), x());
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map x() {
        return this.f11872b;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized JSONObject y() {
        lg1 lg1Var = this.f11878h;
        if (lg1Var == null) {
            return null;
        }
        return lg1Var.T(this.f11873c, u(), x());
    }

    @Override // com.google.android.gms.internal.ads.aw
    public final synchronized void z1(g3.a aVar) {
        if (this.f11883m) {
            return;
        }
        Object objH0 = g3.b.H0(aVar);
        if (!(objH0 instanceof lg1)) {
            qg0.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        lg1 lg1Var = this.f11878h;
        if (lg1Var != null) {
            lg1Var.x(this);
        }
        E();
        lg1 lg1Var2 = (lg1) objH0;
        this.f11878h = lg1Var2;
        lg1Var2.w(this);
        this.f11878h.o(this.f11873c);
        this.f11878h.W(this.f11874d);
        if (this.f11882l) {
            this.f11878h.M().b(this.f11881k);
        }
        if (((Boolean) h2.y.c().b(ns.L3)).booleanValue() && !TextUtils.isEmpty(this.f11878h.Q())) {
            M0(this.f11878h.Q());
        }
        A();
    }
}
