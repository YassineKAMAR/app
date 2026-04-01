package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a1;
import androidx.core.view.e0;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f607v = e.g.f21198m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a1 f615i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f625s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f627u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f616j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f617k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f626t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f615i.x()) {
                return;
            }
            View view = l.this.f620n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f615i.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f622p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f622p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f622p.removeGlobalOnLayoutListener(lVar.f616j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i8, int i9, boolean z7) {
        this.f608b = context;
        this.f609c = eVar;
        this.f611e = z7;
        this.f610d = new d(eVar, LayoutInflater.from(context), z7, f607v);
        this.f613g = i8;
        this.f614h = i9;
        Resources resources = context.getResources();
        this.f612f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f21125d));
        this.f619m = view;
        this.f615i = new a1(context, null, i8, i9);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f623q || (view = this.f619m) == null) {
            return false;
        }
        this.f620n = view;
        this.f615i.G(this);
        this.f615i.H(this);
        this.f615i.F(true);
        View view2 = this.f620n;
        boolean z7 = this.f622p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f622p = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f616j);
        }
        view2.addOnAttachStateChangeListener(this.f617k);
        this.f615i.z(view2);
        this.f615i.C(this.f626t);
        if (!this.f624r) {
            this.f625s = h.o(this.f610d, null, this.f608b, this.f612f);
            this.f624r = true;
        }
        this.f615i.B(this.f625s);
        this.f615i.E(2);
        this.f615i.D(n());
        this.f615i.b();
        ListView listViewJ = this.f615i.j();
        listViewJ.setOnKeyListener(this);
        if (this.f627u && this.f609c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f608b).inflate(e.g.f21197l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f609c.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f615i.p(this.f610d);
        this.f615i.b();
        return true;
    }

    @Override // k.e
    public boolean a() {
        return !this.f623q && this.f615i.a();
    }

    @Override // k.e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        if (eVar != this.f609c) {
            return;
        }
        dismiss();
        j.a aVar = this.f621o;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        this.f624r = false;
        d dVar = this.f610d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // k.e
    public void dismiss() {
        if (a()) {
            this.f615i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f621o = aVar;
    }

    @Override // k.e
    public ListView j() {
        return this.f615i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f608b, mVar, this.f620n, this.f611e, this.f613g, this.f614h);
            iVar.j(this.f621o);
            iVar.g(h.x(mVar));
            iVar.i(this.f618l);
            this.f618l = null;
            this.f609c.e(false);
            int iC = this.f615i.c();
            int iO = this.f615i.o();
            if ((Gravity.getAbsoluteGravity(this.f626t, e0.n(this.f619m)) & 7) == 5) {
                iC += this.f619m.getWidth();
            }
            if (iVar.n(iC, iO)) {
                j.a aVar = this.f621o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f623q = true;
        this.f609c.close();
        ViewTreeObserver viewTreeObserver = this.f622p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f622p = this.f620n.getViewTreeObserver();
            }
            this.f622p.removeGlobalOnLayoutListener(this.f616j);
            this.f622p = null;
        }
        this.f620n.removeOnAttachStateChangeListener(this.f617k);
        PopupWindow.OnDismissListener onDismissListener = this.f618l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f619m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.f610d.d(z7);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i8) {
        this.f626t = i8;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i8) {
        this.f615i.e(i8);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f618l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.f627u = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i8) {
        this.f615i.l(i8);
    }
}
