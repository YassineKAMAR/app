package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ti extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Activity f15101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f15102j;

    public ti(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, View view, Activity activity) {
        super(iiVar, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", ceVar, i8, 62);
        this.f15102j = view;
        this.f15101i = activity;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (this.f15102j == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.f12177r2)).booleanValue();
        Object[] objArr = (Object[]) this.f5297f.invoke(null, this.f15102j, this.f15101i, Boolean.valueOf(zBooleanValue));
        synchronized (this.f5296e) {
            this.f5296e.d0(((Long) objArr[0]).longValue());
            this.f5296e.f0(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.f5296e.e0((String) objArr[2]);
            }
        }
    }
}
