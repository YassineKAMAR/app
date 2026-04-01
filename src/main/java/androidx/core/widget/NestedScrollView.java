package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.f;
import androidx.core.view.e0;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements androidx.core.view.y {
    private static final float B = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a C = new a();
    private static final int[] D = {R.attr.fillViewport};
    private c A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f2263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f2264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f2265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f2266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f2270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f2272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f2279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f2280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2281u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d f2283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final androidx.core.view.z f2284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.core.view.w f2285y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2286z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.h.a(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.h.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.f fVar) {
            int scrollRange;
            super.g(view, fVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.I(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            fVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                fVar.a(f.a.f2158r);
                fVar.a(f.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                fVar.a(f.a.f2157q);
                fVar.a(f.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i8, Bundle bundle) {
            if (super.j(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, iMax, true);
                    return true;
                }
                if (i8 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2287a;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i8) {
                return new d[i8];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f2287a = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2287a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f2287a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w.a.f26989c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f2263c = new Rect();
        this.f2268h = true;
        this.f2269i = false;
        this.f2270j = null;
        this.f2271k = false;
        this.f2274n = true;
        this.f2278r = -1;
        this.f2279s = new int[2];
        this.f2280t = new int[2];
        this.f2265e = e.a(context, attributeSet);
        this.f2266f = e.a(context, attributeSet);
        this.f2261a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, i8, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2284x = new androidx.core.view.z(this);
        this.f2285y = new androidx.core.view.w(this);
        setNestedScrollingEnabled(true);
        e0.H(this, C);
    }

    private void A() {
        this.f2264d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2275o = viewConfiguration.getScaledTouchSlop();
        this.f2276p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2277q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2272l == null) {
            this.f2272l = VelocityTracker.obtain();
        }
    }

    private void C(int i8, int i9) {
        this.f2267g = i8;
        this.f2278r = i9;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i8, int i9) {
        view.getDrawingRect(this.f2263c);
        offsetDescendantRectToMyCoords(view, this.f2263c);
        return this.f2263c.bottom + i8 >= getScrollY() && this.f2263c.top - i8 <= getScrollY() + i9;
    }

    private void G(int i8, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2285y.d(0, scrollY2, 0, i8 - scrollY2, null, i9, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2278r) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f2267g = (int) motionEvent.getY(i8);
            this.f2278r = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f2272l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f2272l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2272l = null;
        }
    }

    private int L(int i8, float f8) {
        float fD;
        EdgeEffect edgeEffect;
        float width = f8 / getWidth();
        float height = i8 / getHeight();
        float f9 = 0.0f;
        if (e.b(this.f2265e) != 0.0f) {
            fD = -e.d(this.f2265e, -height, width);
            if (e.b(this.f2265e) == 0.0f) {
                edgeEffect = this.f2265e;
                edgeEffect.onRelease();
            }
            f9 = fD;
        } else if (e.b(this.f2266f) != 0.0f) {
            fD = e.d(this.f2266f, height, 1.0f - width);
            if (e.b(this.f2266f) == 0.0f) {
                edgeEffect = this.f2266f;
                edgeEffect.onRelease();
            }
            f9 = fD;
        }
        int iRound = Math.round(f9 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void M(boolean z7) {
        if (z7) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f2282v = getScrollY();
        e0.B(this);
    }

    private boolean N(int i8, int i9, int i10) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i8 == 33;
        View viewT = t(z8, i9, i10);
        if (viewT == null) {
            viewT = this;
        }
        if (i9 < scrollY || i10 > i11) {
            O(z8 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z7 = true;
        }
        if (viewT != findFocus()) {
            viewT.requestFocus(i8);
        }
        return z7;
    }

    private int O(int i8, int i9, int i10, boolean z7) {
        int i11;
        int i12;
        EdgeEffect edgeEffect;
        if (i10 == 1) {
            W(2, i10);
        }
        boolean z8 = false;
        if (h(0, i8, this.f2280t, this.f2279s, i10)) {
            i11 = i8 - this.f2280t[1];
            i12 = this.f2279s[1] + 0;
        } else {
            i11 = i8;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z9 = c() && !z7;
        boolean z10 = I(0, i11, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i10);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f2280t;
        iArr[1] = 0;
        i(0, scrollY2, 0, i11 - scrollY2, this.f2279s, i10, iArr);
        int i13 = i12 + this.f2279s[1];
        int i14 = i11 - this.f2280t[1];
        int i15 = scrollY + i14;
        if (i15 < 0) {
            if (z9) {
                e.d(this.f2265e, (-i14) / getHeight(), i9 / getWidth());
                if (!this.f2266f.isFinished()) {
                    edgeEffect = this.f2266f;
                    edgeEffect.onRelease();
                }
            }
        } else if (i15 > scrollRange && z9) {
            e.d(this.f2266f, i14 / getHeight(), 1.0f - (i9 / getWidth()));
            if (!this.f2265e.isFinished()) {
                edgeEffect = this.f2265e;
                edgeEffect.onRelease();
            }
        }
        if (this.f2265e.isFinished() && this.f2266f.isFinished()) {
            z8 = z10;
        } else {
            e0.B(this);
        }
        if (z8 && i10 == 0) {
            this.f2272l.clear();
        }
        if (i10 == 1) {
            Y(i10);
            this.f2265e.onRelease();
            this.f2266f.onRelease();
        }
        return i13;
    }

    private void P(View view) {
        view.getDrawingRect(this.f2263c);
        offsetDescendantRectToMyCoords(view, this.f2263c);
        int iF = f(this.f2263c);
        if (iF != 0) {
            scrollBy(0, iF);
        }
    }

    private boolean Q(Rect rect, boolean z7) {
        int iF = f(rect);
        boolean z8 = iF != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, iF);
            } else {
                S(0, iF);
            }
        }
        return z8;
    }

    private boolean R(EdgeEffect edgeEffect, int i8) {
        if (i8 > 0) {
            return true;
        }
        return w(-i8) < e.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i8, int i9, int i10, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2262b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2264d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, i10);
            M(z7);
        } else {
            if (!this.f2264d.isFinished()) {
                a();
            }
            scrollBy(i8, i9);
        }
        this.f2262b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z7;
        if (e.b(this.f2265e) != 0.0f) {
            e.d(this.f2265e, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (e.b(this.f2266f) == 0.0f) {
            return z7;
        }
        e.d(this.f2266f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f2264d.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i8, int i9, int i10) {
        if (i9 >= i10 || i8 < 0) {
            return 0;
        }
        return i9 + i8 > i10 ? i10 - i9 : i8;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2286z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2286z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2286z;
    }

    private void p(int i8) {
        if (i8 != 0) {
            if (this.f2274n) {
                S(0, i8);
            } else {
                scrollBy(0, i8);
            }
        }
    }

    private boolean q(int i8) {
        EdgeEffect edgeEffect;
        if (e.b(this.f2265e) != 0.0f) {
            if (R(this.f2265e, i8)) {
                edgeEffect = this.f2265e;
                edgeEffect.onAbsorb(i8);
            } else {
                i8 = -i8;
                u(i8);
            }
        } else {
            if (e.b(this.f2266f) == 0.0f) {
                return false;
            }
            i8 = -i8;
            if (R(this.f2266f, i8)) {
                edgeEffect = this.f2266f;
                edgeEffect.onAbsorb(i8);
            }
            u(i8);
        }
        return true;
    }

    private void r() {
        this.f2278r = -1;
        this.f2271k = false;
        K();
        Y(0);
        this.f2265e.onRelease();
        this.f2266f.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View t(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.t(boolean, int, int):android.view.View");
    }

    private float w(int i8) {
        double dLog = Math.log((Math.abs(i8) * 0.35f) / (this.f2261a * 0.015f));
        float f8 = B;
        return (float) (((double) (this.f2261a * 0.015f)) * Math.exp((((double) f8) / (((double) f8) - 1.0d)) * dLog));
    }

    private boolean y(int i8, int i9) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i9 >= childAt.getTop() - scrollY && i9 < childAt.getBottom() - scrollY && i8 >= childAt.getLeft() && i8 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2272l;
        if (velocityTracker == null) {
            this.f2272l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean I(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.x(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2264d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean J(int i8) {
        boolean z7 = i8 == 130;
        int height = getHeight();
        if (z7) {
            this.f2263c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2263c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2263c.top = getScrollY() - height;
            Rect rect2 = this.f2263c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2263c;
        int i9 = rect3.top;
        int i10 = height + i9;
        rect3.bottom = i10;
        return N(i8, i9, i10);
    }

    public final void S(int i8, int i9) {
        T(i8, i9, 250, false);
    }

    void U(int i8, int i9, int i10, boolean z7) {
        T(i8 - getScrollX(), i9 - getScrollY(), i10, z7);
    }

    void V(int i8, int i9, boolean z7) {
        U(i8, i9, 250, z7);
    }

    public boolean W(int i8, int i9) {
        return this.f2285y.m(i8, i9);
    }

    public void Y(int i8) {
        this.f2285y.n(i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i8, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i8) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !F(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f2263c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f2263c);
            O(f(this.f2263c), 0, 1, true);
            viewFindNextFocus.requestFocus(i8);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && D(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2264d.isFinished()) {
            return;
        }
        this.f2264d.computeScrollOffset();
        int currY = this.f2264d.getCurrY();
        int iG = g(currY - this.f2282v);
        this.f2282v = currY;
        int[] iArr = this.f2280t;
        boolean z7 = false;
        iArr[1] = 0;
        h(0, iG, iArr, null, 1);
        int i8 = iG - this.f2280t[1];
        int scrollRange = getScrollRange();
        if (i8 != 0) {
            int scrollY = getScrollY();
            I(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i9 = i8 - scrollY2;
            int[] iArr2 = this.f2280t;
            iArr2[1] = 0;
            i(0, scrollY2, 0, i9, this.f2279s, 1, iArr2);
            i8 = i9 - this.f2280t[1];
        }
        if (i8 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z7 = true;
            }
            if (z7) {
                if (i8 < 0) {
                    if (this.f2265e.isFinished()) {
                        edgeEffect = this.f2265e;
                        edgeEffect.onAbsorb((int) this.f2264d.getCurrVelocity());
                    }
                } else if (this.f2266f.isFinished()) {
                    edgeEffect = this.f2266f;
                    edgeEffect.onAbsorb((int) this.f2264d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f2264d.isFinished()) {
            Y(1);
        } else {
            e0.B(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return this.f2285y.a(f8, f9, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f2285y.b(f8, f9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return h(i8, i9, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.f2285y.e(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f2265e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f2265e.setSize(width, height);
            if (this.f2265e.draw(canvas)) {
                e0.B(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f2266f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2266f.setSize(width2, height2);
        if (this.f2266f.draw(canvas)) {
            e0.B(this);
        }
        canvas.restoreToCount(iSave2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i9) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i8) {
        int height = getHeight();
        if (i8 > 0 && e.b(this.f2265e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * e.d(this.f2265e, ((-i8) * 4.0f) / height, 0.5f));
            if (iRound != i8) {
                this.f2265e.finish();
            }
            return i8 - iRound;
        }
        if (i8 >= 0 || e.b(this.f2266f) == 0.0f) {
            return i8;
        }
        float f8 = height;
        int iRound2 = Math.round((f8 / 4.0f) * e.d(this.f2266f, (i8 * 4.0f) / f8, 0.5f));
        if (iRound2 != i8) {
            this.f2266f.finish();
        }
        return i8 - iRound2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2284x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return this.f2285y.c(i8, i9, iArr, iArr2, i10);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public void i(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        this.f2285y.d(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f2285y.j();
    }

    @Override // androidx.core.view.y
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        G(i11, i12, iArr);
    }

    @Override // androidx.core.view.x
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        G(i11, i12, null);
    }

    @Override // androidx.core.view.x
    public boolean l(View view, View view2, int i8, int i9) {
        return (i8 & 2) != 0;
    }

    @Override // androidx.core.view.x
    public void m(View view, View view2, int i8, int i9) {
        this.f2284x.c(view, view2, i8, i9);
        W(2, i9);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i8, int i9) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.x
    public void n(View view, int i8) {
        this.f2284x.d(view, i8);
        Y(i8);
    }

    @Override // androidx.core.view.x
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        h(i8, i9, iArr, null, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2269i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int width;
        if (motionEvent.getAction() != 8 || this.f2271k) {
            return false;
        }
        if (androidx.core.view.v.a(motionEvent, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if (androidx.core.view.v.a(motionEvent, 4194304)) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            axisValue = axisValue2;
        } else {
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        O(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, androidx.core.view.v.a(motionEvent, 8194));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        int measuredHeight = 0;
        this.f2268h = false;
        View view = this.f2270j;
        if (view != null && E(view, this)) {
            P(this.f2270j);
        }
        this.f2270j = null;
        if (!this.f2269i) {
            if (this.f2283w != null) {
                scrollTo(getScrollX(), this.f2283w.f2287a);
                this.f2283w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE = e(scrollY, paddingTop, measuredHeight);
            if (iE != scrollY) {
                scrollTo(getScrollX(), iE);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2269i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f2273m && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        u((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        o(view, i8, i9, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        G(i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i8, int i9, boolean z7, boolean z8) {
        super.scrollTo(i8, i9);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i8) : focusFinder.findNextFocusFromRect(this, rect, i8);
        if (viewFindNextFocus == null || D(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i8, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2283w = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2287a = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(this, i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !F(viewFindFocus, 0, i11)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f2263c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f2263c);
        p(f(this.f2263c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2268h) {
            this.f2270j = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2268h = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2263c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        J(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE = e(i8, width, width2);
            int iE2 = e(i9, height, height2);
            if (iE == getScrollX() && iE2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE, iE2);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f2273m) {
            this.f2273m = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.f2285y.k(z7);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.A = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f2274n = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i8) {
        return W(i8, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i8) {
        if (getChildCount() > 0) {
            this.f2264d.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i8) {
        int childCount;
        boolean z7 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f2263c;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2263c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2263c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2263c;
        return N(i8, rect3.top, rect3.bottom);
    }

    public boolean x(int i8) {
        return this.f2285y.i(i8);
    }
}
