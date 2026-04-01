package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements l0, androidx.core.view.x, androidx.core.view.y {
    static final int[] F = {e.a.f21088b, R.attr.windowContentOverlay};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final androidx.core.view.z E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0 f657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.core.view.j1 f673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.core.view.j1 f674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.core.view.j1 f675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.core.view.j1 f676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OverScroller f678z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f663k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f663k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f656d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f656d.animate().translationY(-ActionBarOverlayLayout.this.f656d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z7);

        void d();

        void e();

        void onWindowVisibilityChanged(int i8);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i8, int i9) {
            super(i8, i9);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f654b = 0;
        this.f666n = new Rect();
        this.f667o = new Rect();
        this.f668p = new Rect();
        this.f669q = new Rect();
        this.f670r = new Rect();
        this.f671s = new Rect();
        this.f672t = new Rect();
        androidx.core.view.j1 j1Var = androidx.core.view.j1.f2213b;
        this.f673u = j1Var;
        this.f674v = j1Var;
        this.f675w = j1Var;
        this.f676x = j1Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        v(context);
        this.E = new androidx.core.view.z(this);
    }

    private void A() {
        u();
        this.C.run();
    }

    private boolean B(float f8) {
        this.f678z.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f678z.getFinalY() > this.f656d.getHeight();
    }

    private void p() {
        u();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m0 t(View view) {
        if (view instanceof m0) {
            return (m0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f653a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f658f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f659g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f678z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.D, 600L);
    }

    private void y() {
        u();
        postDelayed(this.C, 600L);
    }

    @Override // androidx.appcompat.widget.l0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f657e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean b() {
        z();
        return this.f657e.b();
    }

    @Override // androidx.appcompat.widget.l0
    public void c() {
        z();
        this.f657e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean d() {
        z();
        return this.f657e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f658f == null || this.f659g) {
            return;
        }
        int bottom = this.f656d.getVisibility() == 0 ? (int) (this.f656d.getBottom() + this.f656d.getTranslationY() + 0.5f) : 0;
        this.f658f.setBounds(0, bottom, getWidth(), this.f658f.getIntrinsicHeight() + bottom);
        this.f658f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean e() {
        z();
        return this.f657e.e();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean f() {
        z();
        return this.f657e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean g() {
        z();
        return this.f657e.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f656d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f657e.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public void h(int i8) {
        z();
        if (i8 == 2) {
            this.f657e.s();
        } else if (i8 == 5) {
            this.f657e.t();
        } else {
            if (i8 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void i() {
        z();
        this.f657e.h();
    }

    @Override // androidx.core.view.y
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        k(view, i8, i9, i10, i11, i12);
    }

    @Override // androidx.core.view.x
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i8, i9, i10, i11);
        }
    }

    @Override // androidx.core.view.x
    public boolean l(View view, View view2, int i8, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i8);
    }

    @Override // androidx.core.view.x
    public void m(View view, View view2, int i8, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    @Override // androidx.core.view.x
    public void n(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.x
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i8, i9, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.j1 j1VarU = androidx.core.view.j1.u(windowInsets);
        boolean zQ = q(this.f656d, new Rect(j1VarU.i(), j1VarU.k(), j1VarU.j(), j1VarU.h()), true, true, false, true);
        androidx.core.view.e0.c(this, j1VarU, this.f666n);
        Rect rect = this.f666n;
        androidx.core.view.j1 j1VarL = j1VarU.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f673u = j1VarL;
        boolean z7 = true;
        if (!this.f674v.equals(j1VarL)) {
            this.f674v = this.f673u;
            zQ = true;
        }
        if (this.f667o.equals(this.f666n)) {
            z7 = zQ;
        } else {
            this.f667o.set(this.f666n);
        }
        if (z7) {
            requestLayout();
        }
        return j1VarU.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.e0.E(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measuredHeight;
        androidx.core.view.j1 j1VarA;
        z();
        measureChildWithMargins(this.f656d, i8, 0, i9, 0);
        e eVar = (e) this.f656d.getLayoutParams();
        int iMax = Math.max(0, this.f656d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f656d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f656d.getMeasuredState());
        boolean z7 = (androidx.core.view.e0.s(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.f653a;
            if (this.f661i && this.f656d.getTabContainer() != null) {
                measuredHeight += this.f653a;
            }
        } else {
            measuredHeight = this.f656d.getVisibility() != 8 ? this.f656d.getMeasuredHeight() : 0;
        }
        this.f668p.set(this.f666n);
        androidx.core.view.j1 j1Var = this.f673u;
        this.f675w = j1Var;
        if (this.f660h || z7) {
            j1VarA = new j1.b(this.f675w).c(androidx.core.graphics.b.b(j1Var.i(), this.f675w.k() + measuredHeight, this.f675w.j(), this.f675w.h() + 0)).a();
        } else {
            Rect rect = this.f668p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            j1VarA = j1Var.l(0, measuredHeight, 0, 0);
        }
        this.f675w = j1VarA;
        q(this.f655c, this.f668p, true, true, true, true);
        if (!this.f676x.equals(this.f675w)) {
            androidx.core.view.j1 j1Var2 = this.f675w;
            this.f676x = j1Var2;
            androidx.core.view.e0.d(this.f655c, j1Var2);
        }
        measureChildWithMargins(this.f655c, i8, 0, i9, 0);
        e eVar2 = (e) this.f655c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f655c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f655c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f655c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (!this.f662j || !z7) {
            return false;
        }
        if (B(f9)) {
            p();
        } else {
            A();
        }
        this.f663k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        int i12 = this.f664l + i9;
        this.f664l = i12;
        setActionBarHideOffset(i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        this.E.b(view, view2, i8);
        this.f664l = getActionBarHideOffset();
        u();
        d dVar = this.f677y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f656d.getVisibility() != 0) {
            return false;
        }
        return this.f662j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f662j && !this.f663k) {
            if (this.f664l <= this.f656d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f677y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        z();
        int i9 = this.f665m ^ i8;
        this.f665m = i8;
        boolean z7 = (i8 & 4) == 0;
        boolean z8 = (i8 & 256) != 0;
        d dVar = this.f677y;
        if (dVar != null) {
            dVar.c(!z8);
            if (z7 || !z8) {
                this.f677y.a();
            } else {
                this.f677y.d();
            }
        }
        if ((i9 & 256) == 0 || this.f677y == null) {
            return;
        }
        androidx.core.view.e0.E(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f654b = i8;
        d dVar = this.f677y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i8) {
        u();
        this.f656d.setTranslationY(-Math.max(0, Math.min(i8, this.f656d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f677y = dVar;
        if (getWindowToken() != null) {
            this.f677y.onWindowVisibilityChanged(this.f654b);
            int i8 = this.f665m;
            if (i8 != 0) {
                onWindowSystemUiVisibilityChanged(i8);
                androidx.core.view.e0.E(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f661i = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f662j) {
            this.f662j = z7;
            if (z7) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i8) {
        z();
        this.f657e.setIcon(i8);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f657e.setIcon(drawable);
    }

    public void setLogo(int i8) {
        z();
        this.f657e.l(i8);
    }

    public void setOverlayMode(boolean z7) {
        this.f660h = z7;
        this.f659g = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i8) {
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f657e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f657e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f660h;
    }

    void z() {
        if (this.f655c == null) {
            this.f655c = (ContentFrameLayout) findViewById(e.f.f21161b);
            this.f656d = (ActionBarContainer) findViewById(e.f.f21162c);
            this.f657e = t(findViewById(e.f.f21160a));
        }
    }
}
