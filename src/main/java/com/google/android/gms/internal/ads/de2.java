package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class de2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f6700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6701b;

    de2(lg3 lg3Var, Context context) {
        this.f6700a = lg3Var;
        this.f6701b = context;
    }

    final /* synthetic */ ee2 a() {
        double d8;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f6701b.registerReceiver(null, intentFilter) : this.f6701b.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            double intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
            double intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
            z = intExtra == 2 || intExtra == 5;
            d8 = intExtra2 / intExtra3;
        } else {
            d8 = -1.0d;
        }
        return new ee2(d8, z);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    @SuppressLint({"UnprotectedReceiver"})
    public final x3.d k() {
        return this.f6700a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.ce2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6326a.a();
            }
        });
    }
}
