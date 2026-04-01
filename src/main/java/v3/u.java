package v3;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : w.g(iterable.iterator());
    }

    public static <T> T b(Iterable<? extends T> iterable, T t7) {
        return (T) v.c(iterable.iterator(), t7);
    }

    static Object[] c(Iterable<?> iterable) {
        return a(iterable).toArray();
    }
}
