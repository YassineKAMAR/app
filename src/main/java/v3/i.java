package v3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class i {
    static Object a(int i8) {
        if (i8 >= 2 && i8 <= 1073741824 && Integer.highestOneBit(i8) == i8) {
            return i8 <= 256 ? new byte[i8] : i8 <= 65536 ? new short[i8] : new int[i8];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    static int b(int i8, int i9) {
        return i8 & (~i9);
    }

    static int c(int i8, int i9) {
        return i8 & i9;
    }

    static int d(int i8, int i9, int i10) {
        return (i8 & (~i10)) | (i9 & i10);
    }

    static int e(int i8) {
        return (i8 < 32 ? 4 : 2) * (i8 + 1);
    }

    static int f(Object obj, Object obj2, int i8, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i9;
        int i10;
        int iC = l.c(obj);
        int i11 = iC & i8;
        int iH = h(obj3, i11);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i8);
        int i12 = -1;
        while (true) {
            i9 = iH - 1;
            i10 = iArr[i9];
            if (b(i10, i8) == iB && u3.f.a(obj, objArr[i9]) && (objArr2 == null || u3.f.a(obj2, objArr2[i9]))) {
                break;
            }
            int iC2 = c(i10, i8);
            if (iC2 == 0) {
                return -1;
            }
            i12 = i9;
            iH = iC2;
        }
        int iC3 = c(i10, i8);
        if (i12 == -1) {
            i(obj3, i11, iC3);
        } else {
            iArr[i12] = d(iArr[i12], iC3, i8);
        }
        return i9;
    }

    static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(Object obj, int i8) {
        return obj instanceof byte[] ? ((byte[]) obj)[i8] & 255 : obj instanceof short[] ? ((short[]) obj)[i8] & 65535 : ((int[]) obj)[i8];
    }

    static void i(Object obj, int i8, int i9) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i8] = (byte) i9;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i8] = (short) i9;
        } else {
            ((int[]) obj)[i8] = i9;
        }
    }

    static int j(int i8) {
        return Math.max(4, l.a(i8 + 1, 1.0d));
    }
}
