package j;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.h1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f23867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g1 f23868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23869e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23866b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f23870f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<f1> f23865a = new ArrayList<>();

    class a extends h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23871a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23872b = 0;

        a() {
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            int i8 = this.f23872b + 1;
            this.f23872b = i8;
            if (i8 == h.this.f23865a.size()) {
                g1 g1Var = h.this.f23868d;
                if (g1Var != null) {
                    g1Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.h1, androidx.core.view.g1
        public void c(View view) {
            if (this.f23871a) {
                return;
            }
            this.f23871a = true;
            g1 g1Var = h.this.f23868d;
            if (g1Var != null) {
                g1Var.c(null);
            }
        }

        void d() {
            this.f23872b = 0;
            this.f23871a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f23869e) {
            Iterator<f1> it = this.f23865a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f23869e = false;
        }
    }

    void b() {
        this.f23869e = false;
    }

    public h c(f1 f1Var) {
        if (!this.f23869e) {
            this.f23865a.add(f1Var);
        }
        return this;
    }

    public h d(f1 f1Var, f1 f1Var2) {
        this.f23865a.add(f1Var);
        f1Var2.j(f1Var.d());
        this.f23865a.add(f1Var2);
        return this;
    }

    public h e(long j8) {
        if (!this.f23869e) {
            this.f23866b = j8;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f23869e) {
            this.f23867c = interpolator;
        }
        return this;
    }

    public h g(g1 g1Var) {
        if (!this.f23869e) {
            this.f23868d = g1Var;
        }
        return this;
    }

    public void h() {
        if (this.f23869e) {
            return;
        }
        for (f1 f1Var : this.f23865a) {
            long j8 = this.f23866b;
            if (j8 >= 0) {
                f1Var.f(j8);
            }
            Interpolator interpolator = this.f23867c;
            if (interpolator != null) {
                f1Var.g(interpolator);
            }
            if (this.f23868d != null) {
                f1Var.h(this.f23870f);
            }
            f1Var.l();
        }
        this.f23869e = true;
    }
}
