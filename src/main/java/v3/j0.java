package v3;

/* JADX INFO: loaded from: classes.dex */
final class j0<E> extends q<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f26894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final j0<Object> f26895i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f26896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f26897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f26898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f26899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f26900g;

    static {
        Object[] objArr = new Object[0];
        f26894h = objArr;
        f26895i = new j0<>(objArr, 0, objArr, 0, 0);
    }

    j0(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f26896c = objArr;
        this.f26897d = i8;
        this.f26898e = objArr2;
        this.f26899f = i9;
        this.f26900g = i10;
    }

    @Override // v3.m
    int a(Object[] objArr, int i8) {
        System.arraycopy(this.f26896c, 0, objArr, i8, this.f26900g);
        return i8 + this.f26900g;
    }

    @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f26898e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = l.c(obj);
        while (true) {
            int i8 = iC & this.f26899f;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i8 + 1;
        }
    }

    @Override // v3.m
    Object[] e() {
        return this.f26896c;
    }

    @Override // v3.m
    int g() {
        return this.f26900g;
    }

    @Override // v3.q, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f26897d;
    }

    @Override // v3.m
    int i() {
        return 0;
    }

    @Override // v3.m
    boolean n() {
        return false;
    }

    @Override // v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public q0<E> iterator() {
        return u().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26900g;
    }

    @Override // v3.q
    n<E> y() {
        return n.v(this.f26896c, this.f26900g);
    }

    @Override // v3.q
    boolean z() {
        return true;
    }
}
