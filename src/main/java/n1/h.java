package n1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1.b f25113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f25114b;

    public h(l1.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f25113a = bVar;
        this.f25114b = bArr;
    }

    public byte[] a() {
        return this.f25114b;
    }

    public l1.b b() {
        return this.f25113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f25113a.equals(hVar.f25113a)) {
            return Arrays.equals(this.f25114b, hVar.f25114b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25113a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25114b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f25113a + ", bytes=[...]}";
    }
}
