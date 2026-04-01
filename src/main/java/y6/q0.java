package y6;

import e6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {
    public static final <T> void a(p0<? super T> p0Var, int i8) {
        h6.d<? super T> dVarD = p0Var.d();
        boolean z7 = i8 == 4;
        if (z7 || !(dVarD instanceof d7.j) || b(i8) != b(p0Var.f27517c)) {
            d(p0Var, dVarD, z7);
            return;
        }
        b0 b0Var = ((d7.j) dVarD).f21026d;
        h6.g context = dVarD.getContext();
        if (b0Var.f0(context)) {
            b0Var.e0(context, p0Var);
        } else {
            e(p0Var);
        }
    }

    public static final boolean b(int i8) {
        return i8 == 1 || i8 == 2;
    }

    public static final boolean c(int i8) {
        return i8 == 2;
    }

    public static final <T> void d(p0<? super T> p0Var, h6.d<? super T> dVar, boolean z7) {
        Object objG;
        Object objI = p0Var.i();
        Throwable thF = p0Var.f(objI);
        if (thF != null) {
            s.a aVar = e6.s.f21442b;
            objG = e6.t.a(thF);
        } else {
            s.a aVar2 = e6.s.f21442b;
            objG = p0Var.g(objI);
        }
        Object objB = e6.s.b(objG);
        if (!z7) {
            dVar.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.q.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        d7.j jVar = (d7.j) dVar;
        h6.d<T> dVar2 = jVar.f21027e;
        Object obj = jVar.f21029g;
        h6.g context = dVar2.getContext();
        Object objC = d7.l0.c(context, obj);
        d2<?> d2VarF = objC != d7.l0.f21034a ? a0.f(dVar2, context, objC) : null;
        try {
            jVar.f21027e.resumeWith(objB);
            e6.i0 i0Var = e6.i0.f21430a;
        } finally {
            if (d2VarF == null || d2VarF.C0()) {
                d7.l0.a(context, objC);
            }
        }
    }

    private static final void e(p0<?> p0Var) {
        v0 v0VarA = b2.f27479a.a();
        if (v0VarA.n0()) {
            v0VarA.j0(p0Var);
            return;
        }
        v0VarA.l0(true);
        try {
            d(p0Var, p0Var.d(), true);
            do {
            } while (v0VarA.p0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
