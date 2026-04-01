package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements i7.b<e6.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n2 f24971a = new n2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24972b = p0.a("kotlin.UByte", j7.a.z(kotlin.jvm.internal.d.f24299a));

    private n2() {
    }

    public byte a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return e6.y.c(decoder.o(getDescriptor()).D());
    }

    public void b(l7.f encoder, byte b8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.t(getDescriptor()).j(b8);
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        return e6.y.a(a(eVar));
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24972b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((e6.y) obj).h());
    }
}
