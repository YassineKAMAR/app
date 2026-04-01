package p3;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        a3.o.j(strArr);
        a3.o.j(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < iMin; i8++) {
            String str2 = strArr[i8];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i8];
            }
        }
        return null;
    }
}
