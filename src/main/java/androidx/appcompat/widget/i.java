package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.b1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f987b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static i f988c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b1 f989a;

    class a implements b1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f990a = {e.e.S, e.e.Q, e.e.f21134a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f991b = {e.e.f21148o, e.e.B, e.e.f21153t, e.e.f21149p, e.e.f21150q, e.e.f21152s, e.e.f21151r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f992c = {e.e.P, e.e.R, e.e.f21144k, e.e.I, e.e.J, e.e.L, e.e.N, e.e.K, e.e.M, e.e.O};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f993d = {e.e.f21156w, e.e.f21142i, e.e.f21155v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f994e = {e.e.H, e.e.T};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f995f = {e.e.f21136c, e.e.f21140g, e.e.f21137d, e.e.f21141h};

        a() {
        }

        private boolean f(int[] iArr, int i8) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i8) {
            int iC = g1.c(context, e.a.f21108v);
            return new ColorStateList(new int[][]{g1.f958b, g1.f961e, g1.f959c, g1.f965i}, new int[]{g1.b(context, e.a.f21106t), androidx.core.graphics.a.c(iC, i8), androidx.core.graphics.a.c(iC, i8), i8});
        }

        private ColorStateList i(Context context) {
            return h(context, g1.c(context, e.a.f21105s));
        }

        private ColorStateList j(Context context) {
            return h(context, g1.c(context, e.a.f21106t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i8 = e.a.f21110x;
            ColorStateList colorStateListE = g1.e(context, i8);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = g1.f958b;
                iArr2[0] = g1.b(context, i8);
                iArr[1] = g1.f962f;
                iArr2[1] = g1.c(context, e.a.f21107u);
                iArr[2] = g1.f965i;
                iArr2[2] = g1.c(context, i8);
            } else {
                int[] iArr3 = g1.f958b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = g1.f962f;
                iArr2[1] = g1.c(context, e.a.f21107u);
                iArr[2] = g1.f965i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i8, PorterDuff.Mode mode) {
            if (n0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f987b;
            }
            drawable.setColorFilter(i.e(i8, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.b1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.a()
                int[] r1 = r6.f990a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = e.a.f21109w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f992c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = e.a.f21107u
                goto L14
            L22:
                int[] r1 = r6.f993d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = e.e.f21154u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = e.e.f21145l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.n0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.g1.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.i.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.b1.e
        public PorterDuff.Mode b(int i8) {
            if (i8 == e.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b1.e
        public Drawable c(b1 b1Var, Context context, int i8) {
            if (i8 == e.e.f21143j) {
                return new LayerDrawable(new Drawable[]{b1Var.j(context, e.e.f21142i), b1Var.j(context, e.e.f21144k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b1.e
        public ColorStateList d(Context context, int i8) {
            if (i8 == e.e.f21146m) {
                return g.b.c(context, e.c.f21118e);
            }
            if (i8 == e.e.G) {
                return g.b.c(context, e.c.f21121h);
            }
            if (i8 == e.e.F) {
                return k(context);
            }
            if (i8 == e.e.f21139f) {
                return j(context);
            }
            if (i8 == e.e.f21135b) {
                return g(context);
            }
            if (i8 == e.e.f21138e) {
                return i(context);
            }
            if (i8 == e.e.D || i8 == e.e.E) {
                return g.b.c(context, e.c.f21120g);
            }
            if (f(this.f991b, i8)) {
                return g1.e(context, e.a.f21109w);
            }
            if (f(this.f994e, i8)) {
                return g.b.c(context, e.c.f21117d);
            }
            if (f(this.f995f, i8)) {
                return g.b.c(context, e.c.f21116c);
            }
            if (i8 == e.e.A) {
                return g.b.c(context, e.c.f21119f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.b1.e
        public boolean e(Context context, int i8, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i8 == e.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i9 = e.a.f21109w;
                l(drawableFindDrawableByLayerId2, g1.c(context, i9), i.f987b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), g1.c(context, i9), i.f987b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = g1.c(context, e.a.f21107u);
            } else {
                if (i8 != e.e.f21158y && i8 != e.e.f21157x && i8 != e.e.f21159z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(R.id.background), g1.b(context, e.a.f21109w), i.f987b);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i10 = e.a.f21107u;
                l(drawableFindDrawableByLayerId3, g1.c(context, i10), i.f987b);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = g1.c(context, i10);
            }
            l(drawableFindDrawableByLayerId, iC, i.f987b);
            return true;
        }
    }

    public static synchronized i b() {
        if (f988c == null) {
            h();
        }
        return f988c;
    }

    public static synchronized PorterDuffColorFilter e(int i8, PorterDuff.Mode mode) {
        return b1.l(i8, mode);
    }

    public static synchronized void h() {
        if (f988c == null) {
            i iVar = new i();
            f988c = iVar;
            iVar.f989a = b1.h();
            f988c.f989a.u(new a());
        }
    }

    static void i(Drawable drawable, j1 j1Var, int[] iArr) {
        b1.w(drawable, j1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i8) {
        return this.f989a.j(context, i8);
    }

    synchronized Drawable d(Context context, int i8, boolean z7) {
        return this.f989a.k(context, i8, z7);
    }

    synchronized ColorStateList f(Context context, int i8) {
        return this.f989a.m(context, i8);
    }

    public synchronized void g(Context context) {
        this.f989a.s(context);
    }
}
