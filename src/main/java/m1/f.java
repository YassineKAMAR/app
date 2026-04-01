package m1;

import java.util.Arrays;
import m1.l;

/* JADX INFO: loaded from: classes.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f24517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f24519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f24522g;

    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f24524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f24525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f24526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f24528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f24529g;

        b() {
        }

        @Override // m1.l.a
        public l a() {
            String str = "";
            if (this.f24523a == null) {
                str = " eventTimeMs";
            }
            if (this.f24525c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f24528f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f24523a.longValue(), this.f24524b, this.f24525c.longValue(), this.f24526d, this.f24527e, this.f24528f.longValue(), this.f24529g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m1.l.a
        public l.a b(Integer num) {
            this.f24524b = num;
            return this;
        }

        @Override // m1.l.a
        public l.a c(long j8) {
            this.f24523a = Long.valueOf(j8);
            return this;
        }

        @Override // m1.l.a
        public l.a d(long j8) {
            this.f24525c = Long.valueOf(j8);
            return this;
        }

        @Override // m1.l.a
        public l.a e(o oVar) {
            this.f24529g = oVar;
            return this;
        }

        @Override // m1.l.a
        l.a f(byte[] bArr) {
            this.f24526d = bArr;
            return this;
        }

        @Override // m1.l.a
        l.a g(String str) {
            this.f24527e = str;
            return this;
        }

        @Override // m1.l.a
        public l.a h(long j8) {
            this.f24528f = Long.valueOf(j8);
            return this;
        }
    }

    private f(long j8, Integer num, long j9, byte[] bArr, String str, long j10, o oVar) {
        this.f24516a = j8;
        this.f24517b = num;
        this.f24518c = j9;
        this.f24519d = bArr;
        this.f24520e = str;
        this.f24521f = j10;
        this.f24522g = oVar;
    }

    @Override // m1.l
    public Integer b() {
        return this.f24517b;
    }

    @Override // m1.l
    public long c() {
        return this.f24516a;
    }

    @Override // m1.l
    public long d() {
        return this.f24518c;
    }

    @Override // m1.l
    public o e() {
        return this.f24522g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f24516a == lVar.c() && ((num = this.f24517b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f24518c == lVar.d()) {
            if (Arrays.equals(this.f24519d, lVar instanceof f ? ((f) lVar).f24519d : lVar.f()) && ((str = this.f24520e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f24521f == lVar.h()) {
                o oVar = this.f24522g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m1.l
    public byte[] f() {
        return this.f24519d;
    }

    @Override // m1.l
    public String g() {
        return this.f24520e;
    }

    @Override // m1.l
    public long h() {
        return this.f24521f;
    }

    public int hashCode() {
        long j8 = this.f24516a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f24517b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j9 = this.f24518c;
        int iHashCode2 = (((((i8 ^ iHashCode) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f24519d)) * 1000003;
        String str = this.f24520e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j10 = this.f24521f;
        int i9 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        o oVar = this.f24522g;
        return i9 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f24516a + ", eventCode=" + this.f24517b + ", eventUptimeMs=" + this.f24518c + ", sourceExtension=" + Arrays.toString(this.f24519d) + ", sourceExtensionJsonProto3=" + this.f24520e + ", timezoneOffsetSeconds=" + this.f24521f + ", networkConnectionInfo=" + this.f24522g + "}";
    }
}
