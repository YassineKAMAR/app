package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f1086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f1087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f1088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f1091i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = q0.this.f1086d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.this.e();
        }
    }

    public q0(View view) {
        this.f1086d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1083a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1084b = tapTimeout;
        this.f1085c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1088f;
        if (runnable != null) {
            this.f1086d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1087e;
        if (runnable2 != null) {
            this.f1086d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        o0 o0Var;
        View view = this.f1086d;
        k.e eVarB = b();
        if (eVarB == null || !eVarB.a() || (o0Var = (o0) eVarB.j()) == null || !o0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(o0Var, motionEventObtainNoHistory);
        boolean zE = o0Var.e(motionEventObtainNoHistory, this.f1090h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1086d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1090h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1083a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1090h = r6
            java.lang.Runnable r6 = r5.f1087e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.q0$a r6 = new androidx.appcompat.widget.q0$a
            r6.<init>()
            r5.f1087e = r6
        L52:
            java.lang.Runnable r6 = r5.f1087e
            int r1 = r5.f1084b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1088f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.q0$b r6 = new androidx.appcompat.widget.q0$b
            r6.<init>()
            r5.f1088f = r6
        L65:
            java.lang.Runnable r6 = r5.f1088f
            int r1 = r5.f1085c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < ((float) (view.getRight() - view.getLeft())) + f10 && f9 < ((float) (view.getBottom() - view.getTop())) + f10;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1091i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1091i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract k.e b();

    protected abstract boolean c();

    protected boolean d() {
        k.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1086d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1089g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.f1089g;
        if (z8) {
            z7 = f(motionEvent) || !d();
        } else {
            z7 = g(motionEvent) && c();
            if (z7) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1086d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1089g = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1089g = false;
        this.f1090h = -1;
        Runnable runnable = this.f1087e;
        if (runnable != null) {
            this.f1086d.removeCallbacks(runnable);
        }
    }
}
