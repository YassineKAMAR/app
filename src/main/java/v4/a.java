package v4;

/* JADX INFO: loaded from: classes.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26939b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f26938a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f26939b = str2;
    }

    @Override // v4.f
    public String b() {
        return this.f26938a;
    }

    @Override // v4.f
    public String c() {
        return this.f26939b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f26938a.equals(fVar.b()) && this.f26939b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f26938a.hashCode() ^ 1000003) * 1000003) ^ this.f26939b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f26938a + ", version=" + this.f26939b + "}";
    }
}
