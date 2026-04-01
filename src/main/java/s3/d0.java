package s3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f26153a = new n3.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26153a.post(runnable);
    }
}
