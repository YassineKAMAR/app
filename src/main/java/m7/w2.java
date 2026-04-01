package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 implements i7.b<e6.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f25030a = new w2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25031b = p0.a("kotlin.UShort", j7.a.F(kotlin.jvm.internal.b0.f24296a));

    private w2() {
    }

    public short a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return e6.f0.c(decoder.o(getDescriptor()).E());
    }

    public void b(l7.f encoder, short s8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.t(getDescriptor()).i(s8);
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        return e6.f0.a(a(eVar));
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25031b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((e6.f0) obj).h());
    }
}
