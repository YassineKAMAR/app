package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class p1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static p1 f1067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static p1 f1068k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f1072d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f1073e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q1 f1076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1077i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p1.this.c();
        }
    }

    private p1(View view, CharSequence charSequence) {
        this.f1069a = view;
        this.f1070b = charSequence;
        this.f1071c = androidx.core.view.b1.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1069a.removeCallbacks(this.f1072d);
    }

    private void b() {
        this.f1074f = Integer.MAX_VALUE;
        this.f1075g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1069a.postDelayed(this.f1072d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(p1 p1Var) {
        p1 p1Var2 = f1067j;
        if (p1Var2 != null) {
            p1Var2.a();
        }
        f1067j = p1Var;
        if (p1Var != null) {
            p1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        p1 p1Var = f1067j;
        if (p1Var != null && p1Var.f1069a == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p1(view, charSequence);
            return;
        }
        p1 p1Var2 = f1068k;
        if (p1Var2 != null && p1Var2.f1069a == view) {
            p1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (Math.abs(x7 - this.f1074f) <= this.f1071c && Math.abs(y7 - this.f1075g) <= this.f1071c) {
            return false;
        }
        this.f1074f = x7;
        this.f1075g = y7;
        return true;
    }

    void c() {
        if (f1068k == this) {
            f1068k = null;
            q1 q1Var = this.f1076h;
            if (q1Var != null) {
                q1Var.c();
                this.f1076h = null;
                b();
                this.f1069a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1067j == this) {
            e(null);
        }
        this.f1069a.removeCallbacks(this.f1073e);
    }

    void g(boolean z7) {
        long longPressTimeout;
        if (androidx.core.view.e0.v(this.f1069a)) {
            e(null);
            p1 p1Var = f1068k;
            if (p1Var != null) {
                p1Var.c();
            }
            f1068k = this;
            this.f1077i = z7;
            q1 q1Var = new q1(this.f1069a.getContext());
            this.f1076h = q1Var;
            q1Var.e(this.f1069a, this.f1074f, this.f1075g, this.f1077i, this.f1070b);
            this.f1069a.addOnAttachStateChangeListener(this);
            if (this.f1077i) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.e0.s(this.f1069a) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1069a.removeCallbacks(this.f1073e);
            this.f1069a.postDelayed(this.f1073e, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1076h != null && this.f1077i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1069a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1069a.isEnabled() && this.f1076h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1074f = view.getWidth() / 2;
        this.f1075g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
