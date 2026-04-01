package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.j1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f2187c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2185a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakHashMap<View, f1> f2186b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f2188d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f2189e = {w.b.f26991b, w.b.f26992c, w.b.f27003n, w.b.f27014y, w.b.B, w.b.C, w.b.D, w.b.E, w.b.F, w.b.G, w.b.f26993d, w.b.f26994e, w.b.f26995f, w.b.f26996g, w.b.f26997h, w.b.f26998i, w.b.f26999j, w.b.f27000k, w.b.f27001l, w.b.f27002m, w.b.f27004o, w.b.f27005p, w.b.f27006q, w.b.f27007r, w.b.f27008s, w.b.f27009t, w.b.f27010u, w.b.f27011v, w.b.f27012w, w.b.f27013x, w.b.f27015z, w.b.A};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b0 f2190f = new b0() { // from class: androidx.core.view.d0
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f2191g = new e();

    class a extends f<Boolean> {
        a(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(n.d(view));
        }
    }

    class b extends f<CharSequence> {
        b(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }
    }

    class c extends f<CharSequence> {
        c(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return p.a(view);
        }
    }

    class d extends f<Boolean> {
        d(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.e0.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(n.c(view));
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f2192a = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z7) {
            boolean z8 = view.isShown() && view.getWindowVisibility() == 0;
            if (z7 != z8) {
                e0.y(view, z8 ? 16 : 32);
                this.f2192a.put(view, Boolean.valueOf(z8));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2192a.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f2194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f2196d;

        f(int i8, Class<T> cls, int i9) {
            this(i8, cls, 0, i9);
        }

        f(int i8, Class<T> cls, int i9, int i10) {
            this.f2193a = i8;
            this.f2194b = cls;
            this.f2196d = i9;
            this.f2195c = i10;
        }

        private boolean a() {
            return true;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f2195c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t7 = (T) view.getTag(this.f2193a);
            if (this.f2194b.isInstance(t7)) {
                return t7;
            }
            return null;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i8, Bundle bundle) {
            return view.performAccessibilityAction(i8, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i8, int i9, int i10, int i11) {
            view.postInvalidateOnAnimation(i8, i9, i10, i11);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j8) {
            view.postOnAnimationDelayed(runnable, j8);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z7) {
            view.setHasTransientState(z7);
        }

        static void s(View view, int i8) {
            view.setImportantForAccessibility(i8);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i8) {
            view.setLabelFor(i8);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i8) {
            view.setLayoutDirection(i8);
        }

        static void k(View view, int i8, int i9, int i10, int i11) {
            view.setPaddingRelative(i8, i9, i10, i11);
        }
    }

    static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i8);
        }

        static void f(View view, int i8) {
            view.setAccessibilityLiveRegion(i8);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i8) {
            accessibilityEvent.setContentChangeTypes(i8);
        }
    }

    static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class l {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            j1 f2197a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a0 f2199c;

            a(View view, a0 a0Var) {
                this.f2198b = view;
                this.f2199c = a0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j1 j1VarV = j1.v(windowInsets, view);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 30) {
                    l.a(windowInsets, this.f2198b);
                    if (j1VarV.equals(this.f2197a)) {
                        return this.f2199c.a(view, j1VarV).t();
                    }
                }
                this.f2197a = j1VarV;
                j1 j1VarA = this.f2199c.a(view, j1VarV);
                if (i8 >= 30) {
                    return j1VarA.t();
                }
                e0.E(view);
                return j1VarA.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(w.b.Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static j1 b(View view, j1 j1Var, Rect rect) {
            WindowInsets windowInsetsT = j1Var.t();
            if (windowInsetsT != null) {
                return j1.v(view.computeSystemWindowInsets(windowInsetsT, rect), view);
            }
            rect.setEmpty();
            return j1Var;
        }

        static boolean c(View view, float f8, float f9, boolean z7) {
            return view.dispatchNestedFling(f8, f9, z7);
        }

        static boolean d(View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        static boolean e(View view, int i8, int i9, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i8, i9, iArr, iArr2);
        }

        static boolean f(View view, int i8, int i9, int i10, int i11, int[] iArr) {
            return view.dispatchNestedScroll(i8, i9, i10, i11, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static j1 j(View view) {
            return j1.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f8) {
            view.setElevation(f8);
        }

        static void t(View view, boolean z7) {
            view.setNestedScrollingEnabled(z7);
        }

        static void u(View view, a0 a0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(w.b.L, a0Var);
            }
            if (a0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(w.b.Q));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, a0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f8) {
            view.setTranslationZ(f8);
        }

        static void x(View view, float f8) {
            view.setZ(f8);
        }

        static boolean y(View view, int i8) {
            return view.startNestedScroll(i8);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class m {
        public static j1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j1 j1VarU = j1.u(rootWindowInsets);
            j1VarU.r(j1VarU);
            j1VarU.d(view.getRootView());
            return j1VarU;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i8) {
            view.setScrollIndicators(i8);
        }

        static void d(View view, int i8, int i9) {
            view.setScrollIndicators(i8, i9);
        }
    }

    static class n {
        static void a(View view, final q qVar) {
            int i8 = w.b.P;
            p.h hVar = (p.h) view.getTag(i8);
            if (hVar == null) {
                hVar = new p.h();
                view.setTag(i8, hVar);
            }
            Objects.requireNonNull(qVar);
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = new View$OnUnhandledKeyEventListener() { // from class: androidx.core.view.s0
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return qVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(qVar, view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q qVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            p.h hVar = (p.h) view.getTag(w.b.P);
            if (hVar == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i8) {
            return (T) view.requireViewById(i8);
        }

        static void g(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    private static class o {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i9);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class p {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2200d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2201a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2202b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f2203c = null;

        r() {
        }

        static r a(View view) {
            int i8 = w.b.O;
            r rVar = (r) view.getTag(i8);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(i8, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2201a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f2202b == null) {
                this.f2202b = new SparseArray<>();
            }
            return this.f2202b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(w.b.P);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2201a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2200d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2201a == null) {
                    this.f2201a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2200d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2201a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2201a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2203c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2203c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && e0.v(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    private static f<CharSequence> A() {
        return new b(w.b.K, CharSequence.class, 8, 28);
    }

    public static void B(View view) {
        h.k(view);
    }

    public static void C(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    public static void D(View view, Runnable runnable, long j8) {
        h.n(view, runnable, j8);
    }

    public static void E(View view) {
        k.c(view);
    }

    public static void F(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.c(view, context, iArr, attributeSet, typedArray, i8, i9);
        }
    }

    private static f<Boolean> G() {
        return new a(w.b.M, Boolean.class, 28);
    }

    public static void H(View view, androidx.core.view.a aVar) {
        if (aVar == null && (g(view) instanceof a.C0028a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void I(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static void J(View view, ColorStateList colorStateList) {
        int i8 = Build.VERSION.SDK_INT;
        l.q(view, colorStateList);
        if (i8 == 21) {
            Drawable background = view.getBackground();
            boolean z7 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z7) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void K(View view, PorterDuff.Mode mode) {
        int i8 = Build.VERSION.SDK_INT;
        l.r(view, mode);
        if (i8 == 21) {
            Drawable background = view.getBackground();
            boolean z7 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z7) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void L(View view, float f8) {
        l.s(view, f8);
    }

    public static void M(View view, int i8) {
        h.s(view, i8);
    }

    public static void N(View view, a0 a0Var) {
        l.u(view, a0Var);
    }

    public static void O(View view, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(view, i8, i9);
        }
    }

    public static void P(View view, String str) {
        l.v(view, str);
    }

    private static void Q(View view) {
        if (m(view) == 0) {
            M(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m((View) parent) == 4) {
                M(view, 2);
                return;
            }
        }
    }

    private static f<CharSequence> R() {
        return new c(w.b.N, CharSequence.class, 64, 30);
    }

    public static void S(View view) {
        l.z(view);
    }

    private static f<Boolean> a() {
        return new d(w.b.J, Boolean.class, 28);
    }

    public static f1 b(View view) {
        if (f2186b == null) {
            f2186b = new WeakHashMap<>();
        }
        f1 f1Var = f2186b.get(view);
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(view);
        f2186b.put(view, f1Var2);
        return f1Var2;
    }

    public static j1 c(View view, j1 j1Var, Rect rect) {
        return l.b(view, j1Var, rect);
    }

    public static j1 d(View view, j1 j1Var) {
        WindowInsets windowInsetsT = j1Var.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsA = k.a(view, windowInsetsT);
            if (!windowInsetsA.equals(windowInsetsT)) {
                return j1.v(windowInsetsA, view);
            }
        }
        return j1Var;
    }

    static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate g(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : h(view);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (f2188d) {
            return null;
        }
        if (f2187c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2187c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2188d = true;
                return null;
            }
        }
        try {
            Object obj = f2187c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2188d = true;
            return null;
        }
    }

    public static int i(View view) {
        return j.a(view);
    }

    public static CharSequence j(View view) {
        return A().d(view);
    }

    public static ColorStateList k(View view) {
        return l.g(view);
    }

    public static PorterDuff.Mode l(View view) {
        return l.h(view);
    }

    public static int m(View view) {
        return h.c(view);
    }

    public static int n(View view) {
        return i.d(view);
    }

    public static int o(View view) {
        return h.d(view);
    }

    public static j1 p(View view) {
        return Build.VERSION.SDK_INT >= 23 ? m.a(view) : l.j(view);
    }

    public static CharSequence q(View view) {
        return R().d(view);
    }

    public static String r(View view) {
        return l.k(view);
    }

    @Deprecated
    public static int s(View view) {
        return h.g(view);
    }

    public static boolean t(View view) {
        return g.a(view);
    }

    public static boolean u(View view) {
        Boolean boolD = a().d(view);
        return boolD != null && boolD.booleanValue();
    }

    public static boolean v(View view) {
        return j.b(view);
    }

    public static boolean w(View view) {
        return j.c(view);
    }

    public static boolean x(View view) {
        Boolean boolD = G().d(view);
        return boolD != null && boolD.booleanValue();
    }

    static void y(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = j(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (i(view) != 0 || z7) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z7 ? 32 : 2048);
                j.g(accessibilityEventObtain, i8);
                if (z7) {
                    accessibilityEventObtain.getText().add(j(view));
                    Q(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i8 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                j.g(accessibilityEventObtain2, i8);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(j(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i8);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e8);
                }
            }
        }
    }

    public static j1 z(View view, j1 j1Var) {
        WindowInsets windowInsetsT = j1Var.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsB = k.b(view, windowInsetsT);
            if (!windowInsetsB.equals(windowInsetsT)) {
                return j1.v(windowInsetsB, view);
            }
        }
        return j1Var;
    }
}
