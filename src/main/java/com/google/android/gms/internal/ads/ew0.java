package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements tk, c51, i2.u, b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zv0 f7516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aw0 f7517b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o40 f7519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f7520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e3.e f7521f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7518c = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7522g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dw0 f7523h = new dw0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7524i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f7525j = new WeakReference(this);

    public ew0(l40 l40Var, aw0 aw0Var, Executor executor, zv0 zv0Var, e3.e eVar) {
        this.f7516a = zv0Var;
        v30 v30Var = y30.f17575b;
        this.f7519d = l40Var.a("google.afma.activeView.handleUpdate", v30Var, v30Var);
        this.f7517b = aw0Var;
        this.f7520e = executor;
        this.f7521f = eVar;
    }

    private final void k() {
        Iterator it = this.f7518c.iterator();
        while (it.hasNext()) {
            this.f7516a.f((fm0) it.next());
        }
        this.f7516a.e();
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final synchronized void D(Context context) {
        this.f7523h.f7028b = true;
        a();
    }

    @Override // i2.u
    public final void G5() {
    }

    public final synchronized void a() {
        if (this.f7525j.get() == null) {
            j();
            return;
        }
        if (this.f7524i || !this.f7522g.get()) {
            return;
        }
        try {
            this.f7523h.f7030d = this.f7521f.b();
            final JSONObject jSONObjectA = this.f7517b.b(this.f7523h);
            for (final fm0 fm0Var : this.f7518c) {
                this.f7520e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fm0Var.x0("AFMA_updateActiveView", jSONObjectA);
                    }
                });
            }
            hh0.b(this.f7519d.b(jSONObjectA), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e8) {
            j2.v1.l("Failed to call ActiveViewJS", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final synchronized void b(Context context) {
        this.f7523h.f7028b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void b0(sk skVar) {
        dw0 dw0Var = this.f7523h;
        dw0Var.f7027a = skVar.f14729j;
        dw0Var.f7032f = skVar;
        a();
    }

    public final synchronized void e(fm0 fm0Var) {
        this.f7518c.add(fm0Var);
        this.f7516a.d(fm0Var);
    }

    public final void h(Object obj) {
        this.f7525j = new WeakReference(obj);
    }

    @Override // i2.u
    public final synchronized void h5() {
        this.f7523h.f7028b = false;
        a();
    }

    public final synchronized void j() {
        k();
        this.f7524i = true;
    }

    @Override // i2.u
    public final void k0() {
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final synchronized void q(Context context) {
        this.f7523h.f7031e = "u";
        a();
        k();
        this.f7524i = true;
    }

    @Override // i2.u
    public final synchronized void q3() {
        this.f7523h.f7028b = true;
        a();
    }

    @Override // i2.u
    public final void v0(int i8) {
    }

    @Override // i2.u
    public final void y4() {
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final synchronized void z() {
        if (this.f7522g.compareAndSet(false, true)) {
            this.f7516a.c(this);
            a();
        }
    }
}
