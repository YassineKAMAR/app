package d7;

import h6.g;
import y6.a2;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f21034a = new h0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p6.p<Object, g.b, Object> f21035b = a.f21038a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p6.p<a2<?>, g.b, a2<?>> f21036c = b.f21039a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p6.p<p0, g.b, p0> f21037d = c.f21040a;

    static final class a extends kotlin.jvm.internal.r implements p6.p<Object, g.b, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21038a = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof a2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.p<a2<?>, g.b, a2<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21039a = new b();

        b() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a2<?> invoke(a2<?> a2Var, g.b bVar) {
            if (a2Var != null) {
                return a2Var;
            }
            if (bVar instanceof a2) {
                return (a2) bVar;
            }
            return null;
        }
    }

    static final class c extends kotlin.jvm.internal.r implements p6.p<p0, g.b, p0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21040a = new c();

        c() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(p0 p0Var, g.b bVar) {
            if (bVar instanceof a2) {
                a2<?> a2Var = (a2) bVar;
                p0Var.a(a2Var, a2Var.J(p0Var.f21052a));
            }
            return p0Var;
        }
    }

    public static final void a(h6.g gVar, Object obj) {
        if (obj == f21034a) {
            return;
        }
        if (obj instanceof p0) {
            ((p0) obj).b(gVar);
            return;
        }
        Object objP = gVar.P(null, f21036c);
        kotlin.jvm.internal.q.d(objP, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((a2) objP).q(gVar, obj);
    }

    public static final Object b(h6.g gVar) {
        Object objP = gVar.P(0, f21035b);
        kotlin.jvm.internal.q.c(objP);
        return objP;
    }

    public static final Object c(h6.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f21034a;
        }
        if (obj instanceof Integer) {
            return gVar.P(new p0(gVar, ((Number) obj).intValue()), f21037d);
        }
        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((a2) obj).J(gVar);
    }
}
