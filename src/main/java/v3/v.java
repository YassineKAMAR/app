package v3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends q0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f26933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f26934b;

        a(Object obj) {
            this.f26934b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26933a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f26933a) {
                throw new NoSuchElementException();
            }
            this.f26933a = true;
            return (T) this.f26934b;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        u3.h.i(collection);
        u3.h.i(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !u3.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> T c(Iterator<? extends T> it, T t7) {
        return it.hasNext() ? it.next() : t7;
    }

    public static <T> q0<T> d(T t7) {
        return new a(t7);
    }
}
