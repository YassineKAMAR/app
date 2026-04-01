package m7;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class z1<ElementKlass, Element extends ElementKlass> extends u<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u6.c<ElementKlass> f25045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f25046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(u6.c<ElementKlass> kClass, i7.b<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.q.f(kClass, "kClass");
        kotlin.jvm.internal.q.f(eSerializer, "eSerializer");
        this.f25045b = kClass;
        this.f25046c = new d(eSerializer.getDescriptor());
    }

    @Override // m7.u, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f25046c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList<Element> arrayList, int i8) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> d(Element[] elementArr) {
        kotlin.jvm.internal.q.f(elementArr, "<this>");
        return kotlin.jvm.internal.b.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Element[] elementArr) {
        kotlin.jvm.internal.q.f(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList<Element> arrayList, int i8, Element element) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        arrayList.add(i8, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> k(Element[] elementArr) {
        kotlin.jvm.internal.q.f(elementArr, "<this>");
        return new ArrayList<>(f6.i.c(elementArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Element[] l(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.q.f(arrayList, "<this>");
        return (Element[]) o1.n(arrayList, this.f25045b);
    }
}
