package b7;

import e6.i0;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
final class f<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p<c<? super T>, h6.d<? super i0>, Object> f3398a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super h6.d<? super i0>, ? extends Object> pVar) {
        this.f3398a = pVar;
    }

    @Override // b7.a
    public Object b(c<? super T> cVar, h6.d<? super i0> dVar) {
        Object objInvoke = this.f3398a.invoke(cVar, dVar);
        return objInvoke == i6.d.e() ? objInvoke : i0.f21430a;
    }
}
