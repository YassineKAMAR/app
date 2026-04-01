package f6;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class p extends o {
    public static <T> int m(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i8;
    }

    public static final <T> Integer n(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
