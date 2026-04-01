package f6;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<E> extends AbstractList<E> {
    protected c() {
    }

    public abstract int a();

    public abstract E e(int i8);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i8) {
        return e(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
