package s3;

/* JADX INFO: loaded from: classes.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f26190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f26191b;

    y(z zVar, h hVar) {
        this.f26191b = zVar;
        this.f26190a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26191b.f26193b) {
            z zVar = this.f26191b;
            if (zVar.f26194c != null) {
                zVar.f26194c.a(this.f26190a.j());
            }
        }
    }
}
