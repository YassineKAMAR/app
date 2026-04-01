package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements i7.b<e6.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f24985a = new q2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24986b = p0.a("kotlin.UInt", j7.a.D(kotlin.jvm.internal.p.f24319a));

    private q2() {
    }

    public int a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return e6.a0.c(decoder.o(getDescriptor()).k());
    }

    public void b(l7.f encoder, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.t(getDescriptor()).z(i8);
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        return e6.a0.a(a(eVar));
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24986b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((e6.a0) obj).h());
    }
}
