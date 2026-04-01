package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.r0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends r0 implements e.b, androidx.appcompat.view.menu.k {
    e A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.appcompat.widget.c f686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j.a f687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    e.a f688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f692z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends r0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f698h;

        public c(int i8, int i9) {
            super(i8, i9);
            this.f693c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f693c = cVar.f693c;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f688v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f691y = (int) (56.0f * f8);
        this.f692z = (int) (f8 * 4.0f);
        this.f683q = context;
        this.f684r = 0;
    }

    static int H(View view, int i8, int i9, int i10, int i11) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - i11, View.MeasureSpec.getMode(i10));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z7 = actionMenuItemView != null && actionMenuItemView.f();
        int i12 = 2;
        if (i9 <= 0 || (z7 && i9 < 2)) {
            i12 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i13 = measuredWidth / i8;
            if (measuredWidth % i8 != 0) {
                i13++;
            }
            if (!z7 || i13 >= 2) {
                i12 = i13;
            }
        }
        cVar.f696f = !cVar.f693c && z7;
        cVar.f694d = i12;
        view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i12, 1073741824), iMakeMeasureSpec);
        return i12;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void I(int i8, int i9) {
        int i10;
        int i11;
        boolean z7;
        int i12;
        boolean z8;
        boolean z9;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f691y;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z10 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j8 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i23 = i20 + 1;
                if (z11) {
                    int i24 = this.f692z;
                    i13 = i23;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    i13 = i23;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f698h = r14;
                cVar.f695e = r14;
                cVar.f694d = r14;
                cVar.f696f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f697g = z11 && ((ActionMenuItemView) childAt).f();
                int iH = H(childAt, i18, cVar.f693c ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iH);
                if (cVar.f696f) {
                    i21++;
                }
                if (cVar.f693c) {
                    z10 = true;
                }
                i16 -= iH;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iH == 1) {
                    j8 |= (long) (1 << i19);
                    iMax = iMax;
                }
                i20 = i13;
            }
            i19++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z12 = z10 && i20 == 2;
        boolean z13 = false;
        while (i21 > 0 && i16 > 0) {
            int i26 = 0;
            int i27 = 0;
            int i28 = Integer.MAX_VALUE;
            long j9 = 0;
            while (i27 < childCount) {
                boolean z14 = z13;
                c cVar2 = (c) getChildAt(i27).getLayoutParams();
                int i29 = iMax;
                if (cVar2.f696f) {
                    int i30 = cVar2.f694d;
                    if (i30 < i28) {
                        j9 = 1 << i27;
                        i28 = i30;
                        i26 = 1;
                    } else if (i30 == i28) {
                        i26++;
                        j9 |= 1 << i27;
                    }
                }
                i27++;
                iMax = i29;
                z13 = z14;
            }
            z7 = z13;
            i12 = iMax;
            j8 |= j9;
            if (i26 > i16) {
                i10 = mode;
                i11 = i14;
                break;
            }
            int i31 = i28 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i33 = i14;
                int i34 = mode;
                long j10 = 1 << i32;
                if ((j9 & j10) == 0) {
                    if (cVar3.f694d == i31) {
                        j8 |= j10;
                    }
                    z9 = z12;
                } else {
                    if (z12 && cVar3.f697g && i16 == 1) {
                        int i35 = this.f692z;
                        z9 = z12;
                        childAt2.setPadding(i35 + i18, 0, i35, 0);
                    } else {
                        z9 = z12;
                    }
                    cVar3.f694d++;
                    cVar3.f698h = true;
                    i16--;
                }
                i32++;
                mode = i34;
                i14 = i33;
                z12 = z9;
            }
            iMax = i12;
            z13 = true;
        }
        i10 = mode;
        i11 = i14;
        z7 = z13;
        i12 = iMax;
        boolean z15 = !z10 && i20 == 1;
        if (i16 <= 0 || j8 == 0 || (i16 >= i20 - 1 && !z15 && iMax2 <= 1)) {
            z8 = z7;
        } else {
            float fBitCount = Long.bitCount(j8);
            if (!z15) {
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f697g) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j8 & ((long) (1 << i36))) != 0 && !((c) getChildAt(i36).getLayoutParams()).f697g) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : 0;
            z8 = z7;
            for (int i38 = 0; i38 < childCount; i38++) {
                if ((j8 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f695e = i37;
                        cVar4.f698h = true;
                        if (i38 == 0 && !cVar4.f697g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                    } else if (cVar4.f693c) {
                        cVar4.f695e = i37;
                        cVar4.f698h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i37 / 2;
                        }
                    }
                    z8 = true;
                }
            }
        }
        if (z8) {
            for (int i39 = 0; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f698h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f694d * i18) + cVar5.f695e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, i10 != 1073741824 ? i12 : i25);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.r0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f1120b <= 0) {
            cVar.f1120b = 16;
        }
        return cVar;
    }

    public c B() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f693c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean C(int i8) {
        boolean zA = false;
        if (i8 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i8 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean D() {
        androidx.appcompat.widget.c cVar = this.f686t;
        return cVar != null && cVar.B();
    }

    public boolean E() {
        androidx.appcompat.widget.c cVar = this.f686t;
        return cVar != null && cVar.D();
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.f686t;
        return cVar != null && cVar.E();
    }

    public boolean G() {
        return this.f685s;
    }

    public androidx.appcompat.view.menu.e J() {
        return this.f682p;
    }

    public void K(j.a aVar, e.a aVar2) {
        this.f687u = aVar;
        this.f688v = aVar2;
    }

    public boolean L() {
        androidx.appcompat.widget.c cVar = this.f686t;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f682p.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f682p = eVar;
    }

    @Override // androidx.appcompat.widget.r0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f682p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f682p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f686t = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f686t;
            j.a bVar = this.f687u;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.h(bVar);
            this.f682p.c(this.f686t, this.f683q);
            this.f686t.H(this);
        }
        return this.f682p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f686t.A();
    }

    public int getPopupTheme() {
        return this.f684r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f686t;
        if (cVar != null) {
            cVar.d(false);
            if (this.f686t.E()) {
                this.f686t.B();
                this.f686t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // androidx.appcompat.widget.r0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int width;
        int paddingLeft;
        if (!this.f689w) {
            super.onLayout(z7, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i10 - i8;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean zB = s1.b(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f693c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    C(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int iMax = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f693c) {
                    int i22 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f693c) {
                int i25 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft2 = i25 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.r0, android.view.View
    protected void onMeasure(int i8, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean z7 = this.f689w;
        boolean z8 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.f689w = z8;
        if (z7 != z8) {
            this.f690x = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (this.f689w && (eVar = this.f682p) != null && size != this.f690x) {
            this.f690x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f689w && childCount > 0) {
            I(i8, i9);
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i8, i9);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f686t.G(z7);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f686t.I(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.f685s = z7;
    }

    public void setPopupTheme(int i8) {
        if (this.f684r != i8) {
            this.f684r = i8;
            if (i8 == 0) {
                this.f683q = getContext();
            } else {
                this.f683q = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f686t = cVar;
        cVar.H(this);
    }

    public void x() {
        androidx.appcompat.widget.c cVar = this.f686t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.r0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f1120b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.r0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
