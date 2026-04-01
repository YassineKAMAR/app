package s3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements Executor {
    c0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
