package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends l7.b implements n7.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f25378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n7.a f25379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0 f25380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n7.l[] f25381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p7.c f25382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n7.f f25383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f25385h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25386a;

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
            f25386a = iArr;
        }
    }

    public s0(k composer, n7.a json, y0 mode, n7.l[] lVarArr) {
        kotlin.jvm.internal.q.f(composer, "composer");
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(mode, "mode");
        this.f25378a = composer;
        this.f25379b = json;
        this.f25380c = mode;
        this.f25381d = lVarArr;
        this.f25382e = b().a();
        this.f25383f = b().e();
        int iOrdinal = mode.ordinal();
        if (lVarArr != null) {
            n7.l lVar = lVarArr[iOrdinal];
            if (lVar == null && lVar == this) {
                return;
            }
            lVarArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(o0 output, n7.a json, y0 mode, n7.l[] modeReuseCache) {
        this(t.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.q.f(output, "output");
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(mode, "mode");
        kotlin.jvm.internal.q.f(modeReuseCache, "modeReuseCache");
    }

    private final k J() {
        k kVar = this.f25378a;
        return kVar instanceof r ? kVar : new r(kVar.f25341a, this.f25384g);
    }

    private final void K(k7.f fVar) {
        this.f25378a.c();
        String str = this.f25385h;
        kotlin.jvm.internal.q.c(str);
        F(str);
        this.f25378a.e(':');
        this.f25378a.o();
        F(fVar.a());
    }

    @Override // l7.b, l7.d
    public boolean A(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return this.f25383f.e();
    }

    @Override // l7.b, l7.f
    public void B(long j8) {
        if (this.f25384g) {
            F(String.valueOf(j8));
        } else {
            this.f25378a.i(j8);
        }
    }

    @Override // l7.b, l7.f
    public void F(String value) {
        kotlin.jvm.internal.q.f(value, "value");
        this.f25378a.m(value);
    }

    @Override // l7.b
    public boolean G(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        int i9 = a.f25386a[this.f25380c.ordinal()];
        if (i9 != 1) {
            boolean z7 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f25378a.a()) {
                        this.f25378a.e(',');
                    }
                    this.f25378a.c();
                    F(descriptor.g(i8));
                    this.f25378a.e(':');
                    this.f25378a.o();
                } else {
                    if (i8 == 0) {
                        this.f25384g = true;
                    }
                    if (i8 == 1) {
                        this.f25378a.e(',');
                    }
                }
                return true;
            }
            if (this.f25378a.a()) {
                this.f25384g = true;
            } else {
                int i10 = i8 % 2;
                k kVar = this.f25378a;
                if (i10 == 0) {
                    kVar.e(',');
                    this.f25378a.c();
                    z7 = true;
                    this.f25384g = z7;
                    return true;
                }
                kVar.e(':');
            }
            this.f25378a.o();
            this.f25384g = z7;
            return true;
        }
        if (!this.f25378a.a()) {
            this.f25378a.e(',');
        }
        this.f25378a.c();
        return true;
    }

    @Override // l7.f
    public p7.c a() {
        return this.f25382e;
    }

    @Override // n7.l
    public n7.a b() {
        return this.f25379b;
    }

    @Override // l7.b, l7.f
    public l7.d c(k7.f descriptor) {
        n7.l lVar;
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        y0 y0VarB = z0.b(b(), descriptor);
        char c8 = y0VarB.f25402a;
        if (c8 != 0) {
            this.f25378a.e(c8);
            this.f25378a.b();
        }
        if (this.f25385h != null) {
            K(descriptor);
            this.f25385h = null;
        }
        if (this.f25380c == y0VarB) {
            return this;
        }
        n7.l[] lVarArr = this.f25381d;
        return (lVarArr == null || (lVar = lVarArr[y0VarB.ordinal()]) == null) ? new s0(this.f25378a, b(), y0VarB, this.f25381d) : lVar;
    }

    @Override // l7.b, l7.d
    public void d(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        if (this.f25380c.f25403b != 0) {
            this.f25378a.p();
            this.f25378a.c();
            this.f25378a.e(this.f25380c.f25403b);
        }
    }

    @Override // l7.b, l7.f
    public void e() {
        this.f25378a.j("null");
    }

    @Override // l7.b, l7.d
    public <T> void f(k7.f descriptor, int i8, i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (t7 != null || this.f25383f.f()) {
            super.f(descriptor, i8, serializer, t7);
        }
    }

    @Override // l7.b, l7.f
    public void h(double d8) {
        if (this.f25384g) {
            F(String.valueOf(d8));
        } else {
            this.f25378a.f(d8);
        }
        if (this.f25383f.a()) {
            return;
        }
        if (!((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true)) {
            throw b0.b(Double.valueOf(d8), this.f25378a.f25341a.toString());
        }
    }

    @Override // l7.b, l7.f
    public void i(short s8) {
        if (this.f25384g) {
            F(String.valueOf((int) s8));
        } else {
            this.f25378a.k(s8);
        }
    }

    @Override // l7.b, l7.f
    public void j(byte b8) {
        if (this.f25384g) {
            F(String.valueOf((int) b8));
        } else {
            this.f25378a.d(b8);
        }
    }

    @Override // l7.b, l7.f
    public void k(boolean z7) {
        if (this.f25384g) {
            F(String.valueOf(z7));
        } else {
            this.f25378a.l(z7);
        }
    }

    @Override // l7.b, l7.f
    public void o(float f8) {
        if (this.f25384g) {
            F(String.valueOf(f8));
        } else {
            this.f25378a.g(f8);
        }
        if (this.f25383f.a()) {
            return;
        }
        if (!((Float.isInfinite(f8) || Float.isNaN(f8)) ? false : true)) {
            throw b0.b(Float.valueOf(f8), this.f25378a.f25341a.toString());
        }
    }

    @Override // l7.b, l7.f
    public void p(char c8) {
        F(String.valueOf(c8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.b, l7.f
    public <T> void q(i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (!(serializer instanceof m7.b) || b().e().k()) {
            serializer.serialize(this, t7);
            return;
        }
        m7.b bVar = (m7.b) serializer;
        String strC = p0.c(serializer.getDescriptor(), b());
        kotlin.jvm.internal.q.d(t7, "null cannot be cast to non-null type kotlin.Any");
        i7.j jVarB = i7.f.b(bVar, this, t7);
        p0.f(bVar, jVarB, strC);
        p0.b(jVarB.getDescriptor().e());
        this.f25385h = strC;
        jVarB.serialize(this, t7);
    }

    @Override // l7.b, l7.f
    public l7.f t(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return t0.a(descriptor) ? new s0(J(), b(), this.f25380c, (n7.l[]) null) : super.t(descriptor);
    }

    @Override // l7.b, l7.f
    public void w(k7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.g(i8));
    }

    @Override // l7.b, l7.f
    public void z(int i8) {
        if (this.f25384g) {
            F(String.valueOf(i8));
        } else {
            this.f25378a.h(i8);
        }
    }
}
