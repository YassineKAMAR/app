package l1;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f24341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f24342c;

    a(Integer num, T t7, d dVar) {
        this.f24340a = num;
        if (t7 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f24341b = t7;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f24342c = dVar;
    }

    @Override // l1.c
    public Integer a() {
        return this.f24340a;
    }

    @Override // l1.c
    public T b() {
        return this.f24341b;
    }

    @Override // l1.c
    public d c() {
        return this.f24342c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f24340a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f24341b.equals(cVar.b()) && this.f24342c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f24340a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f24341b.hashCode()) * 1000003) ^ this.f24342c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f24340a + ", payload=" + this.f24341b + ", priority=" + this.f24342c + "}";
    }
}
