package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.a0;
import io.flutter.embedding.android.k;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u5.b;

/* JADX INFO: loaded from: classes.dex */
public class s extends FrameLayout implements b.c, a0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f22670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f22671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f22672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    io.flutter.embedding.engine.renderer.b f22673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.b f22674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<io.flutter.embedding.engine.renderer.a> f22675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.flutter.embedding.engine.a f22677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set<f> f22678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u5.b f22679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.plugin.editing.m f22680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.f f22681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t5.b f22682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a0 f22683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.flutter.embedding.android.c f22684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.flutter.view.g f22685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextServicesManager f22686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private f0 f22687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FlutterRenderer.g f22688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g.k f22689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ContentObserver f22690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f22691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.core.util.a<WindowLayoutInfo> f22692w;

    class a implements g.k {
        a() {
        }

        @Override // io.flutter.view.g.k
        public void a(boolean z7, boolean z8) {
            s.this.z(z7, z8);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            super.onChange(z7);
            if (s.this.f22677h == null) {
                return;
            }
            g5.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            s.this.B();
        }
    }

    class c implements io.flutter.embedding.engine.renderer.a {
        c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            s.this.f22676g = false;
            Iterator it = s.this.f22675f.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.a) it.next()).c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void e() {
            s.this.f22676g = true;
            Iterator it = s.this.f22675f.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.a) it.next()).e();
            }
        }
    }

    class d implements androidx.core.util.a<WindowLayoutInfo> {
        d() {
        }

        @Override // androidx.core.util.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            s.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements io.flutter.embedding.engine.renderer.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlutterRenderer f22697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f22698b;

        e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f22697a = flutterRenderer;
            this.f22698b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void e() {
            this.f22697a.t(this);
            this.f22698b.run();
            s sVar = s.this;
            if ((sVar.f22673d instanceof k) || sVar.f22672c == null) {
                return;
            }
            s.this.f22672c.c();
            s.this.x();
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private s(Context context, AttributeSet attributeSet, l lVar) {
        super(context, attributeSet);
        this.f22675f = new HashSet();
        this.f22678i = new HashSet();
        this.f22688s = new FlutterRenderer.g();
        this.f22689t = new a();
        this.f22690u = new b(new Handler(Looper.getMainLooper()));
        this.f22691v = new c();
        this.f22692w = new d();
        this.f22670a = lVar;
        this.f22673d = lVar;
        u();
    }

    private s(Context context, AttributeSet attributeSet, m mVar) {
        super(context, attributeSet);
        this.f22675f = new HashSet();
        this.f22678i = new HashSet();
        this.f22688s = new FlutterRenderer.g();
        this.f22689t = new a();
        this.f22690u = new b(new Handler(Looper.getMainLooper()));
        this.f22691v = new c();
        this.f22692w = new d();
        this.f22671b = mVar;
        this.f22673d = mVar;
        u();
    }

    public s(Context context, l lVar) {
        this(context, (AttributeSet) null, lVar);
    }

    public s(Context context, m mVar) {
        this(context, (AttributeSet) null, mVar);
    }

    private void C() {
        if (!v()) {
            g5.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f22688s.f22837a = getResources().getDisplayMetrics().density;
        this.f22688s.f22852p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f22677h.r().v(this.f22688s);
    }

    private g o() {
        Context context = getContext();
        int i8 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i8 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void u() {
        View view;
        g5.b.f("FlutterView", "Initializing FlutterView");
        if (this.f22670a != null) {
            g5.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f22670a;
        } else if (this.f22671b != null) {
            g5.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f22671b;
        } else {
            g5.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f22672c;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        k kVar = this.f22672c;
        if (kVar != null) {
            kVar.f();
            removeView(this.f22672c);
            this.f22672c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z7, boolean z8) {
        boolean z9 = false;
        if (!this.f22677h.r().n() && !z7 && !z8) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    public void A(Runnable runnable) {
        if (this.f22672c == null) {
            g5.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.b bVar = this.f22674e;
        if (bVar == null) {
            g5.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f22673d = bVar;
        this.f22674e = null;
        FlutterRenderer flutterRendererR = this.f22677h.r();
        if (this.f22677h != null && flutterRendererR != null) {
            this.f22673d.a(flutterRendererR);
            flutterRendererR.i(new e(flutterRendererR, runnable));
        } else {
            this.f22672c.c();
            x();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1a
            r5.n$c r0 = r5.n.c.dark
            goto L1c
        L1a:
            r5.n$c r0 = r5.n.c.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.f22686q
            if (r3 == 0) goto L43
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L41
            java.util.List r3 = io.flutter.embedding.android.o.a(r3)
            java.util.stream.Stream r3 = io.flutter.embedding.android.p.a(r3)
            io.flutter.embedding.android.r r4 = new io.flutter.embedding.android.r
            r4.<init>()
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f22686q
            boolean r4 = io.flutter.embedding.android.q.a(r4)
            if (r4 == 0) goto L43
            if (r3 == 0) goto L43
        L41:
            r3 = 1
            goto L44
        L43:
            r3 = 0
        L44:
            io.flutter.embedding.engine.a r4 = r6.f22677h
            r5.n r4 = r4.t()
            r5.n$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            r5.n$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r5.n$b r4 = r4.c(r5)
            r5.n$b r3 = r4.d(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L7d
            r1 = 1
        L7d:
            r5.n$b r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            r5.n$b r1 = r1.g(r2)
            r5.n$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.s.B():void");
    }

    @Override // u5.b.c
    @TargetApi(24)
    public PointerIcon a(int i8) {
        return PointerIcon.getSystemIcon(getContext(), i8);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f22680k.j(sparseArray);
    }

    @Override // io.flutter.embedding.android.a0.e
    public void b(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // io.flutter.embedding.android.a0.e
    public boolean c(KeyEvent keyEvent) {
        return this.f22680k.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f22677h;
        return aVar != null ? aVar.p().G(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f22683n.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f22685p;
        if (gVar == null || !gVar.C()) {
            return null;
        }
        return this.f22685p;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f22677h;
    }

    @Override // io.flutter.embedding.android.a0.e
    public s5.c getBinaryMessenger() {
        return this.f22677h.j();
    }

    public k getCurrentImageSurface() {
        return this.f22672c;
    }

    public boolean k() {
        k kVar = this.f22672c;
        if (kVar != null) {
            return kVar.d();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.a aVar) {
        this.f22675f.add(aVar);
    }

    public void m(k kVar) {
        io.flutter.embedding.engine.a aVar = this.f22677h;
        if (aVar != null) {
            kVar.a(aVar.r());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        g5.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f22677h) {
                g5.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                g5.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f22677h = aVar;
        FlutterRenderer flutterRendererR = aVar.r();
        this.f22676g = flutterRendererR.m();
        this.f22673d.a(flutterRendererR);
        flutterRendererR.i(this.f22691v);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f22679j = new u5.b(this, this.f22677h.m());
        }
        this.f22680k = new io.flutter.plugin.editing.m(this, this.f22677h.w(), this.f22677h.p());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f22686q = textServicesManager;
            this.f22681l = new io.flutter.plugin.editing.f(textServicesManager, this.f22677h.u());
        } catch (Exception unused) {
            g5.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f22682m = this.f22677h.l();
        this.f22683n = new a0(this);
        this.f22684o = new io.flutter.embedding.android.c(this.f22677h.r(), false);
        io.flutter.view.g gVar = new io.flutter.view.g(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f22677h.p());
        this.f22685p = gVar;
        gVar.a0(this.f22689t);
        z(this.f22685p.C(), this.f22685p.E());
        this.f22677h.p().a(this.f22685p);
        this.f22677h.p().E(this.f22677h.r());
        this.f22680k.q().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f22690u);
        C();
        aVar.p().F(this);
        Iterator<f> it = this.f22678i.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
        if (this.f22676g) {
            this.f22691v.e();
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.g gVar = this.f22688s;
            gVar.f22848l = systemGestureInsets.top;
            gVar.f22849m = systemGestureInsets.right;
            gVar.f22850n = systemGestureInsets.bottom;
            gVar.f22851o = systemGestureInsets.left;
        }
        boolean z7 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z8 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i8 >= 30) {
            int iNavigationBars = z8 ? 0 | WindowInsets$Type.navigationBars() : 0;
            if (z7) {
                iNavigationBars |= WindowInsets$Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(iNavigationBars);
            FlutterRenderer.g gVar2 = this.f22688s;
            gVar2.f22840d = insets.top;
            gVar2.f22841e = insets.right;
            gVar2.f22842f = insets.bottom;
            gVar2.f22843g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets$Type.ime());
            FlutterRenderer.g gVar3 = this.f22688s;
            gVar3.f22844h = insets2.top;
            gVar3.f22845i = insets2.right;
            gVar3.f22846j = insets2.bottom;
            gVar3.f22847k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets$Type.systemGestures());
            FlutterRenderer.g gVar4 = this.f22688s;
            gVar4.f22848l = insets3.top;
            gVar4.f22849m = insets3.right;
            gVar4.f22850n = insets3.bottom;
            gVar4.f22851o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.g gVar5 = this.f22688s;
                gVar5.f22840d = Math.max(Math.max(gVar5.f22840d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.g gVar6 = this.f22688s;
                gVar6.f22841e = Math.max(Math.max(gVar6.f22841e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.g gVar7 = this.f22688s;
                gVar7.f22842f = Math.max(Math.max(gVar7.f22842f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.g gVar8 = this.f22688s;
                gVar8.f22843g = Math.max(Math.max(gVar8.f22843g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVarO = g.NONE;
            if (!z8) {
                gVarO = o();
            }
            this.f22688s.f22840d = z7 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f22688s.f22841e = (gVarO == g.RIGHT || gVarO == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f22688s.f22842f = (z8 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f22688s.f22843g = (gVarO == g.LEFT || gVarO == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.g gVar9 = this.f22688s;
            gVar9.f22844h = 0;
            gVar9.f22845i = 0;
            gVar9.f22846j = t(windowInsets);
            this.f22688s.f22847k = 0;
        }
        g5.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f22688s.f22840d + ", Left: " + this.f22688s.f22843g + ", Right: " + this.f22688s.f22841e + "\nKeyboard insets: Bottom: " + this.f22688s.f22846j + ", Left: " + this.f22688s.f22847k + ", Right: " + this.f22688s.f22845i + "System Gesture Insets - Left: " + this.f22688s.f22851o + ", Top: " + this.f22688s.f22848l + ", Right: " + this.f22688s.f22849m + ", Bottom: " + this.f22688s.f22846j);
        C();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22687r = r();
        Activity activityF = b6.h.f(getContext());
        f0 f0Var = this.f22687r;
        if (f0Var == null || activityF == null) {
            return;
        }
        f0Var.a(activityF, androidx.core.content.a.h(getContext()), this.f22692w);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f22677h != null) {
            g5.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f22682m.d(configuration);
            B();
            b6.h.c(getContext(), this.f22677h);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f22680k.o(this, this.f22683n, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        f0 f0Var = this.f22687r;
        if (f0Var != null) {
            f0Var.b(this.f22692w);
        }
        this.f22687r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f22684o.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f22685p.L(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i8) {
        super.onProvideAutofillVirtualStructure(viewStructure, i8);
        this.f22680k.A(viewStructure, i8);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        g5.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i10 + " x " + i11 + ", it is now " + i8 + " x " + i9);
        FlutterRenderer.g gVar = this.f22688s;
        gVar.f22838b = i8;
        gVar.f22839c = i9;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f22684o.k(motionEvent);
    }

    public void p() {
        this.f22673d.b();
        k kVar = this.f22672c;
        if (kVar == null) {
            k kVarQ = q();
            this.f22672c = kVarQ;
            addView(kVarQ);
        } else {
            kVar.j(getWidth(), getHeight());
        }
        this.f22674e = this.f22673d;
        k kVar2 = this.f22672c;
        this.f22673d = kVar2;
        io.flutter.embedding.engine.a aVar = this.f22677h;
        if (aVar != null) {
            kVar2.a(aVar.r());
        }
    }

    public k q() {
        return new k(getContext(), getWidth(), getHeight(), k.b.background);
    }

    protected f0 r() {
        try {
            return new f0(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        g5.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f22677h);
        if (!v()) {
            g5.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<f> it = this.f22678i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f22690u);
        this.f22677h.p().P();
        this.f22677h.p().d();
        this.f22685p.S();
        this.f22685p = null;
        this.f22680k.q().restartInput(this);
        this.f22680k.p();
        this.f22683n.d();
        io.flutter.plugin.editing.f fVar = this.f22681l;
        if (fVar != null) {
            fVar.b();
        }
        u5.b bVar = this.f22679j;
        if (bVar != null) {
            bVar.c();
        }
        FlutterRenderer flutterRendererR = this.f22677h.r();
        this.f22676g = false;
        flutterRendererR.t(this.f22691v);
        flutterRendererR.x();
        flutterRendererR.u(false);
        io.flutter.embedding.engine.renderer.b bVar2 = this.f22674e;
        if (bVar2 != null && this.f22673d == this.f22672c) {
            this.f22673d = bVar2;
        }
        this.f22673d.c();
        x();
        this.f22674e = null;
        this.f22677h = null;
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        io.flutter.embedding.engine.renderer.b bVar = this.f22673d;
        if (bVar instanceof l) {
            ((l) bVar).setVisibility(i8);
        }
    }

    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            g5.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.d.HINGE : FlutterRenderer.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.c.POSTURE_HALF_OPENED : FlutterRenderer.c.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), FlutterRenderer.d.UNKNOWN, FlutterRenderer.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                g5.b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.b(rect, FlutterRenderer.d.CUTOUT));
            }
        }
        this.f22688s.f22853q = arrayList;
        C();
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f22677h;
        return aVar != null && aVar.r() == this.f22673d.getAttachedRenderer();
    }

    public void y(io.flutter.embedding.engine.renderer.a aVar) {
        this.f22675f.remove(aVar);
    }
}
