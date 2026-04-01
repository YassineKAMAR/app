package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class g9 implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f8262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cp2 f8263b = new cp2(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8264c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private kx2 f8266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8272k;

    public g9(p8 p8Var) {
        this.f8262a = p8Var;
    }

    private final void c(int i8) {
        this.f8264c = i8;
        this.f8265d = 0;
    }

    private final boolean d(dq2 dq2Var, byte[] bArr, int i8) {
        int iMin = Math.min(dq2Var.j(), i8 - this.f8265d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            dq2Var.h(iMin);
        } else {
            dq2Var.c(bArr, this.f8265d, iMin);
        }
        int i9 = this.f8265d + iMin;
        this.f8265d = i9;
        return i9 == i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
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
    @Override // com.google.android.gms.internal.ads.da
    public final void a(dq2 dq2Var, int i8) {
        int i9;
        long jB;
        int i10;
        uu1.b(this.f8266e);
        int i11 = -1;
        int i12 = 2;
        ?? r62 = 0;
        int i13 = 1;
        if ((i8 & 1) != 0) {
            int i14 = this.f8264c;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2) {
                    int i15 = this.f8271j;
                    if (i15 != -1) {
                        pf2.f("PesReader", "Unexpected start indicator: expected " + i15 + " more bytes");
                    }
                    this.f8262a.b(dq2Var.m() == 0);
                } else {
                    pf2.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i16 = i8;
        while (dq2Var.j() > 0) {
            int i17 = this.f8264c;
            if (i17 == 0) {
                dq2Var.h(dq2Var.j());
            } else if (i17 != i13) {
                if (i17 != i12) {
                    int iJ = dq2Var.j();
                    int i18 = this.f8271j;
                    int i19 = i18 == i11 ? 0 : iJ - i18;
                    if (i19 > 0) {
                        iJ -= i19;
                        dq2Var.f(dq2Var.l() + iJ);
                    }
                    this.f8262a.a(dq2Var);
                    int i20 = this.f8271j;
                    if (i20 != i11) {
                        int i21 = i20 - iJ;
                        this.f8271j = i21;
                        if (i21 == 0) {
                            this.f8262a.b(r62);
                            c(i13);
                        }
                    }
                } else {
                    if (d(dq2Var, this.f8263b.f6432a, Math.min(10, this.f8270i)) && d(dq2Var, null, this.f8270i)) {
                        this.f8263b.j(r62);
                        if (this.f8267f) {
                            this.f8263b.l(4);
                            long jD = this.f8263b.d(3);
                            this.f8263b.l(i13);
                            int iD = this.f8263b.d(15) << 15;
                            this.f8263b.l(i13);
                            long jD2 = this.f8263b.d(15);
                            this.f8263b.l(i13);
                            if (this.f8269h || !this.f8268g) {
                                i10 = iD;
                            } else {
                                this.f8263b.l(4);
                                long jD3 = ((long) this.f8263b.d(3)) << 30;
                                this.f8263b.l(i13);
                                int iD2 = this.f8263b.d(15) << 15;
                                this.f8263b.l(i13);
                                long jD4 = this.f8263b.d(15);
                                this.f8263b.l(i13);
                                i10 = iD;
                                this.f8266e.b(jD3 | ((long) iD2) | jD4);
                                this.f8269h = true;
                            }
                            jB = this.f8266e.b((jD << 30) | ((long) i10) | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i16 |= true != this.f8272k ? 0 : 4;
                        this.f8262a.d(jB, i16);
                        c(3);
                        i11 = -1;
                    }
                }
            } else if (d(dq2Var, this.f8263b.f6432a, 9)) {
                this.f8263b.j(0);
                int iD3 = this.f8263b.d(24);
                if (iD3 != 1) {
                    pf2.f("PesReader", "Unexpected start code prefix: " + iD3);
                    i11 = -1;
                    this.f8271j = -1;
                    i9 = 0;
                } else {
                    this.f8263b.l(8);
                    cp2 cp2Var = this.f8263b;
                    int iD4 = cp2Var.d(16);
                    cp2Var.l(5);
                    this.f8272k = this.f8263b.n();
                    this.f8263b.l(2);
                    this.f8267f = this.f8263b.n();
                    this.f8268g = this.f8263b.n();
                    this.f8263b.l(6);
                    int iD5 = this.f8263b.d(8);
                    this.f8270i = iD5;
                    if (iD4 == 0) {
                        this.f8271j = -1;
                    } else {
                        int i22 = (iD4 - 3) - iD5;
                        this.f8271j = i22;
                        if (i22 < 0) {
                            pf2.f("PesReader", "Found negative packet payload size: " + i22);
                            i11 = -1;
                            this.f8271j = -1;
                        }
                        i9 = 2;
                    }
                    i11 = -1;
                    i9 = 2;
                }
                c(i9);
            } else {
                i11 = -1;
            }
            i12 = 2;
            r62 = 0;
            i13 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.da
    public final void b(kx2 kx2Var, s0 s0Var, ca caVar) {
        this.f8266e = kx2Var;
        this.f8262a.c(s0Var, caVar);
    }

    @Override // com.google.android.gms.internal.ads.da
    public final void l() {
        this.f8264c = 0;
        this.f8265d = 0;
        this.f8269h = false;
        this.f8262a.m();
    }
}
