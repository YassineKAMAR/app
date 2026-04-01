package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
final class c22 {
    public static int a() throws d32 {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        e42.a();
        return iArr[0];
    }

    public static EGLContext b(EGLContext eGLContext, EGLDisplay eGLDisplay, int i8, int[] iArr) throws d32 {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, l(eGLDisplay, iArr), eGLContext, new int[]{12440, i8, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            e42.a();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new d32("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i8);
    }

    public static EGLContext c() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay d() throws d32 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        e42.b(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        e42.b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e42.a();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface e(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws d32 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, l(eGLDisplay, iArr), iArr2, 0);
        g("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static EGLSurface f(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws d32 {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, l(eGLDisplay, iArr), obj, iArr2, 0);
        g("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static void g(String str) throws d32 {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new d32(str + ", error code: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext) throws d32 {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        g("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            g("Error destroying context");
        }
        EGL14.eglReleaseThread();
        g("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        g("Error terminating display");
    }

    public static void i(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws d32 {
        if (eGLDisplay == null || eGLSurface == null) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        g("Error destroying surface");
    }

    public static void j(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i8, int i9, int i10) throws d32 {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        g("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i8) {
            GLES20.glBindFramebuffer(36160, i8);
        }
        e42.a();
        GLES20.glViewport(0, 0, i9, i10);
        e42.a();
    }

    public static boolean k(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    private static EGLConfig l(EGLDisplay eGLDisplay, int[] iArr) throws d32 {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new d32("eglChooseConfig failed.");
    }
}
