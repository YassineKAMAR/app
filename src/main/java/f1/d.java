package f1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f21624b;

    public d(String str, long j8) {
        this.f21623a = str;
        this.f21624b = Long.valueOf(j8);
    }

    public d(String str, boolean z7) {
        this(str, z7 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f21623a.equals(dVar.f21623a)) {
            return false;
        }
        Long l8 = this.f21624b;
        Long l9 = dVar.f21624b;
        return l8 != null ? l8.equals(l9) : l9 == null;
    }

    public int hashCode() {
        int iHashCode = this.f21623a.hashCode() * 31;
        Long l8 = this.f21624b;
        return iHashCode + (l8 != null ? l8.hashCode() : 0);
    }
}
