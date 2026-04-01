package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class y20 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h20 f17560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j2.f1 f17561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n30 f17562c;

    y20(n30 n30Var, gh ghVar, h20 h20Var, j2.f1 f1Var) {
        this.f17562c = n30Var;
        this.f17560a = h20Var;
        this.f17561b = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.qz, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        synchronized (this.f17562c.f11649a) {
            qg0.f("JS Engine is requesting an update");
            if (this.f17562c.f11657i == 0) {
                qg0.f("Starting reload.");
                this.f17562c.f11657i = 2;
                this.f17562c.d(null);
            }
            this.f17560a.m("/requestReload", this.f17561b.a());
        }
    }
}
