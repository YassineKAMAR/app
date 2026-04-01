package y6;

import h6.g;

/* JADX INFO: loaded from: classes2.dex */
final class e2 implements g.b, g.c<e2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f27488a = new e2();

    private e2() {
    }

    @Override // h6.g
    public h6.g E(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // h6.g
    public <R> R P(R r8, p6.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r8, pVar);
    }

    @Override // h6.g
    public h6.g X(h6.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // h6.g.b, h6.g
    public <E extends g.b> E a(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // h6.g.b
    public g.c<?> getKey() {
        return this;
    }
}
