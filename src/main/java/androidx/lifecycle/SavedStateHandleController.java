package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2639a;

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        if (event == d.a.ON_DESTROY) {
            this.f2639a = false;
            source.a().c(this);
        }
    }

    public final void b(androidx.savedstate.a registry, d lifecycle) {
        kotlin.jvm.internal.q.f(registry, "registry");
        kotlin.jvm.internal.q.f(lifecycle, "lifecycle");
        if (!(!this.f2639a)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f2639a = true;
        lifecycle.a(this);
        throw null;
    }

    public final boolean c() {
        return this.f2639a;
    }
}
