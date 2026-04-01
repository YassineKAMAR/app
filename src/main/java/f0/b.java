package f0;

import f0.a;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public b(a initialExtras) {
        q.f(initialExtras, "initialExtras");
        a().putAll(initialExtras.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void b(a.b<T> key, T t7) {
        q.f(key, "key");
        a().put(key, t7);
    }
}
