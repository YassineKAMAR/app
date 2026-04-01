package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public class w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1 f19724c = a1.f19469c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile r2 f19725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile n0 f19726b;

    public final int a() {
        if (this.f19726b != null) {
            return ((k0) this.f19726b).f19606e.length;
        }
        if (this.f19725a != null) {
            return this.f19725a.m();
        }
        return 0;
    }

    public final n0 b() {
        if (this.f19726b != null) {
            return this.f19726b;
        }
        synchronized (this) {
            if (this.f19726b != null) {
                return this.f19726b;
            }
            this.f19726b = this.f19725a == null ? n0.f19633b : this.f19725a.k();
            return this.f19726b;
        }
    }

    protected final void c(r2 r2Var) {
        if (this.f19725a != null) {
            return;
        }
        synchronized (this) {
            if (this.f19725a != null) {
                return;
            }
            try {
                this.f19725a = r2Var;
                this.f19726b = n0.f19633b;
            } catch (u1 unused) {
                this.f19725a = r2Var;
                this.f19726b = n0.f19633b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        r2 r2Var = this.f19725a;
        r2 r2Var2 = w1Var.f19725a;
        if (r2Var == null && r2Var2 == null) {
            return b().equals(w1Var.b());
        }
        if (r2Var != null && r2Var2 != null) {
            return r2Var.equals(r2Var2);
        }
        if (r2Var != null) {
            w1Var.c(r2Var.n());
            return r2Var.equals(w1Var.f19725a);
        }
        c(r2Var2.n());
        return this.f19725a.equals(r2Var2);
    }

    public int hashCode() {
        return 1;
    }
}
