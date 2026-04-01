package c7;

import e6.i0;
import e6.s;
import h6.g;
import h6.h;
import kotlin.jvm.internal.r;
import p6.p;
import p6.q;
import w6.o;
import y6.n1;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> extends kotlin.coroutines.jvm.internal.d implements b7.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.c<T> f3487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f3490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h6.d<? super i0> f3491e;

    static final class a extends r implements p<Integer, g.b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3492a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(b7.c<? super T> cVar, g gVar) {
        super(b.f3485a, h.f22443a);
        this.f3487a = cVar;
        this.f3488b = gVar;
        this.f3489c = ((Number) gVar.P(0, a.f3492a)).intValue();
    }

    private final void a(g gVar, g gVar2, T t7) {
        if (gVar2 instanceof c7.a) {
            d((c7.a) gVar2, t7);
        }
        e.a(this, gVar);
    }

    private final Object c(h6.d<? super i0> dVar, T t7) {
        g context = dVar.getContext();
        n1.e(context);
        g gVar = this.f3490d;
        if (gVar != context) {
            a(context, gVar, t7);
            this.f3490d = context;
        }
        this.f3491e = dVar;
        q qVar = d.f3493a;
        b7.c<T> cVar = this.f3487a;
        kotlin.jvm.internal.q.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.q.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(cVar, t7, this);
        if (!kotlin.jvm.internal.q.b(objInvoke, i6.d.e())) {
            this.f3491e = null;
        }
        return objInvoke;
    }

    private final void d(c7.a aVar, Object obj) {
        throw new IllegalStateException(o.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f3483a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // b7.c
    public Object emit(T t7, h6.d<? super i0> dVar) {
        try {
            Object objC = c(dVar, t7);
            if (objC == i6.d.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objC == i6.d.e() ? objC : i0.f21430a;
        } catch (Throwable th) {
            this.f3490d = new c7.a(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        h6.d<? super i0> dVar = this.f3491e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, h6.d
    public g getContext() {
        g gVar = this.f3490d;
        return gVar == null ? h.f22443a : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable thE = s.e(obj);
        if (thE != null) {
            this.f3490d = new c7.a(thE, getContext());
        }
        h6.d<? super i0> dVar = this.f3491e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return i6.d.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
