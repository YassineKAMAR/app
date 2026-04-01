package s3;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e0 f26160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f26161b;

    f0(e0 e0Var, Callable callable) {
        this.f26160a = e0Var;
        this.f26161b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26160a.o(this.f26161b.call());
        } catch (Exception e8) {
            this.f26160a.n(e8);
        } catch (Throwable th) {
            this.f26160a.n(new RuntimeException(th));
        }
    }
}
