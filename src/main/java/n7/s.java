package n7;

import k7.j;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements i7.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f25211a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25212b = k7.i.d("kotlinx.serialization.json.JsonNull", j.b.f24281a, new k7.f[0], null, 8, null);

    private s() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        k.g(decoder);
        if (decoder.u()) {
            throw new o7.x("Expected 'null' literal");
        }
        decoder.m();
        return r.f25207c;
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, r value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        encoder.e();
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25212b;
    }
}
