package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, yi0 {
    private static final float[] B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zi0 f5813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f5814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f5815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f5816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f5817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f5818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f5819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f5820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f5821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f5822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f5823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SurfaceTexture f5826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SurfaceTexture f5827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final FloatBuffer f5831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CountDownLatch f5832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f5833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private EGL10 f5834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private EGLDisplay f5835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private EGLContext f5836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private EGLSurface f5837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f5838z;

    public bj0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = B;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f5831s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f5814b = new float[9];
        this.f5815c = new float[9];
        this.f5816d = new float[9];
        this.f5817e = new float[9];
        this.f5818f = new float[9];
        this.f5819g = new float[9];
        this.f5820h = new float[9];
        this.f5821i = Float.NaN;
        zi0 zi0Var = new zi0(context);
        this.f5813a = zi0Var;
        zi0Var.a(this);
        this.f5832t = new CountDownLatch(1);
        this.f5833u = new Object();
    }

    private static final void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    private static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f8 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        fArr[7] = (f26 * f32) + (f29 * fArr3[4]) + (f16 * f31);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    private static final void i(float[] fArr, float f8) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d8 = f8;
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = (float) (-Math.sin(d8));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d8);
        fArr[8] = (float) Math.cos(d8);
    }

    private static final void k(float[] fArr, float f8) {
        double d8 = f8;
        fArr[0] = (float) Math.cos(d8);
        fArr[1] = (float) (-Math.sin(d8));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d8);
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int l(int i8, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i8);
        g("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i8 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.f5827o == null) {
            return null;
        }
        try {
            this.f5832t.await();
        } catch (InterruptedException unused) {
        }
        return this.f5826n;
    }

    public final void b(int i8, int i9) {
        synchronized (this.f5833u) {
            this.f5825m = i8;
            this.f5824l = i9;
            this.f5838z = true;
            this.f5833u.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f5825m = i8;
        this.f5824l = i9;
        this.f5827o = surfaceTexture;
    }

    public final void d() {
        synchronized (this.f5833u) {
            this.A = true;
            this.f5827o = null;
            this.f5833u.notifyAll();
        }
    }

    public final void e(float f8, float f9) {
        float f10 = f9 * 1.7453293f;
        float f11 = f8 * 1.7453293f;
        int i8 = this.f5825m;
        int i9 = this.f5824l;
        float f12 = i8 > i9 ? i8 : i9;
        this.f5822j -= f11 / f12;
        float f13 = this.f5823k - (f10 / f12);
        this.f5823k = f13;
        if (f13 < -1.5707964f) {
            this.f5823k = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f5823k = 1.5707964f;
        }
    }

    final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f5837y;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f5834v.eglDestroySurface(this.f5835w, this.f5837y) | this.f5834v.eglMakeCurrent(this.f5835w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f5837y = null;
        }
        EGLContext eGLContext = this.f5836x;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f5834v.eglDestroyContext(this.f5835w, eGLContext);
            this.f5836x = null;
        }
        EGLDisplay eGLDisplay = this.f5835w;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f5834v.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f5835w = null;
        return zEglTerminate;
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void j() {
        synchronized (this.f5833u) {
            this.f5833u.notifyAll();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5830r++;
        synchronized (this.f5833u) {
            this.f5833u.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj0.run():void");
    }
}
