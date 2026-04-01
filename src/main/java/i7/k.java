package i7;

import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import m7.c2;
import m7.n1;
import p6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c2<? extends Object> f22572a = m7.o.a(c.f22578a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c2<Object> f22573b = m7.o.a(d.f22579a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n1<? extends Object> f22574c = m7.o.b(a.f22576a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n1<Object> f22575d = m7.o.b(b.f22577a);

    static final class a extends r implements p<u6.c<Object>, List<? extends u6.i>, i7.b<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22576a = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i7.b<? extends Object> invoke(u6.c<Object> clazz, List<? extends u6.i> types) {
            q.f(clazz, "clazz");
            q.f(types, "types");
            List<i7.b<Object>> listE = l.e(p7.d.a(), types, true);
            q.c(listE);
            return l.a(clazz, types, listE);
        }
    }

    static final class b extends r implements p<u6.c<Object>, List<? extends u6.i>, i7.b<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22577a = new b();

        b() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i7.b<Object> invoke(u6.c<Object> clazz, List<? extends u6.i> types) {
            i7.b<Object> bVarS;
            q.f(clazz, "clazz");
            q.f(types, "types");
            List<i7.b<Object>> listE = l.e(p7.d.a(), types, true);
            q.c(listE);
            i7.b<? extends Object> bVarA = l.a(clazz, types, listE);
            if (bVarA == null || (bVarS = j7.a.s(bVarA)) == null) {
                return null;
            }
            return bVarS;
        }
    }

    static final class c extends r implements p6.l<u6.c<?>, i7.b<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22578a = new c();

        c() {
            super(1);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i7.b<? extends Object> invoke(u6.c<?> it) {
            q.f(it, "it");
            return l.d(it);
        }
    }

    static final class d extends r implements p6.l<u6.c<?>, i7.b<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22579a = new d();

        d() {
            super(1);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i7.b<Object> invoke(u6.c<?> it) {
            i7.b<Object> bVarS;
            q.f(it, "it");
            i7.b bVarD = l.d(it);
            if (bVarD == null || (bVarS = j7.a.s(bVarD)) == null) {
                return null;
            }
            return bVarS;
        }
    }

    public static final i7.b<Object> a(u6.c<Object> clazz, boolean z7) {
        q.f(clazz, "clazz");
        if (z7) {
            return f22573b.a(clazz);
        }
        i7.b<? extends Object> bVarA = f22572a.a(clazz);
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    public static final Object b(u6.c<Object> clazz, List<? extends u6.i> types, boolean z7) {
        q.f(clazz, "clazz");
        q.f(types, "types");
        return (!z7 ? f22574c : f22575d).a(clazz, types);
    }
}
