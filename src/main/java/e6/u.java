package e6;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class u<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21445d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<u<?>, Object> f21446e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile p6.a<? extends T> f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f21448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21449c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public u(p6.a<? extends T> initializer) {
        kotlin.jvm.internal.q.f(initializer, "initializer");
        this.f21447a = initializer;
        e0 e0Var = e0.f21418a;
        this.f21448b = e0Var;
        this.f21449c = e0Var;
    }

    public boolean a() {
        return this.f21448b != e0.f21418a;
    }

    @Override // e6.k
    public T getValue() {
        T t7 = (T) this.f21448b;
        e0 e0Var = e0.f21418a;
        if (t7 != e0Var) {
            return t7;
        }
        p6.a<? extends T> aVar = this.f21447a;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f21446e, this, e0Var, tInvoke)) {
                this.f21447a = null;
                return tInvoke;
            }
        }
        return (T) this.f21448b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
