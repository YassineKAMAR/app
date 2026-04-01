package f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class t extends s {
    public static <T> boolean p(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z7 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    public static final <T> Collection<T> q(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : w.U(iterable);
    }

    public static final <T> boolean r(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        return collection.removeAll(q(elements));
    }

    public static <T> T s(List<T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(o.f(list));
    }

    public static final <T> boolean t(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        return collection.retainAll(q(elements));
    }
}
