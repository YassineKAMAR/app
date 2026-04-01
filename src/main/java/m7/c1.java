package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 implements i7.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f24890a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24891b = new x1("kotlin.Long", e.g.f24256a);

    private c1() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Long.valueOf(decoder.q());
    }

    public void b(l7.f encoder, long j8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.B(j8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24891b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).longValue());
    }
}
