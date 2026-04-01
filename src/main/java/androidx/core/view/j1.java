package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f2213b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f2214a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f2215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f2216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f2217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f2218d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2215a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2216b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2217c = declaredField3;
                declaredField3.setAccessible(true);
                f2218d = true;
            } catch (ReflectiveOperationException e8) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        public static j1 a(View view) {
            if (f2218d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2215a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2216b.get(obj);
                        Rect rect2 = (Rect) f2217c.get(obj);
                        if (rect != null && rect2 != null) {
                            j1 j1VarA = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            j1VarA.r(j1VarA);
                            j1VarA.d(view.getRootView());
                            return j1VarA;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f2219a;

        public b() {
            int i8 = Build.VERSION.SDK_INT;
            this.f2219a = i8 >= 30 ? new e() : i8 >= 29 ? new d() : new c();
        }

        public b(j1 j1Var) {
            int i8 = Build.VERSION.SDK_INT;
            this.f2219a = i8 >= 30 ? new e(j1Var) : i8 >= 29 ? new d(j1Var) : new c(j1Var);
        }

        public j1 a() {
            return this.f2219a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f2219a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f2219a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f2220e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f2221f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f2222g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f2223h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f2224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b f2225d;

        c() {
            this.f2224c = h();
        }

        c(j1 j1Var) {
            super(j1Var);
            this.f2224c = j1Var.t();
        }

        private static WindowInsets h() {
            if (!f2221f) {
                try {
                    f2220e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                f2221f = true;
            }
            Field field = f2220e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
                }
            }
            if (!f2223h) {
                try {
                    f2222g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
                }
                f2223h = true;
            }
            Constructor<WindowInsets> constructor = f2222g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
                }
            }
            return null;
        }

        @Override // androidx.core.view.j1.f
        j1 b() {
            a();
            j1 j1VarU = j1.u(this.f2224c);
            j1VarU.p(this.f2228b);
            j1VarU.s(this.f2225d);
            return j1VarU;
        }

        @Override // androidx.core.view.j1.f
        void d(androidx.core.graphics.b bVar) {
            this.f2225d = bVar;
        }

        @Override // androidx.core.view.j1.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f2224c;
            if (windowInsets != null) {
                this.f2224c = windowInsets.replaceSystemWindowInsets(bVar.f2008a, bVar.f2009b, bVar.f2010c, bVar.f2011d);
            }
        }
    }

    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets$Builder f2226c;

        d() {
            this.f2226c = new WindowInsets$Builder();
        }

        d(j1 j1Var) {
            super(j1Var);
            WindowInsets windowInsetsT = j1Var.t();
            this.f2226c = windowInsetsT != null ? new WindowInsets$Builder(windowInsetsT) : new WindowInsets$Builder();
        }

        @Override // androidx.core.view.j1.f
        j1 b() {
            a();
            j1 j1VarU = j1.u(this.f2226c.build());
            j1VarU.p(this.f2228b);
            return j1VarU;
        }

        @Override // androidx.core.view.j1.f
        void c(androidx.core.graphics.b bVar) {
            this.f2226c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.j1.f
        void d(androidx.core.graphics.b bVar) {
            this.f2226c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.j1.f
        void e(androidx.core.graphics.b bVar) {
            this.f2226c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.j1.f
        void f(androidx.core.graphics.b bVar) {
            this.f2226c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.j1.f
        void g(androidx.core.graphics.b bVar) {
            this.f2226c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(j1 j1Var) {
            super(j1Var);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j1 f2227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.b[] f2228b;

        f() {
            this(new j1((j1) null));
        }

        f(j1 j1Var) {
            this.f2227a = j1Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f2228b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVarF = bVarArr[m.b(1)];
                androidx.core.graphics.b bVarF2 = this.f2228b[m.b(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f2227a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f2227a.f(1);
                }
                f(androidx.core.graphics.b.a(bVarF, bVarF2));
                androidx.core.graphics.b bVar = this.f2228b[m.b(16)];
                if (bVar != null) {
                    e(bVar);
                }
                androidx.core.graphics.b bVar2 = this.f2228b[m.b(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                androidx.core.graphics.b bVar3 = this.f2228b[m.b(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        j1 b() {
            throw null;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
            throw null;
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
            throw null;
        }

        void g(androidx.core.graphics.b bVar) {
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f2229h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f2230i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f2231j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f2232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f2233l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f2234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b[] f2235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.b f2236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j1 f2237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.b f2238g;

        g(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var);
            this.f2236e = null;
            this.f2234c = windowInsets;
        }

        g(j1 j1Var, g gVar) {
            this(j1Var, new WindowInsets(gVar.f2234c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b u(int i8, boolean z7) {
            androidx.core.graphics.b bVarA = androidx.core.graphics.b.f2007e;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    bVarA = androidx.core.graphics.b.a(bVarA, v(i9, z7));
                }
            }
            return bVarA;
        }

        private androidx.core.graphics.b w() {
            j1 j1Var = this.f2237f;
            return j1Var != null ? j1Var.g() : androidx.core.graphics.b.f2007e;
        }

        private androidx.core.graphics.b x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2229h) {
                z();
            }
            Method method = f2230i;
            if (method != null && f2231j != null && f2232k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2232k.get(f2233l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void z() {
            try {
                f2230i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2231j = cls;
                f2232k = cls.getDeclaredField("mVisibleInsets");
                f2233l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2232k.setAccessible(true);
                f2233l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f2229h = true;
        }

        @Override // androidx.core.view.j1.l
        void d(View view) {
            androidx.core.graphics.b bVarX = x(view);
            if (bVarX == null) {
                bVarX = androidx.core.graphics.b.f2007e;
            }
            r(bVarX);
        }

        @Override // androidx.core.view.j1.l
        void e(j1 j1Var) {
            j1Var.r(this.f2237f);
            j1Var.q(this.f2238g);
        }

        @Override // androidx.core.view.j1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2238g, ((g) obj).f2238g);
            }
            return false;
        }

        @Override // androidx.core.view.j1.l
        public androidx.core.graphics.b g(int i8) {
            return u(i8, false);
        }

        @Override // androidx.core.view.j1.l
        final androidx.core.graphics.b k() {
            if (this.f2236e == null) {
                this.f2236e = androidx.core.graphics.b.b(this.f2234c.getSystemWindowInsetLeft(), this.f2234c.getSystemWindowInsetTop(), this.f2234c.getSystemWindowInsetRight(), this.f2234c.getSystemWindowInsetBottom());
            }
            return this.f2236e;
        }

        @Override // androidx.core.view.j1.l
        j1 m(int i8, int i9, int i10, int i11) {
            b bVar = new b(j1.u(this.f2234c));
            bVar.c(j1.m(k(), i8, i9, i10, i11));
            bVar.b(j1.m(i(), i8, i9, i10, i11));
            return bVar.a();
        }

        @Override // androidx.core.view.j1.l
        boolean o() {
            return this.f2234c.isRound();
        }

        @Override // androidx.core.view.j1.l
        @SuppressLint({"WrongConstant"})
        boolean p(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0 && !y(i9)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.j1.l
        public void q(androidx.core.graphics.b[] bVarArr) {
            this.f2235d = bVarArr;
        }

        @Override // androidx.core.view.j1.l
        void r(androidx.core.graphics.b bVar) {
            this.f2238g = bVar;
        }

        @Override // androidx.core.view.j1.l
        void s(j1 j1Var) {
            this.f2237f = j1Var;
        }

        protected androidx.core.graphics.b v(int i8, boolean z7) {
            androidx.core.graphics.b bVarG;
            int i9;
            if (i8 == 1) {
                return z7 ? androidx.core.graphics.b.b(0, Math.max(w().f2009b, k().f2009b), 0, 0) : androidx.core.graphics.b.b(0, k().f2009b, 0, 0);
            }
            if (i8 == 2) {
                if (z7) {
                    androidx.core.graphics.b bVarW = w();
                    androidx.core.graphics.b bVarI = i();
                    return androidx.core.graphics.b.b(Math.max(bVarW.f2008a, bVarI.f2008a), 0, Math.max(bVarW.f2010c, bVarI.f2010c), Math.max(bVarW.f2011d, bVarI.f2011d));
                }
                androidx.core.graphics.b bVarK = k();
                j1 j1Var = this.f2237f;
                bVarG = j1Var != null ? j1Var.g() : null;
                int iMin = bVarK.f2011d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f2011d);
                }
                return androidx.core.graphics.b.b(bVarK.f2008a, 0, bVarK.f2010c, iMin);
            }
            if (i8 != 8) {
                if (i8 == 16) {
                    return j();
                }
                if (i8 == 32) {
                    return h();
                }
                if (i8 == 64) {
                    return l();
                }
                if (i8 != 128) {
                    return androidx.core.graphics.b.f2007e;
                }
                j1 j1Var2 = this.f2237f;
                androidx.core.view.c cVarE = j1Var2 != null ? j1Var2.e() : f();
                return cVarE != null ? androidx.core.graphics.b.b(cVarE.b(), cVarE.d(), cVarE.c(), cVarE.a()) : androidx.core.graphics.b.f2007e;
            }
            androidx.core.graphics.b[] bVarArr = this.f2235d;
            bVarG = bVarArr != null ? bVarArr[m.b(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            androidx.core.graphics.b bVarK2 = k();
            androidx.core.graphics.b bVarW2 = w();
            int i10 = bVarK2.f2011d;
            if (i10 > bVarW2.f2011d) {
                return androidx.core.graphics.b.b(0, 0, 0, i10);
            }
            androidx.core.graphics.b bVar = this.f2238g;
            return (bVar == null || bVar.equals(androidx.core.graphics.b.f2007e) || (i9 = this.f2238g.f2011d) <= bVarW2.f2011d) ? androidx.core.graphics.b.f2007e : androidx.core.graphics.b.b(0, 0, 0, i9);
        }

        protected boolean y(int i8) {
            if (i8 != 1 && i8 != 2) {
                if (i8 == 4) {
                    return false;
                }
                if (i8 != 8 && i8 != 128) {
                    return true;
                }
            }
            return !v(i8, false).equals(androidx.core.graphics.b.f2007e);
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.b f2239m;

        h(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
            this.f2239m = null;
        }

        h(j1 j1Var, h hVar) {
            super(j1Var, hVar);
            this.f2239m = null;
            this.f2239m = hVar.f2239m;
        }

        @Override // androidx.core.view.j1.l
        j1 b() {
            return j1.u(this.f2234c.consumeStableInsets());
        }

        @Override // androidx.core.view.j1.l
        j1 c() {
            return j1.u(this.f2234c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.j1.l
        final androidx.core.graphics.b i() {
            if (this.f2239m == null) {
                this.f2239m = androidx.core.graphics.b.b(this.f2234c.getStableInsetLeft(), this.f2234c.getStableInsetTop(), this.f2234c.getStableInsetRight(), this.f2234c.getStableInsetBottom());
            }
            return this.f2239m;
        }

        @Override // androidx.core.view.j1.l
        boolean n() {
            return this.f2234c.isConsumed();
        }

        @Override // androidx.core.view.j1.l
        public void t(androidx.core.graphics.b bVar) {
            this.f2239m = bVar;
        }
    }

    private static class i extends h {
        i(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        i(j1 j1Var, i iVar) {
            super(j1Var, iVar);
        }

        @Override // androidx.core.view.j1.l
        j1 a() {
            return j1.u(this.f2234c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.j1.g, androidx.core.view.j1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2234c, iVar.f2234c) && Objects.equals(this.f2238g, iVar.f2238g);
        }

        @Override // androidx.core.view.j1.l
        androidx.core.view.c f() {
            return androidx.core.view.c.e(this.f2234c.getDisplayCutout());
        }

        @Override // androidx.core.view.j1.l
        public int hashCode() {
            return this.f2234c.hashCode();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.b f2240n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.b f2241o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.b f2242p;

        j(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
            this.f2240n = null;
            this.f2241o = null;
            this.f2242p = null;
        }

        j(j1 j1Var, j jVar) {
            super(j1Var, jVar);
            this.f2240n = null;
            this.f2241o = null;
            this.f2242p = null;
        }

        @Override // androidx.core.view.j1.l
        androidx.core.graphics.b h() {
            if (this.f2241o == null) {
                this.f2241o = androidx.core.graphics.b.d(this.f2234c.getMandatorySystemGestureInsets());
            }
            return this.f2241o;
        }

        @Override // androidx.core.view.j1.l
        androidx.core.graphics.b j() {
            if (this.f2240n == null) {
                this.f2240n = androidx.core.graphics.b.d(this.f2234c.getSystemGestureInsets());
            }
            return this.f2240n;
        }

        @Override // androidx.core.view.j1.l
        androidx.core.graphics.b l() {
            if (this.f2242p == null) {
                this.f2242p = androidx.core.graphics.b.d(this.f2234c.getTappableElementInsets());
            }
            return this.f2242p;
        }

        @Override // androidx.core.view.j1.g, androidx.core.view.j1.l
        j1 m(int i8, int i9, int i10, int i11) {
            return j1.u(this.f2234c.inset(i8, i9, i10, i11));
        }

        @Override // androidx.core.view.j1.h, androidx.core.view.j1.l
        public void t(androidx.core.graphics.b bVar) {
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final j1 f2243q = j1.u(WindowInsets.CONSUMED);

        k(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        k(j1 j1Var, k kVar) {
            super(j1Var, kVar);
        }

        @Override // androidx.core.view.j1.g, androidx.core.view.j1.l
        final void d(View view) {
        }

        @Override // androidx.core.view.j1.g, androidx.core.view.j1.l
        public androidx.core.graphics.b g(int i8) {
            return androidx.core.graphics.b.d(this.f2234c.getInsets(n.a(i8)));
        }

        @Override // androidx.core.view.j1.g, androidx.core.view.j1.l
        public boolean p(int i8) {
            return this.f2234c.isVisible(n.a(i8));
        }
    }

    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final j1 f2244b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j1 f2245a;

        l(j1 j1Var) {
            this.f2245a = j1Var;
        }

        j1 a() {
            return this.f2245a;
        }

        j1 b() {
            return this.f2245a;
        }

        j1 c() {
            return this.f2245a;
        }

        void d(View view) {
        }

        void e(j1 j1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.d.a(k(), lVar.k()) && androidx.core.util.d.a(i(), lVar.i()) && androidx.core.util.d.a(f(), lVar.f());
        }

        androidx.core.view.c f() {
            return null;
        }

        androidx.core.graphics.b g(int i8) {
            return androidx.core.graphics.b.f2007e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f2007e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f2007e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        j1 m(int i8, int i9, int i10, int i11) {
            return f2244b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        boolean p(int i8) {
            return true;
        }

        public void q(androidx.core.graphics.b[] bVarArr) {
        }

        void r(androidx.core.graphics.b bVar) {
        }

        void s(j1 j1Var) {
        }

        public void t(androidx.core.graphics.b bVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i8) {
            if (i8 == 1) {
                return 0;
            }
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 4) {
                return 2;
            }
            if (i8 == 8) {
                return 3;
            }
            if (i8 == 16) {
                return 4;
            }
            if (i8 == 32) {
                return 5;
            }
            if (i8 == 64) {
                return 6;
            }
            if (i8 == 128) {
                return 7;
            }
            if (i8 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i8);
        }
    }

    private static final class n {
        static int a(int i8) {
            int iStatusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    if (i10 == 1) {
                        iStatusBars = WindowInsets$Type.statusBars();
                    } else if (i10 == 2) {
                        iStatusBars = WindowInsets$Type.navigationBars();
                    } else if (i10 == 4) {
                        iStatusBars = WindowInsets$Type.captionBar();
                    } else if (i10 == 8) {
                        iStatusBars = WindowInsets$Type.ime();
                    } else if (i10 == 16) {
                        iStatusBars = WindowInsets$Type.systemGestures();
                    } else if (i10 == 32) {
                        iStatusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        iStatusBars = WindowInsets$Type.tappableElement();
                    } else if (i10 == 128) {
                        iStatusBars = WindowInsets$Type.displayCutout();
                    }
                    i9 |= iStatusBars;
                }
            }
            return i9;
        }
    }

    static {
        f2213b = Build.VERSION.SDK_INT >= 30 ? k.f2243q : l.f2244b;
    }

    private j1(WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        this.f2214a = i8 >= 30 ? new k(this, windowInsets) : i8 >= 29 ? new j(this, windowInsets) : i8 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public j1(j1 j1Var) {
        if (j1Var == null) {
            this.f2214a = new l(this);
            return;
        }
        l lVar = j1Var.f2214a;
        int i8 = Build.VERSION.SDK_INT;
        this.f2214a = (i8 < 30 || !(lVar instanceof k)) ? (i8 < 29 || !(lVar instanceof j)) ? (i8 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i8, int i9, int i10, int i11) {
        int iMax = Math.max(0, bVar.f2008a - i8);
        int iMax2 = Math.max(0, bVar.f2009b - i9);
        int iMax3 = Math.max(0, bVar.f2010c - i10);
        int iMax4 = Math.max(0, bVar.f2011d - i11);
        return (iMax == i8 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? bVar : androidx.core.graphics.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static j1 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static j1 v(WindowInsets windowInsets, View view) {
        j1 j1Var = new j1((WindowInsets) androidx.core.util.f.b(windowInsets));
        if (view != null && e0.v(view)) {
            j1Var.r(e0.p(view));
            j1Var.d(view.getRootView());
        }
        return j1Var;
    }

    @Deprecated
    public j1 a() {
        return this.f2214a.a();
    }

    @Deprecated
    public j1 b() {
        return this.f2214a.b();
    }

    @Deprecated
    public j1 c() {
        return this.f2214a.c();
    }

    void d(View view) {
        this.f2214a.d(view);
    }

    public androidx.core.view.c e() {
        return this.f2214a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return androidx.core.util.d.a(this.f2214a, ((j1) obj).f2214a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i8) {
        return this.f2214a.g(i8);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f2214a.i();
    }

    @Deprecated
    public int h() {
        return this.f2214a.k().f2011d;
    }

    public int hashCode() {
        l lVar = this.f2214a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2214a.k().f2008a;
    }

    @Deprecated
    public int j() {
        return this.f2214a.k().f2010c;
    }

    @Deprecated
    public int k() {
        return this.f2214a.k().f2009b;
    }

    public j1 l(int i8, int i9, int i10, int i11) {
        return this.f2214a.m(i8, i9, i10, i11);
    }

    public boolean n(int i8) {
        return this.f2214a.p(i8);
    }

    @Deprecated
    public j1 o(int i8, int i9, int i10, int i11) {
        return new b(this).c(androidx.core.graphics.b.b(i8, i9, i10, i11)).a();
    }

    void p(androidx.core.graphics.b[] bVarArr) {
        this.f2214a.q(bVarArr);
    }

    void q(androidx.core.graphics.b bVar) {
        this.f2214a.r(bVar);
    }

    void r(j1 j1Var) {
        this.f2214a.s(j1Var);
    }

    void s(androidx.core.graphics.b bVar) {
        this.f2214a.t(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f2214a;
        if (lVar instanceof g) {
            return ((g) lVar).f2234c;
        }
        return null;
    }
}
