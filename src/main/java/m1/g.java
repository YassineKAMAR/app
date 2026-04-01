package m1;

import java.util.List;
import m1.m;

/* JADX INFO: loaded from: classes.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f24532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f24533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<l> f24535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f24536g;

    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f24538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k f24539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f24540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<l> f24542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f24543g;

        b() {
        }

        @Override // m1.m.a
        public m a() {
            String str = "";
            if (this.f24537a == null) {
                str = " requestTimeMs";
            }
            if (this.f24538b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f24537a.longValue(), this.f24538b.longValue(), this.f24539c, this.f24540d, this.f24541e, this.f24542f, this.f24543g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.m.a
        public m.a b(k kVar) {
            this.f24539c = kVar;
            return this;
        }

        @Override // m1.m.a
        public m.a c(List<l> list) {
            this.f24542f = list;
            return this;
        }

        @Override // m1.m.a
        m.a d(Integer num) {
            this.f24540d = num;
            return this;
        }

        @Override // m1.m.a
        m.a e(String str) {
            this.f24541e = str;
            return this;
        }

        @Override // m1.m.a
        public m.a f(p pVar) {
            this.f24543g = pVar;
            return this;
        }

        @Override // m1.m.a
        public m.a g(long j8) {
            this.f24537a = Long.valueOf(j8);
            return this;
        }

        @Override // m1.m.a
        public m.a h(long j8) {
            this.f24538b = Long.valueOf(j8);
            return this;
        }
    }

    private g(long j8, long j9, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f24530a = j8;
        this.f24531b = j9;
        this.f24532c = kVar;
        this.f24533d = num;
        this.f24534e = str;
        this.f24535f = list;
        this.f24536g = pVar;
    }

    @Override // m1.m
    public k b() {
        return this.f24532c;
    }

    @Override // m1.m
    public List<l> c() {
        return this.f24535f;
    }

    @Override // m1.m
    public Integer d() {
        return this.f24533d;
    }

    @Override // m1.m
    public String e() {
        return this.f24534e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f24530a == mVar.g() && this.f24531b == mVar.h() && ((kVar = this.f24532c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f24533d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f24534e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f24535f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f24536g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.m
    public p f() {
        return this.f24536g;
    }

    @Override // m1.m
    public long g() {
        return this.f24530a;
    }

    @Override // m1.m
    public long h() {
        return this.f24531b;
    }

    public int hashCode() {
        long j8 = this.f24530a;
        long j9 = this.f24531b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        k kVar = this.f24532c;
        int iHashCode = (i8 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f24533d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24534e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f24535f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f24536g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f24530a + ", requestUptimeMs=" + this.f24531b + ", clientInfo=" + this.f24532c + ", logSource=" + this.f24533d + ", logSourceName=" + this.f24534e + ", logEvents=" + this.f24535f + ", qosTier=" + this.f24536g + "}";
    }
}
