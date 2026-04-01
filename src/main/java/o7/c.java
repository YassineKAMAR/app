package o7;

import k7.j;
import k7.k;
import m7.g1;

/* JADX INFO: loaded from: classes2.dex */
abstract class c extends g1 implements n7.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n7.a f25306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n7.h f25307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final n7.f f25308e;

    private c(n7.a aVar, n7.h hVar) {
        this.f25306c = aVar;
        this.f25307d = hVar;
        this.f25308e = b().e();
    }

    public /* synthetic */ c(n7.a aVar, n7.h hVar, kotlin.jvm.internal.j jVar) {
        this(aVar, hVar);
    }

    private final n7.o d0(n7.v vVar, String str) {
        n7.o oVar = vVar instanceof n7.o ? (n7.o) vVar : null;
        if (oVar != null) {
            return oVar;
        }
        throw b0.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final n7.h f0() {
        n7.h hVarE0;
        String strU = U();
        return (strU == null || (hVarE0 = e0(strU)) == null) ? s0() : hVarE0;
    }

    private final Void t0(String str) {
        throw b0.f(-1, "Failed to parse '" + str + '\'', f0().toString());
    }

    @Override // m7.g1
    protected String Z(String parentName, String childName) {
        kotlin.jvm.internal.q.f(parentName, "parentName");
        kotlin.jvm.internal.q.f(childName, "childName");
        return childName;
    }

    @Override // l7.c
    public p7.c a() {
        return b().a();
    }

    @Override // n7.g
    public n7.a b() {
        return this.f25306c;
    }

    @Override // l7.e
    public l7.c c(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        n7.h hVarF0 = f0();
        k7.j jVarE = descriptor.e();
        if (kotlin.jvm.internal.q.b(jVarE, k.b.f24283a) ? true : jVarE instanceof k7.d) {
            n7.a aVarB = b();
            if (hVarF0 instanceof n7.b) {
                return new j0(aVarB, (n7.b) hVarF0);
            }
            throw b0.e(-1, "Expected " + kotlin.jvm.internal.z.b(n7.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.z.b(hVarF0.getClass()));
        }
        if (!kotlin.jvm.internal.q.b(jVarE, k.c.f24284a)) {
            n7.a aVarB2 = b();
            if (hVarF0 instanceof n7.t) {
                return new h0(aVarB2, (n7.t) hVarF0, null, null, 12, null);
            }
            throw b0.e(-1, "Expected " + kotlin.jvm.internal.z.b(n7.t.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.z.b(hVarF0.getClass()));
        }
        n7.a aVarB3 = b();
        k7.f fVarA = z0.a(descriptor.i(0), aVarB3.a());
        k7.j jVarE2 = fVarA.e();
        if ((jVarE2 instanceof k7.e) || kotlin.jvm.internal.q.b(jVarE2, j.b.f24281a)) {
            n7.a aVarB4 = b();
            if (hVarF0 instanceof n7.t) {
                return new l0(aVarB4, (n7.t) hVarF0);
            }
            throw b0.e(-1, "Expected " + kotlin.jvm.internal.z.b(n7.t.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.z.b(hVarF0.getClass()));
        }
        if (!aVarB3.e().b()) {
            throw b0.d(fVarA);
        }
        n7.a aVarB5 = b();
        if (hVarF0 instanceof n7.b) {
            return new j0(aVarB5, (n7.b) hVarF0);
        }
        throw b0.e(-1, "Expected " + kotlin.jvm.internal.z.b(n7.b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.z.b(hVarF0.getClass()));
    }

    @Override // l7.c
    public void d(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
    }

    @Override // m7.h2, l7.e
    public <T> T e(i7.a<T> deserializer) {
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        return (T) p0.d(this, deserializer);
    }

    protected abstract n7.h e0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        n7.v vVarR0 = r0(tag);
        if (!b().e().l() && d0(vVarR0, "boolean").g()) {
            throw b0.f(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean boolE = n7.i.e(vVarR0);
            if (boolE != null) {
                return boolE.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            int iK = n7.i.k(r0(tag));
            boolean z7 = false;
            if (-128 <= iK && iK <= 127) {
                z7 = true;
            }
            Byte bValueOf = z7 ? Byte.valueOf((byte) iK) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            t0("byte");
            throw new e6.h();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            return w6.y.w0(r0(tag).a());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new e6.h();
        }
    }

    @Override // n7.g
    public n7.h j() {
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            double dG = n7.i.g(r0(tag));
            if (!b().e().a()) {
                if (!((Double.isInfinite(dG) || Double.isNaN(dG)) ? false : true)) {
                    throw b0.a(Double.valueOf(dG), tag, f0().toString());
                }
            }
            return dG;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, k7.f enumDescriptor) {
        kotlin.jvm.internal.q.f(tag, "tag");
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        return c0.f(enumDescriptor, b(), r0(tag).a(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            float fI = n7.i.i(r0(tag));
            if (!b().e().a()) {
                if (!((Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true)) {
                    throw b0.a(Float.valueOf(fI), tag, f0().toString());
                }
            }
            return fI;
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public l7.e P(String tag, k7.f inlineDescriptor) {
        kotlin.jvm.internal.q.f(tag, "tag");
        kotlin.jvm.internal.q.f(inlineDescriptor, "inlineDescriptor");
        return t0.a(inlineDescriptor) ? new w(new u0(r0(tag).a()), b()) : super.P(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            return n7.i.k(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            return n7.i.p(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        try {
            int iK = n7.i.k(r0(tag));
            boolean z7 = false;
            if (-32768 <= iK && iK <= 32767) {
                z7 = true;
            }
            Short shValueOf = z7 ? Short.valueOf((short) iK) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            t0("short");
            throw new e6.h();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new e6.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.h2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        n7.v vVarR0 = r0(tag);
        if (b().e().l() || d0(vVarR0, "string").g()) {
            if (vVarR0 instanceof n7.r) {
                throw b0.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return vVarR0.a();
        }
        throw b0.f(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
    }

    protected final n7.v r0(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        n7.h hVarE0 = e0(tag);
        n7.v vVar = hVarE0 instanceof n7.v ? (n7.v) hVarE0 : null;
        if (vVar != null) {
            return vVar;
        }
        throw b0.f(-1, "Expected JsonPrimitive at " + tag + ", found " + hVarE0, f0().toString());
    }

    public abstract n7.h s0();

    @Override // m7.h2, l7.e
    public boolean u() {
        return !(f0() instanceof n7.r);
    }
}
