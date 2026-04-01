package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.w0;
import androidx.core.view.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = e.g.f21190e;
    boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f489g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f498p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f503u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f508z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<e> f490h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<d> f491i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f492j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f493k = new ViewOnAttachStateChangeListenerC0010b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w0 f494l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f495m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f496n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f504v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f499q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f491i.size() <= 0 || b.this.f491i.get(0).f516a.x()) {
                return;
            }
            View view = b.this.f498p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f491i.iterator();
            while (it.hasNext()) {
                it.next().f516a.b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0010b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0010b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f507y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f507y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f507y.removeGlobalOnLayoutListener(bVar.f492j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements w0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f514c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f512a = dVar;
                this.f513b = menuItem;
                this.f514c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f512a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f517b.e(false);
                    b.this.A = false;
                }
                if (this.f513b.isEnabled() && this.f513b.hasSubMenu()) {
                    this.f514c.L(this.f513b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.w0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f489g.removeCallbacksAndMessages(null);
            int size = b.this.f491i.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                } else if (eVar == b.this.f491i.get(i8).f517b) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 == -1) {
                return;
            }
            int i9 = i8 + 1;
            b.this.f489g.postAtTime(new a(i9 < b.this.f491i.size() ? b.this.f491i.get(i9) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.w0
        public void g(e eVar, MenuItem menuItem) {
            b.this.f489g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1 f516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f518c;

        public d(a1 a1Var, e eVar, int i8) {
            this.f516a = a1Var;
            this.f517b = eVar;
            this.f518c = i8;
        }

        public ListView a() {
            return this.f516a.j();
        }
    }

    public b(Context context, View view, int i8, int i9, boolean z7) {
        this.f484b = context;
        this.f497o = view;
        this.f486d = i8;
        this.f487e = i9;
        this.f488f = z7;
        Resources resources = context.getResources();
        this.f485c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f21125d));
        this.f489g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f491i.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (eVar == this.f491i.get(i8).f517b) {
                return i8;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = eVar.getItem(i8);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f517b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return e0.n(this.f497o) == 1 ? 0 : 1;
    }

    private int E(int i8) {
        List<d> list = this.f491i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f498p.getWindowVisibleDisplayFrame(rect);
        return this.f499q == 1 ? (iArr[0] + listViewA.getWidth()) + i8 > rect.right ? 0 : 1 : iArr[0] - i8 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        int i8;
        int i9;
        int i10;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f484b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f488f, B);
        if (!a() && this.f504v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f484b, this.f485c);
        a1 a1VarZ = z();
        a1VarZ.p(dVar2);
        a1VarZ.B(iO);
        a1VarZ.C(this.f496n);
        if (this.f491i.size() > 0) {
            List<d> list = this.f491i;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            a1VarZ.Q(false);
            a1VarZ.N(null);
            int iE = E(iO);
            boolean z7 = iE == 1;
            this.f499q = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                a1VarZ.z(viewC);
                i9 = 0;
                i8 = 0;
            } else {
                int[] iArr = new int[2];
                this.f497o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f496n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f497o.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i8 = iArr2[0] - iArr[0];
                i9 = iArr2[1] - iArr[1];
            }
            if ((this.f496n & 5) == 5) {
                if (!z7) {
                    iO = viewC.getWidth();
                    i10 = i8 - iO;
                }
                i10 = i8 + iO;
            } else {
                if (z7) {
                    iO = viewC.getWidth();
                    i10 = i8 + iO;
                }
                i10 = i8 - iO;
            }
            a1VarZ.e(i10);
            a1VarZ.I(true);
            a1VarZ.l(i9);
        } else {
            if (this.f500r) {
                a1VarZ.e(this.f502t);
            }
            if (this.f501s) {
                a1VarZ.l(this.f503u);
            }
            a1VarZ.D(n());
        }
        this.f491i.add(new d(a1VarZ, eVar, this.f499q));
        a1VarZ.b();
        ListView listViewJ = a1VarZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f505w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(e.g.f21197l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            a1VarZ.b();
        }
    }

    private a1 z() {
        a1 a1Var = new a1(this.f484b, null, this.f486d, this.f487e);
        a1Var.P(this.f494l);
        a1Var.H(this);
        a1Var.G(this);
        a1Var.z(this.f497o);
        a1Var.C(this.f496n);
        a1Var.F(true);
        a1Var.E(2);
        return a1Var;
    }

    @Override // k.e
    public boolean a() {
        return this.f491i.size() > 0 && this.f491i.get(0).f516a.a();
    }

    @Override // k.e
    public void b() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f490h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f490h.clear();
        View view = this.f497o;
        this.f498p = view;
        if (view != null) {
            boolean z7 = this.f507y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f507y = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f492j);
            }
            this.f498p.addOnAttachStateChangeListener(this.f493k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i8 = iA + 1;
        if (i8 < this.f491i.size()) {
            this.f491i.get(i8).f517b.e(false);
        }
        d dVarRemove = this.f491i.remove(iA);
        dVarRemove.f517b.O(this);
        if (this.A) {
            dVarRemove.f516a.O(null);
            dVarRemove.f516a.A(0);
        }
        dVarRemove.f516a.dismiss();
        int size = this.f491i.size();
        this.f499q = size > 0 ? this.f491i.get(size - 1).f518c : D();
        if (size != 0) {
            if (z7) {
                this.f491i.get(0).f517b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f506x;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f507y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f507y.removeGlobalOnLayoutListener(this.f492j);
            }
            this.f507y = null;
        }
        this.f498p.removeOnAttachStateChangeListener(this.f493k);
        this.f508z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        Iterator<d> it = this.f491i.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // k.e
    public void dismiss() {
        int size = this.f491i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f491i.toArray(new d[size]);
            for (int i8 = size - 1; i8 >= 0; i8--) {
                d dVar = dVarArr[i8];
                if (dVar.f516a.a()) {
                    dVar.f516a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f506x = aVar;
    }

    @Override // k.e
    public ListView j() {
        if (this.f491i.isEmpty()) {
            return null;
        }
        return this.f491i.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f491i) {
            if (mVar == dVar.f517b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f506x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f484b);
        if (a()) {
            F(eVar);
        } else {
            this.f490h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f491i.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f491i.get(i8);
            if (!dVar.f516a.a()) {
                break;
            } else {
                i8++;
            }
        }
        if (dVar != null) {
            dVar.f517b.e(false);
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
        if (this.f497o != view) {
            this.f497o = view;
            this.f496n = androidx.core.view.d.a(this.f495m, e0.n(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.f504v = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i8) {
        if (this.f495m != i8) {
            this.f495m = i8;
            this.f496n = androidx.core.view.d.a(i8, e0.n(this.f497o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i8) {
        this.f500r = true;
        this.f502t = i8;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f508z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.f505w = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i8) {
        this.f501s = true;
        this.f503u = i8;
    }
}
