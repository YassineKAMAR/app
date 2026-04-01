package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: loaded from: classes.dex */
public final class e42 {
    public static void a() throws d32 {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new d32(sb.toString());
        }
    }

    public static void b(boolean z7, String str) throws d32 {
        if (!z7) {
            throw new d32(str);
        }
    }

    public static boolean c(Context context) {
        int i8 = nz2.f12300a;
        if (i8 < 24) {
            return false;
        }
        if (i8 < 26 && ("samsung".equals(nz2.f12302c) || "XT1650".equals(nz2.f12303d))) {
            return false;
        }
        if (i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return c22.k("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean d() {
        int i8 = nz2.f12300a;
        return c22.k("EGL_KHR_surfaceless_context");
    }
}
