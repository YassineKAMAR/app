package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class tr4 implements j, gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f15263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hh1 f15264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rh2 f15265d = new rh2(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jw2 f15266e = new jw2(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jw2 f15267f = new jw2(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f15268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f15269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f3 f15270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f15271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Executor f15272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ls4 f15273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private nb f15274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Pair f15275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final jj1 f15276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final jj1 f15277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f15278q;

    public tr4(Context context, ff1 ff1Var, h hVar, nb nbVar) {
        sk4 sk4VarD;
        int i8;
        int i9;
        this.f15262a = context;
        this.f15263b = hVar;
        nz2.g(context);
        jj1 jj1Var = jj1.f9649e;
        this.f15276o = jj1Var;
        this.f15277p = jj1Var;
        f3 f3VarA = null;
        final Handler handlerH = nz2.H(null);
        this.f15268g = handlerH;
        sk4 sk4Var = nbVar.f11805x;
        if (sk4Var == null || ((i9 = sk4Var.f14753c) != 7 && i9 != 6)) {
            sk4Var = sk4.f14744f;
        }
        sk4 sk4Var2 = sk4Var;
        if (sk4Var2.f14753c == 7) {
            oj4 oj4VarC = sk4Var2.c();
            oj4VarC.c(6);
            sk4VarD = oj4VarC.d();
        } else {
            sk4VarD = sk4Var2;
        }
        this.f15264c = ff1Var.a(context, wn4.f16837a, sk4Var2, sk4VarD, false, new Executor() { // from class: com.google.android.gms.internal.ads.rr4
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handlerH.post(runnable);
            }
        }, this);
        Pair pair = this.f15275n;
        if (pair != null) {
            throw null;
        }
        this.f15269h = new ArrayList();
        if (nz2.f12300a < 21 && (i8 = nbVar.f11801t) != 0) {
            f3VarA = sr4.a(i8);
        }
        this.f15270i = f3VarA;
    }

    private final void d() {
        if (this.f15274m == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        f3 f3Var = this.f15270i;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        arrayList.addAll(this.f15269h);
        nb nbVar = this.f15274m;
        throw null;
    }

    public final void a(Surface surface, er2 er2Var) {
        Pair pair = this.f15275n;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((er2) this.f15275n.second).equals(er2Var)) {
            return;
        }
        Pair pair2 = this.f15275n;
        boolean z7 = true;
        if (pair2 != null && !((Surface) pair2.first).equals(surface)) {
            z7 = false;
        }
        this.f15278q = z7;
        this.f15275n = Pair.create(surface, er2Var);
        throw null;
    }

    public final void b(List list) {
        this.f15269h.clear();
        this.f15269h.addAll(list);
        d();
    }

    public final void c(ls4 ls4Var) {
        this.f15273l = ls4Var;
    }

    @Override // com.google.android.gms.internal.ads.j
    public final boolean n() {
        return nz2.g(this.f15262a);
    }

    @Override // com.google.android.gms.internal.ads.j
    public final boolean q() {
        return this.f15278q;
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void r(g gVar, Executor executor) {
        if (nz2.e(this.f15271j, gVar)) {
            uu1.f(nz2.e(this.f15272k, executor));
        } else {
            this.f15271j = gVar;
            this.f15272k = executor;
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void s(int i8, nb nbVar) {
        this.f15274m = nbVar;
        d();
    }
}
