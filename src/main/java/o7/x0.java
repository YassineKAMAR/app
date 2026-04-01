package o7;

import k7.j;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    static final class a extends kotlin.jvm.internal.r implements p6.l<n7.h, e6.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y<n7.h> f25394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.y<n7.h> yVar) {
            super(1);
            this.f25394a = yVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(n7.h it) {
            kotlin.jvm.internal.q.f(it, "it");
            this.f25394a.f24325a = it;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(n7.h hVar) {
            a(hVar);
            return e6.i0.f21430a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(k7.f fVar) {
        return (fVar.e() instanceof k7.e) || fVar.e() == j.b.f24281a;
    }

    public static final <T> n7.h c(n7.a aVar, T t7, i7.j<? super T> serializer) {
        kotlin.jvm.internal.q.f(aVar, "<this>");
        kotlin.jvm.internal.q.f(serializer, "serializer");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        new i0(aVar, new a(yVar)).q(serializer, t7);
        T t8 = yVar.f24325a;
        if (t8 != null) {
            return (n7.h) t8;
        }
        kotlin.jvm.internal.q.t("result");
        return null;
    }
}
