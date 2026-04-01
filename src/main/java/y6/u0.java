package y6;

/* JADX INFO: loaded from: classes2.dex */
final class u0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27553a;

    public u0(boolean z7) {
        this.f27553a = z7;
    }

    @Override // y6.f1
    public boolean c() {
        return this.f27553a;
    }

    @Override // y6.f1
    public v1 e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(c() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
