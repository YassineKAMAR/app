package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2640a;

    public SingleGeneratedAdapterObserver(c generatedAdapter) {
        kotlin.jvm.internal.q.f(generatedAdapter, "generatedAdapter");
        this.f2640a = generatedAdapter;
    }

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        this.f2640a.a(source, event, false, null);
        this.f2640a.a(source, event, true, null);
    }
}
