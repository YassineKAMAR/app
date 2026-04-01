package s3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class m<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f26165a = new CountDownLatch(1);

    /* synthetic */ m(l lVar) {
    }

    @Override // s3.f
    public final void a(T t7) {
        this.f26165a.countDown();
    }

    @Override // s3.c
    public final void b() {
        this.f26165a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f26165a.await();
    }

    @Override // s3.e
    public final void d(Exception exc) {
        this.f26165a.countDown();
    }

    public final boolean e(long j8, TimeUnit timeUnit) {
        return this.f26165a.await(j8, timeUnit);
    }
}
