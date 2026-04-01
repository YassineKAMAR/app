package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f639j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.e0.I(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f21222a);
        this.f634e = typedArrayObtainStyledAttributes.getDrawable(e.j.f21227b);
        this.f635f = typedArrayObtainStyledAttributes.getDrawable(e.j.f21237d);
        this.f639j = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f21267j, -1);
        boolean z7 = true;
        if (getId() == e.f.H) {
            this.f637h = true;
            this.f636g = typedArrayObtainStyledAttributes.getDrawable(e.j.f21232c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f637h ? this.f634e != null || this.f635f != null : this.f636g != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f634e;
        if (drawable != null && drawable.isStateful()) {
            this.f634e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f635f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f635f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f636g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f636g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f631b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f634e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f635f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f636g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f632c = findViewById(e.f.f21160a);
        this.f633d = findViewById(e.f.f21165f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f630a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z7, i8, i9, i10, i11);
        View view2 = this.f631b;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i12 = layoutParams.bottomMargin;
            view2.layout(i8, measuredHeight2 - i12, i10, measuredHeight - i12);
        }
        if (this.f637h) {
            Drawable drawable3 = this.f636g;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = false;
            }
        } else {
            if (this.f634e != null) {
                if (this.f632c.getVisibility() == 0) {
                    drawable2 = this.f634e;
                    left = this.f632c.getLeft();
                    top = this.f632c.getTop();
                    right = this.f632c.getRight();
                    view = this.f632c;
                } else {
                    View view3 = this.f633d;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f634e.setBounds(0, 0, 0, 0);
                        z9 = true;
                    } else {
                        drawable2 = this.f634e;
                        left = this.f633d.getLeft();
                        top = this.f633d.getTop();
                        right = this.f633d.getRight();
                        view = this.f633d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z9 = true;
            }
            this.f638i = z10;
            if (!z10 || (drawable = this.f635f) == null) {
                z8 = z9;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z8) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f632c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f639j
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f632c
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f631b
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f632c
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f632c
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f633d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f633d
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f631b
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f634e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f634e);
        }
        this.f634e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f632c;
            if (view != null) {
                this.f634e.setBounds(view.getLeft(), this.f632c.getTop(), this.f632c.getRight(), this.f632c.getBottom());
            }
        }
        boolean z7 = true;
        if (!this.f637h ? this.f634e != null || this.f635f != null : this.f636g != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f636g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f636g);
        }
        this.f636g = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f637h && (drawable2 = this.f636g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f637h ? !(this.f634e != null || this.f635f != null) : this.f636g == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f635f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f635f);
        }
        this.f635f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f638i && (drawable2 = this.f635f) != null) {
                drawable2.setBounds(this.f631b.getLeft(), this.f631b.getTop(), this.f631b.getRight(), this.f631b.getBottom());
            }
        }
        boolean z7 = true;
        if (!this.f637h ? this.f634e != null || this.f635f != null : this.f636g != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(e1 e1Var) {
        View view = this.f631b;
        if (view != null) {
            removeView(view);
        }
        this.f631b = e1Var;
        if (e1Var != null) {
            addView(e1Var);
            ViewGroup.LayoutParams layoutParams = e1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            e1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z7) {
        this.f630a = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z7 = i8 == 0;
        Drawable drawable = this.f634e;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f635f;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f636g;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f634e && !this.f637h) || (drawable == this.f635f && this.f638i) || ((drawable == this.f636g && this.f637h) || super.verifyDrawable(drawable));
    }
}
