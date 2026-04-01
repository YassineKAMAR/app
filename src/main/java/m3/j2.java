package m3;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o2 f24741a;

    public static void a(o2 o2Var, o2 o2Var2) {
        j2 j2Var = (j2) o2Var;
        if (j2Var.f24741a != null) {
            throw new IllegalStateException();
        }
        j2Var.f24741a = o2Var2;
    }

    @Override // m3.o2
    public final Object k() {
        o2 o2Var = this.f24741a;
        if (o2Var != null) {
            return o2Var.k();
        }
        throw new IllegalStateException();
    }
}
