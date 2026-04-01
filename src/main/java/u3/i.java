package u3;

/* JADX INFO: loaded from: classes.dex */
final class i<T> extends g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f26725a;

    i(T t7) {
        this.f26725a = t7;
    }

    @Override // u3.g
    public T b() {
        return this.f26725a;
    }

    @Override // u3.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f26725a.equals(((i) obj).f26725a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26725a.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f26725a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
