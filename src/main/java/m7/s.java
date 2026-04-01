package m7;

/* JADX INFO: loaded from: classes2.dex */
final class s<T> implements c2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6.l<u6.c<?>, i7.b<T>> f25008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25009b;

    public static final class a extends ClassValue<m<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s<T> f25010a;

        a(s<T> sVar) {
            this.f25010a = sVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(p6.l<? super u6.c<?>, ? extends i7.b<T>> compute) {
        kotlin.jvm.internal.q.f(compute, "compute");
        this.f25008a = compute;
        this.f25009b = b();
    }

    private final a b() {
        return new a(this);
    }

    @Override // m7.c2
    public i7.b<T> a(u6.c<Object> key) {
        kotlin.jvm.internal.q.f(key, "key");
        return this.f25009b.get(o6.a.a(key)).f24967a;
    }
}
