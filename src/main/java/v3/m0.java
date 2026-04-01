package v3;

/* JADX INFO: loaded from: classes.dex */
final class m0<E> extends q<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient E f26905c;

    m0(E e8) {
        this.f26905c = (E) u3.h.i(e8);
    }

    @Override // v3.m
    int a(Object[] objArr, int i8) {
        objArr[i8] = this.f26905c;
        return i8 + 1;
    }

    @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26905c.equals(obj);
    }

    @Override // v3.q, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26905c.hashCode();
    }

    @Override // v3.m
    boolean n() {
        return false;
    }

    @Override // v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public q0<E> iterator() {
        return v.d(this.f26905c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f26905c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
