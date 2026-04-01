package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class kd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg4 f10038a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jd4 f10042e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final de4 f10045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g62 f10046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g94 f10048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private oo4 f10049l = new oo4(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f10040c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10041d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10039b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f10043f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f10044g = new HashSet();

    public kd4(jd4 jd4Var, de4 de4Var, g62 g62Var, pg4 pg4Var) {
        this.f10038a = pg4Var;
        this.f10042e = jd4Var;
        this.f10045h = de4Var;
        this.f10046i = g62Var;
    }

    private final void r(int i8, int i9) {
        while (i8 < this.f10039b.size()) {
            ((id4) this.f10039b.get(i8)).f9163d += i9;
            i8++;
        }
    }

    private final void s(id4 id4Var) {
        hd4 hd4Var = (hd4) this.f10043f.get(id4Var);
        if (hd4Var != null) {
            hd4Var.f8729a.e0(hd4Var.f8730b);
        }
    }

    private final void t() {
        Iterator it = this.f10044g.iterator();
        while (it.hasNext()) {
            id4 id4Var = (id4) it.next();
            if (id4Var.f9162c.isEmpty()) {
                s(id4Var);
                it.remove();
            }
        }
    }

    private final void u(id4 id4Var) {
        if (id4Var.f9164e && id4Var.f9162c.isEmpty()) {
            hd4 hd4Var = (hd4) this.f10043f.remove(id4Var);
            hd4Var.getClass();
            hd4Var.f8729a.b0(hd4Var.f8730b);
            hd4Var.f8729a.c0(hd4Var.f8731c);
            hd4Var.f8729a.g0(hd4Var.f8731c);
            this.f10044g.remove(id4Var);
        }
    }

    private final void v(id4 id4Var) {
        om4 om4Var = id4Var.f9160a;
        um4 um4Var = new um4() { // from class: com.google.android.gms.internal.ads.zc4
            @Override // com.google.android.gms.internal.ads.um4
            public final void a(vm4 vm4Var, s11 s11Var) {
                this.f18158a.f(vm4Var, s11Var);
            }
        };
        gd4 gd4Var = new gd4(this, id4Var);
        this.f10043f.put(id4Var, new hd4(om4Var, um4Var, gd4Var));
        om4Var.a0(new Handler(nz2.I(), null), gd4Var);
        om4Var.f0(new Handler(nz2.I(), null), gd4Var);
        om4Var.X(um4Var, this.f10048k, this.f10038a);
    }

    private final void w(int i8, int i9) {
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            }
            id4 id4Var = (id4) this.f10039b.remove(i9);
            this.f10041d.remove(id4Var.f9161b);
            r(i9, -id4Var.f9160a.u().c());
            id4Var.f9164e = true;
            if (this.f10047j) {
                u(id4Var);
            }
        }
    }

    public final int a() {
        return this.f10039b.size();
    }

    public final s11 b() {
        if (this.f10039b.isEmpty()) {
            return s11.f14453a;
        }
        int iC = 0;
        for (int i8 = 0; i8 < this.f10039b.size(); i8++) {
            id4 id4Var = (id4) this.f10039b.get(i8);
            id4Var.f9163d = iC;
            iC += id4Var.f9160a.u().c();
        }
        return new qd4(this.f10039b, this.f10049l);
    }

    public final s11 c(int i8, int i9, List list) {
        uu1.d(i8 >= 0 && i8 <= i9 && i9 <= a());
        uu1.d(list.size() == i9 - i8);
        for (int i10 = i8; i10 < i9; i10++) {
            ((id4) this.f10039b.get(i10)).f9160a.d0((c50) list.get(i10 - i8));
        }
        return b();
    }

    final /* synthetic */ void f(vm4 vm4Var, s11 s11Var) {
        this.f10042e.o();
    }

    public final void g(g94 g94Var) {
        uu1.f(!this.f10047j);
        this.f10048k = g94Var;
        for (int i8 = 0; i8 < this.f10039b.size(); i8++) {
            id4 id4Var = (id4) this.f10039b.get(i8);
            v(id4Var);
            this.f10044g.add(id4Var);
        }
        this.f10047j = true;
    }

    public final void h() {
        for (hd4 hd4Var : this.f10043f.values()) {
            try {
                hd4Var.f8729a.b0(hd4Var.f8730b);
            } catch (RuntimeException e8) {
                pf2.d("MediaSourceList", "Failed to release child source.", e8);
            }
            hd4Var.f8729a.c0(hd4Var.f8731c);
            hd4Var.f8729a.g0(hd4Var.f8731c);
        }
        this.f10043f.clear();
        this.f10044g.clear();
        this.f10047j = false;
    }

    public final void i(rm4 rm4Var) {
        id4 id4Var = (id4) this.f10040c.remove(rm4Var);
        id4Var.getClass();
        id4Var.f9160a.Y(rm4Var);
        id4Var.f9162c.remove(((lm4) rm4Var).f10779a);
        if (!this.f10040c.isEmpty()) {
            t();
        }
        u(id4Var);
    }

    public final boolean j() {
        return this.f10047j;
    }

    public final s11 k(int i8, List list, oo4 oo4Var) {
        int iC;
        if (!list.isEmpty()) {
            this.f10049l = oo4Var;
            for (int i9 = i8; i9 < list.size() + i8; i9++) {
                id4 id4Var = (id4) list.get(i9 - i8);
                if (i9 > 0) {
                    id4 id4Var2 = (id4) this.f10039b.get(i9 - 1);
                    iC = id4Var2.f9163d + id4Var2.f9160a.u().c();
                } else {
                    iC = 0;
                }
                id4Var.a(iC);
                r(i9, id4Var.f9160a.u().c());
                this.f10039b.add(i9, id4Var);
                this.f10041d.put(id4Var.f9161b, id4Var);
                if (this.f10047j) {
                    v(id4Var);
                    if (this.f10040c.isEmpty()) {
                        this.f10044g.add(id4Var);
                    } else {
                        s(id4Var);
                    }
                }
            }
        }
        return b();
    }

    public final s11 l(int i8, int i9, int i10, oo4 oo4Var) {
        uu1.d(a() >= 0);
        this.f10049l = null;
        return b();
    }

    public final s11 m(int i8, int i9, oo4 oo4Var) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= i9 && i9 <= a()) {
            z7 = true;
        }
        uu1.d(z7);
        this.f10049l = oo4Var;
        w(i8, i9);
        return b();
    }

    public final s11 n(List list, oo4 oo4Var) {
        w(0, this.f10039b.size());
        return k(this.f10039b.size(), list, oo4Var);
    }

    public final s11 o(oo4 oo4Var) {
        int iA = a();
        if (oo4Var.c() != iA) {
            oo4Var = oo4Var.f().g(0, iA);
        }
        this.f10049l = oo4Var;
        return b();
    }

    public final rm4 p(tm4 tm4Var, xq4 xq4Var, long j8) {
        int i8 = qd4.f13415o;
        Object obj = tm4Var.f15161a;
        Object obj2 = ((Pair) obj).first;
        tm4 tm4VarA = tm4Var.a(((Pair) obj).second);
        id4 id4Var = (id4) this.f10041d.get(obj2);
        id4Var.getClass();
        this.f10044g.add(id4Var);
        hd4 hd4Var = (hd4) this.f10043f.get(id4Var);
        if (hd4Var != null) {
            hd4Var.f8729a.h0(hd4Var.f8730b);
        }
        id4Var.f9162c.add(tm4VarA);
        lm4 lm4VarV = id4Var.f9160a.Z(tm4VarA, xq4Var, j8);
        this.f10040c.put(lm4VarV, id4Var);
        t();
        return lm4VarV;
    }

    public final oo4 q() {
        return this.f10049l;
    }
}
