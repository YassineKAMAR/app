package c7;

import h6.g;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ g f3484b;

    public a(Throwable th, g gVar) {
        this.f3483a = th;
        this.f3484b = gVar;
    }

    @Override // h6.g
    public g E(g.c<?> cVar) {
        return this.f3484b.E(cVar);
    }

    @Override // h6.g
    public <R> R P(R r8, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f3484b.P(r8, pVar);
    }

    @Override // h6.g
    public g X(g gVar) {
        return this.f3484b.X(gVar);
    }

    @Override // h6.g
    public <E extends g.b> E a(g.c<E> cVar) {
        return (E) this.f3484b.a(cVar);
    }
}
