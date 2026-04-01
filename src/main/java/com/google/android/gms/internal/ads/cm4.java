package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cm4 extends ul4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f6399h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f6400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g94 f6401j;

    protected cm4() {
    }

    @Override // com.google.android.gms.internal.ads.vm4
    public void W() {
        Iterator it = this.f6399h.values().iterator();
        while (it.hasNext()) {
            ((bm4) it.next()).f5884a.W();
        }
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected final void g() {
        for (bm4 bm4Var : this.f6399h.values()) {
            bm4Var.f5884a.e0(bm4Var.f5885b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected final void h() {
        for (bm4 bm4Var : this.f6399h.values()) {
            bm4Var.f5884a.h0(bm4Var.f5885b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected void i(g94 g94Var) {
        this.f6401j = g94Var;
        this.f6400i = nz2.H(null);
    }

    @Override // com.google.android.gms.internal.ads.ul4
    protected void k() {
        for (bm4 bm4Var : this.f6399h.values()) {
            bm4Var.f5884a.b0(bm4Var.f5885b);
            bm4Var.f5884a.c0(bm4Var.f5886c);
            bm4Var.f5884a.g0(bm4Var.f5886c);
        }
        this.f6399h.clear();
    }

    protected abstract void m(Object obj, vm4 vm4Var, s11 s11Var);

    protected final void n(final Object obj, vm4 vm4Var) {
        uu1.d(!this.f6399h.containsKey(obj));
        um4 um4Var = new um4() { // from class: com.google.android.gms.internal.ads.zl4
            @Override // com.google.android.gms.internal.ads.um4
            public final void a(vm4 vm4Var2, s11 s11Var) {
                this.f18284a.m(obj, vm4Var2, s11Var);
            }
        };
        am4 am4Var = new am4(this, obj);
        this.f6399h.put(obj, new bm4(vm4Var, um4Var, am4Var));
        Handler handler = this.f6400i;
        handler.getClass();
        vm4Var.a0(handler, am4Var);
        Handler handler2 = this.f6400i;
        handler2.getClass();
        vm4Var.f0(handler2, am4Var);
        vm4Var.X(um4Var, this.f6401j, b());
        if (l()) {
            return;
        }
        vm4Var.e0(um4Var);
    }

    protected int o(Object obj, int i8) {
        return 0;
    }

    protected long p(Object obj, long j8) {
        return j8;
    }

    protected abstract tm4 q(Object obj, tm4 tm4Var);
}
