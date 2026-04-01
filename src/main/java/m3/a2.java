package m3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a2 extends b2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f24612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f24613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b2 f24614f;

    a2(b2 b2Var, int i8, int i9) {
        this.f24614f = b2Var;
        this.f24612d = i8;
        this.f24613e = i9;
    }

    @Override // m3.y1
    final int e() {
        return this.f24614f.g() + this.f24612d + this.f24613e;
    }

    @Override // m3.y1
    final int g() {
        return this.f24614f.g() + this.f24612d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        t1.a(i8, this.f24613e, "index");
        return this.f24614f.get(i8 + this.f24612d);
    }

    @Override // m3.y1
    final Object[] i() {
        return this.f24614f.i();
    }

    @Override // m3.b2
    /* JADX INFO: renamed from: n */
    public final b2 subList(int i8, int i9) {
        t1.c(i8, i9, this.f24613e);
        b2 b2Var = this.f24614f;
        int i10 = this.f24612d;
        return b2Var.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24613e;
    }

    @Override // m3.b2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
