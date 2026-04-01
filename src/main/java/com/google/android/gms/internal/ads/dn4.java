package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm4 f6829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f6830c;

    public dn4() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private dn4(CopyOnWriteArrayList copyOnWriteArrayList, int i8, tm4 tm4Var) {
        this.f6830c = copyOnWriteArrayList;
        this.f6828a = 0;
        this.f6829b = tm4Var;
    }

    public final dn4 a(int i8, tm4 tm4Var) {
        return new dn4(this.f6830c, 0, tm4Var);
    }

    public final void b(Handler handler, en4 en4Var) {
        this.f6830c.add(new cn4(handler, en4Var));
    }

    public final void c(final pm4 pm4Var) {
        for (cn4 cn4Var : this.f6830c) {
            final en4 en4Var = cn4Var.f6407b;
            nz2.i(cn4Var.f6406a, new Runnable() { // from class: com.google.android.gms.internal.ads.wm4
                @Override // java.lang.Runnable
                public final void run() {
                    en4Var.D(0, this.f16821a.f6829b, pm4Var);
                }
            });
        }
    }

    public final void d(final km4 km4Var, final pm4 pm4Var) {
        for (cn4 cn4Var : this.f6830c) {
            final en4 en4Var = cn4Var.f6407b;
            nz2.i(cn4Var.f6406a, new Runnable() { // from class: com.google.android.gms.internal.ads.bn4
                @Override // java.lang.Runnable
                public final void run() {
                    en4Var.C(0, this.f5905a.f6829b, km4Var, pm4Var);
                }
            });
        }
    }

    public final void e(final km4 km4Var, final pm4 pm4Var) {
        for (cn4 cn4Var : this.f6830c) {
            final en4 en4Var = cn4Var.f6407b;
            nz2.i(cn4Var.f6406a, new Runnable() { // from class: com.google.android.gms.internal.ads.zm4
                @Override // java.lang.Runnable
                public final void run() {
                    en4Var.p(0, this.f18291a.f6829b, km4Var, pm4Var);
                }
            });
        }
    }

    public final void f(final km4 km4Var, final pm4 pm4Var, final IOException iOException, final boolean z7) {
        for (cn4 cn4Var : this.f6830c) {
            final en4 en4Var = cn4Var.f6407b;
            nz2.i(cn4Var.f6406a, new Runnable() { // from class: com.google.android.gms.internal.ads.an4
                @Override // java.lang.Runnable
                public final void run() {
                    en4Var.F(0, this.f5352a.f6829b, km4Var, pm4Var, iOException, z7);
                }
            });
        }
    }

    public final void g(final km4 km4Var, final pm4 pm4Var) {
        for (cn4 cn4Var : this.f6830c) {
            final en4 en4Var = cn4Var.f6407b;
            nz2.i(cn4Var.f6406a, new Runnable() { // from class: com.google.android.gms.internal.ads.ym4
                @Override // java.lang.Runnable
                public final void run() {
                    en4Var.h(0, this.f17857a.f6829b, km4Var, pm4Var);
                }
            });
        }
    }

    public final void h(en4 en4Var) {
        for (cn4 cn4Var : this.f6830c) {
            if (cn4Var.f6407b == en4Var) {
                this.f6830c.remove(cn4Var);
            }
        }
    }
}
