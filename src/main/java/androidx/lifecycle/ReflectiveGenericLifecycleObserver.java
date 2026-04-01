package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.C0032a f2638b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2637a = obj;
        this.f2638b = a.f2641c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, d.a aVar) {
        this.f2638b.a(iVar, aVar, this.f2637a);
    }
}
