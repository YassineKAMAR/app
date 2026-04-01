package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class r8 implements p8 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final double[] f13970q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f13972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fa f13973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dq2 f13974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e9 f13975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f13976f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q8 f13977g = new q8(128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f13978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f13981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f13984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13986p;

    r8(fa faVar) {
        dq2 dq2Var;
        this.f13973c = faVar;
        if (faVar != null) {
            this.f13975e = new e9(178, 128);
            dq2Var = new dq2();
        } else {
            dq2Var = null;
            this.f13975e = null;
        }
        this.f13974d = dq2Var;
        this.f13982l = -9223372036854775807L;
        this.f13984n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
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
    @Override // com.google.android.gms.internal.ads.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.dq2 r21) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r8.a(com.google.android.gms.internal.ads.dq2):void");
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
    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        uu1.b(this.f13972b);
        if (z7) {
            boolean z8 = this.f13985o;
            long j8 = this.f13978h - this.f13983m;
            this.f13972b.a(this.f13984n, z8 ? 1 : 0, (int) j8, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f13971a = caVar.b();
        this.f13972b = s0Var.f(caVar.a(), 2);
        fa faVar = this.f13973c;
        if (faVar != null) {
            faVar.b(s0Var, caVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        this.f13982l = j8;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        sd3.f(this.f13976f);
        this.f13977g.b();
        e9 e9Var = this.f13975e;
        if (e9Var != null) {
            e9Var.b();
        }
        this.f13978h = 0L;
        this.f13979i = false;
        this.f13982l = -9223372036854775807L;
        this.f13984n = -9223372036854775807L;
    }
}
