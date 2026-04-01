package e7;

import d7.k;
import e6.i0;
import e6.s;
import e6.t;
import h6.d;
import i6.c;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) throws Throwable {
        s.a aVar = s.f21442b;
        dVar.resumeWith(s.b(t.a(th)));
        throw th;
    }

    public static final void b(d<? super i0> dVar, d<?> dVar2) throws Throwable {
        try {
            d dVarC = c.c(dVar);
            s.a aVar = s.f21442b;
            k.c(dVarC, s.b(i0.f21430a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r8, d<? super T> dVar, l<? super Throwable, i0> lVar) throws Throwable {
        try {
            d dVarC = c.c(c.a(pVar, r8, dVar));
            s.a aVar = s.f21442b;
            k.b(dVarC, s.b(i0.f21430a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i8, Object obj2) throws Throwable {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
