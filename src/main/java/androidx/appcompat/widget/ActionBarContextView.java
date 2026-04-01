package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinearLayout f644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f650s;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.b f651a;

        a(j.b bVar) {
            this.f651a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f651a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f21096j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        l1 l1VarU = l1.u(context, attributeSet, e.j.f21342y, i8, 0);
        androidx.core.view.e0.I(this, l1VarU.f(e.j.f21347z));
        this.f647p = l1VarU.m(e.j.D, 0);
        this.f648q = l1VarU.m(e.j.C, 0);
        this.f827e = l1VarU.l(e.j.B, 0);
        this.f650s = l1VarU.m(e.j.A, e.g.f21189d);
        l1VarU.v();
    }

    private void i() {
        if (this.f644m == null) {
            LayoutInflater.from(getContext()).inflate(e.g.f21186a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f644m = linearLayout;
            this.f645n = (TextView) linearLayout.findViewById(e.f.f21164e);
            this.f646o = (TextView) this.f644m.findViewById(e.f.f21163d);
            if (this.f647p != 0) {
                this.f645n.setTextAppearance(getContext(), this.f647p);
            }
            if (this.f648q != 0) {
                this.f646o.setTextAppearance(getContext(), this.f648q);
            }
        }
        this.f645n.setText(this.f640i);
        this.f646o.setText(this.f641j);
        boolean z7 = !TextUtils.isEmpty(this.f640i);
        boolean z8 = !TextUtils.isEmpty(this.f641j);
        int i8 = 0;
        this.f646o.setVisibility(z8 ? 0 : 8);
        LinearLayout linearLayout2 = this.f644m;
        if (!z7 && !z8) {
            i8 = 8;
        }
        linearLayout2.setVisibility(i8);
        if (this.f644m.getParent() == null) {
            addView(this.f644m);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.f1 f(int i8, long j8) {
        return super.f(i8, j8);
    }

    public void g() {
        if (this.f642k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f641j;
    }

    public CharSequence getTitle() {
        return this.f640i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(j.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f642k
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f650s
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f642k = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f642k
            goto L15
        L22:
            android.view.View r0 = r3.f642k
            int r1 = e.f.f21168i
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f826d
            if (r0 == 0) goto L3f
            r0.y()
        L3f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f826d = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f826d
            android.content.Context r2 = r3.f824b
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f826d
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f825c = r4
            r1 = 0
            androidx.core.view.e0.I(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f825c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(j.b):void");
    }

    public boolean j() {
        return this.f649r;
    }

    public void k() {
        removeAllViews();
        this.f643l = null;
        this.f825c = null;
    }

    public boolean l() {
        c cVar = this.f826d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f826d;
        if (cVar != null) {
            cVar.B();
            this.f826d.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f640i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        boolean zB = s1.b(this);
        int paddingRight = zB ? (i10 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        View view = this.f642k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f642k.getLayoutParams();
            int i12 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i12, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f642k, iD, paddingTop, paddingTop2, zB), i13, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f644m;
        if (linearLayout != null && this.f643l == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f644m, iE, paddingTop, paddingTop2, zB);
        }
        int i14 = iE;
        View view2 = this.f643l;
        if (view2 != null) {
            e(view2, i14, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i10 - i8) - getPaddingRight();
        ActionMenuView actionMenuView = this.f825c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i9) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i8);
        int size2 = this.f827e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i9);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f642k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f642k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f825c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f825c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f644m;
        if (linearLayout != null && this.f643l == null) {
            if (this.f649r) {
                this.f644m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f644m.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f644m.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f643l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                iMin = Math.min(i12, iMin);
            }
            this.f643l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(iMin, i13));
        }
        if (this.f827e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i8) {
        this.f827e = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f643l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f643l = view;
        if (view != null && (linearLayout = this.f644m) != null) {
            removeView(linearLayout);
            this.f644m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f641j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f640i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f649r) {
            requestLayout();
        }
        this.f649r = z7;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
