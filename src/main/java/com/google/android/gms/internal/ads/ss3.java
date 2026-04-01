package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ss3 implements ei3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f14811d = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ei3 f14812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dx3 f14813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14814c;

    private ss3(ei3 ei3Var, dx3 dx3Var, byte[] bArr) {
        this.f14812a = ei3Var;
        this.f14813b = dx3Var;
        this.f14814c = bArr;
    }

    public static ei3 b(mo3 mo3Var) throws GeneralSecurityException {
        ByteBuffer byteBufferPut;
        byte[] bArrArray;
        tp3 tp3VarA = mo3Var.a(mh3.a());
        sv3 sv3VarM = vv3.M();
        sv3VarM.v(tp3VarA.f());
        sv3VarM.w(tp3VarA.d());
        sv3VarM.u(tp3VarA.b());
        ei3 ei3Var = (ei3) qi3.c((vv3) sv3VarM.q(), ei3.class);
        dx3 dx3VarC = tp3VarA.c();
        dx3 dx3Var = dx3.UNKNOWN_PREFIX;
        int iOrdinal = dx3VarC.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    bArrArray = new byte[0];
                    return new ss3(ei3Var, dx3VarC, bArrArray);
                }
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            byteBufferPut = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            byteBufferPut = ByteBuffer.allocate(5).put((byte) 1);
        }
        bArrArray = byteBufferPut.putInt(mo3Var.b().intValue()).array();
        return new ss3(ei3Var, dx3VarC, bArrArray);
    }

    @Override // com.google.android.gms.internal.ads.ei3
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f14813b.equals(dx3.LEGACY)) {
            bArr2 = tx3.b(bArr2, f14811d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f14813b.equals(dx3.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f14814c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f14812a.a(bArr, bArr2);
    }
}
