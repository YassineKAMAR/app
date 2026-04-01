package b5;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
class s implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f3363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f3364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f3365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f3366d;

    s(String str, int i8) {
        this.f3363a = str;
        this.f3364b = i8;
    }

    @Override // b5.o
    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    @Override // b5.o
    public void b() {
        HandlerThread handlerThread = this.f3365c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3365c = null;
            this.f3366d = null;
        }
    }

    @Override // b5.o
    public void c(k kVar) {
        this.f3366d.post(kVar.f3343b);
    }

    @Override // b5.o
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f3363a, this.f3364b);
        this.f3365c = handlerThread;
        handlerThread.start();
        this.f3366d = new Handler(this.f3365c.getLooper());
    }
}
