package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
final class gu2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8511c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f8509a = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gv2 f8512d = new gv2();

    public gu2(int i8, int i9) {
        this.f8510b = i8;
        this.f8511c = i9;
    }

    private final void i() {
        while (!this.f8509a.isEmpty()) {
            if (g2.t.b().a() - ((ru2) this.f8509a.getFirst()).f14348d < this.f8511c) {
                return;
            }
            this.f8512d.g();
            this.f8509a.remove();
        }
    }

    public final int a() {
        return this.f8512d.a();
    }

    public final int b() {
        i();
        return this.f8509a.size();
    }

    public final long c() {
        return this.f8512d.b();
    }

    public final long d() {
        return this.f8512d.c();
    }

    public final ru2 e() {
        this.f8512d.f();
        i();
        if (this.f8509a.isEmpty()) {
            return null;
        }
        ru2 ru2Var = (ru2) this.f8509a.remove();
        if (ru2Var != null) {
            this.f8512d.h();
        }
        return ru2Var;
    }

    public final fv2 f() {
        return this.f8512d.d();
    }

    public final String g() {
        return this.f8512d.e();
    }

    public final boolean h(ru2 ru2Var) {
        this.f8512d.f();
        i();
        if (this.f8509a.size() == this.f8510b) {
            return false;
        }
        this.f8509a.add(ru2Var);
        return true;
    }
}
