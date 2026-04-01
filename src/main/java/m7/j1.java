package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class j1<T> implements i7.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.b<T> f24944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f24945b;

    public j1(i7.b<T> serializer) {
        kotlin.jvm.internal.q.f(serializer, "serializer");
        this.f24944a = serializer;
        this.f24945b = new a2(serializer.getDescriptor());
    }

    @Override // i7.a
    public T deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return decoder.u() ? (T) decoder.e(this.f24944a) : (T) decoder.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.q.b(kotlin.jvm.internal.z.b(j1.class), kotlin.jvm.internal.z.b(obj.getClass())) && kotlin.jvm.internal.q.b(this.f24944a, ((j1) obj).f24944a);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24945b;
    }

    public int hashCode() {
        return this.f24944a.hashCode();
    }

    @Override // i7.j
    public void serialize(l7.f encoder, T t7) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        if (t7 == null) {
            encoder.e();
        } else {
            encoder.r();
            encoder.q(this.f24944a, t7);
        }
    }
}
