package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class aj2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f5286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f5287b;

    public aj2(lg3 lg3Var, Context context) {
        this.f5286a = lg3Var;
        this.f5287b = context;
    }

    final /* synthetic */ yi2 a() {
        int i8;
        boolean zIsActiveNetworkMetered;
        int i9;
        TelephonyManager telephonyManager = (TelephonyManager) this.f5287b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        g2.t.r();
        int i10 = -1;
        if (j2.k2.a0(this.f5287b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f5287b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i8 = type;
                i10 = iOrdinal;
            } else {
                i8 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            i9 = i10;
        } else {
            i8 = -2;
            zIsActiveNetworkMetered = false;
            i9 = -1;
        }
        return new yi2(networkOperator, i8, g2.t.s().l(this.f5287b), phoneType, zIsActiveNetworkMetered, i9);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f5286a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.zi2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18253a.a();
            }
        });
    }
}
