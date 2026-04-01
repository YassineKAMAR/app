package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f1112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f1113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f1114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1118o;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1120b;

        public a(int i8, int i9) {
            super(i8, i9);
            this.f1120b = -1;
            this.f1119a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1120b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f21279l1);
            this.f1119a = typedArrayObtainStyledAttributes.getFloat(e.j.f21289n1, 0.0f);
            this.f1120b = typedArrayObtainStyledAttributes.getInt(e.j.f21284m1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1120b = -1;
        }
    }

    public r0(Context context) {
        this(context, null);
    }

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f1104a = true;
        this.f1105b = -1;
        this.f1106c = 0;
        this.f1108e = 8388659;
        int[] iArr = e.j.f21229b1;
        l1 l1VarU = l1.u(context, attributeSet, iArr, i8, 0);
        androidx.core.view.e0.F(this, context, iArr, attributeSet, l1VarU.q(), i8, 0);
        int iJ = l1VarU.j(e.j.f21239d1, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = l1VarU.j(e.j.f21234c1, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = l1VarU.a(e.j.f21244e1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1110g = l1VarU.h(e.j.f21254g1, -1.0f);
        this.f1105b = l1VarU.j(e.j.f21249f1, -1);
        this.f1111h = l1VarU.a(e.j.f21269j1, false);
        setDividerDrawable(l1VarU.f(e.j.f21259h1));
        this.f1117n = l1VarU.j(e.j.f21274k1, 0);
        this.f1118o = l1VarU.e(e.j.f21264i1, 0);
        l1VarU.v();
    }

    private void g(int i8, int i9) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View viewO = o(i10);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i11 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewO.getMeasuredWidth();
                    measureChildWithMargins(viewO, i9, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i11;
                }
            }
        }
    }

    private void h(int i8, int i9) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View viewO = o(i10);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i11 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewO.getMeasuredHeight();
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i9, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i11;
                }
            }
        }
    }

    private void w(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = s1.b(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View viewO = o(i8);
            if (viewO != null && viewO.getVisibility() != 8 && p(i8)) {
                a aVar = (a) viewO.getLayoutParams();
                f(canvas, zB ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1115l);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 != null) {
                a aVar2 = (a) viewO2.getLayoutParams();
                if (zB) {
                    left = viewO2.getLeft();
                    paddingRight = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f1115l;
                } else {
                    right = viewO2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1115l;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View viewO = o(i8);
            if (viewO != null && viewO.getVisibility() != 8 && p(i8)) {
                e(canvas, (viewO.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewO.getLayoutParams())).topMargin) - this.f1116m);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            e(canvas, viewO2 == null ? (getHeight() - getPaddingBottom()) - this.f1116m : viewO2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewO2.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i8) {
        this.f1114k.setBounds(getPaddingLeft() + this.f1118o, i8, (getWidth() - getPaddingRight()) - this.f1118o, this.f1116m + i8);
        this.f1114k.draw(canvas);
    }

    void f(Canvas canvas, int i8) {
        this.f1114k.setBounds(i8, getPaddingTop() + this.f1118o, this.f1115l + i8, (getHeight() - getPaddingBottom()) - this.f1118o);
        this.f1114k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i8;
        if (this.f1105b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f1105b;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1105b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1106c;
        if (this.f1107d == 1 && (i8 = this.f1108e & 112) != 48) {
            if (i8 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1109f) / 2;
            } else if (i8 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1109f;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1105b;
    }

    public Drawable getDividerDrawable() {
        return this.f1114k;
    }

    public int getDividerPadding() {
        return this.f1118o;
    }

    public int getDividerWidth() {
        return this.f1115l;
    }

    public int getGravity() {
        return this.f1108e;
    }

    public int getOrientation() {
        return this.f1107d;
    }

    public int getShowDividers() {
        return this.f1117n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1110g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i8 = this.f1107d;
        if (i8 == 0) {
            return new a(-2, -2);
        }
        if (i8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i8) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i8) {
        return getChildAt(i8);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1114k == null) {
            return;
        }
        if (this.f1107d == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        if (this.f1107d == 1) {
            r(i8, i9, i10, i11);
        } else {
            q(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f1107d == 1) {
            v(i8, i9);
        } else {
            t(i8, i9);
        }
    }

    protected boolean p(int i8) {
        if (i8 == 0) {
            return (this.f1117n & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.f1117n & 4) != 0;
        }
        if ((this.f1117n & 2) == 0) {
            return false;
        }
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (getChildAt(i9).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void q(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.q(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void r(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1108e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1109f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1109f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.o(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.u(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.r0$a r5 = (androidx.appcompat.widget.r0.a) r5
            int r1 = r5.f1120b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.e0.n(r17)
            int r1 = androidx.core.view.d.a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.p(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1116m
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.w(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.n(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.l(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.r(int, int, int, int):void");
    }

    void s(View view, int i8, int i9, int i10, int i11, int i12) {
        measureChildWithMargins(view, i9, i10, i11, i12);
    }

    public void setBaselineAligned(boolean z7) {
        this.f1104a = z7;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 >= 0 && i8 < getChildCount()) {
            this.f1105b = i8;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1114k) {
            return;
        }
        this.f1114k = drawable;
        if (drawable != null) {
            this.f1115l = drawable.getIntrinsicWidth();
            this.f1116m = drawable.getIntrinsicHeight();
        } else {
            this.f1115l = 0;
            this.f1116m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i8) {
        this.f1118o = i8;
    }

    public void setGravity(int i8) {
        if (this.f1108e != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f1108e = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i9 = i8 & 8388615;
        int i10 = this.f1108e;
        if ((8388615 & i10) != i9) {
            this.f1108e = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f1111h = z7;
    }

    public void setOrientation(int i8) {
        if (this.f1107d != i8) {
            this.f1107d = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.f1117n) {
            requestLayout();
        }
        this.f1117n = i8;
    }

    public void setVerticalGravity(int i8) {
        int i9 = i8 & 112;
        int i10 = this.f1108e;
        if ((i10 & 112) != i9) {
            this.f1108e = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f1110g = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03ad A[PHI: r3
  0x03ad: PHI (r3v32 int) = (r3v28 int), (r3v33 int) binds: [B:168:0x03ab, B:164:0x03a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.t(int, int):void");
    }

    int u(int i8) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02db A[PHI: r10
  0x02db: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02d9, B:131:0x02ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.v(int, int):void");
    }
}
