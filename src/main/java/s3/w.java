package s3;

/* JADX INFO: loaded from: classes.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f26185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f26186b;

    w(x xVar, h hVar) {
        this.f26186b = xVar;
        this.f26185a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26186b.f26188b) {
            x xVar = this.f26186b;
            if (xVar.f26189c != null) {
                xVar.f26189c.d((Exception) a3.o.j(this.f26185a.i()));
            }
        }
    }
}
