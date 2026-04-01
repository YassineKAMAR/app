package u;

import u.f;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26588m;

    public g(p pVar) {
        super(pVar);
        this.f26571e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // u.f
    public void d(int i8) {
        if (this.f26576j) {
            return;
        }
        this.f26576j = true;
        this.f26573g = i8;
        for (d dVar : this.f26577k) {
            dVar.a(dVar);
        }
    }
}
