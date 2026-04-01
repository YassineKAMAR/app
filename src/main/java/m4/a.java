package m4;

import f4.d0;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f24870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f24871b;

    public a(Class<T> cls, T t7) {
        this.f24870a = (Class) d0.b(cls);
        this.f24871b = (T) d0.b(t7);
    }

    public T a() {
        return this.f24871b;
    }

    public Class<T> b() {
        return this.f24870a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f24870a, this.f24871b);
    }
}
