package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f21440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f21441b;

    public r(A a8, B b8) {
        this.f21440a = a8;
        this.f21441b = b8;
    }

    public final A a() {
        return this.f21440a;
    }

    public final B b() {
        return this.f21441b;
    }

    public final A c() {
        return this.f21440a;
    }

    public final B d() {
        return this.f21441b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.q.b(this.f21440a, rVar.f21440a) && kotlin.jvm.internal.q.b(this.f21441b, rVar.f21441b);
    }

    public int hashCode() {
        A a8 = this.f21440a;
        int iHashCode = (a8 == null ? 0 : a8.hashCode()) * 31;
        B b8 = this.f21441b;
        return iHashCode + (b8 != null ? b8.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f21440a + ", " + this.f21441b + ')';
    }
}
