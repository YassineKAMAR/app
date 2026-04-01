package f6;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o0 {
    public static <T> Set<T> a(T t7) {
        Set<T> setSingleton = Collections.singleton(t7);
        kotlin.jvm.internal.q.e(setSingleton, "singleton(element)");
        return setSingleton;
    }
}
