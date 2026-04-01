package a4;

import java.security.GeneralSecurityException;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0199b f205b = b.EnumC0199b.f27750a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4.a f206a;

    public c(byte[] bArr) {
        if (!f205b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f206a = b4.a.a(bArr);
    }

    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!a.s(bArr2, bArr, this.f206a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
