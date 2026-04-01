package i6;

import e6.i0;
import e6.t;
import h6.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f22561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f22562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h6.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f22561b = pVar;
            this.f22562c = obj;
            q.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f22560a;
            if (i8 == 0) {
                this.f22560a = 1;
                t.b(obj);
                q.d(this.f22561b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) d0.a(this.f22561b, 2)).invoke(this.f22562c, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f22560a = 2;
            t.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f22564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f22565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h6.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f22564b = pVar;
            this.f22565c = obj;
            q.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i8 = this.f22563a;
            if (i8 == 0) {
                this.f22563a = 1;
                t.b(obj);
                q.d(this.f22564b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) d0.a(this.f22564b, 2)).invoke(this.f22565c, this);
            }
            if (i8 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f22563a = 2;
            t.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: i6.c$c, reason: collision with other inner class name */
    public static final class C0121c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0121c(h6.d<? super T> dVar) {
            super(dVar);
            q.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            t.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h6.d<? super T> dVar, g gVar) {
            super(dVar, gVar);
            q.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            t.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> h6.d<i0> a(p<? super R, ? super h6.d<? super T>, ? extends Object> pVar, R r8, h6.d<? super T> completion) {
        q.f(pVar, "<this>");
        q.f(completion, "completion");
        h6.d<?> dVarA = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r8, dVarA);
        }
        g context = dVarA.getContext();
        return context == h6.h.f22443a ? new a(dVarA, pVar, r8) : new b(dVarA, context, pVar, r8);
    }

    private static final <T> h6.d<T> b(h6.d<? super T> dVar) {
        g context = dVar.getContext();
        return context == h6.h.f22443a ? new C0121c(dVar) : new d(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> h6.d<T> c(h6.d<? super T> dVar) {
        h6.d<T> dVar2;
        q.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (h6.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }

    public static <R, P, T> Object d(p6.q<? super R, ? super P, ? super h6.d<? super T>, ? extends Object> qVar, R r8, P p8, h6.d<? super T> completion) {
        q.f(qVar, "<this>");
        q.f(completion, "completion");
        return ((p6.q) d0.a(qVar, 3)).invoke(r8, p8, b(h.a(completion)));
    }
}
