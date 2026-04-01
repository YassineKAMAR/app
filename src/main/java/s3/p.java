package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class p implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f26170c;

    public p(Executor executor, a aVar, e0 e0Var) {
        this.f26168a = executor;
        this.f26169b = aVar;
        this.f26170c = e0Var;
    }

    @Override // s3.a0
    public final void c(h hVar) {
        this.f26168a.execute(new o(this, hVar));
    }
}
