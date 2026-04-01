package p7;

import f6.o;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    private c() {
    }

    public /* synthetic */ c(j jVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i7.b c(c cVar, u6.c cVar2, List list, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i8 & 2) != 0) {
            list = o.d();
        }
        return cVar.b(cVar2, list);
    }

    public abstract void a(e eVar);

    public abstract <T> i7.b<T> b(u6.c<T> cVar, List<? extends i7.b<?>> list);

    public abstract <T> i7.a<? extends T> d(u6.c<? super T> cVar, String str);

    public abstract <T> i7.j<T> e(u6.c<? super T> cVar, T t7);
}
