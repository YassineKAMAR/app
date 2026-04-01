package m1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<m> f24511a;

    d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f24511a = list;
    }

    @Override // m1.j
    public List<m> c() {
        return this.f24511a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f24511a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f24511a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f24511a + "}";
    }
}
