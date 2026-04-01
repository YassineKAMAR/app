package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends w1<e6.a0, e6.b0, o2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f24981c = new p2();

    private p2() {
        super(j7.a.u(e6.a0.f21403b));
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((e6.b0) obj).D());
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((e6.b0) obj).D());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ e6.b0 r() {
        return e6.b0.a(w());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ void u(l7.d dVar, e6.b0 b0Var, int i8) {
        z(dVar, b0Var.D(), i8);
    }

    protected int v(int[] collectionSize) {
        kotlin.jvm.internal.q.f(collectionSize, "$this$collectionSize");
        return e6.b0.x(collectionSize);
    }

    protected int[] w() {
        return e6.b0.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, o2 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(e6.a0.c(decoder.l(getDescriptor(), i8).k()));
    }

    protected o2 y(int[] toBuilder) {
        kotlin.jvm.internal.q.f(toBuilder, "$this$toBuilder");
        return new o2(toBuilder, null);
    }

    protected void z(l7.d encoder, int[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.E(getDescriptor(), i9).z(e6.b0.v(content, i9));
        }
    }
}
