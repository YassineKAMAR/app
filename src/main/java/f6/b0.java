package f6;

/* JADX INFO: loaded from: classes2.dex */
public final class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f21796b;

    public b0(int i8, T t7) {
        this.f21795a = i8;
        this.f21796b = t7;
    }

    public final int a() {
        return this.f21795a;
    }

    public final T b() {
        return this.f21796b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f21795a == b0Var.f21795a && kotlin.jvm.internal.q.b(this.f21796b, b0Var.f21796b);
    }

    public int hashCode() {
        int i8 = this.f21795a * 31;
        T t7 = this.f21796b;
        return i8 + (t7 == null ? 0 : t7.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f21795a + ", value=" + this.f21796b + ')';
    }
}
