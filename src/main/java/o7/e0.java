package o7;

/* JADX INFO: loaded from: classes2.dex */
final class e0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n7.h f25322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n7.a json, p6.l<? super n7.h, e6.i0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(nodeConsumer, "nodeConsumer");
        Y("primitive");
    }

    @Override // o7.d
    public n7.h q0() {
        n7.h hVar = this.f25322f;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // o7.d
    public void r0(String key, n7.h element) {
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(element, "element");
        if (!(key == "primitive")) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (!(this.f25322f == null)) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f25322f = element;
    }
}
