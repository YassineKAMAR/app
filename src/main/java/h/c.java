package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
class c extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC0115c f22091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f22092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f22093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f22094d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22096f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f22099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f22102l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22095e = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22097g = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(true);
            c.this.invalidateSelf();
        }
    }

    static class b implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable.Callback f22104a;

        b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f22104a;
            this.f22104a = null;
            return callback;
        }

        public b b(Drawable.Callback callback) {
            this.f22104a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
            Drawable.Callback callback = this.f22104a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j8);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f22104a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: renamed from: h.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0115c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f22105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Resources f22106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f22110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Drawable[] f22111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22112h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f22113i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f22114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Rect f22115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f22116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f22117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22118n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f22119o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f22120p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22121q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f22122r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22123s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f22124t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f22125u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f22126v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f22127w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f22128x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f22129y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f22130z;

        AbstractC0115c(AbstractC0115c abstractC0115c, c cVar, Resources resources) {
            this.f22107c = 160;
            this.f22113i = false;
            this.f22116l = false;
            this.f22128x = true;
            this.A = 0;
            this.B = 0;
            this.f22105a = cVar;
            this.f22106b = resources != null ? resources : abstractC0115c != null ? abstractC0115c.f22106b : null;
            int iF = c.f(resources, abstractC0115c != null ? abstractC0115c.f22107c : 0);
            this.f22107c = iF;
            if (abstractC0115c == null) {
                this.f22111g = new Drawable[10];
                this.f22112h = 0;
                return;
            }
            this.f22108d = abstractC0115c.f22108d;
            this.f22109e = abstractC0115c.f22109e;
            this.f22126v = true;
            this.f22127w = true;
            this.f22113i = abstractC0115c.f22113i;
            this.f22116l = abstractC0115c.f22116l;
            this.f22128x = abstractC0115c.f22128x;
            this.f22129y = abstractC0115c.f22129y;
            this.f22130z = abstractC0115c.f22130z;
            this.A = abstractC0115c.A;
            this.B = abstractC0115c.B;
            this.C = abstractC0115c.C;
            this.D = abstractC0115c.D;
            this.E = abstractC0115c.E;
            this.F = abstractC0115c.F;
            this.G = abstractC0115c.G;
            this.H = abstractC0115c.H;
            this.I = abstractC0115c.I;
            if (abstractC0115c.f22107c == iF) {
                if (abstractC0115c.f22114j) {
                    this.f22115k = new Rect(abstractC0115c.f22115k);
                    this.f22114j = true;
                }
                if (abstractC0115c.f22117m) {
                    this.f22118n = abstractC0115c.f22118n;
                    this.f22119o = abstractC0115c.f22119o;
                    this.f22120p = abstractC0115c.f22120p;
                    this.f22121q = abstractC0115c.f22121q;
                    this.f22117m = true;
                }
            }
            if (abstractC0115c.f22122r) {
                this.f22123s = abstractC0115c.f22123s;
                this.f22122r = true;
            }
            if (abstractC0115c.f22124t) {
                this.f22125u = abstractC0115c.f22125u;
                this.f22124t = true;
            }
            Drawable[] drawableArr = abstractC0115c.f22111g;
            this.f22111g = new Drawable[drawableArr.length];
            this.f22112h = abstractC0115c.f22112h;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC0115c.f22110f;
            this.f22110f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f22112h);
            int i8 = this.f22112h;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f22110f.put(i9, constantState);
                    } else {
                        this.f22111g[i9] = drawableArr[i9];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f22110f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f22111g[this.f22110f.keyAt(i8)] = s(this.f22110f.valueAt(i8).newDrawable(this.f22106b));
                }
                this.f22110f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f22130z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f22105a);
            return drawableMutate;
        }

        public final int a(Drawable drawable) {
            int i8 = this.f22112h;
            if (i8 >= this.f22111g.length) {
                o(i8, i8 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f22105a);
            this.f22111g[i8] = drawable;
            this.f22112h++;
            this.f22109e = drawable.getChangingConfigurations() | this.f22109e;
            p();
            this.f22115k = null;
            this.f22114j = false;
            this.f22117m = false;
            this.f22126v = false;
            return i8;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i8 = this.f22112h;
                Drawable[] drawableArr = this.f22111g;
                for (int i9 = 0; i9 < i8; i9++) {
                    Drawable drawable = drawableArr[i9];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i9].applyTheme(theme);
                        this.f22109e |= drawableArr[i9].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f22126v) {
                return this.f22127w;
            }
            e();
            this.f22126v = true;
            int i8 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            for (int i9 = 0; i9 < i8; i9++) {
                if (drawableArr[i9].getConstantState() == null) {
                    this.f22127w = false;
                    return false;
                }
            }
            this.f22127w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i8 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f22110f.get(i9);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f22117m = true;
            e();
            int i8 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            this.f22119o = -1;
            this.f22118n = -1;
            this.f22121q = 0;
            this.f22120p = 0;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f22118n) {
                    this.f22118n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f22119o) {
                    this.f22119o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f22120p) {
                    this.f22120p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f22121q) {
                    this.f22121q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f22111g.length;
        }

        public final Drawable g(int i8) {
            int iIndexOfKey;
            Drawable drawable = this.f22111g[i8];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f22110f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i8)) < 0) {
                return null;
            }
            Drawable drawableS = s(this.f22110f.valueAt(iIndexOfKey).newDrawable(this.f22106b));
            this.f22111g[i8] = drawableS;
            this.f22110f.removeAt(iIndexOfKey);
            if (this.f22110f.size() == 0) {
                this.f22110f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f22108d | this.f22109e;
        }

        public final int h() {
            return this.f22112h;
        }

        public final int i() {
            if (!this.f22117m) {
                d();
            }
            return this.f22119o;
        }

        public final int j() {
            if (!this.f22117m) {
                d();
            }
            return this.f22121q;
        }

        public final int k() {
            if (!this.f22117m) {
                d();
            }
            return this.f22120p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f22113i) {
                return null;
            }
            Rect rect2 = this.f22115k;
            if (rect2 != null || this.f22114j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i8 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            for (int i9 = 0; i9 < i8; i9++) {
                if (drawableArr[i9].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i10 = rect3.left;
                    if (i10 > rect.left) {
                        rect.left = i10;
                    }
                    int i11 = rect3.top;
                    if (i11 > rect.top) {
                        rect.top = i11;
                    }
                    int i12 = rect3.right;
                    if (i12 > rect.right) {
                        rect.right = i12;
                    }
                    int i13 = rect3.bottom;
                    if (i13 > rect.bottom) {
                        rect.bottom = i13;
                    }
                }
            }
            this.f22114j = true;
            this.f22115k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f22117m) {
                d();
            }
            return this.f22118n;
        }

        public final int n() {
            if (this.f22122r) {
                return this.f22123s;
            }
            e();
            int i8 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            int opacity = i8 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i9 = 1; i9 < i8; i9++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i9].getOpacity());
            }
            this.f22123s = opacity;
            this.f22122r = true;
            return opacity;
        }

        public void o(int i8, int i9) {
            Drawable[] drawableArr = new Drawable[i9];
            System.arraycopy(this.f22111g, 0, drawableArr, 0, i8);
            this.f22111g = drawableArr;
        }

        void p() {
            this.f22122r = false;
            this.f22124t = false;
        }

        public final boolean q() {
            return this.f22116l;
        }

        abstract void r();

        public final void t(boolean z7) {
            this.f22116l = z7;
        }

        public final void u(int i8) {
            this.A = i8;
        }

        public final void v(int i8) {
            this.B = i8;
        }

        final boolean w(int i8, int i9) {
            int i10 = this.f22112h;
            Drawable[] drawableArr = this.f22111g;
            boolean z7 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawable.setLayoutDirection(i8) : false;
                    if (i11 == i9) {
                        z7 = layoutDirection;
                    }
                }
            }
            this.f22130z = i8;
            return z7;
        }

        public final void x(boolean z7) {
            this.f22113i = z7;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f22106b = resources;
                int iF = c.f(resources, this.f22107c);
                int i8 = this.f22107c;
                this.f22107c = iF;
                if (i8 != iF) {
                    this.f22117m = false;
                    this.f22114j = false;
                }
            }
        }
    }

    c() {
    }

    private void d(Drawable drawable) {
        if (this.f22102l == null) {
            this.f22102l = new b();
        }
        drawable.setCallback(this.f22102l.b(drawable.getCallback()));
        try {
            if (this.f22091a.A <= 0 && this.f22096f) {
                drawable.setAlpha(this.f22095e);
            }
            AbstractC0115c abstractC0115c = this.f22091a;
            if (abstractC0115c.E) {
                drawable.setColorFilter(abstractC0115c.D);
            } else {
                if (abstractC0115c.H) {
                    androidx.core.graphics.drawable.a.n(drawable, abstractC0115c.F);
                }
                AbstractC0115c abstractC0115c2 = this.f22091a;
                if (abstractC0115c2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, abstractC0115c2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f22091a.f22128x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f22091a.C);
            Rect rect = this.f22092b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f22102l.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i8) {
        if (resources != null) {
            i8 = resources.getDisplayMetrics().densityDpi;
        }
        if (i8 == 0) {
            return 160;
        }
        return i8;
    }

    void a(boolean z7) {
        boolean z8;
        boolean z9 = true;
        this.f22096f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            long j8 = this.f22100j;
            if (j8 == 0) {
                z8 = false;
            } else if (j8 <= jUptimeMillis) {
                drawable.setAlpha(this.f22095e);
                this.f22100j = 0L;
                z8 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j8 - jUptimeMillis) * 255)) / this.f22091a.A)) * this.f22095e) / 255);
                z8 = true;
            }
        } else {
            this.f22100j = 0L;
            z8 = false;
        }
        Drawable drawable2 = this.f22094d;
        if (drawable2 != null) {
            long j9 = this.f22101k;
            if (j9 == 0) {
                z9 = z8;
            } else if (j9 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f22094d = null;
                this.f22101k = 0L;
                z9 = z8;
            } else {
                drawable2.setAlpha(((((int) ((j9 - jUptimeMillis) * 255)) / this.f22091a.B) * this.f22095e) / 255);
            }
        } else {
            this.f22101k = 0L;
            z9 = z8;
        }
        if (z7 && z9) {
            scheduleSelf(this.f22099i, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f22091a.b(theme);
    }

    AbstractC0115c b() {
        throw null;
    }

    int c() {
        return this.f22097g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f22091a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f22094d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f22097g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.c$c r0 = r9.f22091a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f22094d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f22093c
            if (r0 == 0) goto L29
            r9.f22094d = r0
            h.c$c r0 = r9.f22091a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f22101k = r0
            goto L35
        L29:
            r9.f22094d = r4
            r9.f22101k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f22093c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.c$c r0 = r9.f22091a
            int r1 = r0.f22112h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f22093c = r0
            r9.f22097g = r10
            if (r0 == 0) goto L5a
            h.c$c r10 = r9.f22091a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f22100j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f22093c = r4
            r10 = -1
            r9.f22097g = r10
        L5a:
            long r0 = r9.f22100j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f22101k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f22099i
            if (r0 != 0) goto L73
            h.c$a r0 = new h.c$a
            r0.<init>()
            r9.f22099i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22095e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f22091a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f22091a.c()) {
            return null;
        }
        this.f22091a.f22108d = getChangingConfigurations();
        return this.f22091a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f22093c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f22092b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f22091a.q()) {
            return this.f22091a.i();
        }
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f22091a.q()) {
            return this.f22091a.m();
        }
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f22091a.q()) {
            return this.f22091a.j();
        }
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f22091a.q()) {
            return this.f22091a.k();
        }
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f22093c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f22091a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f22091a.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f22093c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    void h(AbstractC0115c abstractC0115c) {
        this.f22091a = abstractC0115c;
        int i8 = this.f22097g;
        if (i8 >= 0) {
            Drawable drawableG = abstractC0115c.g(i8);
            this.f22093c = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f22094d = null;
    }

    final void i(Resources resources) {
        this.f22091a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0115c abstractC0115c = this.f22091a;
        if (abstractC0115c != null) {
            abstractC0115c.p();
        }
        if (drawable != this.f22093c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f22091a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z7;
        Drawable drawable = this.f22094d;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f22094d = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f22093c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f22096f) {
                this.f22093c.setAlpha(this.f22095e);
            }
        }
        if (this.f22101k != 0) {
            this.f22101k = 0L;
            z7 = true;
        }
        if (this.f22100j != 0) {
            this.f22100j = 0L;
        } else {
            z8 = z7;
        }
        if (z8) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f22098h && super.mutate() == this) {
            AbstractC0115c abstractC0115cB = b();
            abstractC0115cB.r();
            h(abstractC0115cB);
            this.f22098h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f22094d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f22093c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        return this.f22091a.w(i8, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        Drawable drawable = this.f22094d;
        if (drawable != null) {
            return drawable.setLevel(i8);
        }
        Drawable drawable2 = this.f22093c;
        if (drawable2 != null) {
            return drawable2.setLevel(i8);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f22094d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f22093c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        if (drawable != this.f22093c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.f22096f && this.f22095e == i8) {
            return;
        }
        this.f22096f = true;
        this.f22095e = i8;
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            if (this.f22100j == 0) {
                drawable.setAlpha(i8);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        AbstractC0115c abstractC0115c = this.f22091a;
        if (abstractC0115c.C != z7) {
            abstractC0115c.C = z7;
            Drawable drawable = this.f22093c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0115c abstractC0115c = this.f22091a;
        abstractC0115c.E = true;
        if (abstractC0115c.D != colorFilter) {
            abstractC0115c.D = colorFilter;
            Drawable drawable = this.f22093c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        AbstractC0115c abstractC0115c = this.f22091a;
        if (abstractC0115c.f22128x != z7) {
            abstractC0115c.f22128x = z7;
            Drawable drawable = this.f22093c;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f8, f9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        Rect rect = this.f22092b;
        if (rect == null) {
            this.f22092b = new Rect(i8, i9, i10, i11);
        } else {
            rect.set(i8, i9, i10, i11);
        }
        Drawable drawable = this.f22093c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i8, i9, i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0115c abstractC0115c = this.f22091a;
        abstractC0115c.H = true;
        if (abstractC0115c.F != colorStateList) {
            abstractC0115c.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f22093c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0115c abstractC0115c = this.f22091a;
        abstractC0115c.I = true;
        if (abstractC0115c.G != mode) {
            abstractC0115c.G = mode;
            androidx.core.graphics.drawable.a.o(this.f22093c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f22094d;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f22093c;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f22093c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
