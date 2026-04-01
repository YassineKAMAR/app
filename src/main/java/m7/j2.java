package m7;

import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j2<A, B, C> implements i7.b<e6.w<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.b<A> f24946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i7.b<B> f24947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i7.b<C> f24948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k7.f f24949d;

    static final class a extends kotlin.jvm.internal.r implements p6.l<k7.a, e6.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2<A, B, C> f24950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j2<A, B, C> j2Var) {
            super(1);
            this.f24950a = j2Var;
        }

        public final void a(k7.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.q.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            k7.a.b(buildClassSerialDescriptor, "first", ((j2) this.f24950a).f24946a.getDescriptor(), null, false, 12, null);
            k7.a.b(buildClassSerialDescriptor, "second", ((j2) this.f24950a).f24947b.getDescriptor(), null, false, 12, null);
            k7.a.b(buildClassSerialDescriptor, "third", ((j2) this.f24950a).f24948c.getDescriptor(), null, false, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(k7.a aVar) {
            a(aVar);
            return e6.i0.f21430a;
        }
    }

    public j2(i7.b<A> aSerializer, i7.b<B> bSerializer, i7.b<C> cSerializer) {
        kotlin.jvm.internal.q.f(aSerializer, "aSerializer");
        kotlin.jvm.internal.q.f(bSerializer, "bSerializer");
        kotlin.jvm.internal.q.f(cSerializer, "cSerializer");
        this.f24946a = aSerializer;
        this.f24947b = bSerializer;
        this.f24948c = cSerializer;
        this.f24949d = k7.i.b("kotlin.Triple", new k7.f[0], new a(this));
    }

    private final e6.w<A, B, C> d(l7.c cVar) {
        Object objC = c.a.c(cVar, getDescriptor(), 0, this.f24946a, null, 8, null);
        Object objC2 = c.a.c(cVar, getDescriptor(), 1, this.f24947b, null, 8, null);
        Object objC3 = c.a.c(cVar, getDescriptor(), 2, this.f24948c, null, 8, null);
        cVar.d(getDescriptor());
        return new e6.w<>(objC, objC2, objC3);
    }

    private final e6.w<A, B, C> e(l7.c cVar) {
        Object objC = k2.f24958a;
        Object objC2 = k2.f24958a;
        Object objC3 = k2.f24958a;
        while (true) {
            int iS = cVar.s(getDescriptor());
            if (iS == -1) {
                cVar.d(getDescriptor());
                if (objC == k2.f24958a) {
                    throw new i7.i("Element 'first' is missing");
                }
                if (objC2 == k2.f24958a) {
                    throw new i7.i("Element 'second' is missing");
                }
                if (objC3 != k2.f24958a) {
                    return new e6.w<>(objC, objC2, objC3);
                }
                throw new i7.i("Element 'third' is missing");
            }
            if (iS == 0) {
                objC = c.a.c(cVar, getDescriptor(), 0, this.f24946a, null, 8, null);
            } else if (iS == 1) {
                objC2 = c.a.c(cVar, getDescriptor(), 1, this.f24947b, null, 8, null);
            } else {
                if (iS != 2) {
                    throw new i7.i("Unexpected index " + iS);
                }
                objC3 = c.a.c(cVar, getDescriptor(), 2, this.f24948c, null, 8, null);
            }
        }
    }

    @Override // i7.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e6.w<A, B, C> deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        l7.c cVarC = decoder.c(getDescriptor());
        return cVarC.y() ? d(cVarC) : e(cVarC);
    }

    @Override // i7.j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, e6.w<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        l7.d dVarC = encoder.c(getDescriptor());
        dVarC.l(getDescriptor(), 0, this.f24946a, value.a());
        dVarC.l(getDescriptor(), 1, this.f24947b, value.b());
        dVarC.l(getDescriptor(), 2, this.f24948c, value.c());
        dVarC.d(getDescriptor());
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24949d;
    }
}
