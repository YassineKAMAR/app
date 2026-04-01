package h6;

import h6.e;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: h6.g$a$a, reason: collision with other inner class name */
        static final class C0119a extends r implements p<g, b, g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0119a f22442a = new C0119a();

            C0119a() {
                super(2);
            }

            @Override // p6.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                h6.c cVar;
                q.f(acc, "acc");
                q.f(element, "element");
                g gVarE = acc.E(element.getKey());
                h hVar = h.f22443a;
                if (gVarE == hVar) {
                    return element;
                }
                e.b bVar = e.T;
                e eVar = (e) gVarE.a(bVar);
                if (eVar == null) {
                    cVar = new h6.c(gVarE, element);
                } else {
                    g gVarE2 = gVarE.E(bVar);
                    if (gVarE2 == hVar) {
                        return new h6.c(element, eVar);
                    }
                    cVar = new h6.c(new h6.c(gVarE2, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            q.f(context, "context");
            return context == h.f22443a ? gVar : (g) context.P(gVar, C0119a.f22442a);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r8, p<? super R, ? super b, ? extends R> operation) {
                q.f(operation, "operation");
                return operation.invoke(r8, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                q.f(key, "key");
                if (!q.b(bVar.getKey(), key)) {
                    return null;
                }
                q.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> key) {
                q.f(key, "key");
                return q.b(bVar.getKey(), key) ? h.f22443a : bVar;
            }

            public static g d(b bVar, g context) {
                q.f(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // h6.g
        <E extends b> E a(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    g E(c<?> cVar);

    <R> R P(R r8, p<? super R, ? super b, ? extends R> pVar);

    g X(g gVar);

    <E extends b> E a(c<E> cVar);
}
