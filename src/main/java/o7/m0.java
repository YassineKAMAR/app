package o7;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class m0 extends i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f25348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25349h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n7.a json, p6.l<? super n7.h, e6.i0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(nodeConsumer, "nodeConsumer");
        this.f25349h = true;
    }

    @Override // o7.i0, o7.d
    public n7.h q0() {
        return new n7.t(s0());
    }

    @Override // o7.i0, o7.d
    public void r0(String key, n7.h element) {
        boolean z7;
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(element, "element");
        if (!this.f25349h) {
            Map<String, n7.h> mapS0 = s0();
            String str = this.f25348g;
            if (str == null) {
                kotlin.jvm.internal.q.t("tag");
                str = null;
            }
            mapS0.put(str, element);
            z7 = true;
        } else {
            if (!(element instanceof n7.v)) {
                if (element instanceof n7.t) {
                    throw b0.d(n7.u.f25216a.getDescriptor());
                }
                if (!(element instanceof n7.b)) {
                    throw new e6.p();
                }
                throw b0.d(n7.c.f25163a.getDescriptor());
            }
            this.f25348g = ((n7.v) element).a();
            z7 = false;
        }
        this.f25349h = z7;
    }
}
