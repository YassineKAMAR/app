package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements g {
    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        kotlin.jvm.internal.q.f(source, "source");
        kotlin.jvm.internal.q.f(event, "event");
        if (event == d.a.ON_CREATE) {
            source.a().c(this);
            throw null;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
