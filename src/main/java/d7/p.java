package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final void a(int i8) {
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i8).toString());
    }
}
