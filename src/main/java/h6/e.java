package h6;

import h6.g;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends g.b {
    public static final b T = b.f22441a;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            q.f(key, "key");
            if (!(key instanceof h6.b)) {
                if (e.T != key) {
                    return null;
                }
                q.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            h6.b bVar = (h6.b) key;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e8 = (E) bVar.b(eVar);
            if (e8 instanceof g.b) {
                return e8;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> key) {
            q.f(key, "key");
            if (!(key instanceof h6.b)) {
                return e.T == key ? h.f22443a : eVar;
            }
            h6.b bVar = (h6.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f22443a;
        }
    }

    public static final class b implements g.c<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f22441a = new b();

        private b() {
        }
    }

    void h(d<?> dVar);

    <T> d<T> o(d<? super T> dVar);
}
