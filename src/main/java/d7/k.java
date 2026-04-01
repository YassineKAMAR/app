package d7;

import e6.s;
import java.util.concurrent.CancellationException;
import y6.b2;
import y6.d2;
import y6.j1;
import y6.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f21031a = new h0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f21032b = new h0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(h6.d<? super T> dVar, Object obj, p6.l<? super Throwable, e6.i0> lVar) {
        boolean z7;
        if (!(dVar instanceof j)) {
            dVar.resumeWith(obj);
            return;
        }
        j jVar = (j) dVar;
        Object objB = y6.y.b(obj, lVar);
        if (jVar.f21026d.f0(jVar.getContext())) {
            jVar.f21028f = objB;
            jVar.f27517c = 1;
            jVar.f21026d.e0(jVar.getContext(), jVar);
            return;
        }
        v0 v0VarA = b2.f27479a.a();
        if (v0VarA.n0()) {
            jVar.f21028f = objB;
            jVar.f27517c = 1;
            v0VarA.j0(jVar);
            return;
        }
        v0VarA.l0(true);
        try {
            j1 j1Var = (j1) jVar.getContext().a(j1.V);
            if (j1Var == null || j1Var.c()) {
                z7 = false;
            } else {
                CancellationException cancellationExceptionZ = j1Var.z();
                jVar.a(objB, cancellationExceptionZ);
                s.a aVar = e6.s.f21442b;
                jVar.resumeWith(e6.s.b(e6.t.a(cancellationExceptionZ)));
                z7 = true;
            }
            if (!z7) {
                h6.d<T> dVar2 = jVar.f21027e;
                Object obj2 = jVar.f21029g;
                h6.g context = dVar2.getContext();
                Object objC = l0.c(context, obj2);
                d2<?> d2VarF = objC != l0.f21034a ? y6.a0.f(dVar2, context, objC) : null;
                try {
                    jVar.f21027e.resumeWith(obj);
                    e6.i0 i0Var = e6.i0.f21430a;
                    if (d2VarF == null || d2VarF.C0()) {
                        l0.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (d2VarF == null || d2VarF.C0()) {
                        l0.a(context, objC);
                    }
                    throw th;
                }
            }
            while (v0VarA.p0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(h6.d dVar, Object obj, p6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
