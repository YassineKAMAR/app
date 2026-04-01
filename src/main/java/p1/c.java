package p1;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<Object> f25473b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f25474a;

    private c(T t7) {
        this.f25474a = t7;
    }

    public static <T> b<T> a(T t7) {
        return new c(d.c(t7, "instance cannot be null"));
    }

    @Override // d6.a
    public T get() {
        return this.f25474a;
    }
}
