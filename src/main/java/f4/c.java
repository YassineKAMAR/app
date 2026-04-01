package f4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<e0<? super T>> f21710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<r> f21711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h<T> f21714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f21715g;

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<e0<? super T>> f21717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<r> f21718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h<T> f21721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f21722g;

        @SafeVarargs
        private b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f21716a = null;
            HashSet hashSet = new HashSet();
            this.f21717b = hashSet;
            this.f21718c = new HashSet();
            this.f21719d = 0;
            this.f21720e = 0;
            this.f21722g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.f21717b, e0VarArr);
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f21716a = null;
            HashSet hashSet = new HashSet();
            this.f21717b = hashSet;
            this.f21718c = new HashSet();
            this.f21719d = 0;
            this.f21720e = 0;
            this.f21722g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.f21717b.add(e0.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f21720e = 1;
            return this;
        }

        private b<T> h(int i8) {
            d0.d(this.f21719d == 0, "Instantiation type has already been set.");
            this.f21719d = i8;
            return this;
        }

        private void i(e0<?> e0Var) {
            d0.a(!this.f21717b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            i(rVar.b());
            this.f21718c.add(rVar);
            return this;
        }

        public c<T> c() {
            d0.d(this.f21721f != null, "Missing required property: factory.");
            return new c<>(this.f21716a, new HashSet(this.f21717b), new HashSet(this.f21718c), this.f21719d, this.f21720e, this.f21721f, this.f21722g);
        }

        public b<T> d() {
            return h(2);
        }

        public b<T> e(h<T> hVar) {
            this.f21721f = (h) d0.c(hVar, "Null factory");
            return this;
        }

        public b<T> g(String str) {
            this.f21716a = str;
            return this;
        }
    }

    private c(String str, Set<e0<? super T>> set, Set<r> set2, int i8, int i9, h<T> hVar, Set<Class<?>> set3) {
        this.f21709a = str;
        this.f21710b = Collections.unmodifiableSet(set);
        this.f21711c = Collections.unmodifiableSet(set2);
        this.f21712d = i8;
        this.f21713e = i9;
        this.f21714f = hVar;
        this.f21715g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(e0<T> e0Var) {
        return new b<>(e0Var, new e0[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(e0<T> e0Var, e0<? super T>... e0VarArr) {
        return new b<>(e0Var, e0VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> l(final T t7, Class<T> cls) {
        return m(cls).e(new h() { // from class: f4.a
            @Override // f4.h
            public final Object a(e eVar) {
                return c.q(t7, eVar);
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(final T t7, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).e(new h() { // from class: f4.b
            @Override // f4.h
            public final Object a(e eVar) {
                return c.r(t7, eVar);
            }
        }).c();
    }

    public Set<r> g() {
        return this.f21711c;
    }

    public h<T> h() {
        return this.f21714f;
    }

    public String i() {
        return this.f21709a;
    }

    public Set<e0<? super T>> j() {
        return this.f21710b;
    }

    public Set<Class<?>> k() {
        return this.f21715g;
    }

    public boolean n() {
        return this.f21712d == 1;
    }

    public boolean o() {
        return this.f21712d == 2;
    }

    public boolean p() {
        return this.f21713e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c<>(this.f21709a, this.f21710b, this.f21711c, this.f21712d, this.f21713e, hVar, this.f21715g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f21710b.toArray()) + ">{" + this.f21712d + ", type=" + this.f21713e + ", deps=" + Arrays.toString(this.f21711c.toArray()) + "}";
    }
}
