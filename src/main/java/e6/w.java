package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f21453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f21454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f21455c;

    public w(A a8, B b8, C c8) {
        this.f21453a = a8;
        this.f21454b = b8;
        this.f21455c = c8;
    }

    public final A a() {
        return this.f21453a;
    }

    public final B b() {
        return this.f21454b;
    }

    public final C c() {
        return this.f21455c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.q.b(this.f21453a, wVar.f21453a) && kotlin.jvm.internal.q.b(this.f21454b, wVar.f21454b) && kotlin.jvm.internal.q.b(this.f21455c, wVar.f21455c);
    }

    public int hashCode() {
        A a8 = this.f21453a;
        int iHashCode = (a8 == null ? 0 : a8.hashCode()) * 31;
        B b8 = this.f21454b;
        int iHashCode2 = (iHashCode + (b8 == null ? 0 : b8.hashCode())) * 31;
        C c8 = this.f21455c;
        return iHashCode2 + (c8 != null ? c8.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f21453a + ", " + this.f21454b + ", " + this.f21455c + ')';
    }
}
