package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class v<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p6.a<? extends T> f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f21451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21452c;

    public v(p6.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.q.f(initializer, "initializer");
        this.f21450a = initializer;
        this.f21451b = e0.f21418a;
        this.f21452c = obj == null ? this : obj;
    }

    public /* synthetic */ v(p6.a aVar, Object obj, int i8, kotlin.jvm.internal.j jVar) {
        this(aVar, (i8 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f21451b != e0.f21418a;
    }

    @Override // e6.k
    public T getValue() {
        T tInvoke;
        T t7 = (T) this.f21451b;
        e0 e0Var = e0.f21418a;
        if (t7 != e0Var) {
            return t7;
        }
        synchronized (this.f21452c) {
            tInvoke = (T) this.f21451b;
            if (tInvoke == e0Var) {
                p6.a<? extends T> aVar = this.f21450a;
                kotlin.jvm.internal.q.c(aVar);
                tInvoke = aVar.invoke();
                this.f21451b = tInvoke;
                this.f21450a = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
