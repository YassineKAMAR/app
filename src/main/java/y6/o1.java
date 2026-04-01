package y6;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o1 {
    public static final s a(j1 j1Var) {
        return new m1(j1Var);
    }

    public static /* synthetic */ s b(j1 j1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j1Var = null;
        }
        return n1.a(j1Var);
    }

    public static final void c(h6.g gVar, CancellationException cancellationException) {
        j1 j1Var = (j1) gVar.a(j1.V);
        if (j1Var != null) {
            j1Var.Y(cancellationException);
        }
    }

    public static /* synthetic */ void d(h6.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        n1.c(gVar, cancellationException);
    }

    public static final void e(h6.g gVar) {
        j1 j1Var = (j1) gVar.a(j1.V);
        if (j1Var != null) {
            n1.f(j1Var);
        }
    }

    public static final void f(j1 j1Var) {
        if (!j1Var.c()) {
            throw j1Var.z();
        }
    }
}
