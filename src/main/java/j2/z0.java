package j2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.e53;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f24083a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f24084b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24085c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24086d = new Object();

    public final Handler a() {
        return this.f24084b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f24086d) {
            if (this.f24085c != 0) {
                a3.o.k(this.f24083a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f24083a == null) {
                v1.k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f24083a = handlerThread;
                handlerThread.start();
                this.f24084b = new e53(this.f24083a.getLooper());
                v1.k("Looper thread started.");
            } else {
                v1.k("Resuming the looper thread");
                this.f24086d.notifyAll();
            }
            this.f24085c++;
            looper = this.f24083a.getLooper();
        }
        return looper;
    }
}
