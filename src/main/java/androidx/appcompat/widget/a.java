package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0011a f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected androidx.core.view.f1 f828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f830h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0011a implements androidx.core.view.g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f831a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f832b;

        protected C0011a() {
        }

        @Override // androidx.core.view.g1
        public void a(View view) {
            this.f831a = true;
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            if (this.f831a) {
                return;
            }
            a aVar = a.this;
            aVar.f828f = null;
            a.super.setVisibility(this.f832b);
        }

        @Override // androidx.core.view.g1
        public void c(View view) {
            a.super.setVisibility(0);
            this.f831a = false;
        }

        public C0011a d(androidx.core.view.f1 f1Var, int i8) {
            a.this.f828f = f1Var;
            this.f832b = i8;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f823a = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.f21087a, typedValue, true) || typedValue.resourceId == 0) {
            this.f824b = context;
        } else {
            this.f824b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i8, int i9, boolean z7) {
        return z7 ? i8 - i9 : i8 + i9;
    }

    protected int c(View view, int i8, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i9);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - i10);
    }

    protected int e(View view, int i8, int i9, int i10, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i9 + ((i10 - measuredHeight) / 2);
        if (z7) {
            view.layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
        } else {
            view.layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.f1 f(int i8, long j8) {
        androidx.core.view.f1 f1VarB;
        androidx.core.view.f1 f1Var = this.f828f;
        if (f1Var != null) {
            f1Var.c();
        }
        if (i8 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            f1VarB = androidx.core.view.e0.b(this).b(1.0f);
        } else {
            f1VarB = androidx.core.view.e0.b(this).b(0.0f);
        }
        f1VarB.f(j8);
        f1VarB.h(this.f823a.d(f1VarB, i8));
        return f1VarB;
    }

    public int getAnimatedVisibility() {
        return this.f828f != null ? this.f823a.f832b : getVisibility();
    }

    public int getContentHeight() {
        return this.f827e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f21222a, e.a.f21089c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(e.j.f21267j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f826d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f830h = false;
        }
        if (!this.f830h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f830h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f830h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f829g = false;
        }
        if (!this.f829g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f829g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f829g = false;
        }
        return true;
    }

    public void setContentHeight(int i8) {
        this.f827e = i8;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            androidx.core.view.f1 f1Var = this.f828f;
            if (f1Var != null) {
                f1Var.c();
            }
            super.setVisibility(i8);
        }
    }
}
