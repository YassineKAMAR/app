package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends w1<Character, char[], p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f24982c = new q();

    private q() {
        super(j7.a.A(kotlin.jvm.internal.f.f24308a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        kotlin.jvm.internal.q.f(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u, m7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(l7.c decoder, int i8, p builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        kotlin.jvm.internal.q.f(builder, "builder");
        builder.e(decoder.A(getDescriptor(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p k(char[] cArr) {
        kotlin.jvm.internal.q.f(cArr, "<this>");
        return new p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.w1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(l7.d encoder, char[] content, int i8) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.x(getDescriptor(), i9, content[i9]);
        }
    }
}
