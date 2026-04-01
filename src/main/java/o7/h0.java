package o7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k7.j;

/* JADX INFO: loaded from: classes2.dex */
class h0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n7.t f25325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k7.f f25327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25329j;

    /* synthetic */ class a extends kotlin.jvm.internal.o implements p6.a<Map<String, ? extends Integer>> {
        a(Object obj) {
            super(0, obj, c0.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Map<String, Integer> invoke() {
            return c0.a((k7.f) this.receiver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n7.a json, n7.t value, String str, k7.f fVar) {
        super(json, value, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(value, "value");
        this.f25325f = value;
        this.f25326g = str;
        this.f25327h = fVar;
    }

    public /* synthetic */ h0(n7.a aVar, n7.t tVar, String str, k7.f fVar, int i8, kotlin.jvm.internal.j jVar) {
        this(aVar, tVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(k7.f fVar, int i8) {
        boolean z7 = (b().e().f() || fVar.j(i8) || !fVar.i(i8).c()) ? false : true;
        this.f25329j = z7;
        return z7;
    }

    private final boolean v0(k7.f fVar, int i8, String str) {
        n7.a aVarB = b();
        k7.f fVarI = fVar.i(i8);
        if (!fVarI.c() && (e0(str) instanceof n7.r)) {
            return true;
        }
        if (kotlin.jvm.internal.q.b(fVarI.e(), j.b.f24281a)) {
            n7.h hVarE0 = e0(str);
            n7.v vVar = hVarE0 instanceof n7.v ? (n7.v) hVarE0 : null;
            String strF = vVar != null ? n7.i.f(vVar) : null;
            if (strF != null && c0.d(fVarI, aVarB, strF) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // m7.g1
    protected String a0(k7.f desc, int i8) {
        Object next;
        kotlin.jvm.internal.q.f(desc, "desc");
        String strG = desc.g(i8);
        if (!this.f25308e.j() || s0().keySet().contains(strG)) {
            return strG;
        }
        Map map = (Map) n7.x.a(b()).b(desc, c0.c(), new a(desc));
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) map.get((String) next);
            if (num != null && num.intValue() == i8) {
                break;
            }
        }
        String str = (String) next;
        return str == null ? strG : str;
    }

    @Override // o7.c, l7.e
    public l7.c c(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return descriptor == this.f25327h ? this : super.c(descriptor);
    }

    @Override // o7.c, l7.c
    public void d(k7.f descriptor) {
        Set<String> setF;
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        if (this.f25308e.g() || (descriptor.e() instanceof k7.d)) {
            return;
        }
        if (this.f25308e.j()) {
            Set<String> setA = m7.t0.a(descriptor);
            Map map = (Map) n7.x.a(b()).a(descriptor, c0.c());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = f6.p0.b();
            }
            setF = f6.q0.f(setA, setKeySet);
        } else {
            setF = m7.t0.a(descriptor);
        }
        for (String str : s0().keySet()) {
            if (!setF.contains(str) && !kotlin.jvm.internal.q.b(str, this.f25326g)) {
                throw b0.g(str, s0().toString());
            }
        }
    }

    @Override // o7.c
    protected n7.h e0(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        return (n7.h) f6.k0.f(s0(), tag);
    }

    @Override // l7.c
    public int s(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        while (this.f25328i < descriptor.f()) {
            int i8 = this.f25328i;
            this.f25328i = i8 + 1;
            String strV = V(descriptor, i8);
            int i9 = this.f25328i - 1;
            this.f25329j = false;
            if (s0().containsKey(strV) || u0(descriptor, i9)) {
                if (!this.f25308e.d() || !v0(descriptor, i9, strV)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // o7.c, m7.h2, l7.e
    public boolean u() {
        return !this.f25329j && super.u();
    }

    @Override // o7.c
    /* JADX INFO: renamed from: w0 */
    public n7.t s0() {
        return this.f25325f;
    }
}
