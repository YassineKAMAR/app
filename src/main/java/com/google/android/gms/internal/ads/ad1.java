package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ad1 extends nz0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f5207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f5208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ob1 f5209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ke1 f5210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i01 f5211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s23 f5212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t41 f5213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final dg0 f5214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5215q;

    ad1(mz0 mz0Var, Context context, fm0 fm0Var, ob1 ob1Var, ke1 ke1Var, i01 i01Var, s23 s23Var, t41 t41Var, dg0 dg0Var) {
        super(mz0Var);
        this.f5215q = false;
        this.f5207i = context;
        this.f5208j = new WeakReference(fm0Var);
        this.f5209k = ob1Var;
        this.f5210l = ke1Var;
        this.f5211m = i01Var;
        this.f5212n = s23Var;
        this.f5213o = t41Var;
        this.f5214p = dg0Var;
    }

    public final void finalize() throws Throwable {
        try {
            final fm0 fm0Var = (fm0) this.f5208j.get();
            if (((Boolean) h2.y.c().b(ns.H6)).booleanValue()) {
                if (!this.f5215q && fm0Var != null) {
                    eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zc1
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

    public final boolean h() {
        return this.f5211m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.ob1 r0 = r4.f5209k
            r0.k()
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.A0
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            g2.t.r()
            android.content.Context r0 = r4.f5207i
            boolean r0 = j2.k2.f(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.qg0.g(r5)
            com.google.android.gms.internal.ads.t41 r5 = r4.f5213o
            r5.k()
            com.google.android.gms.internal.ads.fs r5 = com.google.android.gms.internal.ads.ns.B0
            com.google.android.gms.internal.ads.ls r6 = h2.y.c()
            java.lang.Object r5 = r6.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.s23 r5 = r4.f5212n
            com.google.android.gms.internal.ads.ks2 r6 = r4.f12291a
            com.google.android.gms.internal.ads.js2 r6 = r6.f10323b
            com.google.android.gms.internal.ads.as2 r6 = r6.f9793b
            java.lang.String r6 = r6.f5462b
            r5.a(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.f5208j
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.fm0 r0 = (com.google.android.gms.internal.ads.fm0) r0
            com.google.android.gms.internal.ads.fs r2 = com.google.android.gms.internal.ads.ns.Pa
            com.google.android.gms.internal.ads.ls r3 = h2.y.c()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.wr2 r0 = r0.d()
            if (r0 == 0) goto L92
            boolean r2 = r0.f16902s0
            if (r2 == 0) goto L92
            int r0 = r0.f16904t0
            com.google.android.gms.internal.ads.dg0 r2 = r4.f5214p
            int r2 = r2.b()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            com.google.android.gms.internal.ads.qg0.g(r5)
            com.google.android.gms.internal.ads.t41 r5 = r4.f5213o
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            h2.z2 r6 = com.google.android.gms.internal.ads.vt2.d(r6, r0, r3)
            r5.w(r6)
            goto Lc4
        L92:
            boolean r0 = r4.f5215q
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            com.google.android.gms.internal.ads.qg0.g(r0)
            com.google.android.gms.internal.ads.t41 r0 = r4.f5213o
            r2 = 10
            h2.z2 r2 = com.google.android.gms.internal.ads.vt2.d(r2, r3, r3)
            r0.w(r2)
        La6:
            boolean r0 = r4.f5215q
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.f5207i
        Lae:
            com.google.android.gms.internal.ads.ke1 r0 = r4.f5210l     // Catch: com.google.android.gms.internal.ads.je1 -> Lbe
            com.google.android.gms.internal.ads.t41 r2 = r4.f5213o     // Catch: com.google.android.gms.internal.ads.je1 -> Lbe
            r0.a(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.je1 -> Lbe
            com.google.android.gms.internal.ads.ob1 r5 = r4.f5209k     // Catch: com.google.android.gms.internal.ads.je1 -> Lbe
            r5.j()     // Catch: com.google.android.gms.internal.ads.je1 -> Lbe
            r5 = 1
            r4.f5215q = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.t41 r6 = r4.f5213o
            r6.K(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad1.i(boolean, android.app.Activity):boolean");
    }
}
