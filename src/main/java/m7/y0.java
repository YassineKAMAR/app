package m7;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y0<E> extends v<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f25040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(i7.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.q.f(eSerializer, "eSerializer");
        this.f25040b = new x0(eSerializer.getDescriptor());
    }

    @Override // m7.u, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f25040b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> a() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.q.f(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet<E> linkedHashSet, int i8) {
        kotlin.jvm.internal.q.f(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet<E> linkedHashSet, int i8, E e8) {
        kotlin.jvm.internal.q.f(linkedHashSet, "<this>");
        linkedHashSet.add(e8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.q.f(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<E> l(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.q.f(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
