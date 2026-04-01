package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements b.a {
    RunnableC0012c A;
    private b B;
    final f C;
    int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f859u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    e f863y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    a f864z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, e.a.f21098l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f849k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f482i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f864z = null;
            cVar.D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public k.e a() {
            a aVar = c.this.f864z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0012c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f867a;

        public RunnableC0012c(e eVar) {
            this.f867a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f476c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f476c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f482i;
            if (view != null && view.getWindowToken() != null && this.f867a.m()) {
                c.this.f863y = this.f867a;
            }
            c.this.A = null;
        }
    }

    private class d extends n implements ActionMenuView.a {

        class a extends q0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f870j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f870j = cVar;
            }

            @Override // androidx.appcompat.widget.q0
            public k.e b() {
                e eVar = c.this.f863y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.q0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.q0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, e.a.f21097k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i8, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i8, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z7) {
            super(context, eVar, view, z7, e.a.f21098l);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f476c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f476c.close();
            }
            c.this.f863y = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z7);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f476c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, e.g.f21188c, e.g.f21187b);
        this.f862x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f482i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f849k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f851m) {
            return this.f850l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0012c runnableC0012c = this.A;
        if (runnableC0012c != null && (obj = this.f482i) != null) {
            ((View) obj).removeCallbacks(runnableC0012c);
            this.A = null;
            return true;
        }
        e eVar = this.f863y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f864z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.f863y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f857s) {
            this.f856r = j.a.b(this.f475b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f476c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z7) {
        this.f860v = z7;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f482i = actionMenuView;
        actionMenuView.b(this.f476c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f849k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f851m = true;
            this.f850l = drawable;
        }
    }

    public void J(boolean z7) {
        this.f852n = z7;
        this.f853o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f852n || E() || (eVar = this.f476c) == null || this.f482i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0012c runnableC0012c = new RunnableC0012c(new e(this.f475b, this.f476c, this.f849k, true));
        this.A = runnableC0012c;
        ((View) this.f482i).post(runnableC0012c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f482i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        y();
        super.c(eVar, z7);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        super.d(z7);
        ((View) this.f482i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f476c;
        boolean z8 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i8 = 0; i8 < size; i8++) {
                androidx.core.view.b bVarB = arrayListS.get(i8).b();
                if (bVarB != null) {
                    bVarB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f476c;
        ArrayList<androidx.appcompat.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f852n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z8 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        d dVar = this.f849k;
        if (z8) {
            if (dVar == null) {
                this.f849k = new d(this.f474a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f849k.getParent();
            if (viewGroup != this.f482i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f849k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f482i;
                actionMenuView.addView(this.f849k, actionMenuView.B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f482i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f849k);
            }
        }
        ((ActionMenuView) this.f482i).setOverflowReserved(this.f852n);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListE;
        int size;
        int i8;
        int iH;
        int i9;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f476c;
        View view = null;
        int i10 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i11 = cVar.f856r;
        int i12 = cVar.f855q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f482i;
        boolean z7 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.g gVar = arrayListE.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z7 = true;
            }
            if (cVar.f860v && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.f852n && (z7 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f862x;
        sparseBooleanArray.clear();
        if (cVar.f858t) {
            int i17 = cVar.f861w;
            iH = i12 / i17;
            i8 = i17 + ((i12 % i17) / iH);
        } else {
            i8 = 0;
            iH = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListE.get(i18);
            if (gVar2.o()) {
                View viewN = cVar.n(gVar2, view, viewGroup);
                if (cVar.f858t) {
                    iH -= ActionMenuView.H(viewN, i8, iH, iMakeMeasureSpec, i10);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i9 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                boolean z9 = (i16 > 0 || z8) && i12 > 0 && (!cVar.f858t || iH > 0);
                boolean z10 = z9;
                i9 = size;
                if (z9) {
                    View viewN2 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f858t) {
                        int iH2 = ActionMenuView.H(viewN2, i8, iH, iMakeMeasureSpec, 0);
                        iH -= iH2;
                        if (iH2 == 0) {
                            z10 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z9 = z11 & (!cVar.f858t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z9 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListE.get(i20);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i16++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z9) {
                    i16--;
                }
                gVar2.u(z9);
            } else {
                i9 = size;
                gVar2.u(false);
                i18++;
                view = null;
                cVar = this;
                size = i9;
                i10 = 0;
            }
            i18++;
            view = null;
            cVar = this;
            size = i9;
            i10 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        j.a aVarB = j.a.b(context);
        if (!this.f853o) {
            this.f852n = aVarB.h();
        }
        if (!this.f859u) {
            this.f854p = aVarB.c();
        }
        if (!this.f857s) {
            this.f856r = aVarB.d();
        }
        int measuredWidth = this.f854p;
        if (this.f852n) {
            if (this.f849k == null) {
                d dVar = new d(this.f474a);
                this.f849k = dVar;
                if (this.f851m) {
                    dVar.setImageDrawable(this.f850l);
                    this.f850l = null;
                    this.f851m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f849k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f849k.getMeasuredWidth();
        } else {
            this.f849k = null;
        }
        this.f855q = measuredWidth;
        this.f861w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z7 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f476c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View viewZ = z(mVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i8++;
        }
        a aVar = new a(this.f475b, mVar, viewZ);
        this.f864z = aVar;
        aVar.g(z7);
        this.f864z.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i8) {
        if (viewGroup.getChildAt(i8) == this.f849k) {
            return false;
        }
        return super.l(viewGroup, i8);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f482i;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i8, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
