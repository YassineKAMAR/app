package s3;

/* JADX INFO: loaded from: classes.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f26176a;

    s(t tVar) {
        this.f26176a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26176a.f26178b) {
            t tVar = this.f26176a;
            if (tVar.f26179c != null) {
                tVar.f26179c.b();
            }
        }
    }
}
