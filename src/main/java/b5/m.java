package b5;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f3348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f3349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Runnable f3350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f3351f;

    m(String str, int i8) {
        this.f3346a = str;
        this.f3347b = i8;
    }

    boolean b() {
        k kVar = this.f3351f;
        return kVar != null && kVar.b();
    }

    Integer d() {
        k kVar = this.f3351f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    void e(final k kVar) {
        this.f3349d.post(new Runnable() { // from class: b5.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f3344a.c(kVar);
            }
        });
    }

    synchronized void f() {
        HandlerThread handlerThread = this.f3348c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3348c = null;
            this.f3349d = null;
        }
    }

    synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f3346a, this.f3347b);
        this.f3348c = handlerThread;
        handlerThread.start();
        this.f3349d = new Handler(this.f3348c.getLooper());
        this.f3350e = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.f3343b.run();
        this.f3351f = kVar;
        this.f3350e.run();
    }
}
