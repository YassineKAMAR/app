package f6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class s extends r {
    public static final <T> void o(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.q.f(list, "<this>");
        kotlin.jvm.internal.q.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
