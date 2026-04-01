package s3;

/* JADX INFO: loaded from: classes.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f26166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f26167b;

    o(p pVar, h hVar) {
        this.f26167b = pVar;
        this.f26166a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26166a.k()) {
            this.f26167b.f26170c.p();
            return;
        }
        try {
            this.f26167b.f26170c.o(this.f26167b.f26169b.a(this.f26166a));
        } catch (g e8) {
            if (e8.getCause() instanceof Exception) {
                this.f26167b.f26170c.n((Exception) e8.getCause());
            } else {
                this.f26167b.f26170c.n(e8);
            }
        } catch (Exception e9) {
            this.f26167b.f26170c.n(e9);
        }
    }
}
