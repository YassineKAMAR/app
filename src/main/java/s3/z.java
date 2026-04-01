package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26193b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f26194c;

    public z(Executor executor, f fVar) {
        this.f26192a = executor;
        this.f26194c = fVar;
    }

    @Override // s3.a0
    public final void c(h hVar) {
        if (hVar.m()) {
            synchronized (this.f26193b) {
                if (this.f26194c == null) {
                    return;
                }
                this.f26192a.execute(new y(this, hVar));
            }
        }
    }
}
