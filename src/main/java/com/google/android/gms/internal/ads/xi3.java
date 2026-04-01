package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class xi3 implements fh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ni3 f17242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xs3 f17243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xs3 f17244c;

    /* synthetic */ xi3(ni3 ni3Var, wi3 wi3Var) {
        xs3 xs3VarA;
        this.f17242a = ni3Var;
        if (ni3Var.f()) {
            ys3 ys3VarB = uo3.a().b();
            dt3 dt3VarA = ro3.a(ni3Var);
            this.f17243b = ys3VarB.a(dt3VarA, "aead", "encrypt");
            xs3VarA = ys3VarB.a(dt3VarA, "aead", "decrypt");
        } else {
            xs3VarA = ro3.f14255a;
            this.f17243b = xs3VarA;
        }
        this.f17244c = xs3VarA;
    }

    @Override // com.google.android.gms.internal.ads.fh3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (ii3 ii3Var : this.f17242a.e(bArrCopyOf)) {
                try {
                    byte[] bArrA = ((fh3) ii3Var.e()).a(bArrCopyOfRange, bArr2);
                    ii3Var.a();
                    int length2 = bArrCopyOfRange.length;
                    return bArrA;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (ii3 ii3Var2 : this.f17242a.e(lh3.f10729a)) {
            try {
                byte[] bArrA2 = ((fh3) ii3Var2.e()).a(bArr, bArr2);
                ii3Var2.a();
                return bArrA2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
