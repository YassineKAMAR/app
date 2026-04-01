package h6;

import h6.g;
import h6.g.b;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<g.b, E> f22436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.c<?> f22437b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [h6.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p6.l<? super h6.g$b, ? extends E extends B>, p6.l<h6.g$b, E extends B>] */
    public b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        q.f(baseKey, "baseKey");
        q.f(safeCast, "safeCast");
        this.f22436a = safeCast;
        this.f22437b = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f22437b : baseKey;
    }

    public final boolean a(g.c<?> key) {
        q.f(key, "key");
        return key == this || this.f22437b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lh6/g$b;)TE; */
    public final g.b b(g.b element) {
        q.f(element, "element");
        return (g.b) this.f22436a.invoke(element);
    }
}
