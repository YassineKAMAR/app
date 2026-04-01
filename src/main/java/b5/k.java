package b5;

/* JADX INFO: loaded from: classes.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f3343b;

    k(j jVar, Runnable runnable) {
        this.f3342a = jVar;
        this.f3343b = runnable;
    }

    public Integer a() {
        j jVar = this.f3342a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f3342a;
        return jVar != null && jVar.b();
    }
}
