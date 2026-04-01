package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class is4 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b12 f9341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f9342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Error f9343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RuntimeException f9344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ks4 f9345e;

    public is4() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final ks4 a(int i8) {
        boolean z7;
        start();
        this.f9342b = new Handler(getLooper(), this);
        this.f9341a = new b12(this.f9342b, null);
        synchronized (this) {
            z7 = false;
            this.f9342b.obtainMessage(1, i8, 0).sendToTarget();
            while (this.f9345e == null && this.f9344d == null && this.f9343c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f9344d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f9343c;
        if (error != null) {
            throw error;
        }
        ks4 ks4Var = this.f9345e;
        ks4Var.getClass();
        return ks4Var;
    }

    public final void b() {
        Handler handler = this.f9342b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        try {
            if (i8 != 1) {
                if (i8 != 2) {
                    return true;
                }
                try {
                    b12 b12Var = this.f9341a;
                    b12Var.getClass();
                    b12Var.c();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    int i9 = message.arg1;
                    b12 b12Var2 = this.f9341a;
                    b12Var2.getClass();
                    b12Var2.b(i9);
                    this.f9345e = new ks4(this, this.f9341a.a(), i9 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    pf2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f9343c = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    pf2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f9344d = e9;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (d32 e10) {
                pf2.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f9344d = new IllegalStateException(e10);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
