package e6;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
final class d<T, R> extends c<T, R> implements h6.d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p6.q<? super c<?, ?>, Object, ? super h6.d<Object>, ? extends Object> f21411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f21412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h6.d<Object> f21413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f21414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p6.q<? super c<T, R>, ? super T, ? super h6.d<? super R>, ? extends Object> block, T t7) {
        super(null);
        kotlin.jvm.internal.q.f(block, "block");
        this.f21411a = block;
        this.f21412b = t7;
        kotlin.jvm.internal.q.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f21413c = this;
        this.f21414d = b.f21405a;
    }

    @Override // e6.c
    public Object a(T t7, h6.d<? super R> dVar) {
        kotlin.jvm.internal.q.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f21413c = dVar;
        this.f21412b = t7;
        Object objE = i6.d.e();
        if (objE == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objE;
    }

    public final R c() throws Throwable {
        Object objA;
        while (true) {
            R r8 = (R) this.f21414d;
            h6.d<Object> dVar = this.f21413c;
            if (dVar == null) {
                t.b(r8);
                return r8;
            }
            if (s.d(b.f21405a, r8)) {
                try {
                    p6.q<? super c<?, ?>, Object, ? super h6.d<Object>, ? extends Object> qVar = this.f21411a;
                    Object obj = this.f21412b;
                    objA = !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? i6.c.d(qVar, this, obj, dVar) : ((p6.q) kotlin.jvm.internal.d0.a(qVar, 3)).invoke(this, obj, dVar);
                } catch (Throwable th) {
                    s.a aVar = s.f21442b;
                    objA = t.a(th);
                }
                if (objA != i6.d.e()) {
                    r8 = (R) s.b(objA);
                }
            } else {
                this.f21414d = b.f21405a;
            }
            dVar.resumeWith(r8);
        }
    }

    @Override // h6.d
    public h6.g getContext() {
        return h6.h.f22443a;
    }

    @Override // h6.d
    public void resumeWith(Object obj) {
        this.f21413c = null;
        this.f21414d = obj;
    }
}
