package a4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f218a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f219b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f220c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f221d = {26, 25};

    static byte[] a(long[] jArr) {
        int i8;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j8 = jArrCopyOf[i10];
                int i11 = f221d[i10 & 1];
                int i12 = -((int) (((j8 >> 31) & j8) >> i11));
                jArrCopyOf[i10] = j8 + ((long) (i12 << i11));
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) i12);
            }
            long j9 = jArrCopyOf[9];
            int i13 = -((int) (((j9 >> 31) & j9) >> 25));
            jArrCopyOf[9] = j9 + ((long) (i13 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i13 * 19));
            i9++;
        }
        long j10 = jArrCopyOf[0];
        int i14 = -((int) (((j10 >> 31) & j10) >> 26));
        jArrCopyOf[0] = j10 + ((long) (i14 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i14);
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = 0;
            while (i16 < 9) {
                long j11 = jArrCopyOf[i16];
                int i17 = i16 & 1;
                int i18 = (int) (j11 >> f221d[i17]);
                jArrCopyOf[i16] = j11 & ((long) f220c[i17]);
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + ((long) i18);
            }
        }
        long j12 = jArrCopyOf[9];
        jArrCopyOf[9] = j12 & 33554431;
        long j13 = jArrCopyOf[0] + ((long) (((int) (j12 >> 25)) * 19));
        jArrCopyOf[0] = j13;
        int iD = d((int) j13, 67108845);
        for (int i19 = 1; i19 < 10; i19++) {
            iD &= b((int) jArrCopyOf[i19], f220c[i19 & 1]);
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & iD));
        long j14 = 33554431 & iD;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i8 = 2; i8 < 10; i8 += 2) {
            jArrCopyOf[i8] = jArrCopyOf[i8] - ((long) (67108863 & iD));
            int i20 = i8 + 1;
            jArrCopyOf[i20] = jArrCopyOf[i20] - j14;
        }
        for (int i21 = 0; i21 < 10; i21++) {
            jArrCopyOf[i21] = jArrCopyOf[i21] << f219b[i21];
        }
        byte[] bArr = new byte[32];
        for (int i22 = 0; i22 < 10; i22++) {
            int i23 = f218a[i22];
            long j15 = bArr[i23];
            long j16 = jArrCopyOf[i22];
            bArr[i23] = (byte) (j15 | (j16 & 255));
            bArr[i23 + 1] = (byte) (((long) bArr[r4]) | ((j16 >> 8) & 255));
            bArr[i23 + 2] = (byte) (((long) bArr[r4]) | ((j16 >> 16) & 255));
            bArr[i23 + 3] = (byte) (((long) bArr[r3]) | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    private static int b(int i8, int i9) {
        int i10 = ~(i8 ^ i9);
        int i11 = i10 & (i10 << 16);
        int i12 = i11 & (i11 << 8);
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 << 1)) >> 31;
    }

    static long[] c(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i8 = 0; i8 < 10; i8++) {
            int i9 = f218a[i8];
            jArr[i8] = ((((((long) (bArr[i9] & 255)) | (((long) (bArr[i9 + 1] & 255)) << 8)) | (((long) (bArr[i9 + 2] & 255)) << 16)) | (((long) (bArr[i9 + 3] & 255)) << 24)) >> f219b[i8]) & ((long) f220c[i8 & 1]);
        }
        return jArr;
    }

    private static int d(int i8, int i9) {
        return ~((i8 - i9) >> 31);
    }

    static void e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        k(jArr3, jArr2);
        k(jArr12, jArr3);
        k(jArr11, jArr12);
        f(jArr4, jArr11, jArr2);
        f(jArr5, jArr4, jArr3);
        k(jArr11, jArr5);
        f(jArr6, jArr11, jArr4);
        k(jArr11, jArr6);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        f(jArr7, jArr11, jArr6);
        k(jArr11, jArr7);
        k(jArr12, jArr11);
        for (int i8 = 2; i8 < 10; i8 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr8, jArr12, jArr7);
        k(jArr11, jArr8);
        k(jArr12, jArr11);
        for (int i9 = 2; i9 < 20; i9 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr11, jArr12, jArr8);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            k(jArr12, jArr11);
            k(jArr11, jArr12);
        }
        f(jArr9, jArr11, jArr7);
        k(jArr11, jArr9);
        k(jArr12, jArr11);
        for (int i11 = 2; i11 < 50; i11 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr10, jArr12, jArr9);
        k(jArr12, jArr10);
        k(jArr11, jArr12);
        for (int i12 = 2; i12 < 100; i12 += 2) {
            k(jArr12, jArr11);
            k(jArr11, jArr12);
        }
        f(jArr12, jArr11, jArr10);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            k(jArr11, jArr12);
            k(jArr12, jArr11);
        }
        f(jArr11, jArr12, jArr9);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        k(jArr11, jArr12);
        k(jArr12, jArr11);
        f(jArr, jArr12, jArr5);
    }

    static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        g(jArr4, jArr2, jArr3);
        h(jArr4, jArr);
    }

    static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j8 = jArr2[0];
        long j9 = jArr3[1] * j8;
        long j10 = jArr2[1];
        long j11 = jArr3[0];
        jArr[1] = j9 + (j10 * j11);
        long j12 = jArr2[1];
        long j13 = jArr3[1];
        jArr[2] = (j12 * 2 * j13) + (jArr3[2] * j8) + (jArr2[2] * j11);
        long j14 = jArr3[2];
        long j15 = jArr2[2];
        jArr[3] = (j12 * j14) + (j15 * j13) + (jArr3[3] * j8) + (jArr2[3] * j11);
        long j16 = jArr3[3];
        long j17 = jArr2[3];
        jArr[4] = (j15 * j14) + (((j12 * j16) + (j17 * j13)) * 2) + (jArr3[4] * j8) + (jArr2[4] * j11);
        long j18 = jArr3[4];
        long j19 = jArr2[4];
        jArr[5] = (j15 * j16) + (j17 * j14) + (j12 * j18) + (j19 * j13) + (jArr3[5] * j8) + (jArr2[5] * j11);
        long j20 = jArr3[5];
        long j21 = jArr2[5];
        jArr[6] = (((j17 * j16) + (j12 * j20) + (j21 * j13)) * 2) + (j15 * j18) + (j19 * j14) + (jArr3[6] * j8) + (jArr2[6] * j11);
        long j22 = jArr3[6];
        long j23 = jArr2[6];
        jArr[7] = (j17 * j18) + (j19 * j16) + (j15 * j20) + (j21 * j14) + (j12 * j22) + (j23 * j13) + (jArr3[7] * j8) + (jArr2[7] * j11);
        long j24 = jArr3[7];
        long j25 = jArr2[7];
        jArr[8] = (j19 * j18) + (((j17 * j20) + (j21 * j16) + (j12 * j24) + (j25 * j13)) * 2) + (j15 * j22) + (j23 * j14) + (jArr3[8] * j8) + (jArr2[8] * j11);
        long j26 = jArr3[8];
        long j27 = jArr2[8];
        jArr[9] = (j19 * j20) + (j21 * j18) + (j17 * j22) + (j23 * j16) + (j15 * j24) + (j25 * j14) + (j12 * j26) + (j27 * j13) + (j8 * jArr3[9]) + (jArr2[9] * j11);
        long j28 = jArr3[9];
        long j29 = jArr2[9];
        jArr[10] = (((j21 * j20) + (j17 * j24) + (j25 * j16) + (j12 * j28) + (j13 * j29)) * 2) + (j19 * j22) + (j23 * j18) + (j15 * j26) + (j27 * j14);
        jArr[11] = (j21 * j22) + (j23 * j20) + (j19 * j24) + (j25 * j18) + (j17 * j26) + (j27 * j16) + (j15 * j28) + (j14 * j29);
        jArr[12] = (j23 * j22) + (((j21 * j24) + (j25 * j20) + (j17 * j28) + (j16 * j29)) * 2) + (j19 * j26) + (j27 * j18);
        jArr[13] = (j23 * j24) + (j25 * j22) + (j21 * j26) + (j27 * j20) + (j19 * j28) + (j18 * j29);
        jArr[14] = (((j25 * j24) + (j21 * j28) + (j20 * j29)) * 2) + (j23 * j26) + (j27 * j22);
        jArr[15] = (j25 * j26) + (j27 * j24) + (j23 * j28) + (j22 * j29);
        jArr[16] = (j27 * j26) + (((j25 * j28) + (j24 * j29)) * 2);
        jArr[17] = (j27 * j28) + (j26 * j29);
        jArr[18] = j29 * 2 * j28;
    }

    static void h(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        j(jArr);
        i(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void i(long[] jArr) {
        jArr[10] = 0;
        int i8 = 0;
        while (i8 < 10) {
            long j8 = jArr[i8];
            long j9 = j8 / 67108864;
            jArr[i8] = j8 - (j9 << 26);
            int i9 = i8 + 1;
            long j10 = jArr[i9] + j9;
            jArr[i9] = j10;
            long j11 = j10 / 33554432;
            jArr[i9] = j10 - (j11 << 25);
            i8 += 2;
            jArr[i8] = jArr[i8] + j11;
        }
        long j12 = jArr[0];
        long j13 = jArr[10];
        long j14 = j12 + (j13 << 4);
        jArr[0] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[0] = j15;
        long j16 = j15 + j13;
        jArr[0] = j16;
        jArr[10] = 0;
        long j17 = j16 / 67108864;
        jArr[0] = j16 - (j17 << 26);
        jArr[1] = jArr[1] + j17;
    }

    static void j(long[] jArr) {
        long j8 = jArr[8];
        long j9 = jArr[18];
        long j10 = j8 + (j9 << 4);
        jArr[8] = j10;
        long j11 = j10 + (j9 << 1);
        jArr[8] = j11;
        jArr[8] = j11 + j9;
        long j12 = jArr[7];
        long j13 = jArr[17];
        long j14 = j12 + (j13 << 4);
        jArr[7] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[7] = j15;
        jArr[7] = j15 + j13;
        long j16 = jArr[6];
        long j17 = jArr[16];
        long j18 = j16 + (j17 << 4);
        jArr[6] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[6] = j19;
        jArr[6] = j19 + j17;
        long j20 = jArr[5];
        long j21 = jArr[15];
        long j22 = j20 + (j21 << 4);
        jArr[5] = j22;
        long j23 = j22 + (j21 << 1);
        jArr[5] = j23;
        jArr[5] = j23 + j21;
        long j24 = jArr[4];
        long j25 = jArr[14];
        long j26 = j24 + (j25 << 4);
        jArr[4] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[4] = j27;
        jArr[4] = j27 + j25;
        long j28 = jArr[3];
        long j29 = jArr[13];
        long j30 = j28 + (j29 << 4);
        jArr[3] = j30;
        long j31 = j30 + (j29 << 1);
        jArr[3] = j31;
        jArr[3] = j31 + j29;
        long j32 = jArr[2];
        long j33 = jArr[12];
        long j34 = j32 + (j33 << 4);
        jArr[2] = j34;
        long j35 = j34 + (j33 << 1);
        jArr[2] = j35;
        jArr[2] = j35 + j33;
        long j36 = jArr[1];
        long j37 = jArr[11];
        long j38 = j36 + (j37 << 4);
        jArr[1] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[1] = j39;
        jArr[1] = j39 + j37;
        long j40 = jArr[0];
        long j41 = jArr[10];
        long j42 = j40 + (j41 << 4);
        jArr[0] = j42;
        long j43 = j42 + (j41 << 1);
        jArr[0] = j43;
        jArr[0] = j43 + j41;
    }

    static void k(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        l(jArr3, jArr2);
        h(jArr3, jArr);
    }

    private static void l(long[] jArr, long[] jArr2) {
        long j8 = jArr2[0];
        jArr[0] = j8 * j8;
        long j9 = jArr2[0];
        jArr[1] = j9 * 2 * jArr2[1];
        long j10 = jArr2[1];
        jArr[2] = ((j10 * j10) + (jArr2[2] * j9)) * 2;
        long j11 = jArr2[2];
        jArr[3] = ((j10 * j11) + (jArr2[3] * j9)) * 2;
        long j12 = jArr2[3];
        jArr[4] = (j11 * j11) + (j10 * 4 * j12) + (j9 * 2 * jArr2[4]);
        long j13 = jArr2[4];
        jArr[5] = ((j11 * j12) + (j10 * j13) + (jArr2[5] * j9)) * 2;
        long j14 = (j12 * j12) + (j11 * j13) + (jArr2[6] * j9);
        long j15 = jArr2[5];
        jArr[6] = (j14 + (j10 * 2 * j15)) * 2;
        long j16 = jArr2[6];
        jArr[7] = ((j12 * j13) + (j11 * j15) + (j10 * j16) + (jArr2[7] * j9)) * 2;
        long j17 = (j11 * j16) + (jArr2[8] * j9);
        long j18 = jArr2[7];
        jArr[8] = (j13 * j13) + ((j17 + (((j10 * j18) + (j12 * j15)) * 2)) * 2);
        long j19 = jArr2[8];
        jArr[9] = ((j13 * j15) + (j12 * j16) + (j11 * j18) + (j10 * j19) + (j9 * jArr2[9])) * 2;
        long j20 = jArr2[9];
        jArr[10] = ((j15 * j15) + (j13 * j16) + (j11 * j19) + (((j12 * j18) + (j10 * j20)) * 2)) * 2;
        jArr[11] = ((j15 * j16) + (j13 * j18) + (j12 * j19) + (j11 * j20)) * 2;
        jArr[12] = (j16 * j16) + (((j13 * j19) + (((j15 * j18) + (j12 * j20)) * 2)) * 2);
        jArr[13] = ((j16 * j18) + (j15 * j19) + (j13 * j20)) * 2;
        jArr[14] = ((j18 * j18) + (j16 * j19) + (j15 * 2 * j20)) * 2;
        jArr[15] = ((j18 * j19) + (j16 * j20)) * 2;
        jArr[16] = (j19 * j19) + (j18 * 4 * j20);
        jArr[17] = j19 * 2 * j20;
        jArr[18] = 2 * j20 * j20;
    }

    static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 10; i8++) {
            jArr[i8] = jArr2[i8] - jArr3[i8];
        }
    }

    static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 10; i8++) {
            jArr[i8] = jArr2[i8] + jArr3[i8];
        }
    }
}
