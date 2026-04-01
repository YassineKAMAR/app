package f6;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class p0 extends o0 {
    public static <T> Set<T> b() {
        return a0.f21787a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        kotlin.jvm.internal.q.f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : o0.a(set.iterator().next()) : b();
    }

    public static <T> Set<T> d(T... elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return elements.length > 0 ? j.E(elements) : b();
    }
}
