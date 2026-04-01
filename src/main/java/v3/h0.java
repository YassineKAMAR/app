package v3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class h0<E> extends n<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final n<Object> f26876e = new h0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f26877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f26878d;

    h0(Object[] objArr, int i8) {
        this.f26877c = objArr;
        this.f26878d = i8;
    }

    @Override // v3.n, v3.m
    int a(Object[] objArr, int i8) {
        System.arraycopy(this.f26877c, 0, objArr, i8, this.f26878d);
        return i8 + this.f26878d;
    }

    @Override // v3.m
    Object[] e() {
        return this.f26877c;
    }

    @Override // v3.m
    int g() {
        return this.f26878d;
    }

    @Override // java.util.List
    public E get(int i8) {
        u3.h.g(i8, this.f26878d);
        E e8 = (E) this.f26877c[i8];
        Objects.requireNonNull(e8);
        return e8;
    }

    @Override // v3.m
    int i() {
        return 0;
    }

    @Override // v3.m
    boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26878d;
    }
}
