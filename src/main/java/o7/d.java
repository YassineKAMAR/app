package o7;

import k7.j;
import k7.k;
import m7.h1;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends h1 implements n7.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n7.a f25310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p6.l<n7.h, e6.i0> f25311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final n7.f f25312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25313e;

    static final class a extends kotlin.jvm.internal.r implements p6.l<n7.h, e6.i0> {
        a() {
            super(1);
        }

        public final void a(n7.h node) {
            kotlin.jvm.internal.q.f(node, "node");
            d dVar = d.this;
            dVar.r0(d.d0(dVar), node);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(n7.h hVar) {
            a(hVar);
            return e6.i0.f21430a;
        }
    }

    public static final class b extends l7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p7.c f25315a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25317c;

        b(String str) {
            this.f25317c = str;
            this.f25315a = d.this.b().a();
        }

        @Override // l7.b, l7.f
        public void B(long j8) {
            J(h.a(e6.c0.c(j8), 10));
        }

        public final void J(String s8) {
            kotlin.jvm.internal.q.f(s8, "s");
            d.this.r0(this.f25317c, new n7.o(s8, false));
        }

        @Override // l7.f
        public p7.c a() {
            return this.f25315a;
        }

        @Override // l7.b, l7.f
        public void i(short s8) {
            J(e6.f0.g(e6.f0.c(s8)));
        }

        @Override // l7.b, l7.f
        public void j(byte b8) {
            J(e6.y.g(e6.y.c(b8)));
        }

        @Override // l7.b, l7.f
        public void z(int i8) {
            J(Long.toString(((long) e6.a0.c(i8)) & 4294967295L, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(n7.a aVar, p6.l<? super n7.h, e6.i0> lVar) {
        this.f25310b = aVar;
        this.f25311c = lVar;
        this.f25312d = aVar.e();
    }

    public /* synthetic */ d(n7.a aVar, p6.l lVar, kotlin.jvm.internal.j jVar) {
        this(aVar, lVar);
    }

    public static final /* synthetic */ String d0(d dVar) {
        return dVar.U();
    }

    @Override // l7.d
    public boolean A(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return this.f25312d.e();
    }

    @Override // m7.i2
    protected void T(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        this.f25311c.invoke(q0());
    }

    @Override // m7.h1
    protected String Z(String parentName, String childName) {
        kotlin.jvm.internal.q.f(parentName, "parentName");
        kotlin.jvm.internal.q.f(childName, "childName");
        return childName;
    }

    @Override // l7.f
    public final p7.c a() {
        return this.f25310b.a();
    }

    @Override // n7.l
    public final n7.a b() {
        return this.f25310b;
    }

    @Override // l7.f
    public l7.d c(k7.f descriptor) {
        d i0Var;
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        p6.l aVar = V() == null ? this.f25311c : new a();
        k7.j jVarE = descriptor.e();
        if (kotlin.jvm.internal.q.b(jVarE, k.b.f24283a) ? true : jVarE instanceof k7.d) {
            i0Var = new k0(this.f25310b, aVar);
        } else if (kotlin.jvm.internal.q.b(jVarE, k.c.f24284a)) {
            n7.a aVar2 = this.f25310b;
            k7.f fVarA = z0.a(descriptor.i(0), aVar2.a());
            k7.j jVarE2 = fVarA.e();
            if ((jVarE2 instanceof k7.e) || kotlin.jvm.internal.q.b(jVarE2, j.b.f24281a)) {
                i0Var = new m0(this.f25310b, aVar);
            } else {
                if (!aVar2.e().b()) {
                    throw b0.d(fVarA);
                }
                i0Var = new k0(this.f25310b, aVar);
            }
        } else {
            i0Var = new i0(this.f25310b, aVar);
        }
        String str = this.f25313e;
        if (str != null) {
            kotlin.jvm.internal.q.c(str);
            i0Var.r0(str, n7.i.c(descriptor.a()));
            this.f25313e = null;
        }
        return i0Var;
    }

    @Override // l7.f
    public void e() {
        String strV = V();
        if (strV == null) {
            this.f25311c.invoke(n7.r.f25207c);
        } else {
            n0(strV);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void I(String tag, boolean z7) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.a(Boolean.valueOf(z7)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, byte b8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Byte.valueOf(b8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, char c8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.c(String.valueOf(c8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, double d8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Double.valueOf(d8)));
        if (this.f25312d.a()) {
            return;
        }
        if (!((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true)) {
            throw b0.c(Double.valueOf(d8), tag, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, k7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        r0(tag, n7.i.c(enumDescriptor.g(i8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, float f8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Float.valueOf(f8)));
        if (this.f25312d.a()) {
            return;
        }
        if (!((Float.isInfinite(f8) || Float.isNaN(f8)) ? false : true)) {
            throw b0.c(Float.valueOf(f8), tag, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public l7.f O(String tag, k7.f inlineDescriptor) {
        kotlin.jvm.internal.q.f(tag, "tag");
        kotlin.jvm.internal.q.f(inlineDescriptor, "inlineDescriptor");
        return t0.a(inlineDescriptor) ? new b(tag) : super.O(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void P(String tag, int i8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Integer.valueOf(i8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, long j8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Long.valueOf(j8)));
    }

    protected void n0(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.r.f25207c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, short s8) {
        kotlin.jvm.internal.q.f(tag, "tag");
        r0(tag, n7.i.b(Short.valueOf(s8)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, String value) {
        kotlin.jvm.internal.q.f(tag, "tag");
        kotlin.jvm.internal.q.f(value, "value");
        r0(tag, n7.i.c(value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.i2, l7.f
    public <T> void q(i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (V() == null && x0.b(z0.a(serializer.getDescriptor(), a()))) {
            e0 e0Var = new e0(this.f25310b, this.f25311c);
            e0Var.q(serializer, t7);
            e0Var.T(serializer.getDescriptor());
        } else {
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
            this.f25313e = strC;
            jVarB.serialize(this, t7);
        }
    }

    public abstract n7.h q0();

    @Override // l7.f
    public void r() {
    }

    public abstract void r0(String str, n7.h hVar);
}
