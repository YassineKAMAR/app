package f1;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21629b;

    public g(String str, int i8) {
        this.f21628a = str;
        this.f21629b = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f21629b != gVar.f21629b) {
            return false;
        }
        return this.f21628a.equals(gVar.f21628a);
    }

    public int hashCode() {
        return (this.f21628a.hashCode() * 31) + this.f21629b;
    }
}
