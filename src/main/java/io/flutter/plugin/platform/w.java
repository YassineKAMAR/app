package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.c0;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r5.l;

/* JADX INFO: loaded from: classes.dex */
public class w implements q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Class[] f22982w = {SurfaceView.class};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f22983x = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.android.c f22985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.android.s f22987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextureRegistry f22988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.m f22989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r5.l f22990g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22998o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22999p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23000q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23004u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l.g f23005v = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f22984a = new n();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final HashMap<Integer, z> f22992i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f22991h = new io.flutter.plugin.platform.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HashMap<Context, View> f22993j = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SparseArray<d> f22996m = new SparseArray<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashSet<Integer> f23001r = new HashSet<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashSet<Integer> f23002s = new HashSet<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SparseArray<p> f22997n = new SparseArray<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseArray<k> f22994k = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray<k5.a> f22995l = new SparseArray<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c0 f23003t = c0.a();

    class a implements l.g {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(z zVar, float f8, l.b bVar) {
            w.this.x0(zVar);
            if (w.this.f22986c != null) {
                f8 = w.this.V();
            }
            bVar.a(new l.c(w.this.u0(zVar.e(), f8), w.this.u0(zVar.d(), f8)));
        }

        @Override // r5.l.g
        public void a(boolean z7) {
            w.this.f23000q = z7;
        }

        @Override // r5.l.g
        @TargetApi(17)
        public void b(int i8, int i9) {
            View view;
            StringBuilder sb;
            String str;
            if (!w.y0(i9)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i9 + "(view id: " + i8 + ")");
            }
            if (w.this.c(i8)) {
                view = w.this.f22992i.get(Integer.valueOf(i8)).f();
            } else {
                k kVar = (k) w.this.f22994k.get(i8);
                if (kVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(i8);
                    g5.b.b("PlatformViewsController", sb.toString());
                }
                view = kVar.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i9);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(i8);
            g5.b.b("PlatformViewsController", sb.toString());
        }

        @Override // r5.l.g
        public void c(l.f fVar) {
            int i8 = fVar.f26023a;
            float f8 = w.this.f22986c.getResources().getDisplayMetrics().density;
            if (w.this.c(i8)) {
                w.this.f22992i.get(Integer.valueOf(i8)).b(w.this.v0(f8, fVar, true));
                return;
            }
            k kVar = (k) w.this.f22994k.get(i8);
            if (kVar == null) {
                g5.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i8);
                return;
            }
            View view = kVar.getView();
            if (view != null) {
                view.dispatchTouchEvent(w.this.v0(f8, fVar, false));
                return;
            }
            g5.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i8);
        }

        @Override // r5.l.g
        @TargetApi(20)
        public long d(l.d dVar) {
            w.this.T(dVar);
            int i8 = dVar.f26007a;
            if (w.this.f22997n.get(i8) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i8);
            }
            if (w.this.f22988e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i8);
            }
            if (w.this.f22987d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i8);
            }
            k kVarM = w.this.M(dVar, true);
            View view = kVarM.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(Build.VERSION.SDK_INT >= 23 && !b6.h.g(view, w.f22982w))) {
                if (dVar.f26014h == l.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                    w.this.H(kVarM, dVar);
                    return -2L;
                }
                if (!w.this.f23004u) {
                    return w.this.J(kVarM, dVar);
                }
            }
            return w.this.I(kVarM, dVar);
        }

        @Override // r5.l.g
        public void e(l.e eVar, final l.b bVar) {
            int iW0 = w.this.w0(eVar.f26021b);
            int iW02 = w.this.w0(eVar.f26022c);
            int i8 = eVar.f26020a;
            if (w.this.c(i8)) {
                final float fV = w.this.V();
                final z zVar = w.this.f22992i.get(Integer.valueOf(i8));
                w.this.d0(zVar);
                zVar.i(iW0, iW02, new Runnable() { // from class: io.flutter.plugin.platform.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22978a.k(zVar, fV, bVar);
                    }
                });
                return;
            }
            k kVar = (k) w.this.f22994k.get(i8);
            p pVar = (p) w.this.f22997n.get(i8);
            if (kVar == null || pVar == null) {
                g5.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i8);
                return;
            }
            if (iW0 > pVar.getRenderTargetWidth() || iW02 > pVar.getRenderTargetHeight()) {
                pVar.b(iW0, iW02);
            }
            ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
            layoutParams.width = iW0;
            layoutParams.height = iW02;
            pVar.setLayoutParams(layoutParams);
            View view = kVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iW0;
                layoutParams2.height = iW02;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new l.c(w.this.t0(pVar.getRenderTargetWidth()), w.this.t0(pVar.getRenderTargetHeight())));
        }

        @Override // r5.l.g
        public void f(int i8, double d8, double d9) {
            if (w.this.c(i8)) {
                return;
            }
            p pVar = (p) w.this.f22997n.get(i8);
            if (pVar == null) {
                g5.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i8);
                return;
            }
            int iW0 = w.this.w0(d8);
            int iW02 = w.this.w0(d9);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.getLayoutParams();
            layoutParams.topMargin = iW0;
            layoutParams.leftMargin = iW02;
            pVar.setLayoutParams(layoutParams);
        }

        @Override // r5.l.g
        public void g(int i8) {
            View view;
            StringBuilder sb;
            String str;
            if (w.this.c(i8)) {
                view = w.this.f22992i.get(Integer.valueOf(i8)).f();
            } else {
                k kVar = (k) w.this.f22994k.get(i8);
                if (kVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(i8);
                    g5.b.b("PlatformViewsController", sb.toString());
                }
                view = kVar.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(i8);
            g5.b.b("PlatformViewsController", sb.toString());
        }

        @Override // r5.l.g
        @TargetApi(19)
        public void h(l.d dVar) {
            w.this.S(19);
            w.this.T(dVar);
            w.this.H(w.this.M(dVar, false), dVar);
        }

        @Override // r5.l.g
        public void i(int i8) {
            k kVar = (k) w.this.f22994k.get(i8);
            if (kVar == null) {
                g5.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i8);
                return;
            }
            if (kVar.getView() != null) {
                View view = kVar.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            w.this.f22994k.remove(i8);
            try {
                kVar.a();
            } catch (RuntimeException e8) {
                g5.b.c("PlatformViewsController", "Disposing platform view threw an exception", e8);
            }
            if (w.this.c(i8)) {
                z zVar = w.this.f22992i.get(Integer.valueOf(i8));
                View viewF = zVar.f();
                if (viewF != null) {
                    w.this.f22993j.remove(viewF.getContext());
                }
                zVar.c();
                w.this.f22992i.remove(Integer.valueOf(i8));
                return;
            }
            p pVar = (p) w.this.f22997n.get(i8);
            if (pVar != null) {
                pVar.removeAllViews();
                pVar.a();
                pVar.c();
                ViewGroup viewGroup2 = (ViewGroup) pVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(pVar);
                }
                w.this.f22997n.remove(i8);
                return;
            }
            k5.a aVar = (k5.a) w.this.f22995l.get(i8);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup3 = (ViewGroup) aVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(aVar);
                }
                w.this.f22995l.remove(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(k kVar, l.d dVar) {
        S(19);
        g5.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f26007a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long J(k kVar, final l.d dVar) {
        S(20);
        g5.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f26007a);
        o oVarE0 = e0(this.f22988e);
        z zVarA = z.a(this.f22986c, this.f22991h, kVar, oVarE0, w0(dVar.f26009c), w0(dVar.f26010d), dVar.f26007a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                this.f22976a.a0(dVar, view, z7);
            }
        });
        if (zVarA != null) {
            this.f22992i.put(Integer.valueOf(dVar.f26007a), zVarA);
            View view = kVar.getView();
            this.f22993j.put(view.getContext(), view);
            return oVarE0.getId();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f26008b + " with id: " + dVar.f26007a);
    }

    private void R() {
        while (this.f22994k.size() > 0) {
            this.f23005v.i(this.f22994k.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= i8) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i9 + ", required API level is: " + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(l.d dVar) {
        if (y0(dVar.f26013g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f26013g + "(view id: " + dVar.f26007a + ")");
    }

    private void U(boolean z7) {
        for (int i8 = 0; i8 < this.f22996m.size(); i8++) {
            int iKeyAt = this.f22996m.keyAt(i8);
            d dVarValueAt = this.f22996m.valueAt(i8);
            if (this.f23001r.contains(Integer.valueOf(iKeyAt))) {
                this.f22987d.m(dVarValueAt);
                z7 &= dVarValueAt.d();
            } else {
                if (!this.f22999p) {
                    dVarValueAt.c();
                }
                dVarValueAt.setVisibility(8);
                this.f22987d.removeView(dVarValueAt);
            }
        }
        for (int i9 = 0; i9 < this.f22995l.size(); i9++) {
            int iKeyAt2 = this.f22995l.keyAt(i9);
            k5.a aVar = this.f22995l.get(iKeyAt2);
            if (!this.f23002s.contains(Integer.valueOf(iKeyAt2)) || (!z7 && this.f23000q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float V() {
        return this.f22986c.getResources().getDisplayMetrics().density;
    }

    private void Y() {
        if (!this.f23000q || this.f22999p) {
            return;
        }
        this.f22987d.p();
        this.f22999p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(l.d dVar, View view, boolean z7) {
        if (z7) {
            this.f22990g.d(dVar.f26007a);
            return;
        }
        io.flutter.plugin.editing.m mVar = this.f22989f;
        if (mVar != null) {
            mVar.l(dVar.f26007a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(l.d dVar, View view, boolean z7) {
        if (z7) {
            this.f22990g.d(dVar.f26007a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i8, View view, boolean z7) {
        if (z7) {
            this.f22990g.d(i8);
            return;
        }
        io.flutter.plugin.editing.m mVar = this.f22989f;
        if (mVar != null) {
            mVar.l(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        U(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(z zVar) {
        io.flutter.plugin.editing.m mVar = this.f22989f;
        if (mVar == null) {
            return;
        }
        mVar.u();
        zVar.g();
    }

    private static o e0(TextureRegistry textureRegistry) {
        return (!f22983x || Build.VERSION.SDK_INT < 29) ? new y(textureRegistry.b()) : new c(textureRegistry.a());
    }

    private void f0(k kVar) {
        io.flutter.embedding.android.s sVar = this.f22987d;
        if (sVar == null) {
            g5.b.e("PlatformViewsController", "null flutterView");
        } else {
            kVar.b(sVar);
        }
    }

    private static MotionEvent.PointerCoords n0(Object obj, float f8) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f8;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f8;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f8;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f8;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f8;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f8;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> o0(Object obj, float f8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(n0(it.next(), f8));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties p0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> q0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(p0(it.next()));
        }
        return arrayList;
    }

    private void r0() {
        if (this.f22987d == null) {
            g5.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i8 = 0; i8 < this.f22996m.size(); i8++) {
            this.f22987d.removeView(this.f22996m.valueAt(i8));
        }
        this.f22996m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t0(double d8) {
        return u0(d8, V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0(double d8, float f8) {
        return (int) Math.round(d8 / ((double) f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w0(double d8) {
        return (int) Math.round(d8 * ((double) V()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(z zVar) {
        io.flutter.plugin.editing.m mVar = this.f22989f;
        if (mVar == null) {
            return;
        }
        mVar.H();
        zVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y0(int i8) {
        return i8 == 0 || i8 == 1;
    }

    public void C(Context context, TextureRegistry textureRegistry, h5.a aVar) {
        if (this.f22986c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f22986c = context;
        this.f22988e = textureRegistry;
        r5.l lVar = new r5.l(aVar);
        this.f22990g = lVar;
        lVar.e(this.f23005v);
    }

    public void D(io.flutter.plugin.editing.m mVar) {
        this.f22989f = mVar;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.f22985b = new io.flutter.embedding.android.c(flutterRenderer, true);
    }

    public void F(io.flutter.embedding.android.s sVar) {
        this.f22987d = sVar;
        for (int i8 = 0; i8 < this.f22997n.size(); i8++) {
            this.f22987d.addView(this.f22997n.valueAt(i8));
        }
        for (int i9 = 0; i9 < this.f22995l.size(); i9++) {
            this.f22987d.addView(this.f22995l.valueAt(i9));
        }
        for (int i10 = 0; i10 < this.f22994k.size(); i10++) {
            this.f22994k.valueAt(i10).b(this.f22987d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.f22993j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f22993j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(23)
    public long I(k kVar, final l.d dVar) {
        p pVar;
        long j8;
        S(23);
        g5.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f26007a);
        int iW0 = w0(dVar.f26009c);
        int iW02 = w0(dVar.f26010d);
        if (this.f23004u) {
            pVar = new p(this.f22986c);
            j8 = -1;
        } else {
            o oVarE0 = e0(this.f22988e);
            p pVar2 = new p(this.f22986c, oVarE0);
            long id = oVarE0.getId();
            pVar = pVar2;
            j8 = id;
        }
        pVar.setTouchProcessor(this.f22985b);
        pVar.b(iW0, iW02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iW0, iW02);
        int iW03 = w0(dVar.f26011e);
        int iW04 = w0(dVar.f26012f);
        layoutParams.topMargin = iW03;
        layoutParams.leftMargin = iW04;
        pVar.setLayoutParams(layoutParams);
        View view = kVar.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(iW0, iW02));
        view.setImportantForAccessibility(4);
        pVar.addView(view);
        pVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z7) {
                this.f22974a.Z(dVar, view2, z7);
            }
        });
        this.f22987d.addView(pVar);
        this.f22997n.append(dVar.f26007a, pVar);
        f0(kVar);
        return j8;
    }

    @TargetApi(19)
    public FlutterOverlaySurface K() {
        return L(new d(this.f22987d.getContext(), this.f22987d.getWidth(), this.f22987d.getHeight(), this.f22991h));
    }

    @TargetApi(19)
    public FlutterOverlaySurface L(d dVar) {
        int i8 = this.f22998o;
        this.f22998o = i8 + 1;
        this.f22996m.put(i8, dVar);
        return new FlutterOverlaySurface(i8, dVar.getSurface());
    }

    @TargetApi(19)
    public k M(l.d dVar, boolean z7) {
        l lVarB = this.f22984a.b(dVar.f26008b);
        if (lVarB == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f26008b);
        }
        k kVarA = lVarB.a(z7 ? new MutableContextWrapper(this.f22986c) : this.f22986c, dVar.f26007a, dVar.f26015i != null ? lVarB.b().b(dVar.f26015i) : null);
        View view = kVarA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(dVar.f26013g);
        this.f22994k.put(dVar.f26007a, kVarA);
        f0(kVarA);
        return kVarA;
    }

    public void N() {
        for (int i8 = 0; i8 < this.f22996m.size(); i8++) {
            d dVarValueAt = this.f22996m.valueAt(i8);
            dVarValueAt.c();
            dVarValueAt.f();
        }
    }

    public void O() {
        r5.l lVar = this.f22990g;
        if (lVar != null) {
            lVar.e(null);
        }
        N();
        this.f22990g = null;
        this.f22986c = null;
        this.f22988e = null;
    }

    public void P() {
        for (int i8 = 0; i8 < this.f22997n.size(); i8++) {
            this.f22987d.removeView(this.f22997n.valueAt(i8));
        }
        for (int i9 = 0; i9 < this.f22995l.size(); i9++) {
            this.f22987d.removeView(this.f22995l.valueAt(i9));
        }
        N();
        r0();
        this.f22987d = null;
        this.f22999p = false;
        for (int i10 = 0; i10 < this.f22994k.size(); i10++) {
            this.f22994k.valueAt(i10).e();
        }
    }

    public void Q() {
        this.f22989f = null;
    }

    public m W() {
        return this.f22984a;
    }

    @TargetApi(19)
    void X(final int i8) {
        k kVar = this.f22994k.get(i8);
        if (kVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f22995l.get(i8) != null) {
            return;
        }
        View view = kVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f22986c;
        k5.a aVar = new k5.a(context, context.getResources().getDisplayMetrics().density, this.f22985b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z7) {
                this.f22971a.b0(i8, view2, z7);
            }
        });
        this.f22995l.put(i8, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.f22987d.addView(aVar);
    }

    @Override // io.flutter.plugin.platform.q
    public void a(io.flutter.view.g gVar) {
        this.f22991h.c(gVar);
    }

    @Override // io.flutter.plugin.platform.q
    public View b(int i8) {
        if (c(i8)) {
            return this.f22992i.get(Integer.valueOf(i8)).f();
        }
        k kVar = this.f22994k.get(i8);
        if (kVar == null) {
            return null;
        }
        return kVar.getView();
    }

    @Override // io.flutter.plugin.platform.q
    public boolean c(int i8) {
        return this.f22992i.containsKey(Integer.valueOf(i8));
    }

    @Override // io.flutter.plugin.platform.q
    public void d() {
        this.f22991h.c(null);
    }

    public void g0() {
    }

    public void h0() {
        this.f23001r.clear();
        this.f23002s.clear();
    }

    public void i0() {
        R();
    }

    public void j0(int i8, int i9, int i10, int i11, int i12) {
        if (this.f22996m.get(i8) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i8 + ") doesn't exist");
        }
        Y();
        d dVar = this.f22996m.get(i8);
        if (dVar.getParent() == null) {
            this.f22987d.addView(dVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.leftMargin = i9;
        layoutParams.topMargin = i10;
        dVar.setLayoutParams(layoutParams);
        dVar.setVisibility(0);
        dVar.bringToFront();
        this.f23001r.add(Integer.valueOf(i8));
    }

    public void k0(int i8, int i9, int i10, int i11, int i12, int i13, int i14, FlutterMutatorsStack flutterMutatorsStack) {
        Y();
        X(i8);
        k5.a aVar = this.f22995l.get(i8);
        aVar.a(flutterMutatorsStack, i9, i10, i11, i12);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        View view = this.f22994k.get(i8).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f23002s.add(Integer.valueOf(i8));
    }

    public void l0() {
        boolean z7 = false;
        if (this.f22999p && this.f23002s.isEmpty()) {
            this.f22999p = false;
            this.f22987d.A(new Runnable() { // from class: io.flutter.plugin.platform.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22973a.c0();
                }
            });
        } else {
            if (this.f22999p && this.f22987d.k()) {
                z7 = true;
            }
            U(z7);
        }
    }

    public void m0() {
        R();
    }

    public void s0(boolean z7) {
        this.f23004u = z7;
    }

    public MotionEvent v0(float f8, l.f fVar, boolean z7) {
        MotionEvent motionEventB = this.f23003t.b(c0.a.c(fVar.f26038p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) q0(fVar.f26028f).toArray(new MotionEvent.PointerProperties[fVar.f26027e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) o0(fVar.f26029g, f8).toArray(new MotionEvent.PointerCoords[fVar.f26027e]);
        return (z7 || motionEventB == null) ? MotionEvent.obtain(fVar.f26024b.longValue(), fVar.f26025c.longValue(), fVar.f26026d, fVar.f26027e, pointerPropertiesArr, pointerCoordsArr, fVar.f26030h, fVar.f26031i, fVar.f26032j, fVar.f26033k, fVar.f26034l, fVar.f26035m, fVar.f26036n, fVar.f26037o) : MotionEvent.obtain(motionEventB.getDownTime(), motionEventB.getEventTime(), fVar.f26026d, fVar.f26027e, pointerPropertiesArr, pointerCoordsArr, motionEventB.getMetaState(), motionEventB.getButtonState(), motionEventB.getXPrecision(), motionEventB.getYPrecision(), motionEventB.getDeviceId(), motionEventB.getEdgeFlags(), motionEventB.getSource(), motionEventB.getFlags());
    }
}
