package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class e<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f2132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f2133b;

    public e(F f8, S s8) {
        this.f2132a = f8;
        this.f2133b = s8;
    }

    public static <A, B> e<A, B> a(A a8, B b8) {
        return new e<>(a8, b8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f2132a, this.f2132a) && d.a(eVar.f2133b, this.f2133b);
    }

    public int hashCode() {
        F f8 = this.f2132a;
        int iHashCode = f8 == null ? 0 : f8.hashCode();
        S s8 = this.f2133b;
        return iHashCode ^ (s8 != null ? s8.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2132a + " " + this.f2133b + "}";
    }
}
