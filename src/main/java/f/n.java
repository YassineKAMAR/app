package f;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.m0;
import androidx.core.view.e0;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.i1;
import f.a;
import j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n extends f.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f21581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f21583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f21584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f21585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    m0 f21586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f21587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f21588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e1 f21589i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f21593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    j.b f21594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    b.a f21595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21596p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21598r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f21601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f21602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f21603w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    j.h f21605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f21606z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f21590j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21591k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f21597q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21599s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f21600t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21604x = true;
    final g1 B = new a();
    final g1 C = new b();
    final i1 D = new c();

    class a extends h1 {
        a() {
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.f21600t && (view2 = nVar.f21588h) != null) {
                view2.setTranslationY(0.0f);
                n.this.f21585e.setTranslationY(0.0f);
            }
            n.this.f21585e.setVisibility(8);
            n.this.f21585e.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.f21605y = null;
            nVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f21584d;
            if (actionBarOverlayLayout != null) {
                e0.E(actionBarOverlayLayout);
            }
        }
    }

    class b extends h1 {
        b() {
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            n nVar = n.this;
            nVar.f21605y = null;
            nVar.f21585e.requestLayout();
        }
    }

    class c implements i1 {
        c() {
        }

        @Override // androidx.core.view.i1
        public void a(View view) {
            ((View) n.this.f21585e.getParent()).invalidate();
        }
    }

    public class d extends j.b implements e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f21610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f21611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b.a f21612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f21613f;

        public d(Context context, b.a aVar) {
            this.f21610c = context;
            this.f21612e = aVar;
            androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(context).S(1);
            this.f21611d = eVarS;
            eVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f21612e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f21612e == null) {
                return;
            }
            k();
            n.this.f21587g.l();
        }

        @Override // j.b
        public void c() {
            n nVar = n.this;
            if (nVar.f21593m != this) {
                return;
            }
            if (n.v(nVar.f21601u, nVar.f21602v, false)) {
                this.f21612e.b(this);
            } else {
                n nVar2 = n.this;
                nVar2.f21594n = this;
                nVar2.f21595o = this.f21612e;
            }
            this.f21612e = null;
            n.this.u(false);
            n.this.f21587g.g();
            n.this.f21586f.p().sendAccessibilityEvent(32);
            n nVar3 = n.this;
            nVar3.f21584d.setHideOnContentScrollEnabled(nVar3.A);
            n.this.f21593m = null;
        }

        @Override // j.b
        public View d() {
            WeakReference<View> weakReference = this.f21613f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.b
        public Menu e() {
            return this.f21611d;
        }

        @Override // j.b
        public MenuInflater f() {
            return new j.g(this.f21610c);
        }

        @Override // j.b
        public CharSequence g() {
            return n.this.f21587g.getSubtitle();
        }

        @Override // j.b
        public CharSequence i() {
            return n.this.f21587g.getTitle();
        }

        @Override // j.b
        public void k() {
            if (n.this.f21593m != this) {
                return;
            }
            this.f21611d.d0();
            try {
                this.f21612e.d(this, this.f21611d);
            } finally {
                this.f21611d.c0();
            }
        }

        @Override // j.b
        public boolean l() {
            return n.this.f21587g.j();
        }

        @Override // j.b
        public void m(View view) {
            n.this.f21587g.setCustomView(view);
            this.f21613f = new WeakReference<>(view);
        }

        @Override // j.b
        public void n(int i8) {
            o(n.this.f21581a.getResources().getString(i8));
        }

        @Override // j.b
        public void o(CharSequence charSequence) {
            n.this.f21587g.setSubtitle(charSequence);
        }

        @Override // j.b
        public void q(int i8) {
            r(n.this.f21581a.getResources().getString(i8));
        }

        @Override // j.b
        public void r(CharSequence charSequence) {
            n.this.f21587g.setTitle(charSequence);
        }

        @Override // j.b
        public void s(boolean z7) {
            super.s(z7);
            n.this.f21587g.setTitleOptional(z7);
        }

        public boolean t() {
            this.f21611d.d0();
            try {
                return this.f21612e.a(this, this.f21611d);
            } finally {
                this.f21611d.c0();
            }
        }
    }

    public n(Activity activity, boolean z7) {
        this.f21583c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z7) {
            return;
        }
        this.f21588h = decorView.findViewById(R.id.content);
    }

    public n(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    private void B() {
        if (this.f21603w) {
            this.f21603w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f21584d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(e.f.f21175p);
        this.f21584d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f21586f = z(view.findViewById(e.f.f21160a));
        this.f21587g = (ActionBarContextView) view.findViewById(e.f.f21165f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(e.f.f21162c);
        this.f21585e = actionBarContainer;
        m0 m0Var = this.f21586f;
        if (m0Var == null || this.f21587g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f21581a = m0Var.getContext();
        boolean z7 = (this.f21586f.r() & 4) != 0;
        if (z7) {
            this.f21592l = true;
        }
        j.a aVarB = j.a.b(this.f21581a);
        I(aVarB.a() || z7);
        G(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f21581a.obtainStyledAttributes(null, e.j.f21222a, e.a.f21089c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.f21272k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f21262i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void G(boolean z7) {
        this.f21598r = z7;
        if (z7) {
            this.f21585e.setTabContainer(null);
            this.f21586f.i(this.f21589i);
        } else {
            this.f21586f.i(null);
            this.f21585e.setTabContainer(this.f21589i);
        }
        boolean z8 = A() == 2;
        e1 e1Var = this.f21589i;
        if (e1Var != null) {
            if (z8) {
                e1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21584d;
                if (actionBarOverlayLayout != null) {
                    e0.E(actionBarOverlayLayout);
                }
            } else {
                e1Var.setVisibility(8);
            }
        }
        this.f21586f.u(!this.f21598r && z8);
        this.f21584d.setHasNonEmbeddedTabs(!this.f21598r && z8);
    }

    private boolean J() {
        return e0.w(this.f21585e);
    }

    private void K() {
        if (this.f21603w) {
            return;
        }
        this.f21603w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21584d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z7) {
        if (v(this.f21601u, this.f21602v, this.f21603w)) {
            if (this.f21604x) {
                return;
            }
            this.f21604x = true;
            y(z7);
            return;
        }
        if (this.f21604x) {
            this.f21604x = false;
            x(z7);
        }
    }

    static boolean v(boolean z7, boolean z8, boolean z9) {
        if (z9) {
            return true;
        }
        return (z7 || z8) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m0 z(View view) {
        if (view instanceof m0) {
            return (m0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int A() {
        return this.f21586f.m();
    }

    public void D(boolean z7) {
        E(z7 ? 4 : 0, 4);
    }

    public void E(int i8, int i9) {
        int iR = this.f21586f.r();
        if ((i9 & 4) != 0) {
            this.f21592l = true;
        }
        this.f21586f.k((i8 & i9) | ((~i9) & iR));
    }

    public void F(float f8) {
        e0.L(this.f21585e, f8);
    }

    public void H(boolean z7) {
        if (z7 && !this.f21584d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z7;
        this.f21584d.setHideOnContentScrollEnabled(z7);
    }

    public void I(boolean z7) {
        this.f21586f.q(z7);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f21602v) {
            this.f21602v = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z7) {
        this.f21600t = z7;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f21602v) {
            return;
        }
        this.f21602v = true;
        L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        j.h hVar = this.f21605y;
        if (hVar != null) {
            hVar.a();
            this.f21605y = null;
        }
    }

    @Override // f.a
    public boolean g() {
        m0 m0Var = this.f21586f;
        if (m0Var == null || !m0Var.j()) {
            return false;
        }
        this.f21586f.collapseActionView();
        return true;
    }

    @Override // f.a
    public void h(boolean z7) {
        if (z7 == this.f21596p) {
            return;
        }
        this.f21596p = z7;
        int size = this.f21597q.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f21597q.get(i8).onMenuVisibilityChanged(z7);
        }
    }

    @Override // f.a
    public int i() {
        return this.f21586f.r();
    }

    @Override // f.a
    public Context j() {
        if (this.f21582b == null) {
            TypedValue typedValue = new TypedValue();
            this.f21581a.getTheme().resolveAttribute(e.a.f21093g, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f21582b = new ContextThemeWrapper(this.f21581a, i8);
            } else {
                this.f21582b = this.f21581a;
            }
        }
        return this.f21582b;
    }

    @Override // f.a
    public void l(Configuration configuration) {
        G(j.a.b(this.f21581a).g());
    }

    @Override // f.a
    public boolean n(int i8, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f21593m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i8) {
        this.f21599s = i8;
    }

    @Override // f.a
    public void q(boolean z7) {
        if (this.f21592l) {
            return;
        }
        D(z7);
    }

    @Override // f.a
    public void r(boolean z7) {
        j.h hVar;
        this.f21606z = z7;
        if (z7 || (hVar = this.f21605y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // f.a
    public void s(CharSequence charSequence) {
        this.f21586f.setWindowTitle(charSequence);
    }

    @Override // f.a
    public j.b t(b.a aVar) {
        d dVar = this.f21593m;
        if (dVar != null) {
            dVar.c();
        }
        this.f21584d.setHideOnContentScrollEnabled(false);
        this.f21587g.k();
        d dVar2 = new d(this.f21587g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f21593m = dVar2;
        dVar2.k();
        this.f21587g.h(dVar2);
        u(true);
        this.f21587g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void u(boolean z7) {
        f1 f1VarN;
        f1 f1VarF;
        if (z7) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z7) {
                this.f21586f.o(4);
                this.f21587g.setVisibility(0);
                return;
            } else {
                this.f21586f.o(0);
                this.f21587g.setVisibility(8);
                return;
            }
        }
        if (z7) {
            f1VarF = this.f21586f.n(4, 100L);
            f1VarN = this.f21587g.f(0, 200L);
        } else {
            f1VarN = this.f21586f.n(0, 200L);
            f1VarF = this.f21587g.f(8, 100L);
        }
        j.h hVar = new j.h();
        hVar.d(f1VarF, f1VarN);
        hVar.h();
    }

    void w() {
        b.a aVar = this.f21595o;
        if (aVar != null) {
            aVar.b(this.f21594n);
            this.f21594n = null;
            this.f21595o = null;
        }
    }

    public void x(boolean z7) {
        View view;
        j.h hVar = this.f21605y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f21599s != 0 || (!this.f21606z && !z7)) {
            this.B.b(null);
            return;
        }
        this.f21585e.setAlpha(1.0f);
        this.f21585e.setTransitioning(true);
        j.h hVar2 = new j.h();
        float f8 = -this.f21585e.getHeight();
        if (z7) {
            this.f21585e.getLocationInWindow(new int[]{0, 0});
            f8 -= r5[1];
        }
        f1 f1VarM = e0.b(this.f21585e).m(f8);
        f1VarM.k(this.D);
        hVar2.c(f1VarM);
        if (this.f21600t && (view = this.f21588h) != null) {
            hVar2.c(e0.b(view).m(f8));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f21605y = hVar2;
        hVar2.h();
    }

    public void y(boolean z7) {
        View view;
        View view2;
        j.h hVar = this.f21605y;
        if (hVar != null) {
            hVar.a();
        }
        this.f21585e.setVisibility(0);
        if (this.f21599s == 0 && (this.f21606z || z7)) {
            this.f21585e.setTranslationY(0.0f);
            float f8 = -this.f21585e.getHeight();
            if (z7) {
                this.f21585e.getLocationInWindow(new int[]{0, 0});
                f8 -= r5[1];
            }
            this.f21585e.setTranslationY(f8);
            j.h hVar2 = new j.h();
            f1 f1VarM = e0.b(this.f21585e).m(0.0f);
            f1VarM.k(this.D);
            hVar2.c(f1VarM);
            if (this.f21600t && (view2 = this.f21588h) != null) {
                view2.setTranslationY(f8);
                hVar2.c(e0.b(this.f21588h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f21605y = hVar2;
            hVar2.h();
        } else {
            this.f21585e.setAlpha(1.0f);
            this.f21585e.setTranslationY(0.0f);
            if (this.f21600t && (view = this.f21588h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21584d;
        if (actionBarOverlayLayout != null) {
            e0.E(actionBarOverlayLayout);
        }
    }
}
