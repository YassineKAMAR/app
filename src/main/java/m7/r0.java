package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends w1<Integer, int[], q0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f24989c = new r0();

    private r0() {
        super(j7.a.D(kotlin.jvm.internal.p.f24319a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        kotlin.jvm.internal.q.f(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, q0 builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(decoder.i(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public q0 k(int[] iArr) {
        kotlin.jvm.internal.q.f(iArr, "<this>");
        return new q0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(l7.d encoder, int[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.D(getDescriptor(), i9, content[i9]);
        }
    }
}
