package h6;

import h6.g;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c<?> f22435a;

    public a(g.c<?> key) {
        q.f(key, "key");
        this.f22435a = key;
    }

    @Override // h6.g
    public g E(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // h6.g
    public <R> R P(R r8, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r8, pVar);
    }

    @Override // h6.g
    public g X(g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // h6.g.b, h6.g
    public <E extends g.b> E a(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // h6.g.b
    public g.c<?> getKey() {
        return this.f22435a;
    }
}
