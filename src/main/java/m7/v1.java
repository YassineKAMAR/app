package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(k7.f primitive) {
        super(primitive, null);
        kotlin.jvm.internal.q.f(primitive, "primitive");
        this.f25024c = primitive.a() + "Array";
    }

    @Override // k7.f
    public String a() {
        return this.f25024c;
    }
}
