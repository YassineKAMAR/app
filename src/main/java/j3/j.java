package j3;

/* JADX INFO: loaded from: classes.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f24095a;

    /* synthetic */ j(l lVar, i iVar) {
        this.f24095a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jB = this.f24095a.b();
        if (jB == -1 || e3.h.d().a() <= jB) {
            return;
        }
        l.f(this.f24095a.f24097a);
    }
}
