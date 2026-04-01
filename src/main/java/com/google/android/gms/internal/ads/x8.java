package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f17103a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ff3 f17106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f17107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17110h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17116n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f17104b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f17105c = new SparseArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w8 f17111i = new w8(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w8 f17112j = new w8(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17113k = false;

    public x8(w1 w1Var, boolean z7, boolean z8) {
        this.f17103a = w1Var;
        byte[] bArr = new byte[128];
        this.f17107e = bArr;
        this.f17106d = new ff3(bArr, 0, 0);
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
    private final void g(int i8) {
        long j8 = this.f17115m;
        if (j8 == -9223372036854775807L) {
            return;
        }
        boolean z7 = this.f17116n;
        long j9 = this.f17109g - this.f17114l;
        this.f17103a.a(j8, z7 ? 1 : 0, (int) j9, i8, null);
    }

    public final void a(long j8) {
        this.f17109g = j8;
        g(0);
        this.f17113k = false;
    }

    public final void b(rb3 rb3Var) {
        this.f17105c.append(rb3Var.f14036a, rb3Var);
    }

    public final void c(rc3 rc3Var) {
        this.f17104b.append(rc3Var.f14056d, rc3Var);
    }

    public final void d() {
        this.f17113k = false;
    }

    public final void e(long j8, int i8, long j9) {
        this.f17108f = i8;
        this.f17110h = j9;
        this.f17109g = j8;
    }

    public final boolean f(long j8, int i8, boolean z7, boolean z8) {
        boolean z9 = false;
        if (this.f17108f == 9) {
            if (z7 && this.f17113k) {
                g(i8 + ((int) (j8 - this.f17109g)));
            }
            this.f17114l = this.f17109g;
            this.f17115m = this.f17110h;
            this.f17116n = false;
            this.f17113k = true;
        }
        boolean z10 = this.f17116n;
        int i9 = this.f17108f;
        if (i9 == 5 || (z8 && i9 == 1)) {
            z9 = true;
        }
        boolean z11 = z10 | z9;
        this.f17116n = z11;
        return z11;
    }
}
