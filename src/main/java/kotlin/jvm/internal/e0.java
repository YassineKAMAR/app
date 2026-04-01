package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements u6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24301e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u6.d f24302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u6.j> f24303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u6.i f24304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24305d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24306a;

        static {
            int[] iArr = new int[u6.k.values().length];
            try {
                iArr[u6.k.f26747a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u6.k.f26748b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u6.k.f26749c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24306a = iArr;
        }
    }

    static final class c extends r implements p6.l<u6.j, CharSequence> {
        c() {
            super(1);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(u6.j it) {
            q.f(it, "it");
            return e0.this.f(it);
        }
    }

    public e0(u6.d classifier, List<u6.j> arguments, u6.i iVar, int i8) {
        q.f(classifier, "classifier");
        q.f(arguments, "arguments");
        this.f24302a = classifier;
        this.f24303b = arguments;
        this.f24304c = iVar;
        this.f24305d = i8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(u6.d classifier, List<u6.j> arguments, boolean z7) {
        this(classifier, arguments, null, z7 ? 1 : 0);
        q.f(classifier, "classifier");
        q.f(arguments, "arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(u6.j jVar) {
        String strValueOf;
        StringBuilder sb;
        String str;
        if (jVar.b() == null) {
            return "*";
        }
        u6.i iVarA = jVar.a();
        e0 e0Var = iVarA instanceof e0 ? (e0) iVarA : null;
        if (e0Var == null || (strValueOf = e0Var.g(true)) == null) {
            strValueOf = String.valueOf(jVar.a());
        }
        int i8 = b.f24306a[jVar.b().ordinal()];
        if (i8 == 1) {
            return strValueOf;
        }
        if (i8 == 2) {
            sb = new StringBuilder();
            str = "in ";
        } else {
            if (i8 != 3) {
                throw new e6.p();
            }
            sb = new StringBuilder();
            str = "out ";
        }
        sb.append(str);
        sb.append(strValueOf);
        return sb.toString();
    }

    private final String g(boolean z7) {
        String name;
        u6.d dVarD = d();
        u6.c cVar = dVarD instanceof u6.c ? (u6.c) dVarD : null;
        Class<?> clsA = cVar != null ? o6.a.a(cVar) : null;
        if (clsA == null) {
            name = d().toString();
        } else if ((this.f24305d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = h(clsA);
        } else if (z7 && clsA.isPrimitive()) {
            u6.d dVarD2 = d();
            q.d(dVarD2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = o6.a.b((u6.c) dVarD2).getName();
        } else {
            name = clsA.getName();
        }
        String str = name + (c().isEmpty() ? "" : f6.w.G(c(), ", ", "<", ">", 0, null, new c(), 24, null)) + (a() ? "?" : "");
        u6.i iVar = this.f24304c;
        if (!(iVar instanceof e0)) {
            return str;
        }
        String strG = ((e0) iVar).g(true);
        if (q.b(strG, str)) {
            return str;
        }
        if (q.b(strG, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strG + ')';
    }

    private final String h(Class<?> cls) {
        return q.b(cls, boolean[].class) ? "kotlin.BooleanArray" : q.b(cls, char[].class) ? "kotlin.CharArray" : q.b(cls, byte[].class) ? "kotlin.ByteArray" : q.b(cls, short[].class) ? "kotlin.ShortArray" : q.b(cls, int[].class) ? "kotlin.IntArray" : q.b(cls, float[].class) ? "kotlin.FloatArray" : q.b(cls, long[].class) ? "kotlin.LongArray" : q.b(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // u6.i
    public boolean a() {
        return (this.f24305d & 1) != 0;
    }

    @Override // u6.i
    public List<u6.j> c() {
        return this.f24303b;
    }

    @Override // u6.i
    public u6.d d() {
        return this.f24302a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (q.b(d(), e0Var.d()) && q.b(c(), e0Var.c()) && q.b(this.f24304c, e0Var.f24304c) && this.f24305d == e0Var.f24305d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((d().hashCode() * 31) + c().hashCode()) * 31) + this.f24305d;
    }

    public String toString() {
        return g(false) + " (Kotlin reflection is not available)";
    }
}
