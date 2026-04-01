package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class j0<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p6.a<? extends T> f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f21433b;

    public j0(p6.a<? extends T> initializer) {
        kotlin.jvm.internal.q.f(initializer, "initializer");
        this.f21432a = initializer;
        this.f21433b = e0.f21418a;
    }

    public boolean a() {
        return this.f21433b != e0.f21418a;
    }

    @Override // e6.k
    public T getValue() {
        if (this.f21433b == e0.f21418a) {
            p6.a<? extends T> aVar = this.f21432a;
            kotlin.jvm.internal.q.c(aVar);
            this.f21433b = aVar.invoke();
            this.f21432a = null;
        }
        return (T) this.f21433b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
