package w6;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t6.f f27146b;

    public f(String value, t6.f range) {
        kotlin.jvm.internal.q.f(value, "value");
        kotlin.jvm.internal.q.f(range, "range");
        this.f27145a = value;
        this.f27146b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.q.b(this.f27145a, fVar.f27145a) && kotlin.jvm.internal.q.b(this.f27146b, fVar.f27146b);
    }

    public int hashCode() {
        return (this.f27145a.hashCode() * 31) + this.f27146b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f27145a + ", range=" + this.f27146b + ')';
    }
}
