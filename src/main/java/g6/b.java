package g6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static <T extends Comparable<?>> int a(T t7, T t8) {
        if (t7 == t8) {
            return 0;
        }
        if (t7 == null) {
            return -1;
        }
        if (t8 == null) {
            return 1;
        }
        return t7.compareTo(t8);
    }
}
