package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f2288r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f2291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f2292d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2296h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f2301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f2302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f2303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2305q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0030a f2289a = new C0030a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f2290b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f2293e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f2294f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f2297i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f2298j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f2299k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0030a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f2309d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f2315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f2316k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f2310e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f2314i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f2311f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2312g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2313h = 0;

        C0030a() {
        }

        private float e(long j8) {
            if (j8 < this.f2310e) {
                return 0.0f;
            }
            long j9 = this.f2314i;
            if (j9 < 0 || j8 < j9) {
                return a.e((j8 - r0) / this.f2306a, 0.0f, 1.0f) * 0.5f;
            }
            float f8 = this.f2315j;
            return (1.0f - f8) + (f8 * a.e((j8 - j9) / this.f2316k, 0.0f, 1.0f));
        }

        private float g(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public void a() {
            if (this.f2311f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j8 = jCurrentAnimationTimeMillis - this.f2311f;
            this.f2311f = jCurrentAnimationTimeMillis;
            float f8 = j8 * fG;
            this.f2312g = (int) (this.f2308c * f8);
            this.f2313h = (int) (f8 * this.f2309d);
        }

        public int b() {
            return this.f2312g;
        }

        public int c() {
            return this.f2313h;
        }

        public int d() {
            float f8 = this.f2308c;
            return (int) (f8 / Math.abs(f8));
        }

        public int f() {
            float f8 = this.f2309d;
            return (int) (f8 / Math.abs(f8));
        }

        public boolean h() {
            return this.f2314i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2314i + ((long) this.f2316k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2316k = a.f((int) (jCurrentAnimationTimeMillis - this.f2310e), 0, this.f2307b);
            this.f2315j = e(jCurrentAnimationTimeMillis);
            this.f2314i = jCurrentAnimationTimeMillis;
        }

        public void j(int i8) {
            this.f2307b = i8;
        }

        public void k(int i8) {
            this.f2306a = i8;
        }

        public void l(float f8, float f9) {
            this.f2308c = f8;
            this.f2309d = f9;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2310e = jCurrentAnimationTimeMillis;
            this.f2314i = -1L;
            this.f2311f = jCurrentAnimationTimeMillis;
            this.f2315j = 0.5f;
            this.f2312g = 0;
            this.f2313h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f2303o) {
                if (aVar.f2301m) {
                    aVar.f2301m = false;
                    aVar.f2289a.m();
                }
                C0030a c0030a = a.this.f2289a;
                if (c0030a.h() || !a.this.E()) {
                    a.this.f2303o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f2302n) {
                    aVar2.f2302n = false;
                    aVar2.c();
                }
                c0030a.a();
                a.this.j(c0030a.b(), c0030a.c());
                e0.C(a.this.f2291c, this);
            }
        }
    }

    public a(View view) {
        this.f2291c = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        q(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        z(f10, f10);
        l(1);
        p(Float.MAX_VALUE, Float.MAX_VALUE);
        C(0.2f, 0.2f);
        D(1.0f, 1.0f);
        k(f2288r);
        B(500);
        A(500);
    }

    private void F() {
        int i8;
        if (this.f2292d == null) {
            this.f2292d = new b();
        }
        this.f2303o = true;
        this.f2301m = true;
        if (this.f2300l || (i8 = this.f2296h) <= 0) {
            this.f2292d.run();
        } else {
            e0.D(this.f2291c, this.f2292d, i8);
        }
        this.f2300l = true;
    }

    private float d(int i8, float f8, float f9, float f10) {
        float fH = h(this.f2293e[i8], f9, this.f2294f[i8], f8);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f11 = this.f2297i[i8];
        float f12 = this.f2298j[i8];
        float f13 = this.f2299k[i8];
        float f14 = f11 * f10;
        return fH > 0.0f ? e(fH * f14, f12, f13) : -e((-fH) * f14, f12, f13);
    }

    static float e(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    static int f(int i8, int i9, int i10) {
        return i8 > i10 ? i10 : i8 < i9 ? i9 : i8;
    }

    private float g(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.f2295g;
        if (i8 == 0 || i8 == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.f2303o && i8 == 1) {
                    return 1.0f;
                }
            }
        } else if (i8 == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    private float h(float f8, float f9, float f10, float f11) {
        float interpolation;
        float fE = e(f8 * f9, 0.0f, f10);
        float fG = g(f9 - f11, fE) - g(f11, fE);
        if (fG < 0.0f) {
            interpolation = -this.f2290b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2290b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2301m) {
            this.f2303o = false;
        } else {
            this.f2289a.i();
        }
    }

    public a A(int i8) {
        this.f2289a.j(i8);
        return this;
    }

    public a B(int i8) {
        this.f2289a.k(i8);
        return this;
    }

    public a C(float f8, float f9) {
        float[] fArr = this.f2293e;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a D(float f8, float f9) {
        float[] fArr = this.f2297i;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    boolean E() {
        C0030a c0030a = this.f2289a;
        int iF = c0030a.f();
        int iD = c0030a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }

    public abstract boolean a(int i8);

    public abstract boolean b(int i8);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2291c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i8, int i9);

    public a k(int i8) {
        this.f2296h = i8;
        return this;
    }

    public a l(int i8) {
        this.f2295g = i8;
        return this;
    }

    public a m(boolean z7) {
        if (this.f2304p && !z7) {
            i();
        }
        this.f2304p = z7;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2304p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f2302n = r2
            r5.f2300l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2291c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2291c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2289a
            r7.l(r0, r6)
            boolean r6 = r5.f2303o
            if (r6 != 0) goto L58
            boolean r6 = r5.E()
            if (r6 == 0) goto L58
            r5.F()
        L58:
            boolean r6 = r5.f2305q
            if (r6 == 0) goto L61
            boolean r6 = r5.f2303o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f8, float f9) {
        float[] fArr = this.f2294f;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a q(float f8, float f9) {
        float[] fArr = this.f2299k;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a z(float f8, float f9) {
        float[] fArr = this.f2298j;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }
}
