package k7;

import e6.m;
import e6.x;
import f6.b0;
import f6.k0;
import f6.p;
import f6.w;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.f;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import m7.n;
import m7.p1;
import m7.s1;
import p6.l;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f24260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Annotation> f24262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f24263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f24264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f[] f24265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Annotation>[] f24266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f24267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Integer> f24268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f[] f24269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e6.k f24270l;

    static final class a extends r implements p6.a<Integer> {
        a() {
            super(0);
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(s1.a(gVar, gVar.f24269k));
        }
    }

    static final class b extends r implements l<Integer, CharSequence> {
        b() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return g.this.g(i8) + ": " + g.this.i(i8).a();
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(String serialName, j kind, int i8, List<? extends f> typeParameters, k7.a builder) {
        q.f(serialName, "serialName");
        q.f(kind, "kind");
        q.f(typeParameters, "typeParameters");
        q.f(builder, "builder");
        this.f24259a = serialName;
        this.f24260b = kind;
        this.f24261c = i8;
        this.f24262d = builder.c();
        this.f24263e = w.T(builder.f());
        Object[] array = builder.f().toArray(new String[0]);
        q.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f24264f = strArr;
        this.f24265g = p1.b(builder.e());
        Object[] array2 = builder.d().toArray(new List[0]);
        q.d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f24266h = (List[]) array2;
        this.f24267i = w.R(builder.g());
        Iterable<b0> iterableF = f6.j.F(strArr);
        ArrayList arrayList = new ArrayList(p.m(iterableF, 10));
        for (b0 b0Var : iterableF) {
            arrayList.add(x.a(b0Var.b(), Integer.valueOf(b0Var.a())));
        }
        this.f24268j = k0.n(arrayList);
        this.f24269k = p1.b(typeParameters);
        this.f24270l = m.b(new a());
    }

    private final int l() {
        return ((Number) this.f24270l.getValue()).intValue();
    }

    @Override // k7.f
    public String a() {
        return this.f24259a;
    }

    @Override // m7.n
    public Set<String> b() {
        return this.f24263e;
    }

    @Override // k7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // k7.f
    public int d(String name) {
        q.f(name, "name");
        Integer num = this.f24268j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // k7.f
    public j e() {
        return this.f24260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (q.b(a(), fVar.a()) && Arrays.equals(this.f24269k, ((g) obj).f24269k) && f() == fVar.f()) {
                int iF = f();
                for (int i8 = 0; i8 < iF; i8++) {
                    if (q.b(i(i8).a(), fVar.i(i8).a()) && q.b(i(i8).e(), fVar.i(i8).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // k7.f
    public int f() {
        return this.f24261c;
    }

    @Override // k7.f
    public String g(int i8) {
        return this.f24264f[i8];
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        return this.f24262d;
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        return this.f24266h[i8];
    }

    public int hashCode() {
        return l();
    }

    @Override // k7.f
    public f i(int i8) {
        return this.f24265g[i8];
    }

    @Override // k7.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // k7.f
    public boolean j(int i8) {
        return this.f24267i[i8];
    }

    public String toString() {
        return w.G(t6.l.k(0, f()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
