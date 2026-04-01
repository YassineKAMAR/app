package n1;

import java.util.Map;
import n1.i;

/* JADX INFO: loaded from: classes.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f25072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f25073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, String> f25076f;

    /* JADX INFO: renamed from: n1.b$b, reason: collision with other inner class name */
    static final class C0152b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f25078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f25079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f25080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f25081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String> f25082f;

        C0152b() {
        }

        @Override // n1.i.a
        public i d() {
            String str = "";
            if (this.f25077a == null) {
                str = " transportName";
            }
            if (this.f25079c == null) {
                str = str + " encodedPayload";
            }
            if (this.f25080d == null) {
                str = str + " eventMillis";
            }
            if (this.f25081e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f25082f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f25077a, this.f25078b, this.f25079c, this.f25080d.longValue(), this.f25081e.longValue(), this.f25082f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n1.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f25082f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // n1.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f25082f = map;
            return this;
        }

        @Override // n1.i.a
        public i.a g(Integer num) {
            this.f25078b = num;
            return this;
        }

        @Override // n1.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f25079c = hVar;
            return this;
        }

        @Override // n1.i.a
        public i.a i(long j8) {
            this.f25080d = Long.valueOf(j8);
            return this;
        }

        @Override // n1.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f25077a = str;
            return this;
        }

        @Override // n1.i.a
        public i.a k(long j8) {
            this.f25081e = Long.valueOf(j8);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j8, long j9, Map<String, String> map) {
        this.f25071a = str;
        this.f25072b = num;
        this.f25073c = hVar;
        this.f25074d = j8;
        this.f25075e = j9;
        this.f25076f = map;
    }

    @Override // n1.i
    protected Map<String, String> c() {
        return this.f25076f;
    }

    @Override // n1.i
    public Integer d() {
        return this.f25072b;
    }

    @Override // n1.i
    public h e() {
        return this.f25073c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25071a.equals(iVar.j()) && ((num = this.f25072b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f25073c.equals(iVar.e()) && this.f25074d == iVar.f() && this.f25075e == iVar.k() && this.f25076f.equals(iVar.c());
    }

    @Override // n1.i
    public long f() {
        return this.f25074d;
    }

    public int hashCode() {
        int iHashCode = (this.f25071a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f25072b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f25073c.hashCode()) * 1000003;
        long j8 = this.f25074d;
        int i8 = (iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f25075e;
        return ((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f25076f.hashCode();
    }

    @Override // n1.i
    public String j() {
        return this.f25071a;
    }

    @Override // n1.i
    public long k() {
        return this.f25075e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f25071a + ", code=" + this.f25072b + ", encodedPayload=" + this.f25073c + ", eventMillis=" + this.f25074d + ", uptimeMillis=" + this.f25075e + ", autoMetadata=" + this.f25076f + "}";
    }
}
