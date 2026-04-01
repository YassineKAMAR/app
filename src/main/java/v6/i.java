package v6;

import java.util.Iterator;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T, R> implements b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f26983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<T, R> f26984b;

    public static final class a implements Iterator<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f26985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i<T, R> f26986b;

        a(i<T, R> iVar) {
            this.f26986b = iVar;
            this.f26985a = ((i) iVar).f26983a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26985a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((i) this.f26986b).f26984b.invoke(this.f26985a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> sequence, l<? super T, ? extends R> transformer) {
        q.f(sequence, "sequence");
        q.f(transformer, "transformer");
        this.f26983a = sequence;
        this.f26984b = transformer;
    }

    @Override // v6.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
