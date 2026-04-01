package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements i7.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f24935a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24936b = new x1("kotlin.Boolean", e.a.f24250a);

    private i() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return Boolean.valueOf(decoder.f());
    }

    public void b(l7.f encoder, boolean z7) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.k(z7);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24936b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((Boolean) obj).booleanValue());
    }
}
