package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ca1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f6242a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f6243b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f6244c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f6245d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f6246e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f6247f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f6248g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f6249h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f6250i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f6251j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f6252k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f6253l = new HashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f6254m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f6255n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ip2 f6256o;

    public final ca1 d(h2.a aVar, Executor executor) {
        this.f6244c.add(new yb1(aVar, executor));
        return this;
    }

    public final ca1 e(j41 j41Var, Executor executor) {
        this.f6250i.add(new yb1(j41Var, executor));
        return this;
    }

    public final ca1 f(x41 x41Var, Executor executor) {
        this.f6253l.add(new yb1(x41Var, executor));
        return this;
    }

    public final ca1 g(b51 b51Var, Executor executor) {
        this.f6247f.add(new yb1(b51Var, executor));
        return this;
    }

    public final ca1 h(g41 g41Var, Executor executor) {
        this.f6246e.add(new yb1(g41Var, executor));
        return this;
    }

    public final ca1 i(v51 v51Var, Executor executor) {
        this.f6249h.add(new yb1(v51Var, executor));
        return this;
    }

    public final ca1 j(h61 h61Var, Executor executor) {
        this.f6248g.add(new yb1(h61Var, executor));
        return this;
    }

    public final ca1 k(i2.u uVar, Executor executor) {
        this.f6255n.add(new yb1(uVar, executor));
        return this;
    }

    public final ca1 l(t61 t61Var, Executor executor) {
        this.f6254m.add(new yb1(t61Var, executor));
        return this;
    }

    public final ca1 m(f71 f71Var, Executor executor) {
        this.f6243b.add(new yb1(f71Var, executor));
        return this;
    }

    public final ca1 n(a2.e eVar, Executor executor) {
        this.f6252k.add(new yb1(eVar, executor));
        return this;
    }

    public final ca1 o(hc1 hc1Var, Executor executor) {
        this.f6245d.add(new yb1(hc1Var, executor));
        return this;
    }

    public final ca1 p(ip2 ip2Var) {
        this.f6256o = ip2Var;
        return this;
    }

    public final ea1 q() {
        return new ea1(this, null);
    }
}
