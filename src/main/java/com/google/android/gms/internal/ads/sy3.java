package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class sy3 implements ei3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f14864e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final et3 f14865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f14868d;

    public sy3(et3 et3Var, int i8) throws InvalidAlgorithmParameterException {
        this.f14865a = et3Var;
        this.f14866b = i8;
        this.f14867c = new byte[0];
        this.f14868d = new byte[0];
        if (i8 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        et3Var.a(new byte[0], i8);
    }

    private sy3(kr3 kr3Var) {
        String strValueOf = String.valueOf(kr3Var.d().e());
        this.f14865a = new ry3("HMAC".concat(strValueOf), new SecretKeySpec(kr3Var.e().c(mh3.a()), "HMAC"));
        this.f14866b = kr3Var.d().a();
        this.f14867c = kr3Var.b().c();
        if (kr3Var.d().f().equals(ur3.f15824d)) {
            this.f14868d = Arrays.copyOf(f14864e, 1);
        } else {
            this.f14868d = new byte[0];
        }
    }

    private sy3(mq3 mq3Var) {
        this.f14865a = new py3(mq3Var.d().c(mh3.a()));
        this.f14866b = mq3Var.c().a();
        this.f14867c = mq3Var.b().c();
        if (mq3Var.c().d().equals(vq3.f16421d)) {
            this.f14868d = Arrays.copyOf(f14864e, 1);
        } else {
            this.f14868d = new byte[0];
        }
    }

    public static ei3 b(mq3 mq3Var) {
        return new sy3(mq3Var);
    }

    public static ei3 c(kr3 kr3Var) {
        return new sy3(kr3Var);
    }

    @Override // com.google.android.gms.internal.ads.ei3
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14868d;
        if (!MessageDigest.isEqual(bArr3.length > 0 ? tx3.b(this.f14867c, this.f14865a.a(tx3.b(bArr2, bArr3), this.f14866b)) : tx3.b(this.f14867c, this.f14865a.a(bArr2, this.f14866b)), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
