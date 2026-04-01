package d7;

import y6.a2;

/* JADX INFO: loaded from: classes2.dex */
final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6.g f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f21053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a2<Object>[] f21054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21055d;

    public p0(h6.g gVar, int i8) {
        this.f21052a = gVar;
        this.f21053b = new Object[i8];
        this.f21054c = new a2[i8];
    }

    public final void a(a2<?> a2Var, Object obj) {
        Object[] objArr = this.f21053b;
        int i8 = this.f21055d;
        objArr[i8] = obj;
        a2<Object>[] a2VarArr = this.f21054c;
        this.f21055d = i8 + 1;
        kotlin.jvm.internal.q.d(a2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        a2VarArr[i8] = a2Var;
    }

    public final void b(h6.g gVar) {
        int length = this.f21054c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            a2<Object> a2Var = this.f21054c[length];
            kotlin.jvm.internal.q.c(a2Var);
            a2Var.q(gVar, this.f21053b[length]);
            if (i8 < 0) {
                return;
            } else {
                length = i8;
            }
        }
    }
}
