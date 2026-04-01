package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21442b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21443a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f21444a;

        public b(Throwable exception) {
            kotlin.jvm.internal.q.f(exception, "exception");
            this.f21444a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.q.b(this.f21444a, ((b) obj).f21444a);
        }

        public int hashCode() {
            return this.f21444a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f21444a + ')';
        }
    }

    private /* synthetic */ s(Object obj) {
        this.f21443a = obj;
    }

    public static final /* synthetic */ s a(Object obj) {
        return new s(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof s) && kotlin.jvm.internal.q.b(obj, ((s) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.q.b(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f21444a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21443a, obj);
    }

    public int hashCode() {
        return f(this.f21443a);
    }

    public final /* synthetic */ Object j() {
        return this.f21443a;
    }

    public String toString() {
        return i(this.f21443a);
    }
}
