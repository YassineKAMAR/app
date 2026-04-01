package n7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
@i7.h(with = c.class)
public final class b extends h implements List<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25161c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<h> f25162b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends h> content) {
        super(null);
        kotlin.jvm.internal.q.f(content, "content");
        this.f25162b = content;
    }

    public boolean a(h element) {
        kotlin.jvm.internal.q.f(element, "element");
        return this.f25162b.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return a((h) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return this.f25162b.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.q.b(this.f25162b, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h get(int i8) {
        return this.f25162b.get(i8);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f25162b.hashCode();
    }

    public int i() {
        return this.f25162b.size();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return n((h) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f25162b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f25162b.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return p((h) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<h> listIterator() {
        return this.f25162b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<h> listIterator(int i8) {
        return this.f25162b.listIterator(i8);
    }

    public int n(h element) {
        kotlin.jvm.internal.q.f(element, "element");
        return this.f25162b.indexOf(element);
    }

    public int p(h element) {
        kotlin.jvm.internal.q.f(element, "element");
        return this.f25162b.lastIndexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ h remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ h set(int i8, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    public void sort(Comparator<? super h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<h> subList(int i8, int i9) {
        return this.f25162b.subList(i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.q.f(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }

    public String toString() {
        return f6.w.G(this.f25162b, com.amazon.a.a.o.b.f.f3942a, "[", "]", 0, null, null, 56, null);
    }
}
