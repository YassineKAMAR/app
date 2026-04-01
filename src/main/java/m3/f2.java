package m3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class f2 extends c2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f24665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final f2 f24666i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f24667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f24668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f24669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f24670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f24671g;

    static {
        Object[] objArr = new Object[0];
        f24665h = objArr;
        f24666i = new f2(objArr, 0, objArr, 0, 0);
    }

    f2(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f24667c = objArr;
        this.f24668d = i8;
        this.f24669e = objArr2;
        this.f24670f = i9;
        this.f24671g = i10;
    }

    @Override // m3.y1
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f24667c, 0, objArr, 0, this.f24671g);
        return this.f24671g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f24669e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = x1.a(obj.hashCode());
        while (true) {
            int i8 = iA & this.f24670f;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i8 + 1;
        }
    }

    @Override // m3.y1
    final int e() {
        return this.f24671g;
    }

    @Override // m3.y1
    final int g() {
        return 0;
    }

    @Override // m3.c2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f24668d;
    }

    @Override // m3.y1
    final Object[] i() {
        return this.f24667c;
    }

    @Override // m3.c2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return u().listIterator(0);
    }

    @Override // m3.c2
    /* JADX INFO: renamed from: n */
    public final h2 iterator() {
        return u().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24671g;
    }

    @Override // m3.c2
    final b2 v() {
        return b2.p(this.f24667c, this.f24671g);
    }

    @Override // m3.c2
    final boolean y() {
        return true;
    }
}
