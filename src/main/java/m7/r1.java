package m7;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.f;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public class r1 implements k7.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0<?> f24991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f24994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Annotation>[] f24995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Annotation> f24996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f24997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Integer> f24998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e6.k f24999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e6.k f25000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e6.k f25001l;

    static final class a extends kotlin.jvm.internal.r implements p6.a<Integer> {
        a() {
            super(0);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            r1 r1Var = r1.this;
            return Integer.valueOf(s1.a(r1Var, r1Var.p()));
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.a<i7.b<?>[]> {
        b() {
            super(0);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i7.b<?>[] invoke() {
            i7.b<?>[] bVarArrChildSerializers;
            j0 j0Var = r1.this.f24991b;
            return (j0Var == null || (bVarArrChildSerializers = j0Var.childSerializers()) == null) ? t1.f25016a : bVarArrChildSerializers;
        }
    }

    static final class c extends kotlin.jvm.internal.r implements p6.l<Integer, CharSequence> {
        c() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return r1.this.g(i8) + ": " + r1.this.i(i8).a();
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static final class d extends kotlin.jvm.internal.r implements p6.a<k7.f[]> {
        d() {
            super(0);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k7.f[] invoke() {
            ArrayList arrayList;
            i7.b<?>[] bVarArrTypeParametersSerializers;
            j0 j0Var = r1.this.f24991b;
            if (j0Var == null || (bVarArrTypeParametersSerializers = j0Var.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                for (i7.b<?> bVar : bVarArrTypeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return p1.b(arrayList);
        }
    }

    public r1(String serialName, j0<?> j0Var, int i8) {
        kotlin.jvm.internal.q.f(serialName, "serialName");
        this.f24990a = serialName;
        this.f24991b = j0Var;
        this.f24992c = i8;
        this.f24993d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f24994e = strArr;
        int i10 = this.f24992c;
        this.f24995f = new List[i10];
        this.f24997h = new boolean[i10];
        this.f24998i = f6.k0.e();
        e6.o oVar = e6.o.f21436b;
        this.f24999j = e6.m.a(oVar, new b());
        this.f25000k = e6.m.a(oVar, new d());
        this.f25001l = e6.m.a(oVar, new a());
    }

    public /* synthetic */ r1(String str, j0 j0Var, int i8, int i9, kotlin.jvm.internal.j jVar) {
        this(str, (i9 & 2) != 0 ? null : j0Var, i8);
    }

    public static /* synthetic */ void m(r1 r1Var, String str, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        r1Var.l(str, z7);
    }

    private final Map<String, Integer> n() {
        HashMap map = new HashMap();
        int length = this.f24994e.length;
        for (int i8 = 0; i8 < length; i8++) {
            map.put(this.f24994e[i8], Integer.valueOf(i8));
        }
        return map;
    }

    private final i7.b<?>[] o() {
        return (i7.b[]) this.f24999j.getValue();
    }

    private final int q() {
        return ((Number) this.f25001l.getValue()).intValue();
    }

    @Override // k7.f
    public String a() {
        return this.f24990a;
    }

    @Override // m7.n
    public Set<String> b() {
        return this.f24998i.keySet();
    }

    @Override // k7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // k7.f
    public int d(String name) {
        kotlin.jvm.internal.q.f(name, "name");
        Integer num = this.f24998i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // k7.f
    public k7.j e() {
        return k.a.f24282a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1) {
            k7.f fVar = (k7.f) obj;
            if (kotlin.jvm.internal.q.b(a(), fVar.a()) && Arrays.equals(p(), ((r1) obj).p()) && f() == fVar.f()) {
                int iF = f();
                for (int i8 = 0; i8 < iF; i8++) {
                    if (kotlin.jvm.internal.q.b(i(i8).a(), fVar.i(i8).a()) && kotlin.jvm.internal.q.b(i(i8).e(), fVar.i(i8).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // k7.f
    public final int f() {
        return this.f24992c;
    }

    @Override // k7.f
    public String g(int i8) {
        return this.f24994e[i8];
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f24996g;
        return list == null ? f6.o.d() : list;
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        List<Annotation> list = this.f24995f[i8];
        return list == null ? f6.o.d() : list;
    }

    public int hashCode() {
        return q();
    }

    @Override // k7.f
    public k7.f i(int i8) {
        return o()[i8].getDescriptor();
    }

    @Override // k7.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // k7.f
    public boolean j(int i8) {
        return this.f24997h[i8];
    }

    public final void l(String name, boolean z7) {
        kotlin.jvm.internal.q.f(name, "name");
        String[] strArr = this.f24994e;
        int i8 = this.f24993d + 1;
        this.f24993d = i8;
        strArr[i8] = name;
        this.f24997h[i8] = z7;
        this.f24995f[i8] = null;
        if (i8 == this.f24992c - 1) {
            this.f24998i = n();
        }
    }

    public final k7.f[] p() {
        return (k7.f[]) this.f25000k.getValue();
    }

    public String toString() {
        return f6.w.G(t6.l.k(0, this.f24992c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }
}
