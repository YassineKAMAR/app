package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements i7.b<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f25011a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25012b = new x1("kotlin.Int", e.f.f24255a);

    private s0() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Integer.valueOf(decoder.k());
    }

    public void b(l7.f encoder, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.z(i8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25012b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
