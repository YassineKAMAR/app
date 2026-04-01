package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class fg4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final py0 f7754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jb3 f7755b = jb3.z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mb3 f7756c = mb3.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tm4 f7757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private tm4 f7758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private tm4 f7759f;

    public fg4(py0 py0Var) {
        this.f7754a = py0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static tm4 j(lu0 lu0Var, jb3 jb3Var, tm4 tm4Var, py0 py0Var) {
        s11 s11VarV = lu0Var.v();
        int iM = lu0Var.m();
        Object objF = s11VarV.o() ? null : s11VarV.f(iM);
        int iC = (lu0Var.D() || s11VarV.o()) ? -1 : s11VarV.d(iM, py0Var, false).c(nz2.C(lu0Var.s()));
        for (int i8 = 0; i8 < jb3Var.size(); i8++) {
            tm4 tm4Var2 = (tm4) jb3Var.get(i8);
            if (m(tm4Var2, objF, lu0Var.D(), lu0Var.k(), lu0Var.l(), iC)) {
                return tm4Var2;
            }
        }
        if (jb3Var.isEmpty() && tm4Var != null) {
            if (m(tm4Var, objF, lu0Var.D(), lu0Var.k(), lu0Var.l(), iC)) {
                return tm4Var;
            }
        }
        return null;
    }

    private final void k(lb3 lb3Var, tm4 tm4Var, s11 s11Var) {
        if (tm4Var == null) {
            return;
        }
        if (s11Var.a(tm4Var.f15161a) != -1) {
            lb3Var.a(tm4Var, s11Var);
            return;
        }
        s11 s11Var2 = (s11) this.f7756c.get(tm4Var);
        if (s11Var2 != null) {
            lb3Var.a(tm4Var, s11Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(com.google.android.gms.internal.ads.s11 r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.lb3 r0 = new com.google.android.gms.internal.ads.lb3
            r0.<init>()
            com.google.android.gms.internal.ads.jb3 r1 = r3.f7755b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7758e
            r3.k(r0, r1, r4)
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7759f
            com.google.android.gms.internal.ads.tm4 r2 = r3.f7758e
            boolean r1 = com.google.android.gms.internal.ads.g83.a(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7759f
            r3.k(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7757d
            com.google.android.gms.internal.ads.tm4 r2 = r3.f7758e
            boolean r1 = com.google.android.gms.internal.ads.g83.a(r1, r2)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7757d
            com.google.android.gms.internal.ads.tm4 r2 = r3.f7759f
            boolean r1 = com.google.android.gms.internal.ads.g83.a(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.google.android.gms.internal.ads.jb3 r2 = r3.f7755b
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.google.android.gms.internal.ads.jb3 r2 = r3.f7755b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.tm4 r2 = (com.google.android.gms.internal.ads.tm4) r2
            r3.k(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.google.android.gms.internal.ads.jb3 r1 = r3.f7755b
            com.google.android.gms.internal.ads.tm4 r2 = r3.f7757d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.google.android.gms.internal.ads.tm4 r1 = r3.f7757d
            r3.k(r0, r1, r4)
        L5c:
            com.google.android.gms.internal.ads.mb3 r4 = r0.c()
            r3.f7756c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fg4.l(com.google.android.gms.internal.ads.s11):void");
    }

    private static boolean m(tm4 tm4Var, Object obj, boolean z7, int i8, int i9, int i10) {
        if (!tm4Var.f15161a.equals(obj)) {
            return false;
        }
        if (z7) {
            if (tm4Var.f15162b != i8 || tm4Var.f15163c != i9) {
                return false;
            }
        } else if (tm4Var.f15162b != -1 || tm4Var.f15165e != i10) {
            return false;
        }
        return true;
    }

    public final s11 a(tm4 tm4Var) {
        return (s11) this.f7756c.get(tm4Var);
    }

    public final tm4 b() {
        return this.f7757d;
    }

    public final tm4 c() {
        Object next;
        Object obj;
        if (this.f7755b.isEmpty()) {
            return null;
        }
        jb3 jb3Var = this.f7755b;
        if (!(jb3Var instanceof List)) {
            Iterator<E> it = jb3Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (jb3Var.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = jb3Var.get(jb3Var.size() - 1);
        }
        return (tm4) obj;
    }

    public final tm4 d() {
        return this.f7758e;
    }

    public final tm4 e() {
        return this.f7759f;
    }

    public final void g(lu0 lu0Var) {
        this.f7757d = j(lu0Var, this.f7755b, this.f7758e, this.f7754a);
    }

    public final void h(List list, tm4 tm4Var, lu0 lu0Var) {
        this.f7755b = jb3.x(list);
        if (!list.isEmpty()) {
            this.f7758e = (tm4) list.get(0);
            tm4Var.getClass();
            this.f7759f = tm4Var;
        }
        if (this.f7757d == null) {
            this.f7757d = j(lu0Var, this.f7755b, this.f7758e, this.f7754a);
        }
        l(lu0Var.v());
    }

    public final void i(lu0 lu0Var) {
        this.f7757d = j(lu0Var, this.f7755b, this.f7758e, this.f7754a);
        l(lu0Var.v());
    }
}
