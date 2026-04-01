package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h2.r4 f14300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2.w4 f14301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h2.k4 f14303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f14305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f14306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private lv f14307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h2.c5 f14308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c2.a f14309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c2.g f14310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h2.a1 f14311l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r10 f14313n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private va2 f14316q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h2.e1 f14318s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14312m = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ds2 f14314o = new ds2();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14315p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14317r = false;

    public final ds2 F() {
        return this.f14314o;
    }

    public final rs2 G(ts2 ts2Var) {
        this.f14314o.a(ts2Var.f15313o.f8488a);
        this.f14300a = ts2Var.f15302d;
        this.f14301b = ts2Var.f15303e;
        this.f14318s = ts2Var.f15316r;
        this.f14302c = ts2Var.f15304f;
        this.f14303d = ts2Var.f15299a;
        this.f14305f = ts2Var.f15305g;
        this.f14306g = ts2Var.f15306h;
        this.f14307h = ts2Var.f15307i;
        this.f14308i = ts2Var.f15308j;
        H(ts2Var.f15310l);
        d(ts2Var.f15311m);
        this.f14315p = ts2Var.f15314p;
        this.f14316q = ts2Var.f15301c;
        this.f14317r = ts2Var.f15315q;
        return this;
    }

    public final rs2 H(c2.a aVar) {
        this.f14309j = aVar;
        if (aVar != null) {
            this.f14304e = aVar.g();
        }
        return this;
    }

    public final rs2 I(h2.w4 w4Var) {
        this.f14301b = w4Var;
        return this;
    }

    public final rs2 J(String str) {
        this.f14302c = str;
        return this;
    }

    public final rs2 K(h2.c5 c5Var) {
        this.f14308i = c5Var;
        return this;
    }

    public final rs2 L(va2 va2Var) {
        this.f14316q = va2Var;
        return this;
    }

    public final rs2 M(r10 r10Var) {
        this.f14313n = r10Var;
        this.f14303d = new h2.k4(false, true, false);
        return this;
    }

    public final rs2 N(boolean z7) {
        this.f14315p = z7;
        return this;
    }

    public final rs2 O(boolean z7) {
        this.f14317r = true;
        return this;
    }

    public final rs2 P(boolean z7) {
        this.f14304e = z7;
        return this;
    }

    public final rs2 Q(int i8) {
        this.f14312m = i8;
        return this;
    }

    public final rs2 a(lv lvVar) {
        this.f14307h = lvVar;
        return this;
    }

    public final rs2 b(ArrayList arrayList) {
        this.f14305f = arrayList;
        return this;
    }

    public final rs2 c(ArrayList arrayList) {
        this.f14306g = arrayList;
        return this;
    }

    public final rs2 d(c2.g gVar) {
        this.f14310k = gVar;
        if (gVar != null) {
            this.f14304e = gVar.l();
            this.f14311l = gVar.g();
        }
        return this;
    }

    public final rs2 e(h2.r4 r4Var) {
        this.f14300a = r4Var;
        return this;
    }

    public final rs2 f(h2.k4 k4Var) {
        this.f14303d = k4Var;
        return this;
    }

    public final ts2 g() {
        a3.o.k(this.f14302c, "ad unit must not be null");
        a3.o.k(this.f14301b, "ad size must not be null");
        a3.o.k(this.f14300a, "ad request must not be null");
        return new ts2(this, null);
    }

    public final String i() {
        return this.f14302c;
    }

    public final boolean o() {
        return this.f14315p;
    }

    public final rs2 q(h2.e1 e1Var) {
        this.f14318s = e1Var;
        return this;
    }

    public final h2.r4 v() {
        return this.f14300a;
    }

    public final h2.w4 x() {
        return this.f14301b;
    }
}
