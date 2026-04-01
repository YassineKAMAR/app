package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f2247a;

    private static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f2248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f2249b;

        a(Window window, View view) {
            this.f2248a = window;
            this.f2249b = view;
        }

        protected void c(int i8) {
            View decorView = this.f2248a.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void d(int i8) {
            this.f2248a.addFlags(i8);
        }

        protected void e(int i8) {
            View decorView = this.f2248a.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        protected void f(int i8) {
            this.f2248a.clearFlags(i8);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.s1.e
        public void b(boolean z7) {
            if (!z7) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.s1.e
        public void a(boolean z7) {
            if (!z7) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s1 f2250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f2251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p.h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected Window f2253d;

        d(Window window, s1 s1Var) {
            this(window.getInsetsController(), s1Var);
            this.f2253d = window;
        }

        d(WindowInsetsController windowInsetsController, s1 s1Var) {
            this.f2252c = new p.h<>();
            this.f2251b = windowInsetsController;
            this.f2250a = s1Var;
        }

        @Override // androidx.core.view.s1.e
        public void a(boolean z7) {
            if (z7) {
                if (this.f2253d != null) {
                    c(16);
                }
                this.f2251b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f2253d != null) {
                    d(16);
                }
                this.f2251b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.s1.e
        public void b(boolean z7) {
            if (z7) {
                if (this.f2253d != null) {
                    c(8192);
                }
                this.f2251b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f2253d != null) {
                    d(8192);
                }
                this.f2251b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i8) {
            View decorView = this.f2253d.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void d(int i8) {
            View decorView = this.f2253d.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z7) {
        }

        public void b(boolean z7) {
        }
    }

    public s1(Window window, View view) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f2247a = new d(window, this);
        } else {
            this.f2247a = i8 >= 26 ? new c(window, view) : i8 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(boolean z7) {
        this.f2247a.a(z7);
    }

    public void b(boolean z7) {
        this.f2247a.b(z7);
    }
}
