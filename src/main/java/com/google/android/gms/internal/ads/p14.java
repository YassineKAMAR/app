package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class p14 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m04 f12702c = m04.f11116c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile k24 f12703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile rz3 f12704b;

    public final int a() {
        if (this.f12704b != null) {
            return ((nz3) this.f12704b).f12315e.length;
        }
        if (this.f12703a != null) {
            return this.f12703a.i();
        }
        return 0;
    }

    public final rz3 b() {
        if (this.f12704b != null) {
            return this.f12704b;
        }
        synchronized (this) {
            if (this.f12704b != null) {
                return this.f12704b;
            }
            this.f12704b = this.f12703a == null ? rz3.f14393b : this.f12703a.c();
            return this.f12704b;
        }
    }

    protected final void c(k24 k24Var) {
        if (this.f12703a != null) {
            return;
        }
        synchronized (this) {
            if (this.f12703a == null) {
                try {
                    this.f12703a = k24Var;
                    this.f12704b = rz3.f14393b;
                } catch (m14 unused) {
                    this.f12703a = k24Var;
                    this.f12704b = rz3.f14393b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14)) {
            return false;
        }
        p14 p14Var = (p14) obj;
        k24 k24Var = this.f12703a;
        k24 k24Var2 = p14Var.f12703a;
        if (k24Var == null && k24Var2 == null) {
            return b().equals(p14Var.b());
        }
        if (k24Var != null && k24Var2 != null) {
            return k24Var.equals(k24Var2);
        }
        if (k24Var != null) {
            p14Var.c(k24Var.h());
            return k24Var.equals(p14Var.f12703a);
        }
        c(k24Var2.h());
        return this.f12703a.equals(k24Var2);
    }

    public int hashCode() {
        return 1;
    }
}
