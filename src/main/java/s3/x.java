package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class x implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26188b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f26189c;

    public x(Executor executor, e eVar) {
        this.f26187a = executor;
        this.f26189c = eVar;
    }

    @Override // s3.a0
    public final void c(h hVar) {
        if (hVar.m() || hVar.k()) {
            return;
        }
        synchronized (this.f26188b) {
            if (this.f26189c == null) {
                return;
            }
            this.f26187a.execute(new w(this, hVar));
        }
    }
}
