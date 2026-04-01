package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class v0 implements k.e {
    private static Method G;
    private static Method H;
    private static Method I;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f1158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    o0 f1159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f1171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f1172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f1174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f1175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f1176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final g f1179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final f f1180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final e f1181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f1182z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = v0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            v0.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            o0 o0Var;
            if (i8 == -1 || (o0Var = v0.this.f1159c) == null) {
                return;
            }
            o0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v0.this.r();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (v0.this.a()) {
                v0.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            v0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (i8 != 1 || v0.this.w() || v0.this.F.getContentView() == null) {
                return;
            }
            v0 v0Var = v0.this;
            v0Var.B.removeCallbacks(v0Var.f1179w);
            v0.this.f1179w.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = v0.this.F) != null && popupWindow.isShowing() && x7 >= 0 && x7 < v0.this.F.getWidth() && y7 >= 0 && y7 < v0.this.F.getHeight()) {
                v0 v0Var = v0.this;
                v0Var.B.postDelayed(v0Var.f1179w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            v0 v0Var2 = v0.this;
            v0Var2.B.removeCallbacks(v0Var2.f1179w);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0 o0Var = v0.this.f1159c;
            if (o0Var == null || !androidx.core.view.e0.v(o0Var) || v0.this.f1159c.getCount() <= v0.this.f1159c.getChildCount()) {
                return;
            }
            int childCount = v0.this.f1159c.getChildCount();
            v0 v0Var = v0.this;
            if (childCount <= v0Var.f1171o) {
                v0Var.F.setInputMethodMode(2);
                v0.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public v0(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public v0(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f1160d = -2;
        this.f1161e = -2;
        this.f1164h = 1002;
        this.f1168l = 0;
        this.f1169m = false;
        this.f1170n = false;
        this.f1171o = Integer.MAX_VALUE;
        this.f1173q = 0;
        this.f1179w = new g();
        this.f1180x = new f();
        this.f1181y = new e();
        this.f1182z = new c();
        this.C = new Rect();
        this.f1157a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f21294o1, i8, i9);
        this.f1162f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f21299p1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f21304q1, 0);
        this.f1163g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1165i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i8, i9);
        this.F = pVar;
        pVar.setInputMethodMode(1);
    }

    private void J(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z7);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[PHI: r1
  0x012b: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0120, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.q():int");
    }

    private int u(View view, int i8, boolean z7) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i8, z7);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i8), Boolean.valueOf(z7))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i8);
    }

    private void y() {
        View view = this.f1172p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1172p);
            }
        }
    }

    public void A(int i8) {
        this.F.setAnimationStyle(i8);
    }

    public void B(int i8) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            M(i8);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1161e = rect.left + rect.right + i8;
    }

    public void C(int i8) {
        this.f1168l = i8;
    }

    public void D(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void E(int i8) {
        this.F.setInputMethodMode(i8);
    }

    public void F(boolean z7) {
        this.E = z7;
        this.F.setFocusable(z7);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1177u = onItemClickListener;
    }

    public void I(boolean z7) {
        this.f1167k = true;
        this.f1166j = z7;
    }

    public void K(int i8) {
        this.f1173q = i8;
    }

    public void L(int i8) {
        o0 o0Var = this.f1159c;
        if (!a() || o0Var == null) {
            return;
        }
        o0Var.setListSelectionHidden(false);
        o0Var.setSelection(i8);
        if (o0Var.getChoiceMode() != 0) {
            o0Var.setItemChecked(i8, true);
        }
    }

    public void M(int i8) {
        this.f1161e = i8;
    }

    @Override // k.e
    public boolean a() {
        return this.F.isShowing();
    }

    @Override // k.e
    public void b() {
        int iQ = q();
        boolean zW = w();
        androidx.core.widget.k.b(this.F, this.f1164h);
        if (this.F.isShowing()) {
            if (androidx.core.view.e0.v(t())) {
                int width = this.f1161e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i8 = this.f1160d;
                if (i8 == -1) {
                    if (!zW) {
                        iQ = -1;
                    }
                    if (zW) {
                        this.F.setWidth(this.f1161e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1161e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    iQ = i8;
                }
                this.F.setOutsideTouchable((this.f1170n || this.f1169m) ? false : true);
                this.F.update(t(), this.f1162f, this.f1163g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f1161e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i9 = this.f1160d;
        if (i9 == -1) {
            iQ = -1;
        } else if (i9 != -2) {
            iQ = i9;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iQ);
        J(true);
        this.F.setOutsideTouchable((this.f1170n || this.f1169m) ? false : true);
        this.F.setTouchInterceptor(this.f1180x);
        if (this.f1167k) {
            androidx.core.widget.k.a(this.F, this.f1166j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.k.c(this.F, t(), this.f1162f, this.f1163g, this.f1168l);
        this.f1159c.setSelection(-1);
        if (!this.E || this.f1159c.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1182z);
    }

    public int c() {
        return this.f1162f;
    }

    @Override // k.e
    public void dismiss() {
        this.F.dismiss();
        y();
        this.F.setContentView(null);
        this.f1159c = null;
        this.B.removeCallbacks(this.f1179w);
    }

    public void e(int i8) {
        this.f1162f = i8;
    }

    public Drawable h() {
        return this.F.getBackground();
    }

    @Override // k.e
    public ListView j() {
        return this.f1159c;
    }

    public void k(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void l(int i8) {
        this.f1163g = i8;
        this.f1165i = true;
    }

    public int o() {
        if (this.f1165i) {
            return this.f1163g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1174r;
        if (dataSetObserver == null) {
            this.f1174r = new d();
        } else {
            ListAdapter listAdapter2 = this.f1158b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1158b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1174r);
        }
        o0 o0Var = this.f1159c;
        if (o0Var != null) {
            o0Var.setAdapter(this.f1158b);
        }
    }

    public void r() {
        o0 o0Var = this.f1159c;
        if (o0Var != null) {
            o0Var.setListSelectionHidden(true);
            o0Var.requestLayout();
        }
    }

    o0 s(Context context, boolean z7) {
        return new o0(context, z7);
    }

    public View t() {
        return this.f1175s;
    }

    public int v() {
        return this.f1161e;
    }

    public boolean w() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.E;
    }

    public void z(View view) {
        this.f1175s = view;
    }
}
