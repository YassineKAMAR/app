package androidx.lifecycle;

import androidx.lifecycle.d;
import y6.o1;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h6.g f2618b;

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        if (b().b().compareTo(d.b.DESTROYED) <= 0) {
            b().c(this);
            o1.d(d(), null, 1, null);
        }
    }

    public d b() {
        return this.f2617a;
    }

    @Override // y6.e0
    public h6.g d() {
        return this.f2618b;
    }
}
