package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends w1<e6.f0, e6.g0, u2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v2 f25025c = new v2();

    private v2() {
        super(j7.a.w(e6.f0.f21419b));
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((e6.g0) obj).D());
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((e6.g0) obj).D());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ e6.g0 r() {
        return e6.g0.a(w());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ void u(l7.d dVar, e6.g0 g0Var, int i8) {
        z(dVar, g0Var.D(), i8);
    }

    protected int v(short[] collectionSize) {
        kotlin.jvm.internal.q.f(collectionSize, "$this$collectionSize");
        return e6.g0.x(collectionSize);
    }

    protected short[] w() {
        return e6.g0.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, u2 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(e6.f0.c(decoder.l(getDescriptor(), i8).E()));
    }

    protected u2 y(short[] toBuilder) {
        kotlin.jvm.internal.q.f(toBuilder, "$this$toBuilder");
        return new u2(toBuilder, null);
    }

    protected void z(l7.d encoder, short[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.E(getDescriptor(), i9).i(e6.g0.v(content, i9));
        }
    }
}
