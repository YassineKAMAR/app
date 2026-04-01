package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f18095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f18105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18107m;

    public z8(w1 w1Var) {
        this.f18095a = w1Var;
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
    private final void f(int i8) {
        long j8 = this.f18106l;
        if (j8 == -9223372036854775807L) {
            return;
        }
        boolean z7 = this.f18107m;
        long j9 = this.f18096b - this.f18105k;
        this.f18095a.a(j8, z7 ? 1 : 0, (int) j9, i8, null);
    }

    public final void a(long j8) {
        this.f18096b = j8;
        f(0);
        this.f18103i = false;
    }

    public final void b(long j8, int i8, boolean z7) {
        if (this.f18104j && this.f18101g) {
            this.f18107m = this.f18097c;
            this.f18104j = false;
        } else if (this.f18102h || this.f18101g) {
            if (z7 && this.f18103i) {
                f(i8 + ((int) (j8 - this.f18096b)));
            }
            this.f18105k = this.f18096b;
            this.f18106l = this.f18099e;
            this.f18107m = this.f18097c;
            this.f18103i = true;
        }
    }

    public final void c(byte[] bArr, int i8, int i9) {
        if (this.f18100f) {
            int i10 = this.f18098d;
            int i11 = (i8 + 2) - i10;
            if (i11 >= i9) {
                this.f18098d = i10 + (i9 - i8);
            } else {
                this.f18101g = (bArr[i11] & 128) != 0;
                this.f18100f = false;
            }
        }
    }

    public final void d() {
        this.f18100f = false;
        this.f18101g = false;
        this.f18102h = false;
        this.f18103i = false;
        this.f18104j = false;
    }

    public final void e(long j8, int i8, int i9, long j9, boolean z7) {
        this.f18101g = false;
        this.f18102h = false;
        this.f18099e = j9;
        this.f18098d = 0;
        this.f18096b = j8;
        if (i9 >= 32 && i9 != 40) {
            if (this.f18103i && !this.f18104j) {
                if (z7) {
                    f(i8);
                }
                this.f18103i = false;
            }
            if (i9 <= 35 || i9 == 39) {
                this.f18102h = !this.f18104j;
                this.f18104j = true;
            }
        }
        boolean z8 = i9 >= 16 && i9 <= 21;
        this.f18097c = z8;
        this.f18100f = z8 || i9 <= 9;
    }
}
