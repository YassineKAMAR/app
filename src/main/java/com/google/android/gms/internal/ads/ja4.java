package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ja4 extends bk0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final cf4 f9541p = new cf4() { // from class: com.google.android.gms.internal.ads.ia4
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f9542q = Integer.toString(1001, 36);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f9543r = Integer.toString(1002, 36);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f9544s = Integer.toString(1003, 36);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f9545t = Integer.toString(1004, 36);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f9546u = Integer.toString(1005, 36);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f9547v = Integer.toString(1006, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nb f9551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tm4 f9553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f9554o;

    private ja4(int i8, Throwable th, int i9) {
        this(i8, th, null, i9, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ja4(int i8, Throwable th, String str, int i9, String str2, int i10, nb nbVar, int i11, boolean z7) {
        String str3;
        String str4;
        if (i8 == 0) {
            str3 = "Source error";
        } else if (i8 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(nbVar);
            int i12 = nz2.f12300a;
            if (i11 == 0) {
                str4 = "NO";
            } else if (i11 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i11 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i11 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i10 + ", format=" + strValueOf + ", format_supported=" + str4;
        }
        this(TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i9, i8, str2, i10, nbVar, i11, null, SystemClock.elapsedRealtime(), z7);
    }

    private ja4(String str, Throwable th, int i8, int i9, String str2, int i10, nb nbVar, int i11, tm4 tm4Var, long j8, boolean z7) {
        boolean z8;
        super(str, th, i8, j8);
        int i12 = i9;
        if (!z7) {
            z8 = true;
        } else if (i12 == 1) {
            i12 = 1;
            z8 = true;
        } else {
            z8 = false;
        }
        uu1.d(z8);
        uu1.d(th != null);
        this.f9548i = i12;
        this.f9549j = str2;
        this.f9550k = i10;
        this.f9551l = nbVar;
        this.f9552m = i11;
        this.f9553n = tm4Var;
        this.f9554o = z7;
    }

    public static ja4 b(Throwable th, String str, int i8, nb nbVar, int i9, boolean z7, int i10) {
        return new ja4(1, th, null, i10, str, i8, nbVar, nbVar == null ? 4 : i9, z7);
    }

    public static ja4 c(IOException iOException, int i8) {
        return new ja4(0, iOException, i8);
    }

    public static ja4 d(RuntimeException runtimeException, int i8) {
        return new ja4(2, runtimeException, i8);
    }

    final ja4 a(tm4 tm4Var) {
        String message = getMessage();
        int i8 = nz2.f12300a;
        return new ja4(message, getCause(), this.f5849a, this.f9548i, this.f9549j, this.f9550k, this.f9551l, this.f9552m, tm4Var, this.f5850b, this.f9554o);
    }
}
