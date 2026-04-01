package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
final class gr4 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hr4 f8474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dr4 f8476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IOException f8477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f8479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f8481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ lr4 f8482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr4(lr4 lr4Var, Looper looper, hr4 hr4Var, dr4 dr4Var, int i8, long j8) {
        super(looper);
        this.f8482i = lr4Var;
        this.f8474a = hr4Var;
        this.f8476c = dr4Var;
        this.f8475b = j8;
    }

    private final void d() {
        this.f8477d = null;
        lr4 lr4Var = this.f8482i;
        ExecutorService executorService = lr4Var.f11024a;
        gr4 gr4Var = lr4Var.f11025b;
        gr4Var.getClass();
        executorService.execute(gr4Var);
    }

    public final void a(boolean z7) {
        this.f8481h = z7;
        this.f8477d = null;
        if (hasMessages(0)) {
            this.f8480g = true;
            removeMessages(0);
            if (!z7) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f8480g = true;
                this.f8474a.q();
                Thread thread = this.f8479f;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z7) {
            this.f8482i.f11025b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            dr4 dr4Var = this.f8476c;
            dr4Var.getClass();
            dr4Var.e(this.f8474a, jElapsedRealtime, jElapsedRealtime - this.f8475b, true);
            this.f8476c = null;
        }
    }

    public final void b(int i8) {
        IOException iOException = this.f8477d;
        if (iOException != null && this.f8478e > i8) {
            throw iOException;
        }
    }

    public final void c(long j8) {
        uu1.f(this.f8482i.f11025b == null);
        this.f8482i.f11025b = this;
        if (j8 > 0) {
            sendEmptyMessageDelayed(0, j8);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8481h) {
            return;
        }
        int i8 = message.what;
        if (i8 == 0) {
            d();
            return;
        }
        if (i8 == 3) {
            throw ((Error) message.obj);
        }
        this.f8482i.f11025b = null;
        long j8 = this.f8475b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime - j8;
        dr4 dr4Var = this.f8476c;
        dr4Var.getClass();
        if (this.f8480g) {
            dr4Var.e(this.f8474a, jElapsedRealtime, j9, false);
            return;
        }
        int i9 = message.what;
        if (i9 == 1) {
            try {
                dr4Var.j(this.f8474a, jElapsedRealtime, j9);
                return;
            } catch (RuntimeException e8) {
                pf2.d("LoadTask", "Unexpected exception handling load completed", e8);
                this.f8482i.f11026c = new kr4(e8);
                return;
            }
        }
        if (i9 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f8477d = iOException;
        int i10 = this.f8478e + 1;
        this.f8478e = i10;
        fr4 fr4VarM = dr4Var.m(this.f8474a, jElapsedRealtime, j9, iOException, i10);
        if (fr4VarM.f8006a == 3) {
            this.f8482i.f11026c = this.f8477d;
        } else if (fr4VarM.f8006a != 2) {
            if (fr4VarM.f8006a == 1) {
                this.f8478e = 1;
            }
            c(fr4VarM.f8007b != -9223372036854775807L ? fr4VarM.f8007b : Math.min((this.f8478e - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object kr4Var;
        Message messageObtainMessage;
        boolean z7;
        try {
            synchronized (this) {
                z7 = !this.f8480g;
                this.f8479f = Thread.currentThread();
            }
            if (z7) {
                String str = "load:" + this.f8474a.getClass().getSimpleName();
                int i8 = nz2.f12300a;
                Trace.beginSection(str);
                try {
                    this.f8474a.o();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f8479f = null;
                Thread.interrupted();
            }
            if (this.f8481h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e8) {
            if (this.f8481h) {
                return;
            }
            messageObtainMessage = obtainMessage(2, e8);
            messageObtainMessage.sendToTarget();
        } catch (Exception e9) {
            if (this.f8481h) {
                return;
            }
            pf2.d("LoadTask", "Unexpected exception loading stream", e9);
            kr4Var = new kr4(e9);
            messageObtainMessage = obtainMessage(2, kr4Var);
            messageObtainMessage.sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.f8481h) {
                return;
            }
            pf2.d("LoadTask", "OutOfMemory error loading stream", e10);
            kr4Var = new kr4(e10);
            messageObtainMessage = obtainMessage(2, kr4Var);
            messageObtainMessage.sendToTarget();
        } catch (Error e11) {
            if (!this.f8481h) {
                pf2.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
