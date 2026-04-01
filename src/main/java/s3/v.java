package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26183b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f26184c;

    public v(Executor executor, d dVar) {
        this.f26182a = executor;
        this.f26184c = dVar;
    }

    @Override // s3.a0
    public final void c(h hVar) {
        synchronized (this.f26183b) {
            if (this.f26184c == null) {
                return;
            }
            this.f26182a.execute(new u(this, hVar));
        }
    }
}
