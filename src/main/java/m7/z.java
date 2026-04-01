package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends w1<Double, double[], y> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f25042c = new z();

    private z() {
        super(j7.a.B(kotlin.jvm.internal.k.f24317a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        kotlin.jvm.internal.q.f(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, y builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(decoder.z(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public y k(double[] dArr) {
        kotlin.jvm.internal.q.f(dArr, "<this>");
        return new y(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(l7.d encoder, double[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.n(getDescriptor(), i9, content[i9]);
        }
    }
}
