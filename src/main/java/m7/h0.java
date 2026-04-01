package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends w1<Float, float[], g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f24926c = new h0();

    private h0() {
        super(j7.a.C(kotlin.jvm.internal.l.f24318a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        kotlin.jvm.internal.q.f(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, g0 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(decoder.v(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public g0 k(float[] fArr) {
        kotlin.jvm.internal.q.f(fArr, "<this>");
        return new g0(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(l7.d encoder, float[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.u(getDescriptor(), i9, content[i9]);
        }
    }
}
