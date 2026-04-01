package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj0 f14136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f14137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qi0 f14138d;

    public ri0(Context context, ViewGroup viewGroup, fm0 fm0Var) {
        this.f14135a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14137c = viewGroup;
        this.f14136b = fm0Var;
        this.f14138d = null;
    }

    public final qi0 a() {
        return this.f14138d;
    }

    public final Integer b() {
        qi0 qi0Var = this.f14138d;
        if (qi0Var != null) {
            return qi0Var.v();
        }
        return null;
    }

    public final void c(int i8, int i9, int i10, int i11) {
        a3.o.e("The underlay may only be modified from the UI thread.");
        qi0 qi0Var = this.f14138d;
        if (qi0Var != null) {
            qi0Var.g(i8, i9, i10, i11);
        }
    }

    public final void d(int i8, int i9, int i10, int i11, int i12, boolean z7, cj0 cj0Var) {
        if (this.f14138d != null) {
            return;
        }
        xs.a(this.f14136b.x().a(), this.f14136b.s(), "vpr2");
        Context context = this.f14135a;
        dj0 dj0Var = this.f14136b;
        qi0 qi0Var = new qi0(context, dj0Var, i12, z7, dj0Var.x().a(), cj0Var);
        this.f14138d = qi0Var;
        this.f14137c.addView(qi0Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f14138d.g(i8, i9, i10, i11);
        this.f14136b.h(false);
    }

    public final void e() {
        a3.o.e("onDestroy must be called from the UI thread.");
        qi0 qi0Var = this.f14138d;
        if (qi0Var != null) {
            qi0Var.y();
            this.f14137c.removeView(this.f14138d);
            this.f14138d = null;
        }
    }

    public final void f() {
        a3.o.e("onPause must be called from the UI thread.");
        qi0 qi0Var = this.f14138d;
        if (qi0Var != null) {
            qi0Var.E();
        }
    }

    public final void g(int i8) {
        qi0 qi0Var = this.f14138d;
        if (qi0Var != null) {
            qi0Var.d(i8);
        }
    }
}
