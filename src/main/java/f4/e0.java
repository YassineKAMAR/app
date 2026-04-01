package f4;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes.dex */
public final class e0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f21727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f21728b;

    private @interface a {
    }

    public e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f21727a = cls;
        this.f21728b = cls2;
    }

    public static <T> e0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new e0<>(cls, cls2);
    }

    public static <T> e0<T> b(Class<T> cls) {
        return new e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f21728b.equals(e0Var.f21728b)) {
            return this.f21727a.equals(e0Var.f21727a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f21728b.hashCode() * 31) + this.f21727a.hashCode();
    }

    public String toString() {
        if (this.f21727a == a.class) {
            return this.f21728b.getName();
        }
        return "@" + this.f21727a.getName() + " " + this.f21728b.getName();
    }
}
