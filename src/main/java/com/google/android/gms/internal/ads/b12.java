package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b12 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f5558g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f5560b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f5561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLContext f5562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLSurface f5563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceTexture f5564f;

    public b12(Handler handler, a02 a02Var) {
        this.f5559a = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f5564f;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i8) throws d32 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        e42.b(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        e42.b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f5561c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f5558g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        e42.b(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f5561c, eGLConfig, EGL14.EGL_NO_CONTEXT, i8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        e42.b(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f5562d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f5561c;
        if (i8 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i8 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            e42.b(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        e42.b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f5563e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f5560b, 0);
        e42.a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5560b[0]);
        this.f5564f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.f5559a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f5564f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f5560b, 0);
            }
            EGLDisplay eGLDisplay = this.f5561c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f5561c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f5563e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f5561c, this.f5563e);
            }
            EGLContext eGLContext = this.f5562d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f5561c, eGLContext);
            }
            int i8 = nz2.f12300a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f5561c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f5561c);
            }
            this.f5561c = null;
            this.f5562d = null;
            this.f5563e = null;
            this.f5564f = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f5561c;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f5561c;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f5563e;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f5561c, this.f5563e);
            }
            EGLContext eGLContext2 = this.f5562d;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f5561c, eGLContext2);
            }
            int i9 = nz2.f12300a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f5561c;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f5561c);
            }
            this.f5561c = null;
            this.f5562d = null;
            this.f5563e = null;
            this.f5564f = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5559a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f5564f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
