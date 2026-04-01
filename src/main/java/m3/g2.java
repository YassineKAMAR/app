package m3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class g2 extends c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f24698c;

    g2(Object obj) {
        obj.getClass();
        this.f24698c = obj;
    }

    @Override // m3.y1
    final int a(Object[] objArr, int i8) {
        objArr[0] = this.f24698c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24698c.equals(obj);
    }

    @Override // m3.c2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f24698c.hashCode();
    }

    @Override // m3.c2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new d2(this.f24698c);
    }

    @Override // m3.c2
    /* JADX INFO: renamed from: n */
    public final h2 iterator() {
        return new d2(this.f24698c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f24698c.toString() + "]";
    }
}
