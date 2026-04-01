package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements i7.b<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f24937a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24938b = new x1("kotlin.Float", e.C0142e.f24254a);

    private i0() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Float.valueOf(decoder.F());
    }

    public void b(l7.f encoder, float f8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.o(f8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24938b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).floatValue());
    }
}
