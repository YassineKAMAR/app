package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2716b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2717a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2718b = true;

        public final b a() {
            if (this.f2717a.length() > 0) {
                return new b(this.f2717a, this.f2718b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final a b(String adsSdkName) {
            q.f(adsSdkName, "adsSdkName");
            this.f2717a = adsSdkName;
            return this;
        }

        public final a c(boolean z7) {
            this.f2718b = z7;
            return this;
        }
    }

    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public b(String adsSdkName, boolean z7) {
        q.f(adsSdkName, "adsSdkName");
        this.f2715a = adsSdkName;
        this.f2716b = z7;
    }

    public /* synthetic */ b(String str, boolean z7, int i8, j jVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z7);
    }

    public final String a() {
        return this.f2715a;
    }

    public final boolean b() {
        return this.f2716b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q.b(this.f2715a, bVar.f2715a) && this.f2716b == bVar.f2716b;
    }

    public int hashCode() {
        return (this.f2715a.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.f2716b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f2715a + ", shouldRecordObservation=" + this.f2716b;
    }
}
