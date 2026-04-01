package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f15000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15007h;

    public t8(w1 w1Var) {
        this.f15000a = w1Var;
    }

    public final void a(byte[] bArr, int i8, int i9) {
        if (this.f15002c) {
            int i10 = this.f15005f;
            int i11 = (i8 + 1) - i10;
            if (i11 >= i9) {
                this.f15005f = i10 + (i9 - i8);
            } else {
                this.f15003d = ((bArr[i11] & 192) >> 6) == 0;
                this.f15002c = false;
            }
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
    public final void b(long j8, int i8, boolean z7) {
        if (this.f15004e == 182 && z7 && this.f15001b) {
            long j9 = this.f15007h;
            if (j9 != -9223372036854775807L) {
                long j10 = j8 - this.f15006g;
                this.f15000a.a(j9, this.f15003d ? 1 : 0, (int) j10, i8, null);
            }
        }
        if (this.f15004e != 179) {
            this.f15006g = j8;
        }
    }

    public final void c(int i8, long j8) {
        boolean z7;
        this.f15004e = i8;
        this.f15003d = false;
        if (i8 == 182) {
            z7 = true;
        } else if (i8 == 179) {
            i8 = 179;
            z7 = true;
        } else {
            z7 = false;
        }
        this.f15001b = z7;
        this.f15002c = i8 == 182;
        this.f15005f = 0;
        this.f15007h = j8;
    }

    public final void d() {
        this.f15001b = false;
        this.f15002c = false;
        this.f15003d = false;
        this.f15004e = -1;
    }
}
