package d7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i8, kotlin.jvm.internal.j jVar) {
        if ((i8 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e8) {
        if (obj == null) {
            return a(e8);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e8);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e8);
        return a(arrayList);
    }
}
