package e3;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static boolean a(int[] iArr, int i8) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t7) {
        int length = tArr != null ? tArr.length : 0;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (!a3.n.a(tArr[i8], t7)) {
                i8++;
            } else if (i8 >= 0) {
                return true;
            }
        }
        return false;
    }
}
