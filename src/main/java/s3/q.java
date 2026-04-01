package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f26171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26172b;

    q(r rVar, h hVar) {
        this.f26172b = rVar;
        this.f26171a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVar = (h) this.f26172b.f26174b.a(this.f26171a);
            if (hVar == null) {
                this.f26172b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f26164b;
            hVar.e(executor, this.f26172b);
            hVar.d(executor, this.f26172b);
            hVar.a(executor, this.f26172b);
        } catch (g e8) {
            if (e8.getCause() instanceof Exception) {
                this.f26172b.f26175c.n((Exception) e8.getCause());
            } else {
                this.f26172b.f26175c.n(e8);
            }
        } catch (Exception e9) {
            this.f26172b.f26175c.n(e9);
        }
    }
}
