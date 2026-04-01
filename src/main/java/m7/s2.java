package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends w1<e6.c0, e6.d0, r2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s2 f25013c = new s2();

    private s2() {
        super(j7.a.v(e6.c0.f21409b));
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((e6.d0) obj).D());
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((e6.d0) obj).D());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ e6.d0 r() {
        return e6.d0.a(w());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ void u(l7.d dVar, e6.d0 d0Var, int i8) {
        z(dVar, d0Var.D(), i8);
    }

    protected int v(long[] collectionSize) {
        kotlin.jvm.internal.q.f(collectionSize, "$this$collectionSize");
        return e6.d0.x(collectionSize);
    }

    protected long[] w() {
        return e6.d0.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, r2 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(e6.c0.c(decoder.l(getDescriptor(), i8).q()));
    }

    protected r2 y(long[] toBuilder) {
        kotlin.jvm.internal.q.f(toBuilder, "$this$toBuilder");
        return new r2(toBuilder, null);
    }

    protected void z(l7.d encoder, long[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.E(getDescriptor(), i9).B(e6.d0.v(content, i9));
        }
    }
}
