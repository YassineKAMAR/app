package y6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class r0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f27532a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b0 b0Var = this.f27532a;
        h6.h hVar = h6.h.f22443a;
        if (b0Var.f0(hVar)) {
            this.f27532a.e0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f27532a.toString();
    }
}
