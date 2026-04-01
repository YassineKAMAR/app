package x3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import u3.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    private static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f27301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x3.a<? super V> f27302b;

        a(Future<V> future, x3.a<? super V> aVar) {
            this.f27301a = future;
            this.f27302b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f27301a;
            if ((future instanceof y3.a) && (thA = y3.b.a((y3.a) future)) != null) {
                this.f27302b.b(thA);
                return;
            }
            try {
                this.f27302b.a(b.b(this.f27301a));
            } catch (Error e8) {
                e = e8;
                this.f27302b.b(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f27302b.b(e);
            } catch (ExecutionException e10) {
                this.f27302b.b(e10.getCause());
            }
        }

        public String toString() {
            return u3.d.a(this).c(this.f27302b).toString();
        }
    }

    public static <V> void a(d<V> dVar, x3.a<? super V> aVar, Executor executor) {
        h.i(aVar);
        dVar.c(new a(dVar, aVar), executor);
    }

    public static <V> V b(Future<V> future) {
        h.o(future.isDone(), "Future was expected to be done: %s", future);
        return (V) e.a(future);
    }
}
