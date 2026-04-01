package o1;

import java.util.Arrays;
import o1.f;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterable<n1.i> f25255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f25256b;

    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterable<n1.i> f25257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f25258b;

        b() {
        }

        @Override // o1.f.a
        public f a() {
            String str = "";
            if (this.f25257a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f25257a, this.f25258b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o1.f.a
        public f.a b(Iterable<n1.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f25257a = iterable;
            return this;
        }

        @Override // o1.f.a
        public f.a c(byte[] bArr) {
            this.f25258b = bArr;
            return this;
        }
    }

    private a(Iterable<n1.i> iterable, byte[] bArr) {
        this.f25255a = iterable;
        this.f25256b = bArr;
    }

    @Override // o1.f
    public Iterable<n1.i> b() {
        return this.f25255a;
    }

    @Override // o1.f
    public byte[] c() {
        return this.f25256b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f25255a.equals(fVar.b())) {
            if (Arrays.equals(this.f25256b, fVar instanceof a ? ((a) fVar).f25256b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25255a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25256b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f25255a + ", extras=" + Arrays.toString(this.f25256b) + "}";
    }
}
