package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9630a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f9631b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9632c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9633d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9634e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9635f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9636g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9637h = -1;

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) objInvoke.getClass().getField("adType").get(objInvoke)).intValue()));
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f9636g;
    }

    public final long b() {
        return this.f9634e;
    }

    public final long c() {
        return this.f9630a;
    }

    public final long d() {
        return this.f9632c;
    }

    public final long e() {
        return this.f9637h;
    }

    public final long f() {
        return this.f9635f;
    }

    public final long g() {
        return this.f9631b;
    }

    public final long h() {
        return this.f9633d;
    }

    public final void i() {
        this.f9637h = this.f9636g;
        this.f9636g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f9631b = this.f9630a;
        this.f9630a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f9633d = this.f9632c;
        this.f9632c = SystemClock.uptimeMillis();
        long j8 = this.f9634e;
        if (j8 != -1) {
            this.f9635f = j8;
        }
        DisplayMetrics displayMetricsL = l(context);
        int i8 = displayMetricsL.widthPixels * displayMetricsL.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsL.widthPixels) * Math.min(view.getHeight(), displayMetricsL.heightPixels);
            if (iMin + iMin >= i8 || (iMin == 0 && m(view))) {
                this.f9634e = this.f9632c;
                return;
            }
        }
        this.f9634e = -1L;
    }
}
