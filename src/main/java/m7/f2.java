package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements i7.b<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f24917a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24918b = new x1("kotlin.Short", e.h.f24257a);

    private f2() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Short.valueOf(decoder.E());
    }

    public void b(l7.f encoder, short s8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.i(s8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24918b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).shortValue());
    }
}
