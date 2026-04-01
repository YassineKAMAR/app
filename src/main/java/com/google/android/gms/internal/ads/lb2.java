package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class lb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g4 f10571b = new g4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10573d;

    public lb2(Object obj) {
        this.f10570a = obj;
    }

    public final void a(int i8, j92 j92Var) {
        if (this.f10573d) {
            return;
        }
        if (i8 != -1) {
            this.f10571b.a(i8);
        }
        this.f10572c = true;
        j92Var.a(this.f10570a);
    }

    public final void b(ka2 ka2Var) {
        if (this.f10573d || !this.f10572c) {
            return;
        }
        i6 i6VarB = this.f10571b.b();
        this.f10571b = new g4();
        this.f10572c = false;
        ka2Var.a(this.f10570a, i6VarB);
    }

    public final void c(ka2 ka2Var) {
        this.f10573d = true;
        if (this.f10572c) {
            this.f10572c = false;
            ka2Var.a(this.f10570a, this.f10571b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lb2.class != obj.getClass()) {
            return false;
        }
        return this.f10570a.equals(((lb2) obj).f10570a);
    }

    public final int hashCode() {
        return this.f10570a.hashCode();
    }
}
