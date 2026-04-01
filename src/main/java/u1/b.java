package u1;

import java.util.Map;
import u1.f;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1.a f26636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<l1.d, f.b> f26637b;

    b(x1.a aVar, Map<l1.d, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f26636a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f26637b = map;
    }

    @Override // u1.f
    x1.a e() {
        return this.f26636a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f26636a.equals(fVar.e()) && this.f26637b.equals(fVar.h());
    }

    @Override // u1.f
    Map<l1.d, f.b> h() {
        return this.f26637b;
    }

    public int hashCode() {
        return ((this.f26636a.hashCode() ^ 1000003) * 1000003) ^ this.f26637b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f26636a + ", values=" + this.f26637b + "}";
    }
}
