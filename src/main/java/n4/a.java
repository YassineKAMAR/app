package n4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f25142b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f25141a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f25142b = list;
    }

    @Override // n4.m
    public List<String> b() {
        return this.f25142b;
    }

    @Override // n4.m
    public String c() {
        return this.f25141a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f25141a.equals(mVar.c()) && this.f25142b.equals(mVar.b());
    }

    public int hashCode() {
        return ((this.f25141a.hashCode() ^ 1000003) * 1000003) ^ this.f25142b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f25141a + ", usedDates=" + this.f25142b + "}";
    }
}
