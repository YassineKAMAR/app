package n1;

import java.util.Arrays;
import n1.o;

/* JADX INFO: loaded from: classes.dex */
final class d extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f25094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1.d f25095c;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f25097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l1.d f25098c;

        b() {
        }

        @Override // n1.o.a
        public o a() {
            String str = "";
            if (this.f25096a == null) {
                str = " backendName";
            }
            if (this.f25098c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f25096a, this.f25097b, this.f25098c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n1.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f25096a = str;
            return this;
        }

        @Override // n1.o.a
        public o.a c(byte[] bArr) {
            this.f25097b = bArr;
            return this;
        }

        @Override // n1.o.a
        public o.a d(l1.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f25098c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, l1.d dVar) {
        this.f25093a = str;
        this.f25094b = bArr;
        this.f25095c = dVar;
    }

    @Override // n1.o
    public String b() {
        return this.f25093a;
    }

    @Override // n1.o
    public byte[] c() {
        return this.f25094b;
    }

    @Override // n1.o
    public l1.d d() {
        return this.f25095c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f25093a.equals(oVar.b())) {
            if (Arrays.equals(this.f25094b, oVar instanceof d ? ((d) oVar).f25094b : oVar.c()) && this.f25095c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f25093a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25094b)) * 1000003) ^ this.f25095c.hashCode();
    }
}
