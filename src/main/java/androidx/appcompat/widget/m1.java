package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public class m1 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f1026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f1029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f1031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f1034q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k.a f1035a;

        a() {
            this.f1035a = new k.a(m1.this.f1018a.getContext(), 0, R.id.home, 0, 0, m1.this.f1026i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m1 m1Var = m1.this;
            Window.Callback callback = m1Var.f1029l;
            if (callback == null || !m1Var.f1030m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1035a);
        }
    }

    class b extends androidx.core.view.h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1037a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1038b;

        b(int i8) {
            this.f1038b = i8;
        }

        @Override // androidx.core.view.h1, androidx.core.view.g1
        public void a(View view) {
            this.f1037a = true;
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            if (this.f1037a) {
                return;
            }
            m1.this.f1018a.setVisibility(this.f1038b);
        }

        @Override // androidx.core.view.h1, androidx.core.view.g1
        public void c(View view) {
            m1.this.f1018a.setVisibility(0);
        }
    }

    public m1(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, e.h.f21206a, e.e.f21147n);
    }

    public m1(Toolbar toolbar, boolean z7, int i8, int i9) {
        Drawable drawable;
        this.f1032o = 0;
        this.f1033p = 0;
        this.f1018a = toolbar;
        this.f1026i = toolbar.getTitle();
        this.f1027j = toolbar.getSubtitle();
        this.f1025h = this.f1026i != null;
        this.f1024g = toolbar.getNavigationIcon();
        l1 l1VarU = l1.u(toolbar.getContext(), null, e.j.f21222a, e.a.f21089c, 0);
        this.f1034q = l1VarU.f(e.j.f21277l);
        if (z7) {
            CharSequence charSequenceO = l1VarU.o(e.j.f21307r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                D(charSequenceO);
            }
            CharSequence charSequenceO2 = l1VarU.o(e.j.f21297p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                C(charSequenceO2);
            }
            Drawable drawableF = l1VarU.f(e.j.f21287n);
            if (drawableF != null) {
                y(drawableF);
            }
            Drawable drawableF2 = l1VarU.f(e.j.f21282m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f1024g == null && (drawable = this.f1034q) != null) {
                B(drawable);
            }
            k(l1VarU.j(e.j.f21257h, 0));
            int iM = l1VarU.m(e.j.f21252g, 0);
            if (iM != 0) {
                w(LayoutInflater.from(this.f1018a.getContext()).inflate(iM, (ViewGroup) this.f1018a, false));
                k(this.f1019b | 16);
            }
            int iL = l1VarU.l(e.j.f21267j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1018a.getLayoutParams();
                layoutParams.height = iL;
                this.f1018a.setLayoutParams(layoutParams);
            }
            int iD = l1VarU.d(e.j.f21247f, -1);
            int iD2 = l1VarU.d(e.j.f21242e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f1018a.H(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = l1VarU.m(e.j.f21312s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1018a;
                toolbar2.K(toolbar2.getContext(), iM2);
            }
            int iM3 = l1VarU.m(e.j.f21302q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1018a;
                toolbar3.J(toolbar3.getContext(), iM3);
            }
            int iM4 = l1VarU.m(e.j.f21292o, 0);
            if (iM4 != 0) {
                this.f1018a.setPopupTheme(iM4);
            }
        } else {
            this.f1019b = v();
        }
        l1VarU.v();
        x(i8);
        this.f1028k = this.f1018a.getNavigationContentDescription();
        this.f1018a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.f1026i = charSequence;
        if ((this.f1019b & 8) != 0) {
            this.f1018a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f1019b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1028k)) {
                this.f1018a.setNavigationContentDescription(this.f1033p);
            } else {
                this.f1018a.setNavigationContentDescription(this.f1028k);
            }
        }
    }

    private void G() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1019b & 4) != 0) {
            toolbar = this.f1018a;
            drawable = this.f1024g;
            if (drawable == null) {
                drawable = this.f1034q;
            }
        } else {
            toolbar = this.f1018a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i8 = this.f1019b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) == 0 || (drawable = this.f1023f) == null) {
            drawable = this.f1022e;
        }
        this.f1018a.setLogo(drawable);
    }

    private int v() {
        if (this.f1018a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1034q = this.f1018a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f1028k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f1024g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f1027j = charSequence;
        if ((this.f1019b & 8) != 0) {
            this.f1018a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f1025h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.m0
    public void a(Menu menu, j.a aVar) {
        if (this.f1031n == null) {
            c cVar = new c(this.f1018a.getContext());
            this.f1031n = cVar;
            cVar.p(e.f.f21166g);
        }
        this.f1031n.h(aVar);
        this.f1018a.I((androidx.appcompat.view.menu.e) menu, this.f1031n);
    }

    @Override // androidx.appcompat.widget.m0
    public boolean b() {
        return this.f1018a.A();
    }

    @Override // androidx.appcompat.widget.m0
    public void c() {
        this.f1030m = true;
    }

    @Override // androidx.appcompat.widget.m0
    public void collapseActionView() {
        this.f1018a.e();
    }

    @Override // androidx.appcompat.widget.m0
    public boolean d() {
        return this.f1018a.d();
    }

    @Override // androidx.appcompat.widget.m0
    public boolean e() {
        return this.f1018a.z();
    }

    @Override // androidx.appcompat.widget.m0
    public boolean f() {
        return this.f1018a.w();
    }

    @Override // androidx.appcompat.widget.m0
    public boolean g() {
        return this.f1018a.N();
    }

    @Override // androidx.appcompat.widget.m0
    public Context getContext() {
        return this.f1018a.getContext();
    }

    @Override // androidx.appcompat.widget.m0
    public CharSequence getTitle() {
        return this.f1018a.getTitle();
    }

    @Override // androidx.appcompat.widget.m0
    public void h() {
        this.f1018a.f();
    }

    @Override // androidx.appcompat.widget.m0
    public void i(e1 e1Var) {
        View view = this.f1020c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1018a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1020c);
            }
        }
        this.f1020c = e1Var;
        if (e1Var == null || this.f1032o != 2) {
            return;
        }
        this.f1018a.addView(e1Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1020c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f21461a = 8388691;
        e1Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.m0
    public boolean j() {
        return this.f1018a.v();
    }

    @Override // androidx.appcompat.widget.m0
    public void k(int i8) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i9 = this.f1019b ^ i8;
        this.f1019b = i8;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i8 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i9 & 3) != 0) {
                H();
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    this.f1018a.setTitle(this.f1026i);
                    toolbar = this.f1018a;
                    charSequence = this.f1027j;
                } else {
                    charSequence = null;
                    this.f1018a.setTitle((CharSequence) null);
                    toolbar = this.f1018a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i9 & 16) == 0 || (view = this.f1021d) == null) {
                return;
            }
            if ((i8 & 16) != 0) {
                this.f1018a.addView(view);
            } else {
                this.f1018a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.m0
    public void l(int i8) {
        y(i8 != 0 ? g.b.d(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.m0
    public int m() {
        return this.f1032o;
    }

    @Override // androidx.appcompat.widget.m0
    public androidx.core.view.f1 n(int i8, long j8) {
        return androidx.core.view.e0.b(this.f1018a).b(i8 == 0 ? 1.0f : 0.0f).f(j8).h(new b(i8));
    }

    @Override // androidx.appcompat.widget.m0
    public void o(int i8) {
        this.f1018a.setVisibility(i8);
    }

    @Override // androidx.appcompat.widget.m0
    public ViewGroup p() {
        return this.f1018a;
    }

    @Override // androidx.appcompat.widget.m0
    public void q(boolean z7) {
    }

    @Override // androidx.appcompat.widget.m0
    public int r() {
        return this.f1019b;
    }

    @Override // androidx.appcompat.widget.m0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.m0
    public void setIcon(int i8) {
        setIcon(i8 != 0 ? g.b.d(getContext(), i8) : null);
    }

    @Override // androidx.appcompat.widget.m0
    public void setIcon(Drawable drawable) {
        this.f1022e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.m0
    public void setWindowCallback(Window.Callback callback) {
        this.f1029l = callback;
    }

    @Override // androidx.appcompat.widget.m0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1025h) {
            return;
        }
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.m0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.m0
    public void u(boolean z7) {
        this.f1018a.setCollapsible(z7);
    }

    public void w(View view) {
        View view2 = this.f1021d;
        if (view2 != null && (this.f1019b & 16) != 0) {
            this.f1018a.removeView(view2);
        }
        this.f1021d = view;
        if (view == null || (this.f1019b & 16) == 0) {
            return;
        }
        this.f1018a.addView(view);
    }

    public void x(int i8) {
        if (i8 == this.f1033p) {
            return;
        }
        this.f1033p = i8;
        if (TextUtils.isEmpty(this.f1018a.getNavigationContentDescription())) {
            z(this.f1033p);
        }
    }

    public void y(Drawable drawable) {
        this.f1023f = drawable;
        H();
    }

    public void z(int i8) {
        A(i8 == 0 ? null : getContext().getString(i8));
    }
}
