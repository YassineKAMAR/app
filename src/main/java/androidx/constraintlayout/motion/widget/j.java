package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j extends ConstraintLayout implements y {
    public static boolean H0;
    float A;
    private int[] A0;
    private int B;
    int B0;
    int C;
    private int C0;
    private int D;
    private boolean D0;
    private boolean E;
    e E0;
    HashMap<View, g> F;
    private boolean F0;
    private long G;
    ArrayList<Integer> G0;
    private float H;
    float I;
    float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f1298a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    float f1299b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f1300c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f1301d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private d f1302e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f1303f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f1304g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f1305h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f1306i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    float f1307j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    float f1308k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    long f1309l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    float f1310m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f1311n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ArrayList<h> f1312o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private ArrayList<h> f1313p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ArrayList<h> f1314q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private CopyOnWriteArrayList<d> f1315r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f1316s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f1317t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f1318u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected boolean f1319v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    float f1320w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f1321x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Interpolator f1322y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private c f1323y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Interpolator f1324z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private Runnable f1325z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f1323y0.a();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1327a;

        static {
            int[] iArr = new int[e.values().length];
            f1327a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1327a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1327a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1327a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f1328a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f1329b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1330c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1331d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f1332e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f1333f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f1334g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f1335h = "motion.EndState";

        c() {
        }

        void a() {
            int i8 = this.f1330c;
            if (i8 != -1 || this.f1331d != -1) {
                if (i8 == -1) {
                    j.this.N(this.f1331d);
                } else {
                    int i9 = this.f1331d;
                    if (i9 == -1) {
                        j.this.K(i8, -1, -1);
                    } else {
                        j.this.L(i8, i9);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f1329b)) {
                if (Float.isNaN(this.f1328a)) {
                    return;
                }
                j.this.setProgress(this.f1328a);
            } else {
                j.this.J(this.f1328a, this.f1329b);
                this.f1328a = Float.NaN;
                this.f1329b = Float.NaN;
                this.f1330c = -1;
                this.f1331d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1328a);
            bundle.putFloat("motion.velocity", this.f1329b);
            bundle.putInt("motion.StartState", this.f1330c);
            bundle.putInt("motion.EndState", this.f1331d);
            return bundle;
        }

        public void c() {
            this.f1331d = j.this.D;
            this.f1330c = j.this.B;
            this.f1329b = j.this.getVelocity();
            this.f1328a = j.this.getProgress();
        }

        public void d(int i8) {
            this.f1331d = i8;
        }

        public void e(float f8) {
            this.f1328a = f8;
        }

        public void f(int i8) {
            this.f1330c = i8;
        }

        public void g(Bundle bundle) {
            this.f1328a = bundle.getFloat("motion.progress");
            this.f1329b = bundle.getFloat("motion.velocity");
            this.f1330c = bundle.getInt("motion.StartState");
            this.f1331d = bundle.getInt("motion.EndState");
        }

        public void h(float f8) {
            this.f1329b = f8;
        }
    }

    public interface d {
        void a(j jVar, int i8, int i9, float f8);

        void b(j jVar, int i8, int i9);

        void c(j jVar, int i8);
    }

    enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void F() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f1302e0 == null && ((copyOnWriteArrayList = this.f1315r0) == null || copyOnWriteArrayList.isEmpty())) || this.f1317t0 == this.I) {
            return;
        }
        if (this.f1316s0 != -1) {
            d dVar = this.f1302e0;
            if (dVar != null) {
                dVar.b(this, this.B, this.D);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1315r0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, this.B, this.D);
                }
            }
            this.f1318u0 = true;
        }
        this.f1316s0 = -1;
        float f8 = this.I;
        this.f1317t0 = f8;
        d dVar2 = this.f1302e0;
        if (dVar2 != null) {
            dVar2.a(this, this.B, this.D, f8);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f1315r0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.B, this.D, this.I);
            }
        }
        this.f1318u0 = true;
    }

    private void I() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.f1302e0 == null && ((copyOnWriteArrayList = this.f1315r0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f1318u0 = false;
        for (Integer num : this.G0) {
            d dVar = this.f1302e0;
            if (dVar != null) {
                dVar.c(this, num.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1315r0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, num.intValue());
                }
            }
        }
        this.G0.clear();
    }

    void D(float f8) {
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x021a A[PHI: r2
  0x021a: PHI (r2v15 int) = (r2v13 int), (r2v16 int) binds: [B:161:0x0227, B:154:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void E(boolean r22) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.E(boolean):void");
    }

    protected void G() {
        int iIntValue;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f1302e0 != null || ((copyOnWriteArrayList = this.f1315r0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1316s0 == -1) {
            this.f1316s0 = this.C;
            if (this.G0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.G0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i8 = this.C;
            if (iIntValue != i8 && i8 != -1) {
                this.G0.add(Integer.valueOf(i8));
            }
        }
        I();
        Runnable runnable = this.f1325z0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.A0;
        if (iArr == null || this.B0 <= 0) {
            return;
        }
        N(iArr[0]);
        int[] iArr2 = this.A0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.B0--;
    }

    void H() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f1323y0
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.j$c r0 = new androidx.constraintlayout.motion.widget.j$c
            r0.<init>()
            r2.f1323y0 = r0
        L11:
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f1323y0
            r0.e(r3)
            androidx.constraintlayout.motion.widget.j$c r3 = r2.f1323y0
            r3.h(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.j$e r0 = androidx.constraintlayout.motion.widget.j.e.MOVING
            r2.setState(r0)
            r2.A = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L35
            if (r4 <= 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            r2.D(r0)
            goto L44
        L35:
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L44
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L44
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L30
            goto L31
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.J(float, float):void");
    }

    public void K(int i8, int i9, int i10) {
        setState(e.SETUP);
        this.C = i8;
        this.B = -1;
        this.D = -1;
        androidx.constraintlayout.widget.d dVar = this.f1372k;
        if (dVar != null) {
            dVar.d(i8, i9, i10);
        }
    }

    public void L(int i8, int i9) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f1323y0 == null) {
            this.f1323y0 = new c();
        }
        this.f1323y0.f(i8);
        this.f1323y0.d(i9);
    }

    public void M() {
        D(1.0f);
        this.f1325z0 = null;
    }

    public void N(int i8) {
        if (isAttachedToWindow()) {
            O(i8, -1, -1);
            return;
        }
        if (this.f1323y0 == null) {
            this.f1323y0 = new c();
        }
        this.f1323y0.d(i8);
    }

    public void O(int i8, int i9, int i10) {
        P(i8, i9, i10, -1);
    }

    public void P(int i8, int i9, int i10, int i11) {
        int i12 = this.C;
        if (i12 == i8) {
            return;
        }
        if (this.B == i8) {
            D(0.0f);
            if (i11 > 0) {
                this.H = i11 / 1000.0f;
                return;
            }
            return;
        }
        if (this.D == i8) {
            D(1.0f);
            if (i11 > 0) {
                this.H = i11 / 1000.0f;
                return;
            }
            return;
        }
        this.D = i8;
        if (i12 != -1) {
            L(i12, i8);
            D(1.0f);
            this.W = 0.0f;
            M();
            if (i11 > 0) {
                this.H = i11 / 1000.0f;
                return;
            }
            return;
        }
        this.f1304g0 = false;
        this.f1299b0 = 1.0f;
        this.I = 0.0f;
        this.W = 0.0f;
        this.f1298a0 = getNanoTime();
        this.G = getNanoTime();
        this.f1300c0 = false;
        this.f1322y = null;
        if (i11 == -1) {
            throw null;
        }
        this.B = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f1314q0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        E(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.C;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f1305h0 == null) {
            this.f1305h0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f1305h0;
    }

    public int getEndState() {
        return this.D;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.W;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.B;
    }

    public float getTargetPosition() {
        return this.f1299b0;
    }

    public Bundle getTransitionState() {
        if (this.f1323y0 == null) {
            this.f1323y0 = new c();
        }
        this.f1323y0.c();
        return this.f1323y0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.H * 1000.0f);
    }

    public float getVelocity() {
        return this.A;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.y
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (this.f1306i0 || i8 != 0 || i9 != 0) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
        }
        this.f1306i0 = false;
    }

    @Override // androidx.core.view.x
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
    }

    @Override // androidx.core.view.x
    public boolean l(View view, View view2, int i8, int i9) {
        return false;
    }

    @Override // androidx.core.view.x
    public void m(View view, View view2, int i8, int i9) {
        this.f1309l0 = getNanoTime();
        this.f1310m0 = 0.0f;
        this.f1307j0 = 0.0f;
        this.f1308k0 = 0.0f;
    }

    @Override // androidx.core.view.x
    public void n(View view, int i8) {
    }

    @Override // androidx.core.view.x
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.C0 = display.getRotation();
        }
        H();
        c cVar = this.f1323y0;
        if (cVar != null) {
            if (this.D0) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        this.f1321x0 = true;
        try {
            super.onLayout(z7, i8, i9, i10, i11);
        } finally {
            this.f1321x0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f1315r0 == null) {
                this.f1315r0 = new CopyOnWriteArrayList<>();
            }
            this.f1315r0.add(hVar);
            if (hVar.v()) {
                if (this.f1312o0 == null) {
                    this.f1312o0 = new ArrayList<>();
                }
                this.f1312o0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f1313p0 == null) {
                    this.f1313p0 = new ArrayList<>();
                }
                this.f1313p0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f1314q0 == null) {
                    this.f1314q0 = new ArrayList<>();
                }
                this.f1314q0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f1312o0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f1313p0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f1319v0) {
            int i8 = this.C;
        }
        super.requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void s(int i8) {
        this.f1372k = null;
    }

    public void setDebugMode(int i8) {
        this.f1303f0 = i8;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z7) {
        this.D0 = z7;
    }

    public void setInteractionEnabled(boolean z7) {
        this.E = z7;
    }

    public void setInterpolatedProgress(float f8) {
        setProgress(f8);
    }

    public void setOnHide(float f8) {
        ArrayList<h> arrayList = this.f1313p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f1313p0.get(i8).setProgress(f8);
            }
        }
    }

    public void setOnShow(float f8) {
        ArrayList<h> arrayList = this.f1312o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f1312o0.get(i8).setProgress(f8);
            }
        }
    }

    public void setProgress(float f8) {
        e eVar;
        if (f8 < 0.0f || f8 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1323y0 == null) {
                this.f1323y0 = new c();
            }
            this.f1323y0.e(f8);
            return;
        }
        if (f8 <= 0.0f) {
            if (this.W == 1.0f && this.C == this.D) {
                setState(e.MOVING);
            }
            this.C = this.B;
            if (this.W != 0.0f) {
                return;
            }
        } else if (f8 < 1.0f) {
            this.C = -1;
            eVar = e.MOVING;
            setState(eVar);
        } else {
            if (this.W == 0.0f && this.C == this.B) {
                setState(e.MOVING);
            }
            this.C = this.D;
            if (this.W != 1.0f) {
                return;
            }
        }
        eVar = e.FINISHED;
        setState(eVar);
    }

    public void setScene(l lVar) {
        q();
        throw null;
    }

    void setStartState(int i8) {
        if (isAttachedToWindow()) {
            this.C = i8;
            return;
        }
        if (this.f1323y0 == null) {
            this.f1323y0 = new c();
        }
        this.f1323y0.f(i8);
        this.f1323y0.d(i8);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.C == -1) {
            return;
        }
        e eVar3 = this.E0;
        this.E0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            F();
        }
        int i8 = b.f1327a[eVar3.ordinal()];
        if (i8 == 1 || i8 == 2) {
            if (eVar == eVar4) {
                F();
            }
            if (eVar != eVar2) {
                return;
            }
        } else if (i8 != 3 || eVar != eVar2) {
            return;
        }
        G();
    }

    public void setTransition(int i8) {
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i8) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.f1302e0 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1323y0 == null) {
            this.f1323y0 = new c();
        }
        this.f1323y0.g(bundle);
        if (isAttachedToWindow()) {
            this.f1323y0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.B) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.D) + " (pos:" + this.W + " Dpos/Dt:" + this.A;
    }
}
