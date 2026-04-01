package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static int a(int i8) {
        if (new t6.f(2, 36).p(i8)) {
            return i8;
        }
        throw new IllegalArgumentException("radix " + i8 + " was not in valid range " + new t6.f(2, 36));
    }

    public static final int b(char c8, int i8) {
        return Character.digit((int) c8, i8);
    }

    public static final boolean c(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }
}
