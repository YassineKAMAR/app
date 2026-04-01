package d2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<a> f20982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f20983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CountDownLatch f20984c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f20985d = false;

    public c(a aVar, long j8) {
        this.f20982a = new WeakReference<>(aVar);
        this.f20983b = j8;
        start();
    }

    private final void a() {
        a aVar = this.f20982a.get();
        if (aVar != null) {
            aVar.f();
            this.f20985d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f20984c.await(this.f20983b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
