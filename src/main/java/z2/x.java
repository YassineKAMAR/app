package z2;

/* JADX INFO: loaded from: classes.dex */
final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r3.l f27738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f27739b;

    x(z zVar, r3.l lVar) {
        this.f27739b = zVar;
        this.f27738a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.y4(this.f27739b, this.f27738a);
    }
}
