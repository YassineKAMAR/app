package z2;

/* JADX INFO: loaded from: classes.dex */
public final class f<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f27704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27705b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f27704a == fVar.f27704a && this.f27705b.equals(fVar.f27705b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f27704a) * 31) + this.f27705b.hashCode();
    }
}
