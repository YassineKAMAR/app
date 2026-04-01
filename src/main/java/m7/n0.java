package m7;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n0<E> extends v<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f24970b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(i7.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.q.f(eSerializer, "eSerializer");
        this.f24970b = new m0(eSerializer.getDescriptor());
    }

    @Override // m7.u, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24970b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet<E> a() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet<E> hashSet) {
        kotlin.jvm.internal.q.f(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet<E> hashSet, int i8) {
        kotlin.jvm.internal.q.f(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet<E> hashSet, int i8, E e8) {
        kotlin.jvm.internal.q.f(hashSet, "<this>");
        hashSet.add(e8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.q.f(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set<E> l(HashSet<E> hashSet) {
        kotlin.jvm.internal.q.f(hashSet, "<this>");
        return hashSet;
    }
}
