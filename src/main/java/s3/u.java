package s3;

/* JADX INFO: loaded from: classes.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f26180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f26181b;

    u(v vVar, h hVar) {
        this.f26181b = vVar;
        this.f26180a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26181b.f26183b) {
            v vVar = this.f26181b;
            if (vVar.f26184c != null) {
                vVar.f26184c.a(this.f26180a);
            }
        }
    }
}
