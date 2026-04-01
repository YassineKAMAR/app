package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class fk4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f7788g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f7789h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f7791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f7792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f7793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yx1 f7794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7795f;

    public fk4(MediaCodec mediaCodec, HandlerThread handlerThread) {
        yx1 yx1Var = new yx1(vv1.f16482a);
        this.f7790a = mediaCodec;
        this.f7791b = handlerThread;
        this.f7794e = yx1Var;
        this.f7793d = new AtomicReference();
    }

    static /* bridge */ /* synthetic */ void a(fk4 fk4Var, Message message) {
        ek4 ek4Var;
        int i8 = message.what;
        ek4 ek4Var2 = null;
        if (i8 == 0) {
            ek4Var = (ek4) message.obj;
            try {
                fk4Var.f7790a.queueInputBuffer(ek4Var.f7391a, 0, ek4Var.f7393c, ek4Var.f7395e, ek4Var.f7396f);
            } catch (RuntimeException e8) {
                e = e8;
                ck4.a(fk4Var.f7793d, null, e);
            }
            ek4Var2 = ek4Var;
        } else if (i8 == 1) {
            ek4Var = (ek4) message.obj;
            int i9 = ek4Var.f7391a;
            MediaCodec.CryptoInfo cryptoInfo = ek4Var.f7394d;
            long j8 = ek4Var.f7395e;
            int i10 = ek4Var.f7396f;
            try {
                synchronized (f7789h) {
                    fk4Var.f7790a.queueSecureInputBuffer(i9, 0, cryptoInfo, j8, i10);
                }
            } catch (RuntimeException e9) {
                e = e9;
                ck4.a(fk4Var.f7793d, null, e);
            }
            ek4Var2 = ek4Var;
        } else if (i8 != 2) {
            ck4.a(fk4Var.f7793d, null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            fk4Var.f7794e.e();
        }
        if (ek4Var2 != null) {
            ArrayDeque arrayDeque = f7788g;
            synchronized (arrayDeque) {
                arrayDeque.add(ek4Var2);
            }
        }
    }

    private static ek4 h() {
        ArrayDeque arrayDeque = f7788g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new ek4();
            }
            return (ek4) arrayDeque.removeFirst();
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void b() {
        if (this.f7795f) {
            try {
                Handler handler = this.f7792c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f7794e.c();
                Handler handler2 = this.f7792c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f7794e.a();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f7793d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void d(int i8, int i9, int i10, long j8, int i11) {
        c();
        ek4 ek4VarH = h();
        ek4VarH.a(i8, 0, i10, j8, i11);
        Handler handler = this.f7792c;
        int i12 = nz2.f12300a;
        handler.obtainMessage(0, ek4VarH).sendToTarget();
    }

    public final void e(int i8, int i9, n94 n94Var, long j8, int i10) {
        c();
        ek4 ek4VarH = h();
        ek4VarH.a(i8, 0, 0, j8, 0);
        MediaCodec.CryptoInfo cryptoInfo = ek4VarH.f7394d;
        cryptoInfo.numSubSamples = n94Var.f11751f;
        cryptoInfo.numBytesOfClearData = j(n94Var.f11749d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(n94Var.f11750e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrI = i(n94Var.f11747b, cryptoInfo.key);
        bArrI.getClass();
        cryptoInfo.key = bArrI;
        byte[] bArrI2 = i(n94Var.f11746a, cryptoInfo.iv);
        bArrI2.getClass();
        cryptoInfo.iv = bArrI2;
        cryptoInfo.mode = n94Var.f11748c;
        if (nz2.f12300a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(n94Var.f11752g, n94Var.f11753h));
        }
        this.f7792c.obtainMessage(1, ek4VarH).sendToTarget();
    }

    public final void f() {
        if (this.f7795f) {
            b();
            this.f7791b.quit();
        }
        this.f7795f = false;
    }

    public final void g() {
        if (this.f7795f) {
            return;
        }
        this.f7791b.start();
        this.f7792c = new dk4(this, this.f7791b.getLooper());
        this.f7795f = true;
    }
}
