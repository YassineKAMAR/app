package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class t implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26178b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26179c;

    public t(Executor executor, c cVar) {
        this.f26177a = executor;
        this.f26179c = cVar;
    }

    @Override // s3.a0
    public final void c(h hVar) {
        if (hVar.k()) {
            synchronized (this.f26178b) {
                if (this.f26179c == null) {
                    return;
                }
                this.f26177a.execute(new s(this));
            }
        }
    }
}
