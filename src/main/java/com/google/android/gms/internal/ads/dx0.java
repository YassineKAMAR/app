package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dx0 extends nz0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fm0 f7035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f7036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f7037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final sw0 f7038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ke1 f7039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ob1 f7040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t41 f7041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f7042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dg0 f7043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7044r;

    dx0(mz0 mz0Var, Context context, fm0 fm0Var, int i8, sw0 sw0Var, ke1 ke1Var, ob1 ob1Var, t41 t41Var, dg0 dg0Var) {
        super(mz0Var);
        this.f7044r = false;
        this.f7035i = fm0Var;
        this.f7037k = context;
        this.f7036j = i8;
        this.f7038l = sw0Var;
        this.f7039m = ke1Var;
        this.f7040n = ob1Var;
        this.f7041o = t41Var;
        this.f7042p = ((Boolean) h2.y.c().b(ns.f12090h5)).booleanValue();
        this.f7043q = dg0Var;
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void a() {
        super.a();
        fm0 fm0Var = this.f7035i;
        if (fm0Var != null) {
            fm0Var.destroy();
        }
    }

    public final int h() {
        return this.f7036j;
    }

    public final void i(im imVar) {
        fm0 fm0Var = this.f7035i;
        if (fm0Var != null) {
            fm0Var.Q0(imVar);
        }
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
    public final void j(Activity activity, vm vmVar, boolean z7) {
        fm0 fm0Var;
        wr2 wr2VarD;
        Context context = activity;
        if (activity == null) {
            context = this.f7037k;
        }
        if (this.f7042p) {
            this.f7040n.k();
        }
        if (((Boolean) h2.y.c().b(ns.A0)).booleanValue()) {
            g2.t.r();
            if (j2.k2.f(context)) {
                qg0.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f7041o.k();
                if (((Boolean) h2.y.c().b(ns.B0)).booleanValue()) {
                    new s23(context.getApplicationContext(), g2.t.v().b()).a(this.f12291a.f10323b.f9793b.f5462b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) h2.y.c().b(ns.Pa)).booleanValue() && (fm0Var = this.f7035i) != null && (wr2VarD = fm0Var.d()) != null && wr2VarD.f16902s0 && wr2VarD.f16904t0 != this.f7043q.b()) {
            qg0.g("The app open consent form has been shown.");
            this.f7041o.w(vt2.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f7044r) {
            qg0.g("App open interstitial ad is already visible.");
            this.f7041o.w(vt2.d(10, null, null));
        }
        if (this.f7044r) {
            return;
        }
        try {
            this.f7039m.a(z7, context, this.f7041o);
            if (this.f7042p) {
                this.f7040n.j();
            }
            this.f7044r = true;
        } catch (je1 e8) {
            this.f7041o.K(e8);
        }
    }

    public final void k(long j8, int i8) {
        this.f7038l.a(j8, i8);
    }
}
