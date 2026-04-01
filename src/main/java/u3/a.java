package u3;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<Object> f26716a = new a<>();

    private a() {
    }

    static <T> g<T> e() {
        return f26716a;
    }

    @Override // u3.g
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // u3.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
