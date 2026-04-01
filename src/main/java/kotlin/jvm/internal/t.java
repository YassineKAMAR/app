package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f24321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24322b;

    public t(Class<?> jClass, String moduleName) {
        q.f(jClass, "jClass");
        q.f(moduleName, "moduleName");
        this.f24321a = jClass;
        this.f24322b = moduleName;
    }

    @Override // kotlin.jvm.internal.g
    public Class<?> e() {
        return this.f24321a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && q.b(e(), ((t) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString() + " (Kotlin reflection is not available)";
    }
}
