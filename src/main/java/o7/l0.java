package o7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class l0 extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n7.t f25344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f25345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f25346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25347n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n7.a json, n7.t value) {
        super(json, value, null, null, 12, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(value, "value");
        this.f25344k = value;
        List<String> listU = f6.w.U(s0().keySet());
        this.f25345l = listU;
        this.f25346m = listU.size() * 2;
        this.f25347n = -1;
    }

    @Override // o7.h0, m7.g1
    protected String a0(k7.f desc, int i8) {
        kotlin.jvm.internal.q.f(desc, "desc");
        return this.f25345l.get(i8 / 2);
    }

    @Override // o7.h0, o7.c, l7.c
    public void d(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
    }

    @Override // o7.h0, o7.c
    protected n7.h e0(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        return this.f25347n % 2 == 0 ? n7.i.c(tag) : (n7.h) f6.k0.f(s0(), tag);
    }

    @Override // o7.h0, l7.c
    public int s(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        int i8 = this.f25347n;
        if (i8 >= this.f25346m - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f25347n = i9;
        return i9;
    }

    @Override // o7.h0, o7.c
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public n7.t s0() {
        return this.f25344k;
    }
}
