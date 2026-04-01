package u1;

import java.util.Set;
import u1.f;

/* JADX INFO: loaded from: classes.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f.c> f26640c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f26641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f26642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<f.c> f26643c;

        b() {
        }

        @Override // u1.f.b.a
        public f.b a() {
            String str = "";
            if (this.f26641a == null) {
                str = " delta";
            }
            if (this.f26642b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f26643c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f26641a.longValue(), this.f26642b.longValue(), this.f26643c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u1.f.b.a
        public f.b.a b(long j8) {
            this.f26641a = Long.valueOf(j8);
            return this;
        }

        @Override // u1.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f26643c = set;
            return this;
        }

        @Override // u1.f.b.a
        public f.b.a d(long j8) {
            this.f26642b = Long.valueOf(j8);
            return this;
        }
    }

    private c(long j8, long j9, Set<f.c> set) {
        this.f26638a = j8;
        this.f26639b = j9;
        this.f26640c = set;
    }

    @Override // u1.f.b
    long b() {
        return this.f26638a;
    }

    @Override // u1.f.b
    Set<f.c> c() {
        return this.f26640c;
    }

    @Override // u1.f.b
    long d() {
        return this.f26639b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f26638a == bVar.b() && this.f26639b == bVar.d() && this.f26640c.equals(bVar.c());
    }

    public int hashCode() {
        long j8 = this.f26638a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f26639b;
        return this.f26640c.hashCode() ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f26638a + ", maxAllowedDelay=" + this.f26639b + ", flags=" + this.f26640c + "}";
    }
}
