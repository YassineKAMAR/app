package m7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f<E> extends v<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f24914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i7.b<E> element) {
        super(element);
        kotlin.jvm.internal.q.f(element, "element");
        this.f24914b = new e(element.getDescriptor());
    }

    @Override // m7.u, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24914b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<E> arrayList) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<E> arrayList, int i8) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList<E> arrayList, int i8, E e8) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        arrayList.add(i8, e8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> k(List<? extends E> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List<E> l(ArrayList<E> arrayList) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        return arrayList;
    }
}
