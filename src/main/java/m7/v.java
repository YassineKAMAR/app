package m7;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v<E, C extends Collection<? extends E>, B> extends u<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i7.b<E> element) {
        super(element, null);
        kotlin.jvm.internal.q.f(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> d(C c8) {
        kotlin.jvm.internal.q.f(c8, "<this>");
        return c8.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(C c8) {
        kotlin.jvm.internal.q.f(c8, "<this>");
        return c8.size();
    }
}
