package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f10075a;

    kh(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new jh(this));
        } catch (RuntimeException unused) {
            synchronized (kh.class) {
                this.f10075a = null;
            }
        }
    }

    public static kh c(Context context) {
        if (context != null) {
            return new kh((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (kh.class) {
            NetworkCapabilities networkCapabilities = this.f10075a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.f10075a.hasTransport(1)) {
                    return 1L;
                }
                if (this.f10075a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities b() {
        return this.f10075a;
    }
}
