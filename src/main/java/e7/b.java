package e7;

import d7.l0;
import e6.s;
import e6.t;
import h6.d;
import h6.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.d0;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r8, d<? super T> dVar) {
        Object objA;
        d dVarA = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object objC = l0.c(context, null);
            try {
                objA = ((p) d0.a(pVar, 2)).invoke(r8, dVarA);
                if (objA == i6.d.e()) {
                    return;
                }
            } finally {
                l0.a(context, objC);
            }
        } catch (Throwable th) {
            s.a aVar = s.f21442b;
            objA = t.a(th);
        }
        dVarA.resumeWith(s.b(objA));
    }
}
