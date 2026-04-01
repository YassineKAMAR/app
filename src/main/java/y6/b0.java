package y6;

import h6.e;
import h6.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 extends h6.a implements h6.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27475b = new a(null);

    public static final class a extends h6.b<h6.e, b0> {

        /* JADX INFO: renamed from: y6.b0$a$a, reason: collision with other inner class name */
        static final class C0195a extends kotlin.jvm.internal.r implements p6.l<g.b, b0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0195a f27476a = new C0195a();

            C0195a() {
                super(1);
            }

            @Override // p6.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b0 invoke(g.b bVar) {
                if (bVar instanceof b0) {
                    return (b0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(h6.e.T, C0195a.f27476a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public b0() {
        super(h6.e.T);
    }

    @Override // h6.a, h6.g
    public h6.g E(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    @Override // h6.a, h6.g.b, h6.g
    public <E extends g.b> E a(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    public abstract void e0(h6.g gVar, Runnable runnable);

    public boolean f0(h6.g gVar) {
        return true;
    }

    public b0 g0(int i8) {
        d7.p.a(i8);
        return new d7.o(this, i8);
    }

    @Override // h6.e
    public final void h(h6.d<?> dVar) {
        kotlin.jvm.internal.q.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((d7.j) dVar).o();
    }

    @Override // h6.e
    public final <T> h6.d<T> o(h6.d<? super T> dVar) {
        return new d7.j(this, dVar);
    }

    public String toString() {
        return i0.a(this) + '@' + i0.b(this);
    }
}
