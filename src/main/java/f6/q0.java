package f6;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class q0 extends p0 {
    public static <T> Set<T> e(Set<? extends T> set, Iterable<? extends T> elements) {
        kotlin.jvm.internal.q.f(set, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        Collection<?> collectionQ = t.q(elements);
        if (collectionQ.isEmpty()) {
            return w.Y(set);
        }
        if (!(collectionQ instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionQ);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t7 : set) {
            if (!collectionQ.contains(t7)) {
                linkedHashSet2.add(t7);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> f(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.q.f(set, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        Integer numN = p.n(elements);
        if (numN != null) {
            size = set.size() + numN.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(j0.b(size));
        linkedHashSet.addAll(set);
        t.p(linkedHashSet, elements);
        return linkedHashSet;
    }
}
