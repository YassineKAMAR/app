package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.e0;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f605l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z7, int i8) {
        this(context, eVar, view, z7, i8, 0);
    }

    public i(Context context, e eVar, View view, boolean z7, int i8, int i9) {
        this.f600g = 8388611;
        this.f605l = new a();
        this.f594a = context;
        this.f595b = eVar;
        this.f599f = view;
        this.f596c = z7;
        this.f597d = i8;
        this.f598e = i9;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f594a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f594a.getResources().getDimensionPixelSize(e.d.f21124c) ? new b(this.f594a, this.f599f, this.f597d, this.f598e, this.f596c) : new l(this.f594a, this.f595b, this.f599f, this.f597d, this.f598e, this.f596c);
        bVar.l(this.f595b);
        bVar.u(this.f605l);
        bVar.p(this.f599f);
        bVar.h(this.f602i);
        bVar.r(this.f601h);
        bVar.s(this.f600g);
        return bVar;
    }

    private void l(int i8, int i9, boolean z7, boolean z8) {
        h hVarC = c();
        hVarC.v(z8);
        if (z7) {
            if ((androidx.core.view.d.a(this.f600g, e0.n(this.f599f)) & 7) == 5) {
                i8 -= this.f599f.getWidth();
            }
            hVarC.t(i8);
            hVarC.w(i9);
            int i10 = (int) ((this.f594a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.q(new Rect(i8 - i10, i9 - i10, i8 + i10, i9 + i10));
        }
        hVarC.b();
    }

    public void b() {
        if (d()) {
            this.f603j.dismiss();
        }
    }

    public h c() {
        if (this.f603j == null) {
            this.f603j = a();
        }
        return this.f603j;
    }

    public boolean d() {
        h hVar = this.f603j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f603j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f604k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f599f = view;
    }

    public void g(boolean z7) {
        this.f601h = z7;
        h hVar = this.f603j;
        if (hVar != null) {
            hVar.r(z7);
        }
    }

    public void h(int i8) {
        this.f600g = i8;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f604k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f602i = aVar;
        h hVar = this.f603j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f599f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i8, int i9) {
        if (d()) {
            return true;
        }
        if (this.f599f == null) {
            return false;
        }
        l(i8, i9, true, true);
        return true;
    }
}
