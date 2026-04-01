package n7;

import e6.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final a a(a from, p6.l<? super d, i0> builderAction) {
        kotlin.jvm.internal.q.f(from, "from");
        kotlin.jvm.internal.q.f(builderAction, "builderAction");
        d dVar = new d(from);
        builderAction.invoke(dVar);
        return new m(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, p6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = a.f25157d;
        }
        return a(aVar, lVar);
    }
}
