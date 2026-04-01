package m7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1<Array> {
    public static /* synthetic */ void c(u1 u1Var, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i9 & 1) != 0) {
            i8 = u1Var.d() + 1;
        }
        u1Var.b(i8);
    }

    public abstract Array a();

    public abstract void b(int i8);

    public abstract int d();
}
