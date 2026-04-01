package b7;

import e6.i0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: renamed from: b7.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    static final class C0056a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f3396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3397d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0056a(a<T> aVar, h6.d<? super C0056a> dVar) {
            super(dVar);
            this.f3396c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3395b = obj;
            this.f3397d |= Integer.MIN_VALUE;
            return this.f3396c.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(b7.c<? super T> r6, h6.d<? super e6.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b7.a.C0056a
            if (r0 == 0) goto L13
            r0 = r7
            b7.a$a r0 = (b7.a.C0056a) r0
            int r1 = r0.f3397d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3397d = r1
            goto L18
        L13:
            b7.a$a r0 = new b7.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f3395b
            java.lang.Object r1 = i6.b.e()
            int r2 = r0.f3397d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f3394a
            c7.c r6 = (c7.c) r6
            e6.t.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e6.t.b(r7)
            c7.c r7 = new c7.c
            h6.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f3394a = r7     // Catch: java.lang.Throwable -> L55
            r0.f3397d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            e6.i0 r6 = e6.i0.f21430a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a.a(b7.c, h6.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, h6.d<? super i0> dVar);
}
