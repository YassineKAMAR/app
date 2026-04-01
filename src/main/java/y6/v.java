package y6;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p6.l<Throwable, e6.i0> f27555b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, p6.l<? super Throwable, e6.i0> lVar) {
        this.f27554a = obj;
        this.f27555b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.q.b(this.f27554a, vVar.f27554a) && kotlin.jvm.internal.q.b(this.f27555b, vVar.f27555b);
    }

    public int hashCode() {
        Object obj = this.f27554a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f27555b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f27554a + ", onCancellation=" + this.f27555b + ')';
    }
}
