package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class r<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f26175c;

    public r(Executor executor, a aVar, e0 e0Var) {
        this.f26173a = executor;
        this.f26174b = aVar;
        this.f26175c = e0Var;
    }

    @Override // s3.f
    public final void a(TContinuationResult tcontinuationresult) {
        this.f26175c.o(tcontinuationresult);
    }

    @Override // s3.c
    public final void b() {
        this.f26175c.p();
    }

    @Override // s3.a0
    public final void c(h hVar) {
        this.f26173a.execute(new q(this, hVar));
    }

    @Override // s3.e
    public final void d(Exception exc) {
        this.f26175c.n(exc);
    }
}
