package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements i7.b<e6.i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x2 f25036b = new x2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ k1<e6.i0> f25037a = new k1<>("kotlin.Unit", e6.i0.f21430a);

    private x2() {
    }

    public void a(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        this.f25037a.deserialize(decoder);
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, e6.i0 value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        this.f25037a.serialize(encoder, value);
    }

    @Override // i7.a
    public /* bridge */ /* synthetic */ Object deserialize(l7.e eVar) {
        a(eVar);
        return e6.i0.f21430a;
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f25037a.getDescriptor();
    }
}
