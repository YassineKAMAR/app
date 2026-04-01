package o7;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class i0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, n7.h> f25334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n7.a json, p6.l<? super n7.h, e6.i0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(nodeConsumer, "nodeConsumer");
        this.f25334f = new LinkedHashMap();
    }

    @Override // m7.i2, l7.d
    public <T> void f(k7.f descriptor, int i8, i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (t7 != null || this.f25312d.f()) {
            super.f(descriptor, i8, serializer, t7);
        }
    }

    @Override // o7.d
    public n7.h q0() {
        return new n7.t(this.f25334f);
    }

    @Override // o7.d
    public void r0(String key, n7.h element) {
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(element, "element");
        this.f25334f.put(key, element);
    }

    protected final Map<String, n7.h> s0() {
        return this.f25334f;
    }
}
