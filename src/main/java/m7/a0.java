package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements i7.b<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f24874a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24875b = new x1("kotlin.Double", e.d.f24253a);

    private a0() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Double.valueOf(decoder.G());
    }

    public void b(l7.f encoder, double d8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.h(d8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24875b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).doubleValue());
    }
}
