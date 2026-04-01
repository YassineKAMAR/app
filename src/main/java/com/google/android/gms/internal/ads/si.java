package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class si {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f14703e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14704a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14705b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14706c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14707d = false;

    si(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new qi(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static si d(Context context, Executor executor) {
        return new si(context, executor, f14703e);
    }

    public final long b() {
        long j8 = this.f14706c;
        this.f14706c = -1L;
        return j8;
    }

    public final long c() {
        if (this.f14707d) {
            return this.f14705b - this.f14704a;
        }
        return -1L;
    }

    public final void h() {
        if (this.f14707d) {
            this.f14705b = System.currentTimeMillis();
        }
    }
}
