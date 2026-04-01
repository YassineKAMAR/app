package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<T> f1253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f1254c = androidx.concurrent.futures.d.A();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1255d;

        a() {
        }

        private void d() {
            this.f1252a = null;
            this.f1253b = null;
            this.f1254c = null;
        }

        void a() {
            this.f1252a = null;
            this.f1253b = null;
            this.f1254c.w(null);
        }

        public boolean b(T t7) {
            this.f1255d = true;
            d<T> dVar = this.f1253b;
            boolean z7 = dVar != null && dVar.b(t7);
            if (z7) {
                d();
            }
            return z7;
        }

        public boolean c() {
            this.f1255d = true;
            d<T> dVar = this.f1253b;
            boolean z7 = dVar != null && dVar.a(true);
            if (z7) {
                d();
            }
            return z7;
        }

        public boolean e(Throwable th) {
            this.f1255d = true;
            d<T> dVar = this.f1253b;
            boolean z7 = dVar != null && dVar.d(th);
            if (z7) {
                d();
            }
            return z7;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f1253b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1252a));
            }
            if (this.f1255d || (dVar = this.f1254c) == null) {
                return;
            }
            dVar.w(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0016c<T> {
        Object a(a<T> aVar);
    }

    private static final class d<T> implements x3.d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f1256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f1257b = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String t() {
                a<T> aVar = d.this.f1256a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1252a + "]";
            }
        }

        d(a<T> aVar) {
            this.f1256a = new WeakReference<>(aVar);
        }

        boolean a(boolean z7) {
            return this.f1257b.cancel(z7);
        }

        boolean b(T t7) {
            return this.f1257b.w(t7);
        }

        @Override // x3.d
        public void c(Runnable runnable, Executor executor) {
            this.f1257b.c(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            a<T> aVar = this.f1256a.get();
            boolean zCancel = this.f1257b.cancel(z7);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        boolean d(Throwable th) {
            return this.f1257b.x(th);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f1257b.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j8, TimeUnit timeUnit) {
            return this.f1257b.get(j8, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1257b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1257b.isDone();
        }

        public String toString() {
            return this.f1257b.toString();
        }
    }

    public static <T> x3.d<T> a(InterfaceC0016c<T> interfaceC0016c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f1253b = dVar;
        aVar.f1252a = interfaceC0016c.getClass();
        try {
            Object objA = interfaceC0016c.a(aVar);
            if (objA != null) {
                aVar.f1252a = objA;
            }
        } catch (Exception e8) {
            dVar.d(e8);
        }
        return dVar;
    }
}
