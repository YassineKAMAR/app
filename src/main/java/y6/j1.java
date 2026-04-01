package y6;

import h6.g;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public interface j1 extends g.b {
    public static final b V = b.f27503a;

    public static final class a {
        public static /* synthetic */ void a(j1 j1Var, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            j1Var.Y(cancellationException);
        }

        public static <R> R b(j1 j1Var, R r8, p6.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(j1Var, r8, pVar);
        }

        public static <E extends g.b> E c(j1 j1Var, g.c<E> cVar) {
            return (E) g.b.a.b(j1Var, cVar);
        }

        public static /* synthetic */ t0 d(j1 j1Var, boolean z7, boolean z8, p6.l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return j1Var.w(z7, z8, lVar);
        }

        public static h6.g e(j1 j1Var, g.c<?> cVar) {
            return g.b.a.c(j1Var, cVar);
        }

        public static h6.g f(j1 j1Var, h6.g gVar) {
            return g.b.a.d(j1Var, gVar);
        }
    }

    public static final class b implements g.c<j1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f27503a = new b();

        private b() {
        }
    }

    t0 G(p6.l<? super Throwable, e6.i0> lVar);

    p N(r rVar);

    void Y(CancellationException cancellationException);

    boolean c();

    j1 getParent();

    boolean start();

    t0 w(boolean z7, boolean z8, p6.l<? super Throwable, e6.i0> lVar);

    CancellationException z();
}
