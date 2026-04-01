package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends w1<e6.y, e6.z, l2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2 f24969c = new m2();

    private m2() {
        super(j7.a.t(e6.y.f21456b));
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((e6.z) obj).D());
    }

    @Override // m7.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((e6.z) obj).D());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ e6.z r() {
        return e6.z.a(w());
    }

    @Override // m7.w1
    public /* bridge */ /* synthetic */ void u(l7.d dVar, e6.z zVar, int i8) {
        z(dVar, zVar.D(), i8);
    }

    protected int v(byte[] collectionSize) {
        kotlin.jvm.internal.q.f(collectionSize, "$this$collectionSize");
        return e6.z.x(collectionSize);
    }

    protected byte[] w() {
        return e6.z.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, l2 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(e6.y.c(decoder.l(getDescriptor(), i8).D()));
    }

    protected l2 y(byte[] toBuilder) {
        kotlin.jvm.internal.q.f(toBuilder, "$this$toBuilder");
        return new l2(toBuilder, null);
    }

    protected void z(l7.d encoder, byte[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.E(getDescriptor(), i9).j(e6.z.v(content, i9));
        }
    }
}
