package c7;

import e6.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.o;
import p6.q;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<b7.c<Object>, Object, h6.d<? super i0>, Object> f3493a;

    /* synthetic */ class a extends o implements q<b7.c<? super Object>, Object, h6.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3494a = new a();

        a() {
            super(3, b7.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p6.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b7.c<Object> cVar, Object obj, h6.d<? super i0> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f3494a;
        kotlin.jvm.internal.q.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f3493a = (q) d0.a(aVar, 3);
    }
}
