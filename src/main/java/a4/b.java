package a4;

import a4.a;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long[] f194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.C0002a[][] f197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a.C0002a[] f198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigInteger f199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigInteger f201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigInteger f202i;

    /* JADX INFO: renamed from: a4.b$b, reason: collision with other inner class name */
    private static class C0003b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BigInteger f203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BigInteger f204b;

        private C0003b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f199f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f200g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f201h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f202i = bigIntegerModPow;
        C0003b c0003b = new C0003b();
        c0003b.f204b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c0003b.f203a = c(c0003b.f204b);
        f194a = f.c(d(bigIntegerMod));
        f195b = f.c(d(bigIntegerMod2));
        f196c = f.c(d(bigIntegerModPow));
        f197d = (a.C0002a[][]) Array.newInstance((Class<?>) a.C0002a.class, 32, 8);
        C0003b c0003bA = c0003b;
        for (int i8 = 0; i8 < 32; i8++) {
            C0003b c0003bA2 = c0003bA;
            for (int i9 = 0; i9 < 8; i9++) {
                f197d[i8][i9] = b(c0003bA2);
                c0003bA2 = a(c0003bA2, c0003bA);
            }
            for (int i10 = 0; i10 < 8; i10++) {
                c0003bA = a(c0003bA, c0003bA);
            }
        }
        C0003b c0003bA3 = a(c0003b, c0003b);
        f198e = new a.C0002a[8];
        for (int i11 = 0; i11 < 8; i11++) {
            f198e[i11] = b(c0003b);
            c0003b = a(c0003b, c0003bA3);
        }
    }

    private static C0003b a(C0003b c0003b, C0003b c0003b2) {
        C0003b c0003b3 = new C0003b();
        BigInteger bigIntegerMultiply = f200g.multiply(c0003b.f203a.multiply(c0003b2.f203a).multiply(c0003b.f204b).multiply(c0003b2.f204b));
        BigInteger bigInteger = f199f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = c0003b.f203a.multiply(c0003b2.f204b).add(c0003b2.f203a.multiply(c0003b.f204b));
        BigInteger bigInteger2 = BigInteger.ONE;
        c0003b3.f203a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c0003b3.f204b = c0003b.f204b.multiply(c0003b2.f204b).add(c0003b.f203a.multiply(c0003b2.f203a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c0003b3;
    }

    private static a.C0002a b(C0003b c0003b) {
        BigInteger bigIntegerAdd = c0003b.f204b.add(c0003b.f203a);
        BigInteger bigInteger = f199f;
        return new a.C0002a(f.c(d(bigIntegerAdd.mod(bigInteger))), f.c(d(c0003b.f204b.subtract(c0003b.f203a).mod(bigInteger))), f.c(d(f201h.multiply(c0003b.f203a).multiply(c0003b.f204b).mod(bigInteger))));
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f200g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f199f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f202i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i8 = 0; i8 < 16; i8++) {
            byte b8 = bArr[i8];
            int i9 = (32 - i8) - 1;
            bArr[i8] = bArr[i9];
            bArr[i9] = b8;
        }
        return bArr;
    }
}
