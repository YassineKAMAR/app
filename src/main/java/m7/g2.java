package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 implements i7.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f24923a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24924b = new x1("kotlin.String", e.i.f24258a);

    private g2() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return decoder.n();
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, String value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        encoder.F(value);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24924b;
    }
}
