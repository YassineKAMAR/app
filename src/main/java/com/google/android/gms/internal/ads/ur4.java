package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ur4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ff1 f15828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f15829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tr4 f15830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f15831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ls4 f15832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15833g;

    public ur4(Context context, ff1 ff1Var, h hVar) {
        this.f15827a = context;
        this.f15828b = ff1Var;
        this.f15829c = hVar;
    }

    public final j a() {
        tr4 tr4Var = this.f15830d;
        uu1.b(tr4Var);
        return tr4Var;
    }

    public final void b() {
        uu1.b(this.f15830d);
        throw null;
    }

    public final void c(nb nbVar) {
        boolean z7 = false;
        if (!this.f15833g && this.f15830d == null) {
            z7 = true;
        }
        uu1.f(z7);
        uu1.b(this.f15831e);
        tr4 tr4Var = new tr4(this.f15827a, this.f15828b, this.f15829c, nbVar);
        this.f15830d = tr4Var;
        ls4 ls4Var = this.f15832f;
        if (ls4Var != null) {
            tr4Var.c(ls4Var);
        }
    }

    public final void d() {
        if (this.f15833g) {
            return;
        }
        if (this.f15830d != null) {
            throw null;
        }
        this.f15833g = true;
    }

    public final void e(Surface surface, er2 er2Var) {
        tr4 tr4Var = this.f15830d;
        uu1.b(tr4Var);
        tr4Var.a(surface, er2Var);
    }

    public final void f(long j8) {
        uu1.b(this.f15830d);
    }

    public final void g(List list) {
        this.f15831e = list;
        if (i()) {
            tr4 tr4Var = this.f15830d;
            uu1.b(tr4Var);
            tr4Var.b(list);
        }
    }

    public final void h(ls4 ls4Var) {
        this.f15832f = ls4Var;
        if (i()) {
            tr4 tr4Var = this.f15830d;
            uu1.b(tr4Var);
            tr4Var.c(ls4Var);
        }
    }

    public final boolean i() {
        return this.f15830d != null;
    }
}
