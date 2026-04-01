package o7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class k0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<n7.h> f25343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n7.a json, p6.l<? super n7.h, e6.i0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(nodeConsumer, "nodeConsumer");
        this.f25343f = new ArrayList<>();
    }

    @Override // m7.h1
    protected String a0(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // o7.d
    public n7.h q0() {
        return new n7.b(this.f25343f);
    }

    @Override // o7.d
    public void r0(String key, n7.h element) {
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(element, "element");
        this.f25343f.add(Integer.parseInt(key), element);
    }
}
