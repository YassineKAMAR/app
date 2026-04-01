package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c[] f2610a;

    public CompositeGeneratedAdaptersObserver(c[] generatedAdapters) {
        kotlin.jvm.internal.q.f(generatedAdapters, "generatedAdapters");
        this.f2610a = generatedAdapters;
    }

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        n nVar = new n();
        for (c cVar : this.f2610a) {
            cVar.a(source, event, false, nVar);
        }
        for (c cVar2 : this.f2610a) {
            cVar2.a(source, event, true, nVar);
        }
    }
}
