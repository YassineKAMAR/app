package a7;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f286b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f287c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f288a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f289a;

        public a(Throwable th) {
            this.f289a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && q.b(this.f289a, ((a) obj).f289a);
        }

        public int hashCode() {
            Throwable th = this.f289a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // a7.g.c
        public String toString() {
            return "Closed(" + this.f289a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return g.c(new a(th));
        }

        public final <E> Object b() {
            return g.c(g.f287c);
        }

        public final <E> Object c(E e8) {
            return g.c(e8);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ g(Object obj) {
        this.f288a = obj;
    }

    public static final /* synthetic */ g b(Object obj) {
        return new g(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof g) && q.b(obj, ((g) obj2).i());
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof a;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof c);
    }

    public static String h(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f288a, obj);
    }

    public int hashCode() {
        return e(this.f288a);
    }

    public final /* synthetic */ Object i() {
        return this.f288a;
    }

    public String toString() {
        return h(this.f288a);
    }
}
