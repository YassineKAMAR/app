package m7;

import k7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements i7.b<x6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f24881a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f24882b = new x1("kotlin.time.Duration", e.i.f24258a);

    private b0() {
    }

    public long a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return x6.a.f27324b.c(decoder.n());
    }

    public void b(l7.f encoder, long j8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        encoder.F(x6.a.J(j8));
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        return x6.a.g(a(eVar));
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f24882b;
    }

    @Override // i7.j
    public /* bridge */ /* synthetic */ void serialize(l7.f fVar, Object obj) {
        b(fVar, ((x6.a) obj).N());
    }
}
