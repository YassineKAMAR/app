package v6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<b<T>> f26980a;

    public a(b<? extends T> sequence) {
        q.f(sequence, "sequence");
        this.f26980a = new AtomicReference<>(sequence);
    }

    @Override // v6.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f26980a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
