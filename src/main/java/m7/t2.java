package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 implements i7.b<e6.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f25017a = new t2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25018b = p0.a("kotlin.ULong", j7.a.E(kotlin.jvm.internal.s.f24320a));

    private t2() {
    }

    public long a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return e6.c0.c(decoder.o(getDescriptor()).q());
    }

    public void b(l7.f encoder, long j8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.t(getDescriptor()).B(j8);
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        return e6.c0.a(a(eVar));
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25018b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((e6.c0) obj).h());
    }
}
