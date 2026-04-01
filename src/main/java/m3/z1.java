package m3;

/* JADX INFO: loaded from: classes.dex */
final class z1 extends v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f24865c;

    z1(b2 b2Var, int i8) {
        super(b2Var.size(), i8);
        this.f24865c = b2Var;
    }

    @Override // m3.v1
    protected final Object a(int i8) {
        return this.f24865c.get(i8);
    }
}
