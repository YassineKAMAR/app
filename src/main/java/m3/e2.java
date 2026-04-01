package m3;

/* JADX INFO: loaded from: classes.dex */
final class e2 extends b2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b2 f24657f = new e2(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f24658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f24659e;

    e2(Object[] objArr, int i8) {
        this.f24658d = objArr;
        this.f24659e = i8;
    }

    @Override // m3.b2, m3.y1
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f24658d, 0, objArr, 0, this.f24659e);
        return this.f24659e;
    }

    @Override // m3.y1
    final int e() {
        return this.f24659e;
    }

    @Override // m3.y1
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        t1.a(i8, this.f24659e, "index");
        Object obj = this.f24658d[i8];
        obj.getClass();
        return obj;
    }

    @Override // m3.y1
    final Object[] i() {
        return this.f24658d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24659e;
    }
}
