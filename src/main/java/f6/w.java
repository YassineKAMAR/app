package f6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class w extends v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements v6.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21808a;

        public a(Iterable iterable) {
            this.f21808a = iterable;
        }

        @Override // v6.b
        public Iterator<T> iterator() {
            return this.f21808a.iterator();
        }
    }

    public static <T> T A(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T B(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> Set<T> C(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(other, "other");
        Set<T> setX = X(iterable);
        t.t(setX, other);
        return setX;
    }

    public static final <T, A extends Appendable> A D(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, p6.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(buffer, "buffer");
        kotlin.jvm.internal.q.f(separator, "separator");
        kotlin.jvm.internal.q.f(prefix, "prefix");
        kotlin.jvm.internal.q.f(postfix, "postfix");
        kotlin.jvm.internal.q.f(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (T t7 : iterable) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            w6.n.a(buffer, t7, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String F(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, p6.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(separator, "separator");
        kotlin.jvm.internal.q.f(prefix, "prefix");
        kotlin.jvm.internal.q.f(postfix, "postfix");
        kotlin.jvm.internal.q.f(truncated, "truncated");
        String string = ((StringBuilder) D(iterable, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        kotlin.jvm.internal.q.e(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String G(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, p6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return F(iterable, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static <T> T H(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(o.f(list));
    }

    public static <T> T I(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T J(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> K(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.p(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> L(Collection<? extends T> collection, T t7) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t7);
        return arrayList;
    }

    public static <T> T M(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) N((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T N(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T O(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> P(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listV = V(iterable);
            s.o(listV, comparator);
            return listV;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return U(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        i.j(array, comparator);
        return i.c(array);
    }

    public static final <T> List<T> Q(Iterable<? extends T> iterable, int i8) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        int i9 = 0;
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return o.d();
        }
        if (iterable instanceof Collection) {
            if (i8 >= ((Collection) iterable).size()) {
                return U(iterable);
            }
            if (i8 == 1) {
                return n.b(y(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return o.k(arrayList);
    }

    public static boolean[] R(Collection<Boolean> collection) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = it.next().booleanValue();
            i8++;
        }
        return zArr;
    }

    public static final <T, C extends Collection<? super T>> C S(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> HashSet<T> T(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return (HashSet) S(iterable, new HashSet(j0.b(p.m(iterable, 12))));
    }

    public static <T> List<T> U(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o.k(V(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o.d();
        }
        if (size != 1) {
            return W(collection);
        }
        return n.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> V(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return iterable instanceof Collection ? W((Collection) iterable) : (List) S(iterable, new ArrayList());
    }

    public static final <T> List<T> W(Collection<? extends T> collection) {
        kotlin.jvm.internal.q.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> X(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) S(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> Y(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p0.c((Set) S(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p0.b();
        }
        if (size != 1) {
            return (Set) S(iterable, new LinkedHashSet(j0.b(collection.size())));
        }
        return o0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> v6.b<T> u(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<T> v(List<? extends T> list, int i8) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (i8 >= 0) {
            return Q(list, t6.l.b(list.size() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static <T> List<T> w(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        return (List) x(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C x(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        for (T t7 : iterable) {
            if (t7 != null) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static <T> T y(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.q.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T z(List<? extends T> list) {
        kotlin.jvm.internal.q.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }
}
