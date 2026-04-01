package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class jm1 extends nz0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f9707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f9708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ke1 f9709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ob1 f9710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t41 f9711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c61 f9712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i01 f9713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final fc0 f9714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s23 f9715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ms2 f9716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9717s;

    jm1(mz0 mz0Var, Context context, fm0 fm0Var, ke1 ke1Var, ob1 ob1Var, t41 t41Var, c61 c61Var, i01 i01Var, wr2 wr2Var, s23 s23Var, ms2 ms2Var) {
        super(mz0Var);
        this.f9717s = false;
        this.f9707i = context;
        this.f9709k = ke1Var;
        this.f9708j = new WeakReference(fm0Var);
        this.f9710l = ob1Var;
        this.f9711m = t41Var;
        this.f9712n = c61Var;
        this.f9713o = i01Var;
        this.f9715q = s23Var;
        bc0 bc0Var = wr2Var.f16891n;
        this.f9714p = new zc0(bc0Var != null ? bc0Var.f5708a : "", bc0Var != null ? bc0Var.f5709b : 1);
        this.f9716r = ms2Var;
    }

    public final void finalize() throws Throwable {
        try {
            final fm0 fm0Var = (fm0) this.f9708j.get();
            if (((Boolean) h2.y.c().b(ns.H6)).booleanValue()) {
                if (!this.f9717s && fm0Var != null) {
                    eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.im1
                        @Override // java.lang.Runnable
                        public final void run() {
                            fm0Var.destroy();
                        }
                    });
                }
            } else if (fm0Var != null) {
                fm0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle h() {
        return this.f9712n.A0();
    }

    public final fc0 i() {
        return this.f9714p;
    }

    public final ms2 j() {
        return this.f9716r;
    }

    public final boolean k() {
        return this.f9713o.a();
    }

    public final boolean l() {
        return this.f9717s;
    }

    public final boolean m() {
        fm0 fm0Var = (fm0) this.f9708j.get();
        return (fm0Var == null || fm0Var.c1()) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean n(boolean z7, Activity activity) {
        if (((Boolean) h2.y.c().b(ns.A0)).booleanValue()) {
            g2.t.r();
            if (j2.k2.f(this.f9707i)) {
                qg0.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f9711m.k();
                if (((Boolean) h2.y.c().b(ns.B0)).booleanValue()) {
                    this.f9715q.a(this.f12291a.f10323b.f9793b.f5462b);
                }
                return false;
            }
        }
        if (this.f9717s) {
            qg0.g("The rewarded ad have been showed.");
            this.f9711m.w(vt2.d(10, null, null));
            return false;
        }
        this.f9717s = true;
        this.f9710l.k();
        Context context = activity;
        if (activity == null) {
            context = this.f9707i;
        }
        try {
            this.f9709k.a(z7, context, this.f9711m);
            this.f9710l.j();
            return true;
        } catch (je1 e8) {
            this.f9711m.K(e8);
            return false;
        }
    }
}
