package h6;

import h6.g;
import java.io.Serializable;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f22438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.b f22439b;

    static final class a extends r implements p<String, g.b, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22440a = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            q.f(acc, "acc");
            q.f(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        q.f(left, "left");
        q.f(element, "element");
        this.f22438a = left;
        this.f22439b = element;
    }

    private final boolean b(g.b bVar) {
        return q.b(a(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (b(cVar.f22439b)) {
            g gVar = cVar.f22438a;
            if (!(gVar instanceof c)) {
                q.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int e() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f22438a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    @Override // h6.g
    public g E(g.c<?> key) {
        q.f(key, "key");
        if (this.f22439b.a(key) != null) {
            return this.f22438a;
        }
        g gVarE = this.f22438a.E(key);
        return gVarE == this.f22438a ? this : gVarE == h.f22443a ? this.f22439b : new c(gVarE, this.f22439b);
    }

    @Override // h6.g
    public <R> R P(R r8, p<? super R, ? super g.b, ? extends R> operation) {
        q.f(operation, "operation");
        return operation.invoke((Object) this.f22438a.P(r8, operation), this.f22439b);
    }

    @Override // h6.g
    public g X(g gVar) {
        return g.a.a(this, gVar);
    }

    @Override // h6.g
    public <E extends g.b> E a(g.c<E> key) {
        q.f(key, "key");
        c cVar = this;
        while (true) {
            E e8 = (E) cVar.f22439b.a(key);
            if (e8 != null) {
                return e8;
            }
            g gVar = cVar.f22438a;
            if (!(gVar instanceof c)) {
                return (E) gVar.a(key);
            }
            cVar = (c) gVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f22438a.hashCode() + this.f22439b.hashCode();
    }

    public String toString() {
        return '[' + ((String) P("", a.f22440a)) + ']';
    }
}
