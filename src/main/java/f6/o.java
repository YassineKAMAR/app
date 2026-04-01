package f6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static final <T> Collection<T> c(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return new d(tArr, false);
    }

    public static <T> List<T> d() {
        return y.f21810a;
    }

    public static t6.f e(Collection<?> collection) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        return new t6.f(0, collection.size() - 1);
    }

    public static <T> int f(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> g(T... elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return elements.length > 0 ? i.c(elements) : d();
    }

    public static <T> List<T> h(T t7) {
        return t7 != null ? n.b(t7) : d();
    }

    public static <T> List<T> i(T... elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return j.p(elements);
    }

    public static <T> List<T> j(T... elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new d(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> k(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : n.b(list.get(0)) : d();
    }

    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
