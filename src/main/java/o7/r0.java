package o7;

import k7.j;

/* JADX INFO: loaded from: classes2.dex */
public class r0 extends l7.a implements n7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n7.a f25366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f25367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.a f25368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p7.c f25369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f25371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n7.f f25372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y f25373h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25374a;

        public a(String str) {
            this.f25374a = str;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25375a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25375a = iArr;
        }
    }

    public r0(n7.a json, y0 mode, o7.a lexer, k7.f descriptor, a aVar) {
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(mode, "mode");
        kotlin.jvm.internal.q.f(lexer, "lexer");
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        this.f25366a = json;
        this.f25367b = mode;
        this.f25368c = lexer;
        this.f25369d = json.a();
        this.f25370e = -1;
        this.f25371f = aVar;
        n7.f fVarE = json.e();
        this.f25372g = fVarE;
        this.f25373h = fVarE.f() ? null : new y(descriptor);
    }

    private final void K() {
        if (this.f25368c.E() != 4) {
            return;
        }
        o7.a.y(this.f25368c, "Unexpected leading comma", 0, null, 6, null);
        throw new e6.h();
    }

    private final boolean L(k7.f fVar, int i8) {
        String strF;
        n7.a aVar = this.f25366a;
        k7.f fVarI = fVar.i(i8);
        if (fVarI.c() || !(!this.f25368c.M())) {
            if (!kotlin.jvm.internal.q.b(fVarI.e(), j.b.f24281a) || (strF = this.f25368c.F(this.f25372g.l())) == null || c0.d(fVarI, aVar, strF) != -3) {
                return false;
            }
            this.f25368c.q();
        }
        return true;
    }

    private final int M() {
        boolean zL = this.f25368c.L();
        if (!this.f25368c.f()) {
            if (!zL) {
                return -1;
            }
            o7.a.y(this.f25368c, "Unexpected trailing comma", 0, null, 6, null);
            throw new e6.h();
        }
        int i8 = this.f25370e;
        if (i8 != -1 && !zL) {
            o7.a.y(this.f25368c, "Expected end of the array or comma", 0, null, 6, null);
            throw new e6.h();
        }
        int i9 = i8 + 1;
        this.f25370e = i9;
        return i9;
    }

    private final int N() {
        int i8 = this.f25370e;
        boolean zL = false;
        boolean z7 = i8 % 2 != 0;
        if (!z7) {
            this.f25368c.o(':');
        } else if (i8 != -1) {
            zL = this.f25368c.L();
        }
        if (!this.f25368c.f()) {
            if (!zL) {
                return -1;
            }
            o7.a.y(this.f25368c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new e6.h();
        }
        if (z7) {
            if (this.f25370e == -1) {
                o7.a aVar = this.f25368c;
                boolean z8 = !zL;
                int i9 = aVar.f25302a;
                if (!z8) {
                    o7.a.y(aVar, "Unexpected trailing comma", i9, null, 4, null);
                    throw new e6.h();
                }
            } else {
                o7.a aVar2 = this.f25368c;
                int i10 = aVar2.f25302a;
                if (!zL) {
                    o7.a.y(aVar2, "Expected comma after the key-value pair", i10, null, 4, null);
                    throw new e6.h();
                }
            }
        }
        int i11 = this.f25370e + 1;
        this.f25370e = i11;
        return i11;
    }

    private final int O(k7.f fVar) {
        boolean zL;
        boolean zL2 = this.f25368c.L();
        while (this.f25368c.f()) {
            String strP = P();
            this.f25368c.o(':');
            int iD = c0.d(fVar, this.f25366a, strP);
            boolean z7 = false;
            if (iD == -3) {
                zL = false;
                z7 = true;
            } else {
                if (!this.f25372g.d() || !L(fVar, iD)) {
                    y yVar = this.f25373h;
                    if (yVar != null) {
                        yVar.c(iD);
                    }
                    return iD;
                }
                zL = this.f25368c.L();
            }
            zL2 = z7 ? Q(strP) : zL;
        }
        if (zL2) {
            o7.a.y(this.f25368c, "Unexpected trailing comma", 0, null, 6, null);
            throw new e6.h();
        }
        y yVar2 = this.f25373h;
        if (yVar2 != null) {
            return yVar2.d();
        }
        return -1;
    }

    private final String P() {
        return this.f25372g.l() ? this.f25368c.t() : this.f25368c.k();
    }

    private final boolean Q(String str) {
        if (this.f25372g.g() || S(this.f25371f, str)) {
            this.f25368c.H(this.f25372g.l());
        } else {
            this.f25368c.A(str);
        }
        return this.f25368c.L();
    }

    private final void R(k7.f fVar) {
        while (s(fVar) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.q.b(aVar.f25374a, str)) {
            return false;
        }
        aVar.f25374a = null;
        return true;
    }

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
    @Override // l7.a, l7.c
    public <T> T C(k7.f descriptor, int i8, i7.a<T> deserializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        boolean z7 = this.f25367b == y0.MAP && (i8 & 1) == 0;
        if (z7) {
            this.f25368c.f25303b.d();
        }
        T t8 = (T) super.C(descriptor, i8, deserializer, t7);
        if (z7) {
            this.f25368c.f25303b.f(t8);
        }
        return t8;
    }

    @Override // l7.a, l7.e
    public byte D() {
        long jP = this.f25368c.p();
        byte b8 = (byte) jP;
        if (jP == b8) {
            return b8;
        }
        o7.a.y(this.f25368c, "Failed to parse byte for input '" + jP + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    @Override // l7.a, l7.e
    public short E() {
        long jP = this.f25368c.p();
        short s8 = (short) jP;
        if (jP == s8) {
            return s8;
        }
        o7.a.y(this.f25368c, "Failed to parse short for input '" + jP + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    @Override // l7.a, l7.e
    public float F() {
        o7.a aVar = this.f25368c;
        String strS = aVar.s();
        try {
            float f8 = Float.parseFloat(strS);
            if (!this.f25366a.e().a()) {
                if (!((Float.isInfinite(f8) || Float.isNaN(f8)) ? false : true)) {
                    b0.j(this.f25368c, Float.valueOf(f8));
                    throw new e6.h();
                }
            }
            return f8;
        } catch (IllegalArgumentException unused) {
            o7.a.y(aVar, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.a, l7.e
    public double G() {
        o7.a aVar = this.f25368c;
        String strS = aVar.s();
        try {
            double d8 = Double.parseDouble(strS);
            if (!this.f25366a.e().a()) {
                if (!((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true)) {
                    b0.j(this.f25368c, Double.valueOf(d8));
                    throw new e6.h();
                }
            }
            return d8;
        } catch (IllegalArgumentException unused) {
            o7.a.y(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.a, l7.e
    public int H(k7.f enumDescriptor) {
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        return c0.e(enumDescriptor, this.f25366a, n(), " at path " + this.f25368c.f25303b.a());
    }

    @Override // l7.c
    public p7.c a() {
        return this.f25369d;
    }

    @Override // n7.g
    public final n7.a b() {
        return this.f25366a;
    }

    @Override // l7.a, l7.e
    public l7.c c(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        y0 y0VarB = z0.b(this.f25366a, descriptor);
        this.f25368c.f25303b.c(descriptor);
        this.f25368c.o(y0VarB.f25402a);
        K();
        int i8 = b.f25375a[y0VarB.ordinal()];
        return (i8 == 1 || i8 == 2 || i8 == 3) ? new r0(this.f25366a, y0VarB, this.f25368c, descriptor, this.f25371f) : (this.f25367b == y0VarB && this.f25366a.e().f()) ? this : new r0(this.f25366a, y0VarB, this.f25368c, descriptor, this.f25371f);
    }

    @Override // l7.a, l7.c
    public void d(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        if (this.f25366a.e().g() && descriptor.f() == 0) {
            R(descriptor);
        }
        this.f25368c.o(this.f25367b.f25403b);
        this.f25368c.f25303b.b();
    }

    @Override // l7.a, l7.e
    public <T> T e(i7.a<T> deserializer) {
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        try {
            if ((deserializer instanceof m7.b) && !this.f25366a.e().k()) {
                String strC = p0.c(deserializer.getDescriptor(), this.f25366a);
                String strL = this.f25368c.l(strC, this.f25372g.l());
                i7.a<? extends T> aVarC = strL != null ? ((m7.b) deserializer).c(this, strL) : null;
                if (aVarC == null) {
                    return (T) p0.d(this, deserializer);
                }
                this.f25371f = new a(strC);
                return aVarC.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (i7.c e8) {
            throw new i7.c(e8.a(), e8.getMessage() + " at path: " + this.f25368c.f25303b.a(), e8);
        }
    }

    @Override // l7.a, l7.e
    public boolean f() {
        return this.f25372g.l() ? this.f25368c.i() : this.f25368c.g();
    }

    @Override // l7.a, l7.e
    public char g() {
        String strS = this.f25368c.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        o7.a.y(this.f25368c, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    @Override // n7.g
    public n7.h j() {
        return new n0(this.f25366a.e(), this.f25368c).e();
    }

    @Override // l7.a, l7.e
    public int k() {
        long jP = this.f25368c.p();
        int i8 = (int) jP;
        if (jP == i8) {
            return i8;
        }
        o7.a.y(this.f25368c, "Failed to parse int for input '" + jP + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    @Override // l7.a, l7.e
    public Void m() {
        return null;
    }

    @Override // l7.a, l7.e
    public String n() {
        return this.f25372g.l() ? this.f25368c.t() : this.f25368c.q();
    }

    @Override // l7.a, l7.e
    public l7.e o(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return t0.a(descriptor) ? new w(this.f25368c, this.f25366a) : super.o(descriptor);
    }

    @Override // l7.a, l7.e
    public long q() {
        return this.f25368c.p();
    }

    @Override // l7.c
    public int s(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        int i8 = b.f25375a[this.f25367b.ordinal()];
        int iM = i8 != 2 ? i8 != 4 ? M() : O(descriptor) : N();
        if (this.f25367b != y0.MAP) {
            this.f25368c.f25303b.g(iM);
        }
        return iM;
    }

    @Override // l7.a, l7.e
    public boolean u() {
        y yVar = this.f25373h;
        return !(yVar != null ? yVar.b() : false) && this.f25368c.M();
    }
}
