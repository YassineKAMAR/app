package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import f.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    f G;
    private final ActionMenuView.e H;
    private m1 I;
    private androidx.appcompat.widget.c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActionMenuView f778a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private d f779a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f780b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private j.a f781b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f782c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private e.a f783c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f784d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f785d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f786e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f787e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d1 f802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f808z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.G;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f813b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z7) {
            if (this.f813b != null) {
                androidx.appcompat.view.menu.e eVar = this.f812a;
                boolean z8 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            break;
                        }
                        if (this.f812a.getItem(i8) == this.f813b) {
                            z8 = true;
                            break;
                        }
                        i8++;
                    }
                }
                if (z8) {
                    return;
                }
                f(this.f812a, this.f813b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f791i;
            if (callback instanceof j.c) {
                ((j.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f791i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f790h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f791i = null;
            toolbar3.a();
            this.f813b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f790h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f790h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f790h);
            }
            Toolbar.this.f791i = gVar.getActionView();
            this.f813b = gVar;
            ViewParent parent2 = Toolbar.this.f791i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f791i);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f21461a = 8388611 | (toolbar4.f796n & 112);
                eVarGenerateDefaultLayoutParams.f815b = 2;
                toolbar4.f791i.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f791i);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f791i;
            if (callback instanceof j.c) {
                ((j.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f812a;
            if (eVar2 != null && (gVar = this.f813b) != null) {
                eVar2.f(gVar);
            }
            this.f812a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public static class e extends a.C0102a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f815b;

        public e(int i8, int i9) {
            super(i8, i9);
            this.f815b = 0;
            this.f21461a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f815b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f815b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f815b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((a.C0102a) eVar);
            this.f815b = 0;
            this.f815b = eVar.f815b;
        }

        public e(a.C0102a c0102a) {
            super(c0102a);
            this.f815b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends c0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f817d;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f816c = parcel.readInt();
            this.f817d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f816c);
            parcel.writeInt(this.f817d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.L);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f805w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new a();
        this.f787e0 = new b();
        Context context2 = getContext();
        int[] iArr = e.j.W2;
        l1 l1VarU = l1.u(context2, attributeSet, iArr, i8, 0);
        androidx.core.view.e0.F(this, context, iArr, attributeSet, l1VarU.q(), i8, 0);
        this.f794l = l1VarU.m(e.j.f21346y3, 0);
        this.f795m = l1VarU.m(e.j.f21301p3, 0);
        this.f805w = l1VarU.k(e.j.X2, this.f805w);
        this.f796n = l1VarU.k(e.j.Y2, 48);
        int iD = l1VarU.d(e.j.f21316s3, 0);
        int i9 = e.j.f21341x3;
        iD = l1VarU.r(i9) ? l1VarU.d(i9, iD) : iD;
        this.f801s = iD;
        this.f800r = iD;
        this.f799q = iD;
        this.f798p = iD;
        int iD2 = l1VarU.d(e.j.f21331v3, -1);
        if (iD2 >= 0) {
            this.f798p = iD2;
        }
        int iD3 = l1VarU.d(e.j.f21326u3, -1);
        if (iD3 >= 0) {
            this.f799q = iD3;
        }
        int iD4 = l1VarU.d(e.j.f21336w3, -1);
        if (iD4 >= 0) {
            this.f800r = iD4;
        }
        int iD5 = l1VarU.d(e.j.f21321t3, -1);
        if (iD5 >= 0) {
            this.f801s = iD5;
        }
        this.f797o = l1VarU.e(e.j.f21271j3, -1);
        int iD6 = l1VarU.d(e.j.f21251f3, Integer.MIN_VALUE);
        int iD7 = l1VarU.d(e.j.f21231b3, Integer.MIN_VALUE);
        int iE = l1VarU.e(e.j.f21241d3, 0);
        int iE2 = l1VarU.e(e.j.f21246e3, 0);
        h();
        this.f802t.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f802t.g(iD6, iD7);
        }
        this.f803u = l1VarU.d(e.j.f21256g3, Integer.MIN_VALUE);
        this.f804v = l1VarU.d(e.j.f21236c3, Integer.MIN_VALUE);
        this.f788f = l1VarU.f(e.j.f21226a3);
        this.f789g = l1VarU.o(e.j.Z2);
        CharSequence charSequenceO = l1VarU.o(e.j.f21311r3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = l1VarU.o(e.j.f21296o3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f792j = getContext();
        setPopupTheme(l1VarU.m(e.j.f21291n3, 0));
        Drawable drawableF = l1VarU.f(e.j.f21286m3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = l1VarU.o(e.j.f21281l3);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = l1VarU.f(e.j.f21261h3);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = l1VarU.o(e.j.f21266i3);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i10 = e.j.f21351z3;
        if (l1VarU.r(i10)) {
            setTitleTextColor(l1VarU.c(i10));
        }
        int i11 = e.j.f21306q3;
        if (l1VarU.r(i11)) {
            setSubtitleTextColor(l1VarU.c(i11));
        }
        int i12 = e.j.f21276k3;
        if (l1VarU.r(i12)) {
            x(l1VarU.m(i12, 0));
        }
        l1VarU.v();
    }

    private int B(View view, int i8, int[] iArr, int i9) {
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int iQ = q(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i8, int[] iArr, int i9) {
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int iQ = q(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + iMax + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void E(View view, int i8, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.f787e0);
        post(this.f787e0);
    }

    private boolean L() {
        if (!this.f785d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i8) {
        boolean z7 = androidx.core.view.e0.n(this) == 1;
        int childCount = getChildCount();
        int iA = androidx.core.view.d.a(i8, androidx.core.view.e0.n(this));
        list.clear();
        if (!z7) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f815b == 0 && M(childAt) && p(eVar.f21461a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f815b == 0 && M(childAt2) && p(eVar2.f21461a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f815b = 1;
        if (!z7 || this.f791i == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new j.g(getContext());
    }

    private void h() {
        if (this.f802t == null) {
            this.f802t = new d1();
        }
    }

    private void i() {
        if (this.f786e == null) {
            this.f786e = new n(getContext());
        }
    }

    private void j() {
        k();
        if (this.f778a.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f778a.getMenu();
            if (this.f779a0 == null) {
                this.f779a0 = new d();
            }
            this.f778a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f779a0, this.f792j);
        }
    }

    private void k() {
        if (this.f778a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f778a = actionMenuView;
            actionMenuView.setPopupTheme(this.f793k);
            this.f778a.setOnMenuItemClickListener(this.H);
            this.f778a.K(this.f781b0, this.f783c0);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f21461a = 8388613 | (this.f796n & 112);
            this.f778a.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f778a, false);
        }
    }

    private void l() {
        if (this.f784d == null) {
            this.f784d = new l(getContext(), null, e.a.K);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f21461a = 8388611 | (this.f796n & 112);
            this.f784d.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i8) {
        int iN = androidx.core.view.e0.n(this);
        int iA = androidx.core.view.d.a(i8, iN) & 7;
        return (iA == 1 || iA == 3 || iA == 5) ? iA : iN == 1 ? 5 : 3;
    }

    private int q(View view, int i8) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int iR = r(eVar.f21461a);
        if (iR == 48) {
            return getPaddingTop() - i9;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i10) {
            iMax = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i11 < i12) {
                iMax = Math.max(0, iMax - (i12 - i11));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i8) {
        int i9 = i8 & 112;
        return (i9 == 16 || i9 == 48 || i9 == 80) ? i9 : this.f805w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.g.b(marginLayoutParams) + androidx.core.view.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i8 = iArr[0];
        int i9 = iArr[1];
        int size = list.size();
        int i10 = 0;
        int measuredWidth = 0;
        while (i10 < size) {
            View view = list.get(i10);
            e eVar = (e) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i8;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i9;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, i12);
            int iMax3 = Math.max(0, -i11);
            int iMax4 = Math.max(0, -i12);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i10++;
            i9 = iMax4;
            i8 = iMax3;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f778a;
        return actionMenuView != null && actionMenuView.F();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f815b != 2 && childAt != this.f778a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void H(int i8, int i9) {
        h();
        this.f802t.g(i8, i9);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f778a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarJ = this.f778a.J();
        if (eVarJ == eVar) {
            return;
        }
        if (eVarJ != null) {
            eVarJ.O(this.W);
            eVarJ.O(this.f779a0);
        }
        if (this.f779a0 == null) {
            this.f779a0 = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f792j);
            eVar.c(this.f779a0, this.f792j);
        } else {
            cVar.i(this.f792j, null);
            this.f779a0.i(this.f792j, null);
            cVar.d(true);
            this.f779a0.d(true);
        }
        this.f778a.setPopupTheme(this.f793k);
        this.f778a.setPresenter(cVar);
        this.W = cVar;
    }

    public void J(Context context, int i8) {
        this.f795m = i8;
        TextView textView = this.f782c;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void K(Context context, int i8) {
        this.f794l = i8;
        TextView textView = this.f780b;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f778a;
        return actionMenuView != null && actionMenuView.L();
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f778a) != null && actionMenuView.G();
    }

    public void e() {
        d dVar = this.f779a0;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f813b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f778a;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f790h == null) {
            l lVar = new l(getContext(), null, e.a.K);
            this.f790h = lVar;
            lVar.setImageDrawable(this.f788f);
            this.f790h.setContentDescription(this.f789g);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f21461a = 8388611 | (this.f796n & 112);
            eVarGenerateDefaultLayoutParams.f815b = 2;
            this.f790h.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f790h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f790h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f790h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        d1 d1Var = this.f802t;
        if (d1Var != null) {
            return d1Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.f804v;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        d1 d1Var = this.f802t;
        if (d1Var != null) {
            return d1Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        d1 d1Var = this.f802t;
        if (d1Var != null) {
            return d1Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        d1 d1Var = this.f802t;
        if (d1Var != null) {
            return d1Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.f803u;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarJ;
        ActionMenuView actionMenuView = this.f778a;
        return actionMenuView != null && (eVarJ = actionMenuView.J()) != null && eVarJ.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f804v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.e0.n(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.e0.n(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f803u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f786e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f786e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f778a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f784d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f784d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.W;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f778a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f792j;
    }

    public int getPopupTheme() {
        return this.f793k;
    }

    public CharSequence getSubtitle() {
        return this.f807y;
    }

    final TextView getSubtitleTextView() {
        return this.f782c;
    }

    public CharSequence getTitle() {
        return this.f806x;
    }

    public int getTitleMarginBottom() {
        return this.f801s;
    }

    public int getTitleMarginEnd() {
        return this.f799q;
    }

    public int getTitleMarginStart() {
        return this.f798p;
    }

    public int getTitleMarginTop() {
        return this.f800r;
    }

    final TextView getTitleTextView() {
        return this.f780b;
    }

    public m0 getWrapper() {
        if (this.I == null) {
            this.I = new m1(this, true);
        }
        return this.I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0102a ? new e((a.C0102a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f787e0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.F;
        boolean zB = s1.b(this);
        int i10 = !zB ? 1 : 0;
        if (M(this.f784d)) {
            E(this.f784d, i8, 0, i9, 0, this.f797o);
            measuredWidth = this.f784d.getMeasuredWidth() + s(this.f784d);
            iMax = Math.max(0, this.f784d.getMeasuredHeight() + t(this.f784d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f784d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.f790h)) {
            E(this.f790h, i8, 0, i9, 0, this.f797o);
            measuredWidth = this.f790h.getMeasuredWidth() + s(this.f790h);
            iMax = Math.max(iMax, this.f790h.getMeasuredHeight() + t(this.f790h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f790h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (M(this.f778a)) {
            E(this.f778a, i8, iMax3, i9, 0, this.f797o);
            measuredWidth2 = this.f778a.getMeasuredWidth() + s(this.f778a);
            iMax = Math.max(iMax, this.f778a.getMeasuredHeight() + t(this.f778a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f778a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i10] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (M(this.f791i)) {
            iMax4 += D(this.f791i, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f791i.getMeasuredHeight() + t(this.f791i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f791i.getMeasuredState());
        }
        if (M(this.f786e)) {
            iMax4 += D(this.f786e, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f786e.getMeasuredHeight() + t(this.f786e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f786e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e) childAt.getLayoutParams()).f815b == 0 && M(childAt)) {
                iMax4 += D(childAt, i8, iMax4, i9, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i12 = this.f800r + this.f801s;
        int i13 = this.f798p + this.f799q;
        if (M(this.f780b)) {
            D(this.f780b, i8, iMax4 + i13, i9, i12, iArr);
            int measuredWidth3 = this.f780b.getMeasuredWidth() + s(this.f780b);
            measuredHeight = this.f780b.getMeasuredHeight() + t(this.f780b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f780b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (M(this.f782c)) {
            iMax2 = Math.max(iMax2, D(this.f782c, i8, iMax4 + i13, i9, measuredHeight + i12, iArr));
            measuredHeight += this.f782c.getMeasuredHeight() + t(this.f782c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f782c.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, (-16777216) & iCombineMeasuredStates2), L() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.b());
        ActionMenuView actionMenuView = this.f778a;
        androidx.appcompat.view.menu.e eVarJ = actionMenuView != null ? actionMenuView.J() : null;
        int i8 = gVar.f816c;
        if (i8 != 0 && this.f779a0 != null && eVarJ != null && (menuItemFindItem = eVarJ.findItem(i8)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f817d) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        h();
        this.f802t.f(i8 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f779a0;
        if (dVar != null && (gVar = dVar.f813b) != null) {
            gVar2.f816c = gVar.getItemId();
        }
        gVar2.f817d = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f790h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(g.b.d(getContext(), i8));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f790h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f790h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f788f);
            }
        }
    }

    public void setCollapsible(boolean z7) {
        this.f785d0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f804v) {
            this.f804v = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f803u) {
            this.f803u = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i8) {
        setLogo(g.b.d(getContext(), i8));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f786e)) {
                c(this.f786e, true);
            }
        } else {
            ImageView imageView = this.f786e;
            if (imageView != null && y(imageView)) {
                removeView(this.f786e);
                this.E.remove(this.f786e);
            }
        }
        ImageView imageView2 = this.f786e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f786e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f784d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(g.b.d(getContext(), i8));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f784d)) {
                c(this.f784d, true);
            }
        } else {
            ImageButton imageButton = this.f784d;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f784d);
                this.E.remove(this.f784d);
            }
        }
        ImageButton imageButton2 = this.f784d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f784d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.G = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f778a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.f793k != i8) {
            this.f793k = i8;
            if (i8 == 0) {
                this.f792j = getContext();
            } else {
                this.f792j = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f782c;
            if (textView != null && y(textView)) {
                removeView(this.f782c);
                this.E.remove(this.f782c);
            }
        } else {
            if (this.f782c == null) {
                Context context = getContext();
                e0 e0Var = new e0(context);
                this.f782c = e0Var;
                e0Var.setSingleLine();
                this.f782c.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f795m;
                if (i8 != 0) {
                    this.f782c.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f782c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f782c)) {
                c(this.f782c, true);
            }
        }
        TextView textView2 = this.f782c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f807y = charSequence;
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f782c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f780b;
            if (textView != null && y(textView)) {
                removeView(this.f780b);
                this.E.remove(this.f780b);
            }
        } else {
            if (this.f780b == null) {
                Context context = getContext();
                e0 e0Var = new e0(context);
                this.f780b = e0Var;
                e0Var.setSingleLine();
                this.f780b.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f794l;
                if (i8 != 0) {
                    this.f780b.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f808z;
                if (colorStateList != null) {
                    this.f780b.setTextColor(colorStateList);
                }
            }
            if (!y(this.f780b)) {
                c(this.f780b, true);
            }
        }
        TextView textView2 = this.f780b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f806x = charSequence;
    }

    public void setTitleMarginBottom(int i8) {
        this.f801s = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.f799q = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.f798p = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.f800r = i8;
        requestLayout();
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f808z = colorStateList;
        TextView textView = this.f780b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.f779a0;
        return (dVar == null || dVar.f813b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f778a;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f778a;
        return actionMenuView != null && actionMenuView.E();
    }
}
