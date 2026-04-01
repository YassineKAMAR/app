package v3;

/* JADX INFO: loaded from: classes.dex */
final class l {
    static int a(int i8, double d8) {
        int iMax = Math.max(i8, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d8 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i9 = iHighestOneBit << 1;
        if (i9 > 0) {
            return i9;
        }
        return 1073741824;
    }

    static int b(int i8) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i8) * (-862048943)), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
