package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements i7.b<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f24987a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24988b = new x1("kotlin.Char", e.c.f24252a);

    private r() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Character.valueOf(decoder.g());
    }

    public void b(l7.f encoder, char c8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.p(c8);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24988b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Character) obj).charValue());
    }
}
