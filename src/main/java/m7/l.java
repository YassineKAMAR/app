package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements i7.b<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f24959a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24960b = new x1("kotlin.Byte", e.b.f24251a);

    private l() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Byte.valueOf(decoder.D());
    }

    public void b(l7.f encoder, byte b8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.j(b8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24960b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Number) obj).byteValue());
    }
}
